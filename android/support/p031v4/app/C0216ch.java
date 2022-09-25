package android.support.p031v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.ch */
/* compiled from: PG */
final class C0216ch implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f830a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f831b;

    public C0216ch(View view, ArrayList arrayList) {
        this.f830a = view;
        this.f831b = arrayList;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f830a.setVisibility(8);
        int size = this.f831b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f831b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
