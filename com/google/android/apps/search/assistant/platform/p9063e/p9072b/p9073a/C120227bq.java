package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119256b;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bq */
/* compiled from: PG */
public final class C120227bq {

    /* renamed from: b */
    public static final /* synthetic */ int f334567b = 0;

    /* renamed from: c */
    private static final C120226bp f334568c = new C120226bp();

    /* renamed from: a */
    public final C37215b f334569a;

    public C120227bq(C37215b bVar) {
        this.f334569a = bVar;
    }

    /* renamed from: e */
    private static void m199175e(Throwable th, C37252a aVar) {
        Throwable th2 = (Throwable) C119256b.f332583a.mo104261a(th).map(C120225bo.f334566a).orElse(th);
        if (th2 == null) {
            aVar.mo40781e(C62722b.OK);
        } else if (th2 instanceof CancellationException) {
            aVar.mo40781e(C62722b.CANCELLED);
        } else if (th2 instanceof C70761fa) {
            aVar.mo40781e(f334568c.apply(((C70761fa) th2).f188571a.getCode()));
        } else {
            C34834b bVar = C34830d.m63595b(th2).f92362c;
            if (bVar == null) {
                bVar = C34834b.f92401c;
            }
            C34819a b = C34819a.m63579b(bVar);
            aVar.mo40780d(b.mo39520a(), b.mo39522e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104692a(Throwable th) {
        C37215b bVar = this.f334569a;
        C37252a c = C37176a.f96918bj.mo40779c();
        m199175e(th, c);
        bVar.mo19974a(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104693b(Throwable th) {
        C37215b bVar = this.f334569a;
        C37252a c = C37176a.f96919bk.mo40779c();
        m199175e(th, c);
        bVar.mo19974a(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo104694c(Throwable th) {
        C37215b bVar = this.f334569a;
        C37252a c = C37176a.f96903bU.mo40779c();
        m199175e(th, c);
        bVar.mo19974a(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo104695d(Throwable th) {
        C37215b bVar = this.f334569a;
        C37252a c = C37176a.f96912bd.mo40779c();
        m199175e(th, c);
        bVar.mo19974a(c);
    }
}
