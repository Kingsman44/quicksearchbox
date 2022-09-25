package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.p2684a;

import android.os.ParcelFileDescriptor;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.g.a.b */
/* compiled from: PG */
public final class C34640b {

    /* renamed from: a */
    public final ParcelFileDescriptor f91976a;

    /* renamed from: b */
    public final ParcelFileDescriptor f91977b;

    /* renamed from: c */
    public final C69613f f91978c = new C69747m(new C34639a(this));

    /* renamed from: d */
    private final ParcelFileDescriptor[] f91979d;

    public C34640b() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        C69664n.m101060f(createPipe, "createPipe()");
        this.f91979d = createPipe;
        this.f91976a = createPipe[0];
        this.f91977b = createPipe[1];
    }
}
