package android.support.p031v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.cg */
/* compiled from: PG */
final class C0215cg extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f829a;

    public C0215cg(Rect rect) {
        this.f829a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f829a;
    }
}
