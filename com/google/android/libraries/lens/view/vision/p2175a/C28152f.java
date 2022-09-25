package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.android.libraries.lens.C24066b;
import com.google.common.base.C58838bb;
import com.google.lens.p4707j.C62419aw;
import com.google.lens.p4707j.C62429bf;
import com.google.lens.p4707j.C62540fi;
import com.google.lens.p4707j.C62563ge;
import com.google.lens.p4707j.C62565gg;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.lens.view.vision.a.f */
/* compiled from: PG */
public final /* synthetic */ class C28152f implements C24066b {

    /* renamed from: a */
    public final /* synthetic */ C28156j f76586a;

    public /* synthetic */ C28152f(C28156j jVar) {
        this.f76586a = jVar;
    }

    /* renamed from: a */
    public final void mo29457a(C62419aw awVar) {
        C62563ge geVar;
        C62540fi fiVar;
        C28156j jVar = this.f76586a;
        C28156j.m52467A(awVar);
        if (awVar.f168493a == 3) {
            geVar = (C62563ge) awVar.f168494b;
        } else {
            geVar = C62563ge.f168910d;
        }
        int a = C62429bf.m94773a(awVar.f168496d);
        boolean z = false;
        C58838bb.m90887v(a == 0 || a == 1, "%s-processFF: wrong subsystem", "IST");
        int a2 = C62565gg.m94797a(geVar.f168914c);
        if (a2 != 0 && a2 == 3) {
            z = true;
        }
        C58838bb.m90887v(z, "%s-processFF: wrong result type", "IST");
        AtomicLong atomicLong = jVar.f76598m;
        if (geVar.f168912a == 4) {
            fiVar = (C62540fi) geVar.f168913b;
        } else {
            fiVar = C62540fi.f168849b;
        }
        atomicLong.set(fiVar.f168851a);
    }
}
