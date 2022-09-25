package com.google.android.apps.gsa.staticplugins.webview;

import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.b */
/* compiled from: PG */
final class C118137b extends C118219dz {

    /* renamed from: a */
    private final List f327893a;

    /* renamed from: b */
    private final C58833ax f327894b;

    public C118137b(List list, C58833ax axVar) {
        this.f327893a = list;
        this.f327894b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo103553a() {
        return this.f327894b;
    }

    /* renamed from: b */
    public final List mo103554b() {
        return this.f327893a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C118219dz) {
            C118219dz dzVar = (C118219dz) obj;
            return this.f327893a.equals(dzVar.mo103554b()) && this.f327894b.equals(dzVar.mo103553a());
        }
    }

    public final int hashCode() {
        return ((this.f327893a.hashCode() ^ 1000003) * 1000003) ^ this.f327894b.hashCode();
    }

    public final String toString() {
        String obj = this.f327893a.toString();
        String valueOf = String.valueOf(this.f327894b);
        return "WebViewHistoryState{history=" + obj + ", uri=" + valueOf + "}";
    }
}
