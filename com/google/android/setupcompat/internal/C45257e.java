package com.google.android.setupcompat.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import com.google.android.setupcompat.logging.C45273c;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.android.setupcompat.p3550b.C45250g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.setupcompat.internal.e */
/* compiled from: PG */
public final class C45257e extends Fragment {

    /* renamed from: a */
    private static final String f118217a = "e";

    /* renamed from: b */
    private MetricKey f118218b;

    /* renamed from: c */
    private long f118219c;

    /* renamed from: d */
    private long f118220d = 0;

    public C45257e() {
        setRetainInstance(true);
    }

    /* renamed from: a */
    public static void m80625a(Activity activity) {
        if (C45250g.m80606b(activity.getIntent())) {
            C45263k a = C45263k.m80635a(activity.getApplicationContext());
            String componentName = activity.getComponentName().toString();
            Bundle bundle = new Bundle();
            bundle.putString("screenName", activity.getComponentName().toString());
            bundle.putString("intentAction", activity.getIntent().getAction());
            a.mo49142b(componentName, bundle);
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager != null && !fragmentManager.isDestroyed()) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
                if (findFragmentByTag == null) {
                    C45257e eVar = new C45257e();
                    try {
                        fragmentManager.beginTransaction().add(eVar, "lifecycle_monitor").commitNow();
                        findFragmentByTag = eVar;
                    } catch (IllegalStateException e) {
                        Log.e(f118217a, "Error occurred when attach to Activity:".concat(String.valueOf(String.valueOf(activity.getComponentName()))), e);
                    }
                } else if (!(findFragmentByTag instanceof C45257e)) {
                    Log.wtf(f118217a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
                    return;
                }
                C45257e eVar2 = (C45257e) findFragmentByTag;
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f118218b = MetricKey.m80652b("ScreenDuration", getActivity());
    }

    public final void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.f118218b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.f118220d);
        C45259g.m80634c(activity, "Context cannot be null.");
        C45259g.m80634c(metricKey, "Timer name cannot be null.");
        C45259g.m80632a(millis >= 0, "Duration cannot be negative.");
        C45263k a = C45263k.m80635a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.m80651a(metricKey));
        bundle.putLong("timeMillis", millis);
        a.mo49146f(2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.f118220d += System.nanoTime() - this.f118219c;
    }

    public final void onResume() {
        super.onResume();
        this.f118219c = System.nanoTime();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("onScreenResume", System.nanoTime());
        C45273c.m80657a(getActivity(), CustomEvent.m80650a(MetricKey.m80652b("ScreenActivity", getActivity()), persistableBundle));
    }
}
