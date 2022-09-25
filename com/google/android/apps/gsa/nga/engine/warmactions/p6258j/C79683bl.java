package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.av.bh;
import com.google.android.apps.gsa.nga.engine.av.s;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bl */
/* compiled from: PG */
public final class C79683bl implements C79688bq {

    /* renamed from: a */
    private final C79646ab f218534a;

    /* renamed from: b */
    private final C60950i f218535b;

    /* renamed from: c */
    private final C75113bn f218536c;

    public C79683bl(C79646ab abVar, C75113bn bnVar, C60950i iVar) {
        this.f218534a = abVar;
        this.f218536c = bnVar;
        this.f218535b = iVar;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo74176b(C79690bs bsVar) {
        return true;
    }

    /* renamed from: h */
    public final C60870cx mo74177h(C79690bs bsVar) {
        bsVar.mo74199g();
        C75113bn bnVar = this.f218536c;
        bh a = this.f218534a.mo74178a(bsVar);
        s sVar = new s();
        sVar.c(bsVar.mo74199g());
        sVar.b(C77551ad.NON_VOICE);
        sVar.d(this.f218535b.mo57444a());
        return bnVar.mo71498a(a.h(sVar.a()));
    }
}
