package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import androidx.p104d.p105a.C2164c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C18828ba implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18832be f53027a;

    /* renamed from: b */
    public final /* synthetic */ boolean f53028b;

    public /* synthetic */ C18828ba(C18832be beVar, boolean z) {
        this.f53027a = beVar;
        this.f53028b = z;
    }

    public final void accept(Object obj) {
        C18832be beVar = this.f53027a;
        boolean z = this.f53028b;
        beVar.mo24189f((C2164c) obj, z ? 2 : 10, true != z ? "Cancelled without results." : "Cancelled with results.");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
