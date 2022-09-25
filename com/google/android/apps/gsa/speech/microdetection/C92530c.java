package com.google.android.apps.gsa.speech.microdetection;

import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.c */
/* compiled from: PG */
public final class C92530c implements C90991b {

    /* renamed from: a */
    private final BitFlags f258224a;

    public C92530c() {
        this.f258224a = new BitFlags(C92530c.class, "FLAG_", 0);
    }

    public C92530c(C92530c cVar) {
        this.f258224a = new BitFlags(C92530c.class, "FLAG_", cVar.f258224a.f253762b);
    }

    /* renamed from: h */
    private static long m152227h(long j) {
        return (j ^ -1) & Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final synchronized boolean mo87300a() {
        return BitFlags.m148144f(this.f258224a.f253762b, 5);
    }

    /* renamed from: b */
    public final synchronized boolean mo87301b() {
        return !this.f258224a.mo85050d();
    }

    /* renamed from: c */
    public final synchronized boolean mo87302c() {
        return this.f258224a.f253762b == 1;
    }

    /* renamed from: e */
    public final synchronized boolean mo87303e() {
        return this.f258224a.mo85049c(m152227h(5), 5);
    }

    /* renamed from: f */
    public final synchronized boolean mo87304f() {
        return this.f258224a.mo85054g();
    }

    /* renamed from: g */
    public final synchronized boolean mo87305g() {
        return this.f258224a.mo85049c(m152227h(1), 1);
    }

    /* renamed from: gS */
    public final synchronized void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MicroDetectionMode");
        fVar.mo85279c("Detection Mode").mo85276a(C90752i.m148229c(this.f258224a.mo85048b()));
    }

    public final synchronized String toString() {
        return "[mDetectionMode: " + this.f258224a.mo85048b() + "]";
    }
}
