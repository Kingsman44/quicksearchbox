package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1858i.C22724a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.c */
/* compiled from: PG */
final class C22598c {

    /* renamed from: a */
    public static final C59071e f62256a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.a.c");

    /* renamed from: a */
    static C60870cx m42091a(String str, C63010eb ebVar, int i, C22724a aVar) {
        SettableFuture settableFuture = new SettableFuture();
        C60856cj.m92911t(aVar.mo27880a(str), C47810es.m84974n(new C22597b(settableFuture, ebVar, i, str, aVar)), C60826bg.f164896a);
        return settableFuture;
    }

    /* renamed from: b */
    static C60870cx m42092b(String str, MessageLite messageLite, long j, int i, C22724a aVar) {
        SettableFuture settableFuture = new SettableFuture();
        C22724a aVar2 = aVar;
        C60856cj.m92911t(aVar2.mo27881b(str, messageLite.toByteArray(), j), C47810es.m84974n(new C22596a(str, settableFuture, i, messageLite, j, aVar2)), C60826bg.f164896a);
        return settableFuture;
    }
}
