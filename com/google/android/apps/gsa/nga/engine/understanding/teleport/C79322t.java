package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p001a.p014d.p015a.p016a.C0081z;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.t */
/* compiled from: PG */
final class C79322t extends C79214bx {

    /* renamed from: a */
    private final C0081z f217827a;

    /* renamed from: b */
    private final C58485gu f217828b;

    /* renamed from: c */
    private final C58485gu f217829c;

    public C79322t(C0081z zVar, C58485gu guVar, C58485gu guVar2) {
        this.f217827a = zVar;
        this.f217828b = guVar;
        this.f217829c = guVar2;
    }

    /* renamed from: a */
    public final C0081z mo73840a() {
        return this.f217827a;
    }

    /* renamed from: b */
    public final C58485gu mo73841b() {
        return this.f217829c;
    }

    /* renamed from: c */
    public final C58485gu mo73842c() {
        return this.f217828b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79214bx) {
            C79214bx bxVar = (C79214bx) obj;
            return this.f217827a.equals(bxVar.mo73840a()) && C58597ky.m90218i(this.f217828b, bxVar.mo73842c()) && C58597ky.m90218i(this.f217829c, bxVar.mo73841b());
        }
    }

    public final int hashCode() {
        return ((((this.f217827a.hashCode() ^ 1000003) * 1000003) ^ this.f217828b.hashCode()) * 1000003) ^ this.f217829c.hashCode();
    }

    public final String toString() {
        String obj = this.f217827a.toString();
        String obj2 = this.f217828b.toString();
        String obj3 = this.f217829c.toString();
        return "TeleportPrecompiledPatternSet{source=" + obj + ", patterns=" + obj2 + ", exceptions=" + obj3 + "}";
    }
}
