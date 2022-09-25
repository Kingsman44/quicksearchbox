package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26748aq;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26749ar;

/* renamed from: com.google.android.libraries.lens.view.h.e.p */
/* compiled from: PG */
public final /* synthetic */ class C26805p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73072a;

    /* renamed from: b */
    public final /* synthetic */ C26749ar f73073b;

    /* renamed from: c */
    public final /* synthetic */ int f73074c;

    /* renamed from: d */
    public final /* synthetic */ int f73075d;

    public /* synthetic */ C26805p(C26784ai aiVar, C26749ar arVar, int i, int i2) {
        this.f73072a = aiVar;
        this.f73073b = arVar;
        this.f73074c = i;
        this.f73075d = i2;
    }

    public final void run() {
        C26784ai aiVar = this.f73072a;
        C26749ar arVar = this.f73073b;
        int i = this.f73074c;
        int i2 = this.f73075d;
        C26749ar arVar2 = aiVar.f73018j;
        boolean z = false;
        if (arVar2 != null) {
            C26748aq[] aqVarArr = arVar.f72877a;
            C26748aq[] aqVarArr2 = arVar2.f72877a;
            if (aqVarArr.length == aqVarArr2.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= aqVarArr.length) {
                        break;
                    } else if (aqVarArr2[i3].f72875c != aqVarArr[i3].f72875c) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z = true;
        }
        aiVar.f73018j = arVar;
        if (z || i != aiVar.f73019k || i2 != aiVar.f73020l) {
            aiVar.f73019k = i;
            aiVar.f73020l = i2;
            aiVar.f73031w.mo31983m();
            aiVar.mo32150s(z);
        }
    }
}
