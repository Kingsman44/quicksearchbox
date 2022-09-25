package com.google.apps.tiktok.account.data.manager;

import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.account.data.manager.an */
/* compiled from: PG */
public final class C46241an implements C43019v {

    /* renamed from: a */
    public final AtomicReference f121214a = new AtomicReference();

    /* renamed from: b */
    final /* synthetic */ String f121215b;

    /* renamed from: c */
    final /* synthetic */ C46242ao f121216c;

    /* renamed from: d */
    final /* synthetic */ C46244aq f121217d;

    public C46241an(C46244aq aqVar, String str, C46242ao aoVar) {
        this.f121217d = aqVar;
        this.f121215b = str;
        this.f121216c = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60856cj.m92895d(this.f121217d.f121221b.mo19399b(new C46236ai(this)), this.f121217d.f121222c.mo46039a(new C46237aj(this.f121215b), C60826bg.f164896a)).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo18055b(MessageLite messageLite) {
        return this.f121216c.mo50295a(messageLite, (C46243ap) this.f121214a.get());
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60922j.m93044g(C60922j.m93045h(this.f121217d.f121221b.mo19399b(new C46238ak(this)), new C46239al(C60922j.m93044g(this.f121217d.f121222c.mo46042d(), new C46235ah(this.f121215b), C60826bg.f164896a)), C60826bg.f164896a), new C46240am(this), this.f121217d.f121221b);
    }
}
