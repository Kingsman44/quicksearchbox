package com.google.android.libraries.assistant.p1484g.p1502d;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.d.ao */
/* compiled from: PG */
final class C18163ao implements C18102c {

    /* renamed from: a */
    public final DirectAction f51648a;

    /* renamed from: b */
    final /* synthetic */ C18164ap f51649b;

    public C18163ao(C18164ap apVar, DirectAction directAction) {
        this.f51649b = apVar;
        this.f51648a = directAction;
    }

    /* renamed from: a */
    public final Bundle mo23595a() {
        return this.f51648a.getExtras();
    }

    /* renamed from: b */
    public final Optional mo23596b() {
        return this.f51649b.mo23646c();
    }

    /* renamed from: c */
    public final Optional mo23597c() {
        return this.f51649b.mo23647d();
    }

    /* renamed from: d */
    public final Object mo23598d() {
        return Integer.valueOf(this.f51649b.f51651a);
    }

    /* renamed from: e */
    public final String mo23599e() {
        return this.f51648a.getId();
    }
}
