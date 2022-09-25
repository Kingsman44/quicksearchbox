package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.p104d.p105a.C2164c;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.libraries.p2259n.p2260a.C29763b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56754ah;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56757ak;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.p */
/* compiled from: PG */
final class C43429p extends C5561c {

    /* renamed from: a */
    final /* synthetic */ C2164c f113456a;

    /* renamed from: b */
    final /* synthetic */ String f113457b;

    /* renamed from: d */
    final /* synthetic */ C43431r f113458d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43429p(C43431r rVar, C2164c cVar, String str) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f113458d = rVar;
        this.f113456a = cVar;
        this.f113457b = str;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        this.f113456a.mo5439d(new IllegalArgumentException(String.format("Failed to load image %s.", new Object[]{this.f113457b})));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        C43431r rVar = this.f113458d;
        C2164c cVar = this.f113456a;
        C56754ah ahVar = (C56754ah) C56757ak.f151469k.createBuilder();
        long d = rVar.f113462c.mo26872d();
        ahVar.copyOnWrite();
        C56757ak akVar = (C56757ak) ahVar.instance;
        akVar.f151471a |= 128;
        akVar.f151479i = (int) d;
        C29763b bVar = C29763b.LENS_IN_GOOGLE_APP_BROWSER;
        ahVar.copyOnWrite();
        C56757ak akVar2 = (C56757ak) ahVar.instance;
        akVar2.f151477g = bVar.f80662t;
        akVar2.f151471a |= 32;
        C63088z A = C63088z.m96139A((byte[]) obj);
        ahVar.copyOnWrite();
        C56757ak akVar3 = (C56757ak) ahVar.instance;
        akVar3.f151471a |= 1;
        akVar3.f151472b = A;
        C60856cj.m92911t(rVar.f113460a.mo42554c((C56757ak) ahVar.build()), C47810es.m84974n(C47810es.m84974n(new C43430q(cVar))), C60826bg.f164896a);
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
    }
}
