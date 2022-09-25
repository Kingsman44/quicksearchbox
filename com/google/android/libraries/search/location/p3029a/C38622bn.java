package com.google.android.libraries.search.location.p3029a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.common.C143875g;
import com.google.android.libraries.search.location.p3029a.p3030a.C38579h;
import com.google.android.libraries.search.location.p3029a.p3030a.C38580i;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p3094q.p3095a.C39904i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.location.a.bn */
/* compiled from: PG */
public final class C38622bn {

    /* renamed from: a */
    public static final C59071e f102053a = C59071e.m91332i("com.google.android.libraries.search.location.a.bn");

    /* renamed from: b */
    public static final Account f102054b = new Account("sentinel", "signedout");

    /* renamed from: c */
    public final C60888db f102055c;

    /* renamed from: d */
    public final C60836bq f102056d = new C60836bq();

    /* renamed from: e */
    public final Context f102057e;

    /* renamed from: f */
    public final C38580i f102058f;

    /* renamed from: g */
    public final C39904i f102059g;

    /* renamed from: h */
    public final AccountId f102060h;

    /* renamed from: i */
    public final C46128f f102061i;

    /* renamed from: j */
    public final C46175b f102062j;

    /* renamed from: k */
    public final C143875g f102063k;

    /* renamed from: l */
    public final C142915o f102064l;

    /* renamed from: m */
    private final C60888db f102065m;

    /* renamed from: n */
    private final C38588ah f102066n;

    /* renamed from: o */
    private final C37215b f102067o;

    public C38622bn(C60888db dbVar, C60888db dbVar2, C142915o oVar, C39904i iVar, C38580i iVar2, AccountId accountId, C46128f fVar, C46175b bVar, C38780c cVar, C38588ah ahVar, C143875g gVar, Context context) {
        this.f102055c = dbVar;
        this.f102065m = dbVar2;
        this.f102064l = oVar;
        this.f102059g = iVar;
        this.f102058f = iVar2;
        this.f102066n = ahVar;
        this.f102057e = context;
        this.f102060h = accountId;
        this.f102061i = fVar;
        this.f102062j = bVar;
        this.f102067o = cVar.mo41619a(C38828b.LOCATION_AGSA);
        this.f102063k = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo41521a(boolean z) {
        C38629bu buVar = (C38629bu) C38630bv.f102073e.createBuilder();
        buVar.copyOnWrite();
        C38630bv bvVar = (C38630bv) buVar.instance;
        int i = 2;
        bvVar.f102075a |= 2;
        bvVar.f102077c = z;
        buVar.copyOnWrite();
        C38630bv bvVar2 = (C38630bv) buVar.instance;
        bvVar2.f102075a |= 1;
        bvVar2.f102076b = z;
        if (true != z) {
            i = 3;
        }
        buVar.copyOnWrite();
        C38630bv bvVar3 = (C38630bv) buVar.instance;
        bvVar3.f102078d = i - 1;
        bvVar3.f102075a |= 4;
        C38630bv bvVar4 = (C38630bv) buVar.build();
        C38580i iVar = this.f102058f;
        return C47633f.m84733g(iVar.f101981a.mo46039a(new C38579h(iVar, bvVar4), C60826bg.f164896a)).mo51515h(new C38594an(bvVar4), this.f102055c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo41522b(C58833ax axVar) {
        mo41523c(C37173a.f96785e.mo40779c(), axVar);
        C60870cx a = this.f102058f.mo41503a();
        C60870cx a2 = this.f102066n.mo41518a();
        return C47633f.m84733g(C47636i.m84746e(a, a2).mo51519b(new C38599as(a, a2), this.f102055c)).mo51514f(Throwable.class, new C38612bd(this, axVar), this.f102055c).mo51516i(new C38613be(this, axVar), this.f102055c);
    }

    /* renamed from: c */
    public final void mo41523c(C37252a aVar, C58833ax axVar) {
        if (axVar.mo56113h()) {
            C37215b bVar = this.f102067o;
            ((C37253b) aVar).mo40795s("flow_id", (String) axVar.mo56107c());
            bVar.mo19974a(aVar);
        }
    }

    /* renamed from: d */
    public final void mo41524d(C37252a aVar, C58833ax axVar, int i) {
        if (axVar.mo56113h()) {
            C37215b bVar = this.f102067o;
            ((C37253b) aVar).mo40795s("flow_id", (String) axVar.mo56107c());
            aVar.mo40780d(i - 1, "compliance_location_consent_ds");
            bVar.mo19974a(aVar);
        }
    }

    /* renamed from: e */
    public final C60870cx mo41525e(Account account, boolean z) {
        return C47633f.m84733g(this.f102065m.mo19399b(C47810es.m84978r(new C38606az(this, new HasCapabilitiesRequest(account, new String[]{"gm3dilldmfya"}, (Bundle) null))))).mo51517j(5, TimeUnit.SECONDS, this.f102055c).mo51516i(new C38609ba(this, z, account), this.f102055c).mo51514f(TimeoutException.class, C38610bb.f102044a, this.f102055c).mo51514f(Throwable.class, C38611bc.f102045a, this.f102055c);
    }
}
