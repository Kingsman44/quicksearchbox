package com.google.android.libraries.search.p2904c.p2911c.p2912a;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2942m.p2944b.C37875c;
import com.google.android.libraries.search.p2904c.p2942m.p2944b.C37876d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.c.a.g */
/* compiled from: PG */
public final class C37430g {

    /* renamed from: c */
    private static final C59071e f99372c = C59071e.m91331h();

    /* renamed from: a */
    public final C37875c f99373a;

    /* renamed from: b */
    public final C37428e f99374b;

    /* renamed from: d */
    private final AtomicBoolean f99375d = new AtomicBoolean(false);

    public C37430g(C37360ay ayVar, C37876d dVar) {
        this.f99373a = dVar.mo41095a(ayVar);
        this.f99374b = new C37429f(this);
    }

    /* renamed from: a */
    public final void mo40951a() {
        if (!this.f99375d.getAndSet(true)) {
            C59052c cVar = (C59052c) f99372c.mo56224b();
            String a = C37331f.m66337a(this);
            cVar.mo56379ah(new C59094n(52686));
            cVar.mo56389s("#audio# close processor (%s)", a);
            this.f99373a.mo41094a(-1);
        }
    }

    /* renamed from: b */
    public final void mo40952b(byte[] bArr, int i) {
        C69664n.m101061g(bArr, "source");
        if (!this.f99375d.get()) {
            this.f99373a.mo41094a(i);
        }
    }

    /* renamed from: c */
    public final void mo40953c(byte[] bArr, int i, int i2) {
        int i3;
        C69664n.m101061g(bArr, "source");
        if (!this.f99375d.get() && (i3 = i2 - i) > 0) {
            this.f99373a.mo41094a(i3);
        }
    }
}
