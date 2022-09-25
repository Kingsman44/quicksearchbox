package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.storage.protostore.y */
/* compiled from: PG */
public final /* synthetic */ class C43022y implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42875aa f112510a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f112511b;

    /* renamed from: c */
    public final /* synthetic */ int f112512c;

    /* renamed from: d */
    public final /* synthetic */ List f112513d;

    public /* synthetic */ C43022y(C42875aa aaVar, MessageLite messageLite, int i, List list) {
        this.f112510a = aaVar;
        this.f112511b = messageLite;
        this.f112512c = i;
        this.f112513d = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42875aa aaVar = this.f112510a;
        MessageLite messageLite = this.f112511b;
        int i = this.f112512c;
        List list = this.f112513d;
        C60870cx i2 = C60856cj.m92900i(messageLite);
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) C60856cj.m92909r((Future) list.get(i3))).booleanValue()) {
                i2 = C60922j.m93045h(i2, C47810es.m84966f(new C43023z((C43019v) aaVar.f112183a.get(i3))), C60826bg.f164896a);
            }
        }
        return i2;
    }
}
