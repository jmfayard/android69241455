package com.androidAppModule0;
import android.app.Activity;
import android.os.Bundle;
import com.androidAppModule0.R;

import org.bouncycastle.jcajce.provider.digest.SHA256;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.ConcurrentRefUpdateException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.RejectCommitException;
import org.eclipse.jgit.api.errors.UnmergedPathsException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.lib.CommitBuilder;

import java.io.File;
import java.io.IOException;

import static libs.UselibsKt.threetenabp;


public class Activity0 extends Activity {
    public Activity0() {
        threetenabp();
    }

    /**
     * Called with the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity.  You can find it
        // in res/layout/hello_activity.xml
        setContentView(R.layout.activity_main0);
        doof();
    }

    public void doof() {
        Git.cloneRepository();
        new SHA256.Digest();
        try {
            Git git = Git.open(new File("."));
            git.commit().call();
        } catch (IOException | UnmergedPathsException | WrongRepositoryStateException e) {
            e.printStackTrace();
        } catch (ConcurrentRefUpdateException e) {
            e.printStackTrace();
        } catch (RejectCommitException e) {
            e.printStackTrace();
        } catch (NoHeadException e) {
            e.printStackTrace();
        } catch (NoMessageException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }

    }
}
