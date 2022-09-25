package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.ao */
/* compiled from: PG */
public final class C2340ao extends Fragment {
    /* renamed from: a */
    static void m6325a(Activity activity, C2382m mVar) {
        if (activity instanceof C2394y) {
            ((C2394y) activity).mo5796a().mo5793e(mVar);
        } else if (activity instanceof C2391v) {
            C2384o lifecycle = ((C2391v) activity).getLifecycle();
            if (lifecycle instanceof C2393x) {
                ((C2393x) lifecycle).mo5793e(mVar);
            }
        }
    }

    /* renamed from: b */
    public static void m6326b(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new C2339an());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C2340ao(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C2382m mVar = C2382m.ON_CREATE;
    }

    public final void onDestroy() {
        super.onDestroy();
        C2382m mVar = C2382m.ON_CREATE;
    }

    public final void onPause() {
        super.onPause();
        C2382m mVar = C2382m.ON_CREATE;
    }

    public final void onResume() {
        super.onResume();
        C2382m mVar = C2382m.ON_CREATE;
    }

    public final void onStart() {
        super.onStart();
        C2382m mVar = C2382m.ON_CREATE;
    }

    public final void onStop() {
        super.onStop();
        C2382m mVar = C2382m.ON_CREATE;
    }
}
