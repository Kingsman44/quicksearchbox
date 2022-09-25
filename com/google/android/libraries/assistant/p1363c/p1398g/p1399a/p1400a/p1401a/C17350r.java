package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import androidx.media3.common.C2646bh;
import com.google.apps.tiktok.concurrent.C46428ao;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C17350r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17355w f50195a;

    public /* synthetic */ C17350r(C17355w wVar) {
        this.f50195a = wVar;
    }

    public final void run() {
        C17355w wVar = this.f50195a;
        C46428ao aoVar = wVar.f50203c;
        C2646bh bhVar = wVar.f50202b;
        Objects.requireNonNull(bhVar);
        aoVar.post(new C17349q(bhVar));
    }
}
