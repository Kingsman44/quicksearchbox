package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c;

import com.google.android.apps.gsa.shared.p6983ah.C89154k;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a */
/* compiled from: PG */
public final class C78188a extends C78224b {

    /* renamed from: b */
    private final boolean f215270b;

    /* renamed from: c */
    private final boolean f215271c;

    /* renamed from: d */
    private final boolean f215272d;

    /* renamed from: e */
    private final C89158o f215273e;

    /* renamed from: f */
    private final C89154k f215274f;

    public C78188a(boolean z, boolean z2, boolean z3, C89158o oVar, C89154k kVar) {
        this.f215270b = z;
        this.f215271c = z2;
        this.f215272d = z3;
        if (oVar != null) {
            this.f215273e = oVar;
            if (kVar != null) {
                this.f215274f = kVar;
                return;
            }
            throw new NullPointerException("Null opaResponseVisualState");
        }
        throw new NullPointerException("Null opaVisualState");
    }

    /* renamed from: a */
    public final C89154k mo73120a() {
        return this.f215274f;
    }

    /* renamed from: b */
    public final C89158o mo73121b() {
        return this.f215273e;
    }

    /* renamed from: c */
    public final boolean mo73122c() {
        return this.f215272d;
    }

    /* renamed from: d */
    public final boolean mo73123d() {
        return this.f215271c;
    }

    /* renamed from: e */
    public final boolean mo73124e() {
        return this.f215270b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78224b) {
            C78224b bVar = (C78224b) obj;
            return this.f215270b == bVar.mo73124e() && this.f215271c == bVar.mo73123d() && this.f215272d == bVar.mo73122c() && this.f215273e.equals(bVar.mo73121b()) && this.f215274f.equals(bVar.mo73120a());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f215270b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f215271c ? 1237 : 1231)) * 1000003;
        if (true == this.f215272d) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ this.f215273e.hashCode()) * 1000003) ^ this.f215274f.hashCode();
    }

    public final String toString() {
        boolean z = this.f215270b;
        boolean z2 = this.f215271c;
        boolean z3 = this.f215272d;
        String obj = this.f215273e.toString();
        String obj2 = this.f215274f.toString();
        return "CardVisibility{isOpaVisible=" + z + ", isNgaVisible=" + z2 + ", closeSystemDialogRequested=" + z3 + ", opaVisualState=" + obj + ", opaResponseVisualState=" + obj2 + "}";
    }
}
