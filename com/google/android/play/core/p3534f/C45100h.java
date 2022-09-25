package com.google.android.play.core.p3534f;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.f.h */
/* compiled from: PG */
final class C45100h implements C45103k {

    /* renamed from: a */
    final /* synthetic */ C45112t f117762a;

    /* renamed from: b */
    final /* synthetic */ Set f117763b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f117764c;

    /* renamed from: d */
    final /* synthetic */ C45106n f117765d;

    public C45100h(C45106n nVar, C45112t tVar, Set set, AtomicBoolean atomicBoolean) {
        this.f117765d = nVar;
        this.f117762a = tVar;
        this.f117763b = set;
        this.f117764c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo48938a(ZipFile zipFile, Set set) {
        this.f117765d.mo48939b(this.f117762a, set, new C45099g(this));
    }
}
