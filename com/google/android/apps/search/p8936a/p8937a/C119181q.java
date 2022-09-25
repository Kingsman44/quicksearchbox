package com.google.android.apps.search.p8936a.p8937a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2879g.C37191a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;
import p5535j.p5536a.p5558e.C71174c;

/* renamed from: com.google.android.apps.search.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C119181q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119182r f332373a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f332374b;

    /* renamed from: c */
    public final /* synthetic */ C119168d f332375c;

    public /* synthetic */ C119181q(C119182r rVar, C60870cx cxVar, C119168d dVar) {
        this.f332373a = rVar;
        this.f332374b = cxVar;
        this.f332375c = dVar;
    }

    public final void run() {
        C62722b bVar;
        C37215b bVar2;
        C37252a c;
        C119182r rVar = this.f332373a;
        C60870cx cxVar = this.f332374b;
        C119168d dVar = this.f332375c;
        C62722b bVar3 = C62722b.UNKNOWN;
        try {
            C60856cj.m92909r(cxVar);
            bVar3 = C62722b.OK;
            ((C59052c) ((C59052c) C119182r.f332376a.mo56224b()).mo56372aa(41469)).mo56386p("Hsi installation successful");
            bVar2 = rVar.f332377b;
            c = C37191a.f98398b.mo40805c(bVar3);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof TimeoutException) {
                ((C59052c) ((C59052c) ((C59052c) C119182r.f332376a.mo56226d()).mo56382g(cause)).mo56372aa(41471)).mo56386p("HSI installation cancelled/timed out.");
                bVar = C62722b.CANCELLED;
            } else {
                ((C59052c) ((C59052c) ((C59052c) C119182r.f332376a.mo56225c()).mo56382g(e.getCause())).mo56372aa(41470)).mo56386p("HSI installation failed.");
                bVar = C62722b.INTERNAL;
            }
            bVar2 = rVar.f332377b;
            c = C37191a.f98398b.mo40805c(bVar);
        } catch (Throwable th) {
            C37215b bVar4 = rVar.f332377b;
            C37252a c2 = C37191a.f98398b.mo40805c(bVar3);
            ((C37253b) c2).mo40792p(C71174c.f189886f, C119182r.m197879b(dVar));
            bVar4.mo19974a(c2);
            throw th;
        }
        ((C37253b) c).mo40792p(C71174c.f189886f, C119182r.m197879b(dVar));
        bVar2.mo19974a(c);
    }
}
