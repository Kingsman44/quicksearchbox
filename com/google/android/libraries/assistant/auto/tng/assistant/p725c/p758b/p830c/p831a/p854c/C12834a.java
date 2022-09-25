package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.a */
/* compiled from: PG */
final class C12834a extends C12842i {

    /* renamed from: a */
    public final C58495hd f40058a;

    /* renamed from: b */
    public final Optional f40059b;

    public C12834a(C58495hd hdVar, Optional optional) {
        if (hdVar != null) {
            this.f40058a = hdVar;
            if (optional != null) {
                this.f40059b = optional;
                return;
            }
            throw new NullPointerException("Null micBehaviorArgs");
        }
        throw new NullPointerException("Null clientOpResultMap");
    }

    /* renamed from: a */
    public final C58495hd mo20804a() {
        return this.f40058a;
    }

    /* renamed from: b */
    public final Optional mo20805b() {
        return this.f40059b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12842i) {
            C12842i iVar = (C12842i) obj;
            return this.f40058a.equals(iVar.mo20804a()) && this.f40059b.equals(iVar.mo20805b());
        }
    }

    public final int hashCode() {
        return ((C58758qx.m90643a(this.f40058a.entrySet()) ^ 1000003) * 1000003) ^ this.f40059b.hashCode();
    }

    public final String toString() {
        String obj = this.f40058a.toString();
        String obj2 = this.f40059b.toString();
        return "ClientOpsExecutionResult{clientOpResultMap=" + obj + ", micBehaviorArgs=" + obj2 + "}";
    }
}
