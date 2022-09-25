package android.support.p031v4.app;

import android.transition.Transition;
import androidx.core.p094f.C1893f;

/* renamed from: android.support.v4.app.p */
/* compiled from: PG */
final class C0253p extends C0252o {

    /* renamed from: c */
    public final Object f915c;

    /* renamed from: d */
    public final boolean f916d;

    /* renamed from: e */
    public final Object f917e;

    public C0253p(C0238dc dcVar, C1893f fVar, boolean z, boolean z2) {
        super(dcVar, fVar);
        Object obj;
        Object obj2;
        boolean z3;
        if (dcVar.f876e == 2) {
            if (z) {
                obj2 = dcVar.f872a.getReenterTransition();
            } else {
                obj2 = dcVar.f872a.getEnterTransition();
            }
            this.f915c = obj2;
            if (z) {
                z3 = dcVar.f872a.getAllowReturnTransitionOverlap();
            } else {
                z3 = dcVar.f872a.getAllowEnterTransitionOverlap();
            }
            this.f916d = z3;
        } else {
            if (z) {
                obj = dcVar.f872a.getReturnTransition();
            } else {
                obj = dcVar.f872a.getExitTransition();
            }
            this.f915c = obj;
            this.f916d = true;
        }
        if (!z2) {
            this.f917e = null;
        } else if (z) {
            this.f917e = dcVar.f872a.getSharedElementReturnTransition();
        } else {
            this.f917e = dcVar.f872a.getSharedElementEnterTransition();
        }
    }

    /* renamed from: a */
    public final C0222cn mo768a(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = C0214cf.f828c;
        if (obj instanceof Transition) {
            return C0214cf.f826a;
        }
        C0222cn cnVar = C0214cf.f827b;
        if (cnVar != null && cnVar.mo721m(obj)) {
            return C0214cf.f827b;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f913a.f872a + " is not a valid framework Transition or AndroidX Transition");
    }
}
