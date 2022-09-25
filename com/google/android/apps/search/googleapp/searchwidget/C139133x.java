package com.google.android.apps.search.googleapp.searchwidget;

import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.x */
/* compiled from: PG */
final class C139133x extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139134y f378389a;

    /* renamed from: b */
    final /* synthetic */ C37259h f378390b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139133x(C139134y yVar, C37259h hVar) {
        super(1);
        this.f378389a = yVar;
        this.f378390b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C62722b bVar;
        Throwable th = (Throwable) obj;
        if (th == null) {
            bVar = C62722b.OK;
        } else if (th instanceof CancellationException) {
            bVar = C62722b.CANCELLED;
        } else {
            bVar = C62722b.ABORTED;
        }
        this.f378389a.f378394c.mo19974a(this.f378390b.mo40781e(bVar));
        return C69788q.f186170a;
    }
}
