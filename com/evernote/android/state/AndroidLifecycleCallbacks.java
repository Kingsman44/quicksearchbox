package com.evernote.android.state;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;

/* compiled from: PG */
final class AndroidLifecycleCallbacks extends C0192bk implements Application.ActivityLifecycleCallbacks {
    static final AndroidLifecycleCallbacks INSTANCE = new AndroidLifecycleCallbacks();
    boolean mEnabled;

    private AndroidLifecycleCallbacks() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.restoreInstanceState((Object) activity, bundle);
        }
        if (activity instanceof C0167am) {
            ((C0167am) activity).mo545jw().f644k.mo606o(this, true);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.saveInstanceState((Object) activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.restoreInstanceState((Object) fragment, bundle);
        }
    }

    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.saveInstanceState((Object) fragment, bundle);
        }
    }
}
