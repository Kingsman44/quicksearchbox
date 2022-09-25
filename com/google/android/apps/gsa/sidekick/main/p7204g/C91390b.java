package com.google.android.apps.gsa.sidekick.main.p7204g;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4552o.p4566l.C60220t;

/* renamed from: com.google.android.apps.gsa.sidekick.main.g.b */
/* compiled from: PG */
final class C91390b extends C91397i {

    /* renamed from: a */
    private final C58485gu f254973a;

    /* renamed from: b */
    private final C58485gu f254974b;

    /* renamed from: c */
    private final C58485gu f254975c;

    /* renamed from: d */
    private final C60220t f254976d;

    public C91390b(C58485gu guVar, C58485gu guVar2, C58485gu guVar3, C60220t tVar) {
        if (guVar != null) {
            this.f254973a = guVar;
            if (guVar2 != null) {
                this.f254974b = guVar2;
                if (guVar3 != null) {
                    this.f254975c = guVar3;
                    if (tVar != null) {
                        this.f254976d = tVar;
                        return;
                    }
                    throw new NullPointerException("Null eventIdMessage");
                }
                throw new NullPointerException("Null foregroundActions");
            }
            throw new NullPointerException("Null pietSharedStateItems");
        }
        throw new NullPointerException("Null experimentalFeatures");
    }

    /* renamed from: a */
    public final C58485gu mo85718a() {
        return this.f254973a;
    }

    /* renamed from: b */
    public final C58485gu mo85719b() {
        return this.f254975c;
    }

    /* renamed from: c */
    public final C58485gu mo85720c() {
        return this.f254974b;
    }

    /* renamed from: d */
    public final C60220t mo85721d() {
        return this.f254976d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91397i) {
            C91397i iVar = (C91397i) obj;
            return C58597ky.m90218i(this.f254973a, iVar.mo85718a()) && C58597ky.m90218i(this.f254974b, iVar.mo85720c()) && C58597ky.m90218i(this.f254975c, iVar.mo85719b()) && this.f254976d.equals(iVar.mo85721d());
        }
    }

    public final int hashCode() {
        return ((((((this.f254973a.hashCode() ^ 1000003) * 1000003) ^ this.f254974b.hashCode()) * 1000003) ^ this.f254975c.hashCode()) * 1000003) ^ this.f254976d.hashCode();
    }

    public final String toString() {
        String obj = this.f254973a.toString();
        String obj2 = this.f254974b.toString();
        String obj3 = this.f254975c.toString();
        String obj4 = this.f254976d.toString();
        return "EntryTreeGlobalData{experimentalFeatures=" + obj + ", pietSharedStateItems=" + obj2 + ", foregroundActions=" + obj3 + ", eventIdMessage=" + obj4 + "}";
    }
}
