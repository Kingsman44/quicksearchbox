package com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.config.webfeature.AutoValue_UserAgentListenerFeature;
import com.google.android.libraries.search.silk.web.close.C40727c;
import com.google.android.libraries.search.silk.web.close.SilkCloseFeature;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.p3345b.C43229a;
import com.google.android.libraries.web.webview.contrib.stuckjs.StuckJsFeature;
import com.google.common.p4552o.apk;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.a.a */
/* compiled from: PG */
public final class C134676a implements C43229a {

    /* renamed from: a */
    private final C133665d f366745a;

    /* renamed from: b */
    private final C40758l f366746b;

    public C134676a(C133665d dVar, C40758l lVar) {
        C69664n.m101061g(dVar, "userAgentHelper");
        C69664n.m101061g(lVar, "silkCoreFeatureFactory");
        this.f366745a = dVar;
        this.f366746b = lVar;
    }

    /* renamed from: a */
    public final WebConfig mo46279a() {
        C43259j jVar = new C43259j();
        jVar.f113058a = false;
        String c = this.f366745a.mo111322c();
        C69664n.m101060f(c, "userAgentHelper.userAgentSuffix");
        jVar.mo46375e(c);
        C40758l lVar = this.f366746b;
        C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
        C69664n.m101060f(jVar2, "newBuilder()");
        C69664n.m101061g(jVar2, "builder");
        apk apk = apk.TNG_DISCOVER;
        C69664n.m101061g(apk, "value");
        jVar2.copyOnWrite();
        C40757k kVar = (C40757k) jVar2.instance;
        kVar.f106860b = apk.f159677E;
        kVar.f106859a |= 1;
        C62942bv build = jVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        jVar.mo46372b(StuckJsFeature.m78405e(), lVar.mo42702a((C40757k) build), SilkCloseFeature.m70571e(new C40727c()), new AutoValue_UserAgentListenerFeature());
        return jVar.mo46371a();
    }
}
