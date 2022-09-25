package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ho */
/* compiled from: PG */
public abstract class C0707ho extends C0646fh {

    /* renamed from: m */
    public boolean f2538m = true;

    /* renamed from: f */
    public abstract boolean mo2690f(C0673gh ghVar);

    /* renamed from: g */
    public abstract boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4);

    /* renamed from: h */
    public abstract boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4);

    /* renamed from: i */
    public abstract boolean mo2693i(C0673gh ghVar);

    /* renamed from: o */
    public final boolean mo2891o(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2) {
        int i;
        int i2;
        if (fgVar == null || ((i = fgVar.f2405a) == (i2 = fgVar2.f2405a) && fgVar.f2406b == fgVar2.f2406b)) {
            return mo2690f(ghVar);
        }
        return mo2692h(ghVar, i, fgVar.f2406b, i2, fgVar2.f2406b);
    }

    /* renamed from: p */
    public boolean mo2892p(C0673gh ghVar, C0673gh ghVar2, C0645fg fgVar, C0645fg fgVar2) {
        int i;
        int i2;
        int i3 = fgVar.f2405a;
        int i4 = fgVar.f2406b;
        if (ghVar2.shouldIgnore()) {
            int i5 = fgVar.f2405a;
            i = fgVar.f2406b;
            i2 = i5;
        } else {
            i2 = fgVar2.f2405a;
            i = fgVar2.f2406b;
        }
        return mo2691g(ghVar, ghVar2, i3, i4, i2, i);
    }

    /* renamed from: q */
    public final boolean mo2893q(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2) {
        int i;
        int i2;
        int i3 = fgVar.f2405a;
        int i4 = fgVar.f2406b;
        View view = ghVar.itemView;
        if (fgVar2 == null) {
            i = view.getLeft();
        } else {
            i = fgVar2.f2405a;
        }
        int i5 = i;
        if (fgVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = fgVar2.f2406b;
        }
        int i6 = i2;
        if (ghVar.isRemoved() || (i3 == i5 && i4 == i6)) {
            return mo2693i(ghVar);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return mo2692h(ghVar, i3, i4, i5, i6);
    }

    /* renamed from: r */
    public final boolean mo2894r(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2) {
        int i = fgVar.f2405a;
        int i2 = fgVar2.f2405a;
        if (i == i2 && fgVar.f2406b == fgVar2.f2406b) {
            mo2889m(ghVar);
            return false;
        }
        return mo2692h(ghVar, i, fgVar.f2406b, i2, fgVar2.f2406b);
    }

    /* renamed from: s */
    public boolean mo2895s(C0673gh ghVar) {
        return !this.f2538m || ghVar.isInvalid();
    }
}
