package com.google.android.libraries.silk.p3240c;

import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apn;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import p3186j$.util.Optional;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.silk.c.f */
/* compiled from: PG */
public final /* synthetic */ class C41790f implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C41871q f109157a;

    /* renamed from: b */
    public final /* synthetic */ String f109158b;

    /* renamed from: c */
    public final /* synthetic */ String f109159c;

    /* renamed from: d */
    public final /* synthetic */ Optional f109160d;

    public /* synthetic */ C41790f(C41871q qVar, String str, String str2, Optional optional) {
        this.f109157a = qVar;
        this.f109158b = str;
        this.f109159c = str2;
        this.f109160d = optional;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C41871q qVar = this.f109157a;
        String str = this.f109158b;
        String str2 = this.f109159c;
        Optional optional = this.f109160d;
        C56848d c = C41749b.m73224c((Throwable) obj);
        String str3 = c.f151672b;
        C59591api api = (C59591api) apn.f159680i.createBuilder();
        api.copyOnWrite();
        apn apn = (apn) api.instance;
        apn.f159685d = 2;
        apn.f159682a |= 32;
        api.copyOnWrite();
        apn apn2 = (apn) api.instance;
        str3.getClass();
        apn2.f159682a |= 512;
        apn2.f159688g = str3;
        qVar.mo44346b(api, str, str2);
        optional.ifPresent(new C41813i(qVar, c));
    }
}
