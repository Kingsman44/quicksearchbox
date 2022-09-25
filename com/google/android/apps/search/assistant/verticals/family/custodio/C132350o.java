package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import androidx.lifecycle.C2368bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.o */
/* compiled from: PG */
public final class C132350o implements C45987ay {

    /* renamed from: g */
    private static final C59071e f361281g = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.o");

    /* renamed from: a */
    public final CustodioActivity f361282a;

    /* renamed from: b */
    public final Bundle f361283b;

    /* renamed from: c */
    public final C132352p f361284c;

    /* renamed from: d */
    public final C47477n f361285d;

    /* renamed from: e */
    public final boolean f361286e;

    /* renamed from: f */
    public C37215b f361287f;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.o$a */
    /* compiled from: PG */
    public interface C132351a {
        /* renamed from: eQ */
        C37215b mo110660eQ();
    }

    public C132350o(CustodioActivity custodioActivity, C45989b bVar, C32158h hVar, C47477n nVar, boolean z) {
        this.f361282a = custodioActivity;
        Bundle extras = custodioActivity.getIntent().getExtras();
        this.f361283b = extras == null ? new Bundle() : extras;
        this.f361284c = (C132352p) new C2368bp(custodioActivity).mo5770a(C132352p.class);
        this.f361285d = nVar;
        hVar.mo37971b(custodioActivity, this, bVar);
        this.f361286e = z;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C59071e eVar = f361281g;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39509)).mo56386p("onAccountChanged called");
        this.f361287f = ((C132351a) C47245e.m84045a(this.f361282a.getApplicationContext(), C132351a.class, awVar.f120815a.f120816a)).mo110660eQ();
        C132352p pVar = this.f361284c;
        if (!pVar.f361288a) {
            boolean z = true;
            pVar.f361288a = true;
            Bundle bundle = this.f361283b.getBundle("device_id");
            C37215b bVar = (C37215b) Objects.requireNonNull(this.f361287f);
            C37258g gVar = C37176a.f96981ct;
            C62940bt btVar = C63224d.f170804o;
            C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
            int b = C132361w.m215130b(this.f361283b);
            cVar.copyOnWrite();
            C63224d dVar = (C63224d) cVar.instance;
            dVar.f170807b = b - 1;
            dVar.f170806a |= 1;
            boolean containsKey = this.f361283b.containsKey("account_name");
            cVar.copyOnWrite();
            C63224d dVar2 = (C63224d) cVar.instance;
            dVar2.f170806a |= 2;
            dVar2.f170808c = containsKey;
            boolean containsKey2 = this.f361283b.containsKey("supervised_oid");
            cVar.copyOnWrite();
            C63224d dVar3 = (C63224d) cVar.instance;
            dVar3.f170806a |= 4;
            dVar3.f170809d = containsKey2;
            boolean z2 = bundle != null && bundle.containsKey("cast_device_id");
            cVar.copyOnWrite();
            C63224d dVar4 = (C63224d) cVar.instance;
            dVar4.f170806a |= 8;
            dVar4.f170810e = z2;
            if (bundle == null || !bundle.containsKey("libassistant_device_id")) {
                z = false;
            }
            cVar.copyOnWrite();
            C63224d dVar5 = (C63224d) cVar.instance;
            dVar5.f170806a |= 16;
            dVar5.f170811f = z;
            bVar.mo19974a(gVar.mo40812e(btVar, (C63224d) cVar.build()));
        } else {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39510)).mo56386p("Unexpected duplicate call to onAccountChanged!");
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C132230cp cpVar = new C132230cp();
        C68324h.m98669f(cpVar);
        C47247a.m84047b(cpVar, accountId);
        cpVar.setArguments(this.f361283b);
        C0154a aVar = new C0154a(this.f361282a.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_custodio_root_fragment_container, cpVar, (String) null);
        aVar.mo518o(cpVar);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f361281g.mo56226d()).mo56382g(th)).mo56372aa(39511)).mo56386p("onAccountError called");
        this.f361282a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
