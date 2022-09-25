package com.google.apps.tiktok.dataservice;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47820fb;
import com.google.apps.tiktok.tracing.C47822fd;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.du */
/* compiled from: PG */
public final /* synthetic */ class C46806du implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46815ec f122178a;

    /* renamed from: b */
    public final /* synthetic */ C46790dg f122179b;

    /* renamed from: c */
    public final /* synthetic */ C46768cl f122180c;

    public /* synthetic */ C46806du(C46815ec ecVar, C46790dg dgVar, C46768cl clVar) {
        this.f122178a = ecVar;
        this.f122179b = dgVar;
        this.f122180c = clVar;
    }

    public final void run() {
        C46815ec ecVar = this.f122178a;
        C46790dg dgVar = this.f122179b;
        C46768cl clVar = this.f122180c;
        C19559g.m37304c();
        C58838bb.m90884s(!dgVar.equals(ecVar.f122196g), "The same LoadTask was processed twice.");
        C58838bb.m90883r(clVar.mo50779b().isDone());
        if (ecVar.f122200k.mo50399c(clVar) && !clVar.mo50779b().isCancelled()) {
            try {
                if (dgVar.mo50804h(ecVar.f122196g)) {
                    clVar.mo50780c();
                } else if (!clVar.mo50779b().isCancelled()) {
                    int a = ((C46886z) ecVar.f122197h).f122329b.mo50743a(((C46683aa) dgVar).f121966f, clVar.mo50778a(), !dgVar.mo50805i());
                    C46781cy cyVar = C46781cy.LOCAL_STATE_CHANGE;
                    int i = a - 1;
                    if (a == 0) {
                        throw null;
                    } else if (i == 0) {
                        clVar.mo50780c();
                        if (dgVar.mo50805i()) {
                            C46764ch chVar = new C46764ch();
                            C47820fb.m84994a(chVar, C47822fd.m84997c());
                            ecVar.mo50822f(chVar);
                        } else {
                            ecVar.mo50820b(dgVar);
                        }
                    } else if (i == 1) {
                        ecVar.mo50819a(dgVar, clVar);
                        if (ecVar.f122198i.mo50729e() && ecVar.mo50823g()) {
                            C58838bb.m90884s(ecVar.f122198i.mo50728d().mo56113h(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                            C46815ec.m83392e((C46685ac) ecVar.f122198i.mo50726b());
                            ecVar.f122198i = ecVar.f122198i.mo50808g(false);
                        }
                    } else if (i == 2) {
                        ecVar.mo50819a(dgVar, clVar);
                        if (dgVar.mo50805i()) {
                            C46764ch chVar2 = new C46764ch();
                            C47820fb.m84994a(chVar2, C47822fd.m84997c());
                            ecVar.mo50822f(chVar2);
                        } else {
                            ecVar.mo50820b(dgVar);
                        }
                    }
                }
                if (ecVar.f122198i.mo50729e() && ecVar.mo50823g()) {
                    C58838bb.m90884s(ecVar.f122198i.mo50728d().mo56113h(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                    C46815ec.m83392e((C46685ac) ecVar.f122198i.mo50726b());
                    ecVar.f122198i = ecVar.f122198i.mo50808g(false);
                }
            } catch (C46796dk e) {
                ecVar.mo50822f(e.getCause());
            } catch (Throwable th) {
                ecVar.f122193d.execute(new C46804ds(th));
            }
        }
    }
}
