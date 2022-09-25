package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.gsa.conversation.h.k */
/* compiled from: PG */
public final class C22707k extends C22722z {

    /* renamed from: a */
    public final C58833ax f62504a;

    /* renamed from: b */
    public final C22721y f62505b;

    /* renamed from: c */
    public final C58485gu f62506c;

    /* renamed from: d */
    public final C58833ax f62507d;

    public C22707k(C58833ax axVar, C22721y yVar, C58485gu guVar, C58833ax axVar2) {
        this.f62504a = axVar;
        if (yVar != null) {
            this.f62505b = yVar;
            if (guVar != null) {
                this.f62506c = guVar;
                this.f62507d = axVar2;
                return;
            }
            throw new NullPointerException("Null clientOpResultMetadataList");
        }
        throw new NullPointerException("Null processingResult");
    }

    /* renamed from: a */
    public final C22721y mo27854a() {
        return this.f62505b;
    }

    /* renamed from: b */
    public final C58833ax mo27855b() {
        return this.f62504a;
    }

    /* renamed from: c */
    public final C58833ax mo27856c() {
        return this.f62507d;
    }

    /* renamed from: d */
    public final C58485gu mo27857d() {
        return this.f62506c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22722z) {
            C22722z zVar = (C22722z) obj;
            return this.f62504a.equals(zVar.mo27855b()) && this.f62505b.equals(zVar.mo27854a()) && C58597ky.m90218i(this.f62506c, zVar.mo27857d()) && this.f62507d.equals(zVar.mo27856c());
        }
    }

    public final int hashCode() {
        return ((((((this.f62504a.hashCode() ^ 1000003) * 1000003) ^ this.f62505b.hashCode()) * 1000003) ^ this.f62506c.hashCode()) * 1000003) ^ this.f62507d.hashCode();
    }

    public final String toString() {
        String obj = this.f62504a.toString();
        String obj2 = this.f62505b.toString();
        String obj3 = this.f62506c.toString();
        String obj4 = this.f62507d.toString();
        return "DeltaProcessedEventData{conversationEventId=" + obj + ", processingResult=" + obj2 + ", clientOpResultMetadataList=" + obj3 + ", optionalQuery=" + obj4 + "}";
    }
}
