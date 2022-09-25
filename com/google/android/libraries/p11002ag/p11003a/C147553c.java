package com.google.android.libraries.p11002ag.p11003a;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.ag.a.c */
/* compiled from: PG */
final class C147553c extends LinkedHashMap {

    /* renamed from: a */
    final /* synthetic */ C147554d f398248a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147553c(C147554d dVar, int i) {
        super(i, 0.75f, true);
        this.f398248a = dVar;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f398248a.f398249a;
    }
}
