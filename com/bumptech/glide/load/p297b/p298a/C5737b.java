package com.bumptech.glide.load.p297b.p298a;

import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.C5939n;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5762an;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.b.a.b */
/* compiled from: PG */
public final class C5737b implements C5764ap {

    /* renamed from: a */
    public static final C5959r f17295a = C5959r.m15375b("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b */
    private final C5762an f17296b;

    public C5737b() {
        this.f17296b = null;
    }

    public C5737b(C5762an anVar) {
        this.f17296b = anVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        C5750ab abVar = (C5750ab) obj;
        C5750ab abVar2 = (C5750ab) this.f17296b.mo12268a(abVar, 0, 0);
        if (abVar2 == null) {
            this.f17296b.mo12269b(abVar, 0, 0, abVar);
        } else {
            abVar = abVar2;
        }
        return new C5763ao(abVar, Collections.emptyList(), new C5939n(abVar, ((Integer) sVar.mo12401b(f17295a)).intValue()));
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        C5750ab abVar = (C5750ab) obj;
        return true;
    }
}
