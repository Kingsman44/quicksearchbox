package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.view.contentcapture.DataShareRequest;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C119196h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C119202n f332406a;

    /* renamed from: b */
    public final /* synthetic */ String f332407b;

    /* renamed from: c */
    public final /* synthetic */ Instant f332408c;

    /* renamed from: d */
    public final /* synthetic */ DataShareRequest f332409d;

    /* renamed from: e */
    public final /* synthetic */ MessageLite f332410e;

    /* renamed from: f */
    public final /* synthetic */ int f332411f;

    public /* synthetic */ C119196h(C119202n nVar, String str, Instant instant, DataShareRequest dataShareRequest, MessageLite messageLite, int i) {
        this.f332406a = nVar;
        this.f332407b = str;
        this.f332408c = instant;
        this.f332409d = dataShareRequest;
        this.f332410e = messageLite;
        this.f332411f = i;
    }

    public final Object call() {
        return this.f332406a.mo104240b(this.f332407b, this.f332408c, this.f332409d, this.f332410e, this.f332411f + 1);
    }
}
