package com.google.android.setupdesign.p3556e;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Window;
import com.google.android.material.p3516m.p3517a.C44800d;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45244a;
import com.google.android.setupdesign.p3558f.C45315i;

/* renamed from: com.google.android.setupdesign.e.a */
/* compiled from: PG */
public final class C45304a {

    /* renamed from: a */
    static boolean f118359a = false;

    /* renamed from: b */
    static boolean f118360b = false;

    /* renamed from: a */
    public static int m80745a(Context context) {
        if (!C45244a.m80595a() || !C45315i.m80768c(context)) {
            return 0;
        }
        return C45240c.m80574e(context).mo49109s(context, C45238a.CONFIG_TRANSITION_TYPE);
    }

    /* renamed from: b */
    public static void m80746b(Fragment fragment) {
        if (m80745a(fragment.getContext()) == 1) {
            fragment.setReturnTransition(new C44800d(false));
            fragment.setReenterTransition(new C44800d(false));
            return;
        }
        Log.w("TransitionHelper", "Not apply the backward transition for platform fragment.");
    }

    /* renamed from: c */
    public static void m80747c(Fragment fragment) {
        if (m80745a(fragment.getContext()) == 1) {
            fragment.setExitTransition(new C44800d(true));
            fragment.setEnterTransition(new C44800d(true));
            return;
        }
        Log.w("TransitionHelper", "Not apply the forward transition for platform fragment.");
    }

    /* renamed from: d */
    public static void m80748d(Activity activity) {
        if (activity != null) {
            if (!f118359a) {
                f118359a = true;
                if (m80745a(activity) == 1) {
                    activity.finishAfterTransition();
                } else {
                    Log.w("TransitionHelper", "Fallback to using Activity#finish() due to the Activity#finishAfterTransition() is supported from Android Sdk 21");
                    activity.finish();
                }
            }
            f118359a = false;
            return;
        }
        throw new IllegalArgumentException("Invalid activity=null");
    }

    /* renamed from: e */
    public static void m80749e(Activity activity) {
        if (m80745a(activity) == 1) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setReenterTransition(new C44800d(false));
                window.setReturnTransition(new C44800d(false));
                return;
            }
            Log.w("TransitionHelper", "applyBackwardTransition: Invalid window=null");
        }
    }

    /* renamed from: f */
    public static void m80750f(Activity activity) {
        if (m80745a(activity) == 1) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setExitTransition(new C44800d(true));
                window.setAllowEnterTransitionOverlap(true);
                window.setEnterTransition(new C44800d(true));
                return;
            }
            Log.w("TransitionHelper", "applyForwardTransition: Invalid window=null");
        }
    }

    /* renamed from: h */
    private static void m80752h(Activity activity, Intent intent, int i) {
        try {
            m80745a(activity);
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.w("TransitionHelper", "Activity not found when startActivityForResult with transition.");
            f118360b = false;
            throw e;
        }
    }

    /* renamed from: g */
    public static void m80751g(Activity activity, Intent intent, int i) {
        Bundle bundle;
        if (activity == null) {
            throw new IllegalArgumentException("Invalid activity=null");
        } else if (intent != null) {
            if ((intent.getFlags() & 268435456) == 268435456) {
                Log.e("TransitionHelper", "The transition won't take effect since the WindowManager does not allow override new task transitions");
            }
            if (!f118360b) {
                f118360b = true;
                if (m80745a(activity) == 1) {
                    if (activity.getWindow() != null && !activity.getWindow().hasFeature(13)) {
                        Log.w("TransitionHelper", "The transition won't take effect due to NO FEATURE_ACTIVITY_TRANSITIONS feature");
                    }
                    if ((intent.getFlags() & 268435456) == 268435456) {
                        Log.e("TransitionHelper", "The transition won't take effect since the WindowManager does not allow override new task transitions");
                    }
                    if (m80745a(activity) == 1) {
                        if (activity.getWindow() != null && !activity.getWindow().hasFeature(13)) {
                            Log.w("TransitionHelper", "The transition won't take effect due to NO FEATURE_ACTIVITY_TRANSITIONS feature");
                        }
                        bundle = ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]).toBundle();
                        intent.putExtra("sud:activity_options", bundle);
                    } else {
                        bundle = null;
                    }
                    intent.putExtra("sud:activity_options", bundle);
                    activity.startActivityForResult(intent, i, bundle);
                } else {
                    m80752h(activity, intent, i);
                }
                f118360b = false;
            }
        } else {
            throw new IllegalArgumentException("Invalid intent=null");
        }
    }
}
