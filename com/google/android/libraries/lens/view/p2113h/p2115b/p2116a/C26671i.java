package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26744am;
import com.google.android.libraries.lens.view.p2161r.C27658e;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C26671i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72716a;

    /* renamed from: b */
    public final /* synthetic */ C27658e f72717b;

    public /* synthetic */ C26671i(C26679q qVar, C27658e eVar) {
        this.f72716a = qVar;
        this.f72717b = eVar;
    }

    public final void run() {
        C26679q qVar = this.f72716a;
        C27658e eVar = this.f72717b;
        int i = qVar.f72752z;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "STREAMING" : "OPEN" : "OPENING" : "CLOSED";
        if (i != 0) {
            eVar.mo33148e("cameraState", str);
            int i2 = qVar.f72751y;
            String a = C26744am.m49455a(i2);
            if (i2 != 0) {
                eVar.mo33148e("requestedState", a);
                eVar.mo33146c(qVar.f72734h);
                return;
            }
            throw null;
        }
        throw null;
    }
}
