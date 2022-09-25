package android.support.p031v4.app;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.ci */
/* compiled from: PG */
final class C0217ci implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f832a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f833b;

    /* renamed from: c */
    final /* synthetic */ Object f834c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f835d;

    /* renamed from: e */
    final /* synthetic */ C0220cl f836e;

    public C0217ci(C0220cl clVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f836e = clVar;
        this.f832a = obj;
        this.f833b = arrayList;
        this.f834c = obj2;
        this.f835d = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f832a;
        if (obj != null) {
            this.f836e.mo715g(obj, this.f833b, (ArrayList) null);
        }
        Object obj2 = this.f834c;
        if (obj2 != null) {
            this.f836e.mo715g(obj2, this.f835d, (ArrayList) null);
        }
    }
}
