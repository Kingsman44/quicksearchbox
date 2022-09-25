package com.google.android.play.core.p3534f;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.f.i */
/* compiled from: PG */
final class C45101i implements C45103k {

    /* renamed from: a */
    final /* synthetic */ Set f117766a;

    /* renamed from: b */
    final /* synthetic */ C45112t f117767b;

    /* renamed from: c */
    final /* synthetic */ C45106n f117768c;

    public C45101i(C45106n nVar, Set set, C45112t tVar) {
        this.f117768c = nVar;
        this.f117766a = set;
        this.f117767b = tVar;
    }

    /* renamed from: a */
    public final void mo48938a(ZipFile zipFile, Set set) {
        Set set2 = this.f117766a;
        C45106n nVar = this.f117768c;
        C45112t tVar = this.f117767b;
        HashSet hashSet = new HashSet();
        nVar.mo48939b(tVar, set, new C45102j(hashSet, tVar, zipFile));
        set2.addAll(hashSet);
    }
}
