package com.google.android.apps.gsa.staticplugins.bisto.p7457a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a.a */
/* compiled from: PG */
public abstract class C94636a implements C94640d {

    /* renamed from: c */
    private static final C59071e f264704c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.a.a");

    /* renamed from: a */
    public final C95307m f264705a;

    /* renamed from: b */
    public final C21370a f264706b;

    protected C94636a(C95307m mVar, C21370a aVar) {
        this.f264705a = mVar;
        this.f264706b = aVar;
    }

    /* renamed from: a */
    public C94638b mo88567a() {
        if (!mo88576j()) {
            C59104x d = f264704c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AbstractAnnouncement");
            ((C59052c) ((C59052c) d).mo56372aa(14545)).mo56386p("Cant take action when actions aren't accepted.");
            int i = C90755l.f253831a;
        }
        return new C94638b(false, false, false);
    }

    /* renamed from: b */
    public C94639c mo88568b(C95455a aVar, C95065ab abVar, Runnable runnable) {
        return new C94639c(false, false);
    }

    /* renamed from: c */
    public C60237lk mo88569c() {
        C60237lk lkVar = (C60237lk) C60241lo.f162980w.createBuilder();
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
        npVar.copyOnWrite();
        C60305nr nrVar = (C60305nr) npVar.instance;
        nrVar.f163182b = 2;
        nrVar.f163181a |= 1;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60305nr nrVar2 = (C60305nr) npVar.build();
        nrVar2.getClass();
        loVar.f162987f = nrVar2;
        loVar.f162982a |= 64;
        return lkVar;
    }

    /* renamed from: d */
    public String mo88570d() {
        return null;
    }

    /* renamed from: e */
    public String mo88571e() {
        return null;
    }

    /* renamed from: f */
    public void mo88572f(boolean z) {
    }

    /* renamed from: g */
    public void mo88573g(boolean z) {
    }

    /* renamed from: h */
    public /* synthetic */ void mo88574h(String str, Runnable runnable) {
    }

    /* renamed from: i */
    public void mo88575i() {
    }

    /* renamed from: j */
    public boolean mo88576j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo88577k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: m */
    public /* synthetic */ boolean mo88579m() {
        return false;
    }
}
