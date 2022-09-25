package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.apps.gsa.p8867w.p8879i.C118800b;
import com.google.android.apps.search.googleapp.compliance.C133586ak;
import com.google.android.apps.search.googleapp.compliance.p10147d.C133637m;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.r */
/* compiled from: PG */
public final class C133567r {

    /* renamed from: a */
    public static final C59071e f363896a = C59071e.m91332i("com.google.android.apps.search.googleapp.compliance.a.r");

    /* renamed from: b */
    public final Executor f363897b;

    /* renamed from: c */
    public final C133637m f363898c;

    /* renamed from: d */
    public final C42876ab f363899d;

    /* renamed from: e */
    public final Optional f363900e;

    /* renamed from: f */
    public final C133586ak f363901f;

    /* renamed from: g */
    public final C46175b f363902g;

    /* renamed from: h */
    public final AccountId f363903h;

    /* renamed from: i */
    public final C44058f f363904i;

    /* renamed from: j */
    public final C136832c f363905j;

    /* renamed from: k */
    public final C37215b f363906k;

    /* renamed from: l */
    public final C60950i f363907l;

    /* renamed from: m */
    public final C118800b f363908m;

    public C133567r(C42876ab abVar, Executor executor, C37215b bVar, C133637m mVar, C118800b bVar2, Optional optional, C133586ak akVar, C46175b bVar3, AccountId accountId, C44058f fVar, C136832c cVar, C60950i iVar) {
        this.f363899d = abVar;
        this.f363897b = executor;
        this.f363906k = bVar;
        this.f363898c = mVar;
        this.f363908m = bVar2;
        this.f363900e = optional;
        this.f363901f = akVar;
        this.f363902g = bVar3;
        this.f363903h = accountId;
        this.f363904i = fVar;
        this.f363905j = cVar;
        this.f363907l = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo111269a(C133570u uVar) {
        C58838bb.m90866a(uVar, "Null params provided to updatePreference");
        C47633f g = C47633f.m84733g(this.f363899d.mo46039a(new C133559j(uVar), this.f363897b));
        return (uVar.mo111262d() != 1 || ((Boolean) uVar.mo111259a().orElse(false)).booleanValue()) ? g : g.mo51516i(new C133560k(this, uVar), this.f363897b);
    }
}
