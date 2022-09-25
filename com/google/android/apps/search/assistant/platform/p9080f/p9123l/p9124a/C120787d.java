package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.gsa.binaries.satin.app.ahz;
import com.google.android.apps.gsa.binaries.satin.app.aic;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a.C120792i;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2574b.p2575a.C33439a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.hilt.C68286a;
import dagger.p5294a.C68225k;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.d */
/* compiled from: PG */
public final /* synthetic */ class C120787d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120789f f335913a;

    /* renamed from: b */
    public final /* synthetic */ C120811d f335914b;

    /* renamed from: c */
    public final /* synthetic */ boolean f335915c;

    public /* synthetic */ C120787d(C120789f fVar, C120811d dVar, boolean z) {
        this.f335913a = fVar;
        this.f335914b = dVar;
        this.f335915c = z;
    }

    public final void run() {
        C120789f fVar = this.f335913a;
        C120811d dVar = this.f335914b;
        boolean z = this.f335915c;
        C120792i iVar = fVar.f335920d;
        if (iVar != null) {
            Object obj = iVar.f335926a;
            C47558bi a = C47831fm.m85006a("PrefetchController.areKeysEqual");
            try {
                boolean equals = Objects.equals(obj, dVar);
                a.close();
                if (equals) {
                    return;
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        if (iVar != null) {
            iVar.mo104937a();
            fVar.f335920d = null;
        }
        if (fVar.f335921e) {
            ((C59052c) ((C59052c) C120789f.f335917a.mo56226d()).mo56372aa(35601)).mo56386p("utterance is down, prefetch ignored");
            return;
        }
        C120794j jVar = fVar.f335919c;
        dVar.getClass();
        dVar.getClass();
        C58048g gVar = (C58048g) jVar.f335934a.mo17428b();
        gVar.getClass();
        C33439a aVar = (C33439a) jVar.f335935b.mo17428b();
        aVar.getClass();
        C120792i iVar2 = new C120792i(dVar, dVar, z, gVar, aVar);
        C57934a a2 = iVar2.f335932g.mo54628a("APA.PrefetchGraph");
        ahz ahz = iVar2.f335933h.f89541a;
        ahz.f196179e = a2;
        ahz.f196180f = iVar2;
        C68225k.m98529a(ahz.f196179e, C57934a.class);
        C68225k.m98529a(ahz.f196180f, Object.class);
        iVar2.f335928c = ((C120792i.C120793a) C68286a.m98629a(new aic(ahz.f196175a, ahz.f196176b, ahz.f196177c, ahz.f196178d, ahz.f196179e, ahz.f196180f), C120792i.C120793a.class)).mo104938b();
        fVar.f335920d = iVar2;
        return;
        throw th;
    }
}
