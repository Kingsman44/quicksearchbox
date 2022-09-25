package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.av */
/* compiled from: PG */
public final class C123946av implements C123976m {

    /* renamed from: a */
    private final C52560wg f342341a;

    /* renamed from: b */
    private final C50690ab f342342b;

    /* renamed from: c */
    private final C123978o f342343c;

    /* renamed from: d */
    private final C58974d f342344d;

    /* renamed from: e */
    private final boolean f342345e;

    /* renamed from: f */
    private Optional f342346f;

    public C123946av(C52560wg wgVar, C50690ab abVar, C14626qe qeVar, C123978o oVar, C130603a aVar) {
        this.f342341a = wgVar;
        this.f342342b = abVar;
        this.f342343c = oVar;
        this.f342344d = aVar.mo109740b(this);
        C14626qe qeVar2 = C14626qe.STATUS_UNKNOWN;
        this.f342345e = qeVar.ordinal() == 1 ? false : true;
        this.f342346f = C123978o.m203353b(wgVar);
    }

    /* renamed from: a */
    public final C50690ab mo106206a() {
        return this.f342342b;
    }

    /* renamed from: b */
    public final C52560wg mo106207b() {
        return this.f342341a;
    }

    /* renamed from: c */
    public final /* synthetic */ Optional mo106208c() {
        return C123975l.m203337a(this);
    }

    /* renamed from: d */
    public final Optional mo106209d() {
        return this.f342346f;
    }

    /* renamed from: e */
    public final String mo106210e(int i) {
        ((C58970a) ((C58970a) this.f342344d.mo56224b()).mo56372aa(35323)).mo56386p("Replacing YouTube URI with YTM URI.");
        C52559wf wfVar = (C52559wf) this.f342341a.toBuilder();
        String replace = this.f342341a.f137948d.replace("www.youtube.com", "music.youtube.com");
        wfVar.copyOnWrite();
        C52560wg wgVar = (C52560wg) wfVar.instance;
        replace.getClass();
        wgVar.f137945a |= 1;
        wgVar.f137948d = replace;
        String uri = this.f342343c.mo106222a((C52560wg) wfVar.build(), i, this.f342345e).toUri(1);
        ((C58970a) ((C58970a) this.f342344d.mo56224b()).mo56372aa(35324)).mo56389s("#generateIntentUri: %s", uri);
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
        this.f342346f = Optional.m71637of(zVar);
    }
}
