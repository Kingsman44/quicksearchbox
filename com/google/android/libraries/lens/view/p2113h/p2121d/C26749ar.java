package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.view.Surface;

/* renamed from: com.google.android.libraries.lens.view.h.d.ar */
/* compiled from: PG */
public final class C26749ar {

    /* renamed from: a */
    public final C26748aq[] f72877a;

    public C26749ar(C26748aq[] aqVarArr) {
        this.f72877a = aqVarArr;
    }

    /* renamed from: a */
    public final Surface[] mo32081a() {
        Surface[] surfaceArr = new Surface[this.f72877a.length];
        int i = 0;
        while (true) {
            C26748aq[] aqVarArr = this.f72877a;
            if (i >= aqVarArr.length) {
                return surfaceArr;
            }
            surfaceArr[i] = aqVarArr[i].f72875c;
            i++;
        }
    }
}
