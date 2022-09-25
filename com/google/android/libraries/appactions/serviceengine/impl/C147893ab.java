package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52954s;
import com.google.assistant.p3944g.p3948b.p3949a.C52955t;
import com.google.common.base.C58881cr;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ab */
/* compiled from: PG */
public final /* synthetic */ class C147893ab implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f398953a;

    /* renamed from: b */
    public final /* synthetic */ String f398954b;

    public /* synthetic */ C147893ab(C147906ao aoVar, String str) {
        this.f398953a = aoVar;
        this.f398954b = str;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C147906ao aoVar = this.f398953a;
        String str = this.f398954b;
        C52954s sVar = (C52954s) C52955t.f138843e.createBuilder();
        sVar.copyOnWrite();
        C52955t tVar = (C52955t) sVar.instance;
        str.getClass();
        tVar.f138845a |= 1;
        tVar.f138846b = str;
        boolean h = aoVar.mo124571h(str);
        sVar.copyOnWrite();
        C52955t tVar2 = (C52955t) sVar.instance;
        tVar2.f138845a |= 4;
        tVar2.f138848d = h;
        Optional map = Optional.ofNullable(aoVar.f398971a.getPackageManager()).flatMap(new C147924q(str)).map(C147925r.f399004a);
        Objects.requireNonNull(sVar);
        map.ifPresent(new C147901aj(sVar));
        return (C52955t) sVar.build();
    }
}
