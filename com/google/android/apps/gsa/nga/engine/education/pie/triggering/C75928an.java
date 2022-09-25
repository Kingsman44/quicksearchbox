package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75830bd;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.an */
/* compiled from: PG */
public final class C75928an implements C75864b {

    /* renamed from: a */
    public static final C58974d f210671a = C58974d.m91136j();

    /* renamed from: b */
    public final C75866e f210672b;

    /* renamed from: c */
    public final C75911l f210673c;

    /* renamed from: d */
    public final C81515c f210674d;

    /* renamed from: e */
    public final C76092h f210675e;

    /* renamed from: f */
    public final C21370a f210676f;

    /* renamed from: g */
    public final C75830bd f210677g;

    /* renamed from: h */
    private final C75910k f210678h;

    public C75928an(C75866e eVar, C75830bd bdVar, C75910k kVar, C75911l lVar, C81515c cVar, C76092h hVar, C21370a aVar) {
        this.f210672b = eVar;
        this.f210677g = bdVar;
        this.f210678h = kVar;
        this.f210674d = cVar;
        this.f210675e = hVar;
        this.f210673c = lVar;
        this.f210676f = aVar;
    }

    /* renamed from: c */
    public static C47868b m122450c(String str, Bundle bundle) {
        String uri = new Intent(str).putExtras(bundle).putExtra("NGA_PIE", true).toUri(0);
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        aVar.mo51701a(uri);
        return (C47868b) aVar.build();
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210678h.mo71909a(new C75926al(this));
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210678h.mo71911c(new C75926al(this));
    }
}
