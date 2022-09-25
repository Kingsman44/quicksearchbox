package com.google.apps.tiktok.cache;

import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.ak */
/* compiled from: PG */
public final /* synthetic */ class C46373ak implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121389a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121390b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f121391c;

    public /* synthetic */ C46373ak(C46385aw awVar, MessageLite messageLite, MessageLite messageLite2) {
        this.f121389a = awVar;
        this.f121390b = messageLite;
        this.f121391c = messageLite2;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        bfVar.mo45931c("cache_table", this.f121389a.mo50341a(this.f121390b, this.f121391c), 5);
    }
}
