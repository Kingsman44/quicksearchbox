package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.a */
/* compiled from: PG */
final class C114165a extends C114208aw {

    /* renamed from: a */
    private final boolean f316512a;

    /* renamed from: b */
    private final C58495hd f316513b;

    public C114165a(boolean z, C58495hd hdVar) {
        this.f316512a = z;
        this.f316513b = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo101238a() {
        return this.f316513b;
    }

    /* renamed from: b */
    public final boolean mo101239b() {
        return this.f316512a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114208aw) {
            C114208aw awVar = (C114208aw) obj;
            return this.f316512a == awVar.mo101239b() && this.f316513b.equals(awVar.mo101238a());
        }
    }

    public final int hashCode() {
        return (((true != this.f316512a ? 1237 : 1231) ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f316513b.entrySet());
    }

    public final String toString() {
        boolean z = this.f316512a;
        String obj = this.f316513b.toString();
        return "CsiPing{isEarly=" + z + ", metrics=" + obj + "}";
    }
}
