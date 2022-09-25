package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.protostore.w */
/* compiled from: PG */
public final /* synthetic */ class C43020w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42875aa f112504a;

    /* renamed from: b */
    public final /* synthetic */ List f112505b;

    /* renamed from: c */
    public final /* synthetic */ int f112506c;

    public /* synthetic */ C43020w(C42875aa aaVar, List list, int i) {
        this.f112504a = aaVar;
        this.f112505b = list;
        this.f112506c = i;
    }

    public final C60870cx apply(Object obj) {
        C42875aa aaVar = this.f112504a;
        List list = this.f112505b;
        return C60856cj.m92892a(list).mo57335b(C47810es.m84965e(new C43022y(aaVar, (MessageLite) obj, this.f112506c, list)), aaVar.f112184b);
    }
}
