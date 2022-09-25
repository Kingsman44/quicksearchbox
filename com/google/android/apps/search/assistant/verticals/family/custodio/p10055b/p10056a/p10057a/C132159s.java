package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.s */
/* compiled from: PG */
final class C132159s implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ String f360717a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f360718b;

    /* renamed from: c */
    final /* synthetic */ boolean f360719c;

    /* renamed from: d */
    final /* synthetic */ boolean f360720d;

    /* renamed from: e */
    final /* synthetic */ C132161u f360721e;

    public C132159s(C132161u uVar, String str, C58485gu guVar, boolean z, boolean z2) {
        this.f360721e = uVar;
        this.f360717a = str;
        this.f360718b = guVar;
        this.f360719c = z;
        this.f360720d = z2;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx d = this.f360721e.f360726d.f360741a.mo46042d();
        C132156p pVar = new C132156p(this, this.f360719c, this.f360718b);
        return new C46463o(new C60817ay(C60922j.m93044g(d, C47810es.m84963c(pVar), C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C132161u uVar = this.f360721e;
        String str = this.f360717a;
        C58485gu guVar = this.f360718b;
        return uVar.mo110509h(str, guVar, this.f360719c, this.f360720d, new C132157q(this, guVar));
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        ArrayList arrayList = new ArrayList();
        if (this.f360719c) {
            arrayList.add(new C46885y("callerInfoSingleKey"));
        }
        if (this.f360718b.isEmpty()) {
            arrayList.add(new C46885y("fullFetchSingleKey"));
        } else {
            C58485gu guVar = this.f360718b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C46885y((String) guVar.get(i2)));
            }
        }
        if (arrayList.size() > 1) {
            return C46786dc.m83350a(C58528ij.m90006F(arrayList));
        }
        return (C46691ai) arrayList.get(0);
    }
}
