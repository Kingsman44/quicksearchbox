package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.aa */
/* compiled from: PG */
final class C93333aa {

    /* renamed from: a */
    final C93359z[] f260300a;

    public C93333aa(C93359z[] zVarArr) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (C93359z zVar : zVarArr) {
            int i4 = zVar.f260383d;
            i2 = i4 != i ? -1 : i2;
            int i5 = i + 1;
            C58838bb.m90874i(i4 == i5 || (i4 == i && zVar.f260384e > i2), "expected numberOfAttempts=%s or minNumberOfItems>=%s for ResourceSet %s  (actual: numberOfAttempts=%s, minNumberOfItems=%s)", Integer.valueOf(i5), Integer.valueOf(i2 + 1), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(zVar.f260384e));
            i3++;
            i = zVar.f260383d;
            i2 = zVar.f260384e;
        }
        this.f260300a = zVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo87640a() {
        C93359z[] zVarArr = this.f260300a;
        return zVarArr[zVarArr.length - 1].f260383d;
    }
}
