package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82653nd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82654ne;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.q */
/* compiled from: PG */
final class C106257q implements C106260t {

    /* renamed from: a */
    final /* synthetic */ C106261u f296464a;

    public C106257q(C106261u uVar) {
        this.f296464a = uVar;
    }

    /* renamed from: a */
    public final String mo95471a() {
        return "Disconnected";
    }

    /* renamed from: b */
    public final void mo95472b() {
        C59104x b = C106261u.f296468a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
        ((C59052c) ((C59052c) b).mo56372aa(25185)).mo56386p("setupConnection");
        boolean a = this.f296464a.f296481n.mo76650a();
        int i = Build.VERSION.SDK_INT >= 30 ? 4097 : 1;
        C106255o oVar = new C106255o(this.f296464a);
        boolean bindService = this.f296464a.f296482o.f296443a.bindService(new Intent().setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.apps.gsa.publicsearch.IPublicSearchService"), oVar.f296460b, i);
        C83305i iVar = this.f296464a.f296474g;
        C82653nd g = C82654ne.m131945g();
        g.mo76152b(((C83217a) this.f296464a.f296473f.map(C106256p.f296463a).orElse(C83217a.UNKNOWN)).f226840e);
        g.mo76153c(a);
        g.mo76154d(bindService);
        iVar.mo75579d(g.mo76151a());
        if (!bindService) {
            C59104x d = C106261u.f296468a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
            ((C59052c) ((C59052c) d).mo56372aa(25186)).mo56386p("Unable to bind to public search service.");
            return;
        }
        this.f296464a.mo95477b(oVar);
    }

    /* renamed from: c */
    public final void mo95473c(String str) {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo95474d() {
    }

    /* renamed from: e */
    public final void mo95475e() {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
    }
}
