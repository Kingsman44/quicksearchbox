package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;
import p5488io.p5490b.C70121m;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C21077a implements C70121m {

    /* renamed from: a */
    public final /* synthetic */ String f59084a;

    /* renamed from: b */
    public final /* synthetic */ ByteStore f59085b;

    public /* synthetic */ C21077a(String str, ByteStore byteStore) {
        this.f59084a = str;
        this.f59085b = byteStore;
    }

    /* renamed from: a */
    public final void mo26136a(C69977g gVar) {
        String str = this.f59084a;
        ByteStore byteStore = this.f59085b;
        Subscription subscribe = byteStore.subscribe(str, new C21080d(gVar, str));
        if (subscribe != null) {
            Objects.requireNonNull(subscribe);
            gVar.mo61553c(new C21079c(subscribe));
        }
        Snapshot snapshot = byteStore.snapshot();
        if (snapshot != null) {
            gVar.mo61552b(C58833ax.m90833j(snapshot.find(str)));
        }
    }
}
