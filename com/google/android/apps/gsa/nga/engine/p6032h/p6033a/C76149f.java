package com.google.android.apps.gsa.nga.engine.p6032h.p6033a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80100ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80101ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.h.a.f */
/* compiled from: PG */
public final class C76149f implements C76146c {

    /* renamed from: a */
    private final C76455a f211125a;

    /* renamed from: b */
    private final C22871g f211126b;

    public C76149f(C76455a aVar, C22871g gVar) {
        this.f211125a = aVar;
        this.f211126b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo72091a(String str) {
        Bundle bundle = new Bundle();
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80100ao aoVar = (C80100ao) C80101ap.f219806c.createBuilder();
        aoVar.copyOnWrite();
        C80101ap apVar = (C80101ap) aoVar.instance;
        str.getClass();
        apVar.f219808a |= 1;
        apVar.f219809b = str;
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        C80101ap apVar2 = (C80101ap) aoVar.build();
        apVar2.getClass();
        bnVar.f219918b = apVar2;
        bnVar.f219917a = 6;
        return this.f211126b.mo28209i(this.f211125a.mo72193d((C80136bn) kVar.build(), Optional.m71637of(bundle)), "[NGA] PopulousCloudContactResolver.queryCloudContacts", C76148e.f211124a);
    }
}
