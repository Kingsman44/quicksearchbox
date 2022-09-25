package com.google.android.libraries.storage.protostore.p3319d;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.protostore.d.e */
/* compiled from: PG */
public final class C42964e implements C43019v {

    /* renamed from: a */
    public final Uri f112372a;

    /* renamed from: b */
    public final C42813k f112373b;

    /* renamed from: c */
    private final C60887da f112374c;

    public C42964e(C42963d dVar) {
        this.f112372a = dVar.f112371c;
        this.f112374c = dVar.f112369a;
        this.f112373b = dVar.f112370b;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return this.f112374c.mo19399b(new C42960a(this));
    }

    /* renamed from: b */
    public final C60870cx mo18055b(MessageLite messageLite) {
        return this.f112374c.mo19399b(new C42961b(this, messageLite));
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return this.f112374c.mo19399b(new C42962c(this));
    }
}
