package com.bumptech.glide.load.p293a;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.p292a.C5610f;
import com.bumptech.glide.p291h.p292a.C5612h;
import com.bumptech.glide.p291h.p292a.C5613i;
import com.bumptech.glide.p291h.p292a.C5614j;

/* renamed from: com.bumptech.glide.load.a.au */
/* compiled from: PG */
final class C5678au implements C5679av, C5610f {

    /* renamed from: a */
    private static final C1971f f17124a = C5612h.m14575a(20, new C5677at());

    /* renamed from: b */
    private final C5614j f17125b = new C5613i();

    /* renamed from: c */
    private C5679av f17126c;

    /* renamed from: d */
    private boolean f17127d;

    /* renamed from: e */
    private boolean f17128e;

    /* renamed from: d */
    static C5678au m14739d(C5679av avVar) {
        C5678au auVar = (C5678au) f17124a.mo5126a();
        C5630q.m14607d(auVar, "Argument must not be null");
        auVar.f17128e = false;
        auVar.f17127d = true;
        auVar.f17126c = avVar;
        return auVar;
    }

    /* renamed from: a */
    public final int mo12158a() {
        return this.f17126c.mo12158a();
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return this.f17126c.mo12159b();
    }

    /* renamed from: c */
    public final Object mo12160c() {
        return this.f17126c.mo12160c();
    }

    /* renamed from: e */
    public final synchronized void mo12162e() {
        this.f17125b.mo12057b();
        this.f17128e = true;
        if (!this.f17127d) {
            this.f17126c.mo12162e();
            this.f17126c = null;
            f17124a.mo5127b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo12180f() {
        this.f17125b.mo12057b();
        if (this.f17127d) {
            this.f17127d = false;
            if (this.f17128e) {
                mo12162e();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }

    /* renamed from: fC */
    public final C5614j mo12055fC() {
        return this.f17125b;
    }
}
