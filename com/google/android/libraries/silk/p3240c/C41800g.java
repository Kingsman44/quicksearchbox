package com.google.android.libraries.silk.p3240c;

import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.silk.c.g */
/* compiled from: PG */
public final /* synthetic */ class C41800g implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C41871q f109170a;

    /* renamed from: b */
    public final /* synthetic */ String f109171b;

    /* renamed from: c */
    public final /* synthetic */ String f109172c;

    /* renamed from: d */
    public final /* synthetic */ Optional f109173d;

    public /* synthetic */ C41800g(C41871q qVar, String str, String str2, Optional optional) {
        this.f109170a = qVar;
        this.f109171b = str;
        this.f109172c = str2;
        this.f109173d = optional;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C41871q qVar = this.f109170a;
        String str = this.f109171b;
        String str2 = this.f109172c;
        Optional optional = this.f109173d;
        qVar.mo44347c(str, str2);
        optional.ifPresent(new C41750a(qVar, (MessageLite) obj));
    }
}
