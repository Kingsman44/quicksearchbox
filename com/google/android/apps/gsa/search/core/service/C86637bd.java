package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86134c;
import com.google.android.apps.gsa.search.core.p6807j.C86135d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.service.bd */
/* compiled from: PG */
public final class C86637bd extends C91093c {

    /* renamed from: a */
    public static final C59071e f234057a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.bd");

    /* renamed from: b */
    public final C68214a f234058b;

    /* renamed from: c */
    private final Context f234059c;

    /* renamed from: e */
    private final C68214a f234060e;

    /* renamed from: f */
    private final C68214a f234061f;

    /* renamed from: g */
    private final C68214a f234062g;

    /* renamed from: h */
    private final C68214a f234063h;

    /* renamed from: i */
    private final C22871g f234064i;

    /* renamed from: j */
    private final C86124t f234065j;

    public C86637bd(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, C86124t tVar) {
        super(context);
        this.f234059c = context;
        this.f234060e = aVar;
        this.f234061f = aVar2;
        this.f234062g = aVar3;
        this.f234063h = aVar4;
        this.f234058b = aVar5;
        this.f234064i = gVar;
        this.f234065j = tVar;
    }

    /* renamed from: i */
    private final void m139551i(Intent intent) {
        boolean z;
        if (this.f234065j.mo79746e(C90110fh.f250593R)) {
            z = intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED", false);
        } else {
            z = intent.hasExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED");
        }
        if (z) {
            ((C89859i) this.f234063h.mo27525b()).mo83702b(C89849ae.CCT_INTENT_STARTED);
        }
        if (intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.LOG_NO_SESSION_APP_FLOW", false)) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.CCT_LAUNCHED_WITHOUT_SESSION;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C58833ax a = C89917a.m146440a(intent);
            if (a.mo56113h()) {
                long longValue = ((Long) a.mo56107c()).longValue();
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                cbVar.f160123d |= 65536;
                cbVar.f160085aW = longValue;
            }
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f234063h.mo27525b()).mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: o */
    private final void m139552o(Intent intent) {
        C58833ax axVar = (C58833ax) this.f234061f.mo27525b();
        if (axVar.mo56113h()) {
            ((C100321a) axVar.mo56107c()).mo91880d(intent.toUri(0));
        }
    }

    /* renamed from: p */
    private final void m139553p() {
        C58833ax axVar = (C58833ax) this.f234061f.mo27525b();
        if (axVar.mo56113h()) {
            this.f254388d = ((C100321a) axVar.mo56107c()).mo91877a(this.f234059c, "SearchServiceIntentStar");
        }
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        C86636bc bcVar;
        C86135d dVar;
        C59104x b = f234057a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SearchServiceIntentStar");
        boolean z = false;
        ((C59052c) ((C59052c) b).mo56372aa(8444)).mo56389s("startActivity: %s", intent.toUri(0));
        C86775r rVar = ((C86610af) this.f234060e.mo27525b()).f233977l;
        if (rVar == null) {
            m139553p();
        } else if (intent.getBooleanExtra("on_lockscreen", false)) {
            rVar.mo80391m(intent);
            m139552o(intent);
            return true;
        } else if (intent.getBooleanExtra("launch_in_current_process", false)) {
            m139553p();
            return super.mo65089a(intent);
        }
        if (rVar == null) {
            bcVar = new C86627aw(this);
        } else {
            bcVar = new C86628ax(this, rVar);
        }
        boolean z2 = rVar == null || !rVar.f234384f.f236953f.equals("opa");
        if (!intent.hasCategory("android.intent.category.BROWSABLE") || intent.hasExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED") || !((C58833ax) this.f234062g.mo27525b()).mo56113h()) {
            dVar = C86135d.m138541d(intent);
        } else {
            dVar = ((C86134c) ((C58833ax) this.f234062g.mo27525b()).mo56107c()).mo79784a(intent);
        }
        if (z2) {
            new C90873ag(dVar.mo79773a(), this.f234064i, "Custom Tabs interceptor", new C86634ba(this, dVar)).mo85223a(C86635bb.f234056a);
        }
        boolean b2 = dVar.mo79774b();
        C60870cx a = dVar.mo79773a();
        if (a.isDone() || b2) {
            z = true;
        }
        C58893dc.m90997b(z);
        if (a.isDone()) {
            return bcVar.mo80256a((Intent) C60856cj.m92910s(a));
        }
        C22871g gVar = this.f234064i;
        Objects.requireNonNull(bcVar);
        new C90873ag(a, gVar, "Process Custom Tabs intent", new C86629ay(bcVar)).mo85223a(C86630az.f234053a);
        return true;
    }

    /* renamed from: b */
    public final boolean mo65090b(Intent intent, C91096f fVar) {
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", true);
        return mo65089a(intent);
    }

    /* renamed from: c */
    public final boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        return false;
    }

    /* renamed from: d */
    public final boolean mo65092d() {
        C86775r rVar = ((C86610af) this.f234060e.mo27525b()).f233977l;
        return rVar != null && !BitFlags.m148144f(rVar.f234384f.f236949b.f253762b, 65536);
    }

    /* renamed from: e */
    public final boolean mo65093e() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo80258g(Intent intent, C86775r rVar) {
        if (((C86610af) this.f234060e.mo27525b()).f233977l != rVar) {
            C59104x d = f234057a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchServiceIntentStar");
            ((C59052c) ((C59052c) d).mo56372aa(8443)).mo56386p("Client changed after Custom Tabs processing finished. Falling back to no-client");
            boolean a = super.mo65089a(intent);
            m139551i(intent);
            return a;
        }
        rVar.mo80391m(intent);
        m139551i(intent);
        m139552o(intent);
        return true;
    }

    /* renamed from: h */
    public final boolean mo80259h(Intent intent) {
        boolean a = super.mo65089a(intent);
        m139551i(intent);
        return a;
    }
}
