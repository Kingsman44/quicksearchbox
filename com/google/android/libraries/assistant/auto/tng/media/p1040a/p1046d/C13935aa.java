package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0315q;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13981f;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13982g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C13935aa implements C13920d {

    /* renamed from: a */
    public final /* synthetic */ C13946al f42414a;

    /* renamed from: b */
    public final /* synthetic */ Optional f42415b;

    /* renamed from: c */
    public final /* synthetic */ Uri f42416c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f42417d;

    public /* synthetic */ C13935aa(C13946al alVar, Optional optional, Uri uri, Bundle bundle) {
        this.f42414a = alVar;
        this.f42415b = optional;
        this.f42416c = uri;
        this.f42417d = bundle;
    }

    /* renamed from: a */
    public final void mo21353a(C0315q qVar) {
        C13946al alVar = this.f42414a;
        Optional optional = this.f42415b;
        Uri uri = this.f42416c;
        Bundle bundle = this.f42417d;
        alVar.mo21369e(C37179a.f97590dC, optional);
        C13982g gVar = alVar.f42455j;
        ((C59052c) ((C59052c) C13982g.f42570a.mo56224b()).mo56372aa(45255)).mo56354G("URI string currently prepared: %s, URI string in the play command: %s", gVar.f42572c, uri);
        if (C58837ba.m90859h(gVar.f42572c) || !gVar.f42572c.equals(uri.toString())) {
            ((C59052c) ((C59052c) C13982g.f42570a.mo56224b()).mo56372aa(45256)).mo56386p("The media.PREPARE_MEDIA operation is missing, default to use playFromUri.");
            qVar.mo1021f(uri, bundle);
            return;
        }
        C60870cx cxVar = gVar.f42571b;
        cxVar.getClass();
        C60845bz n = C47810es.m84974n(new C13981f(qVar, uri, bundle));
        C60856cj.m92911t(cxVar, C47810es.m84974n(n), gVar.f42573d);
    }
}
