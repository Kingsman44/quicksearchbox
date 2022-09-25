package com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.b.b */
/* compiled from: PG */
final class C90993b extends LinkedHashMap {

    /* renamed from: a */
    final /* synthetic */ int f254192a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90993b(int i, int i2) {
        super(i);
        this.f254192a = i2;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f254192a;
    }
}
