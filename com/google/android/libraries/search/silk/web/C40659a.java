package com.google.android.libraries.search.silk.web;

import com.google.android.libraries.search.silk.p3184c.C40656a;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apk;
import com.google.common.p4552o.apn;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.a */
/* compiled from: PG */
public final /* synthetic */ class C40659a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C40769f f106680a;

    /* renamed from: b */
    public final /* synthetic */ C59591api f106681b;

    /* renamed from: c */
    public final /* synthetic */ String f106682c;

    /* renamed from: d */
    public final /* synthetic */ String f106683d;

    public /* synthetic */ C40659a(C40769f fVar, C59591api api, String str, String str2) {
        this.f106680a = fVar;
        this.f106681b = api;
        this.f106682c = str;
        this.f106683d = str2;
    }

    public final void accept(Object obj) {
        C40769f fVar = this.f106680a;
        C59591api api = this.f106681b;
        String str = this.f106682c;
        String str2 = this.f106683d;
        C40656a aVar = (C40656a) obj;
        api.copyOnWrite();
        apn apn = (apn) api.instance;
        apn apn2 = apn.f159680i;
        apn.f159682a |= 128;
        apn.f159686e = str;
        api.copyOnWrite();
        apn apn3 = (apn) api.instance;
        apn3.f159682a |= 256;
        apn3.f159687f = str2;
        api.copyOnWrite();
        apn apn4 = (apn) api.instance;
        apn4.f159683b = 1;
        apn4.f159682a |= 4;
        apk a = apk.m92453a(fVar.f106885a.f106860b);
        if (a == null) {
            a = apk.UNKNOWN_SURFACE;
        }
        api.copyOnWrite();
        apn apn5 = (apn) api.instance;
        apn5.f159684c = a.f159677E;
        apn5.f159682a |= 16;
        aVar.mo42584a((apn) api.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
