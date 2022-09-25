package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b */
/* compiled from: PG */
public final class C123949b implements C123976m {

    /* renamed from: a */
    public final C58974d f342355a;

    /* renamed from: b */
    private final C52560wg f342356b;

    /* renamed from: c */
    private final C50690ab f342357c;

    /* renamed from: d */
    private final C123978o f342358d;

    /* renamed from: e */
    private final C58881cr f342359e;

    /* renamed from: f */
    private Optional f342360f;

    public C123949b(C52560wg wgVar, C50690ab abVar, C123978o oVar, C130603a aVar) {
        this.f342356b = wgVar;
        this.f342357c = abVar;
        this.f342358d = oVar;
        this.f342355a = aVar.mo109740b(this);
        this.f342360f = C123978o.m203353b(wgVar);
        this.f342359e = C58886cw.m90973a(new C123916a(this, abVar, wgVar));
    }

    /* renamed from: a */
    public final C50690ab mo106206a() {
        return this.f342357c;
    }

    /* renamed from: b */
    public final C52560wg mo106207b() {
        return this.f342356b;
    }

    /* renamed from: c */
    public final Optional mo106208c() {
        return (Optional) this.f342359e.mo6453a();
    }

    /* renamed from: d */
    public final Optional mo106209d() {
        return this.f342360f;
    }

    /* renamed from: e */
    public final String mo106210e(int i) {
        String uri = this.f342358d.mo106222a(this.f342356b, i, false).toUri(1);
        ((C58970a) ((C58970a) this.f342355a.mo56224b()).mo56372aa(35298)).mo56389s("#generateIntentUri: %s", uri);
        return uri;
    }

    /* renamed from: f */
    public final /* synthetic */ String mo106211f() {
        return C123975l.m203338b(this);
    }

    /* renamed from: g */
    public final /* synthetic */ String mo106212g() {
        return C123975l.m203339c(this);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo106213h() {
        return C123975l.m203340d(this);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo106214i() {
        return C123975l.m203341e(this);
    }

    /* renamed from: j */
    public final void mo106215j(C63088z zVar) {
        this.f342360f = Optional.m71637of(zVar);
    }
}
