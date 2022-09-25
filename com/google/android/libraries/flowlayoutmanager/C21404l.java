package com.google.android.libraries.flowlayoutmanager;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.flowlayoutmanager.l */
/* compiled from: PG */
final class C21404l extends C21401i {

    /* renamed from: b */
    private static final C1971f f59878b = new C1972g(15);

    /* renamed from: a */
    public final List f59879a = new ArrayList();

    private C21404l() {
        mo26897g();
    }

    /* renamed from: e */
    public static C21404l m40519e(int i) {
        C21404l lVar = (C21404l) f59878b.mo5126a();
        if (lVar == null) {
            lVar = new C21404l();
        }
        lVar.f59865f = i;
        return lVar;
    }

    /* renamed from: a */
    public final int mo26913a(int i) {
        int i2 = 0;
        boolean z = false;
        for (int size = this.f59879a.size() - 1; size >= 0; size--) {
            C21400h hVar = (C21400h) this.f59879a.get(size);
            if (z) {
                i2 += hVar.f59867h;
            } else if (hVar.f59865f <= i) {
                i2 = hVar.mo26891a(i);
                z = true;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo26892b(boolean z, int i) {
        int size = this.f59879a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((C21400h) this.f59879a.get(i3)).mo26909i(i);
        }
        return i2;
    }

    /* renamed from: c */
    public final int mo26893c() {
        if (this.f59879a.isEmpty()) {
            return this.f59865f;
        }
        List list = this.f59879a;
        return ((C21400h) list.get(list.size() - 1)).mo26893c();
    }

    /* renamed from: d */
    public final C21400h mo26914d() {
        if (this.f59879a.isEmpty()) {
            return null;
        }
        List list = this.f59879a;
        return (C21400h) list.get(list.size() - 1);
    }

    /* renamed from: f */
    public final void mo26915f(C21400h hVar) {
        this.f59879a.add(hVar);
        this.f59867h = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26897g() {
        super.mo26897g();
        int size = this.f59879a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21400h) this.f59879a.get(size)).mo26896f();
            } else {
                this.f59879a.clear();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo26898h(int i) {
        int size = this.f59879a.size();
        if (size == 0) {
            return false;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 >= 0) {
            C21400h hVar = (C21400h) this.f59879a.get(i3);
            int j = hVar.mo26910j(i);
            if (j != 0) {
                if (j == 1) {
                    return true;
                }
                if (j == 2) {
                    hVar.mo26896f();
                    this.f59879a.remove(i3);
                }
                i3--;
            } else if (i3 != i2) {
                return true;
            } else {
                return false;
            }
        }
        throw new Error("Should not reach here");
    }

    /* renamed from: k */
    public final void mo26911k(int i) {
        this.f59865f += i;
        int size = this.f59879a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21400h) this.f59879a.get(size)).mo26911k(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void mo26916l() {
        int size = this.f59879a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21400h) this.f59879a.get(size)).mo26895e();
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final void mo26917m() {
        mo26897g();
        f59878b.mo5127b(this);
    }
}
