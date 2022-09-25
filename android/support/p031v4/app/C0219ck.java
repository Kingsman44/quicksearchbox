package android.support.p031v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.ck */
/* compiled from: PG */
final class C0219ck extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f838a;

    public C0219ck(Rect rect) {
        this.f838a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        if (this.f838a.isEmpty()) {
            return null;
        }
        return this.f838a;
    }
}
