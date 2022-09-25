package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.common.base.C58817ah;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.C69685i;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.ad */
/* compiled from: PG */
final class C40264ad implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C69626l f105760a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f105761b;

    public C40264ad(C69626l lVar, AtomicReference atomicReference) {
        this.f105760a = lVar;
        this.f105761b = atomicReference;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        C69626l lVar = this.f105760a;
        C69664n.m101058d(messageLite);
        C69685i iVar = (C69685i) lVar.mo5761a(messageLite);
        MessageLite messageLite2 = (MessageLite) iVar.f186052a;
        this.f105761b.set(iVar.f186053b);
        return messageLite2;
    }
}
