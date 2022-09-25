package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ew */
/* compiled from: PG */
final class C126139ew {

    /* renamed from: a */
    C126140ex f347586a = new C126062c(0, BuildConfig.FLAVOR);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C126140ex mo107374a() {
        C126062c cVar;
        cVar = new C126062c(((C126062c) this.f347586a).f347430a + 1, BuildConfig.FLAVOR);
        this.f347586a = cVar;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Optional mo107375b(String str) {
        if (str.equals(((C126062c) this.f347586a).f347431b)) {
            return Optional.empty();
        }
        C126062c cVar = new C126062c(((C126062c) this.f347586a).f347430a, str);
        this.f347586a = cVar;
        return Optional.m71637of(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo107376c(C126140ex exVar) {
        boolean equals;
        equals = this.f347586a.equals(exVar);
        if (equals) {
            mo107374a();
        }
        return equals;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo107377d(C126140ex exVar) {
        return ((C126062c) this.f347586a).f347430a == ((C126062c) exVar).f347430a;
    }
}
