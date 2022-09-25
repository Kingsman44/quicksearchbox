package com.google.android.libraries.p11002ag.p11004b;

import com.google.android.libraries.p11002ag.C147573c;
import com.google.android.libraries.p11002ag.p11004b.p11005a.C147558a;
import com.google.android.libraries.p11002ag.p11004b.p11005a.C147559b;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147560a;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147565f;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147568i;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147569j;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147570k;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147571l;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147572m;

/* renamed from: com.google.android.libraries.ag.b.a */
/* compiled from: PG */
public final class C147557a {

    /* renamed from: a */
    public static final C147557a f398252a = new C147557a();

    /* renamed from: b */
    public final C147559b f398253b;

    /* renamed from: c */
    public final C147573c f398254c;

    /* renamed from: d */
    public final C147570k f398255d;

    /* renamed from: e */
    public final C147571l f398256e;

    /* renamed from: f */
    private final C147570k f398257f;

    private C147557a() {
        C147559b bVar = new C147559b();
        this.f398253b = bVar;
        C147558a aVar = new C147558a();
        this.f398254c = aVar;
        C147569j jVar = new C147569j("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto");
        this.f398255d = jVar;
        new C147568i(jVar, aVar, bVar);
        C147569j jVar2 = new C147569j("/com/google/android/libraries/phonenumbers/data/ShortNumberMetadataProto");
        this.f398257f = jVar2;
        this.f398256e = new C147572m(jVar2, aVar, bVar);
        new C147569j("/com/google/android/libraries/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        new C147560a(C147565f.m240601c());
    }
}
