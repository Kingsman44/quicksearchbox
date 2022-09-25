package com.google.android.libraries.assistant.auto.tng.p1322v.p1324b;

import com.google.common.base.C58817ah;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0024t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.b.c */
/* compiled from: PG */
public final /* synthetic */ class C16837c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16844j f49295a;

    /* renamed from: b */
    public final /* synthetic */ boolean f49296b;

    /* renamed from: c */
    public final /* synthetic */ long f49297c;

    public /* synthetic */ C16837c(C16844j jVar, boolean z, long j) {
        this.f49295a = jVar;
        this.f49296b = z;
        this.f49297c = j;
    }

    public final Object apply(Object obj) {
        C16844j jVar = this.f49295a;
        boolean z = this.f49296b;
        long j = this.f49297c;
        C0009e eVar = (C0009e) ((C0024t) obj).toBuilder();
        long b = z ? jVar.f49306c.mo26870b() + j : 0;
        eVar.copyOnWrite();
        C0024t tVar = (C0024t) eVar.instance;
        tVar.f69a |= 32;
        tVar.f75g = b;
        return (C0024t) eVar.build();
    }
}
