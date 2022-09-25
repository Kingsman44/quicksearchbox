package com.google.android.apps.gsa.shared.p7195y;

import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5762an;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.shared.y.c */
/* compiled from: PG */
public final class C91211c implements C5764ap {

    /* renamed from: a */
    public static final C59071e f254597a = C59071e.m91332i("com.google.android.apps.gsa.shared.y.c");

    /* renamed from: b */
    private final C5762an f254598b = new C5762an(500);

    /* renamed from: c */
    private final C91212d f254599c;

    public C91211c(C91212d dVar) {
        this.f254599c = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        int i3;
        C5750ab abVar = (C5750ab) obj;
        C5750ab abVar2 = (C5750ab) this.f254598b.mo12268a(abVar, 0, 0);
        if (abVar2 == null) {
            this.f254598b.mo12269b(abVar, 0, 0, abVar);
        } else {
            abVar = abVar2;
        }
        Integer num = (Integer) sVar.mo12401b(C91188at.f254564a);
        C91212d dVar = this.f254599c;
        if (num == null) {
            i3 = 7;
        } else {
            i3 = num.intValue();
        }
        abVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) dVar.f254600a).f184585a);
        a.getClass();
        C91201bf bfVar = (C91201bf) dVar.f254601b.mo17428b();
        bfVar.getClass();
        return new C5763ao(abVar, Collections.emptyList(), new C91168a(abVar, i3, a, bfVar));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        C5750ab abVar = (C5750ab) obj;
        return abVar.mo12250c().startsWith("http://") || abVar.mo12250c().startsWith("https://");
    }
}
