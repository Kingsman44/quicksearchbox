package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16626a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.q */
/* compiled from: PG */
public final /* synthetic */ class C12823q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12830x f40031a;

    public /* synthetic */ C12823q(C12830x xVar) {
        this.f40031a = xVar;
    }

    public final Object apply(Object obj) {
        C12830x xVar = this.f40031a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            C15481g gVar = xVar.f40045f;
            C37259h d = C37179a.f97482bA.mo40806d();
            C62722b bVar = C62722b.CANCELLED;
            C13007y yVar = xVar.f40046g.f40383b;
            if (yVar == null) {
                yVar = C13007y.f40413d;
            }
            gVar.mo22354d(d, bVar, Optional.m71637of(Long.valueOf(yVar.f40416b)));
            return new C16626a().mo22941a();
        } else if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C12830x.f40040a.mo56226d()).mo56382g(th)).mo56372aa(44472)).mo56386p("Smart Action timed out");
            C15481g gVar2 = xVar.f40045f;
            C37259h d2 = C37179a.f97482bA.mo40806d();
            C62722b bVar2 = C62722b.DEADLINE_EXCEEDED;
            C13007y yVar2 = xVar.f40046g.f40383b;
            if (yVar2 == null) {
                yVar2 = C13007y.f40413d;
            }
            gVar2.mo22354d(d2, bVar2, Optional.m71637of(Long.valueOf(yVar2.f40416b)));
            return new C16626a().mo22941a();
        } else {
            ((C59052c) ((C59052c) ((C59052c) C12830x.f40040a.mo56226d()).mo56382g(th)).mo56372aa(44471)).mo56386p("Smart Action failed");
            C15481g gVar3 = xVar.f40045f;
            C37259h d3 = C37179a.f97482bA.mo40806d();
            C62722b bVar3 = C62722b.INTERNAL;
            C13007y yVar3 = xVar.f40046g.f40383b;
            if (yVar3 == null) {
                yVar3 = C13007y.f40413d;
            }
            gVar3.mo22354d(d3, bVar3, Optional.m71637of(Long.valueOf(yVar3.f40416b)));
            return new C16626a().mo22941a();
        }
    }
}
