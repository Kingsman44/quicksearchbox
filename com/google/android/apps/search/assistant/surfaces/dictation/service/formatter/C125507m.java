package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.m */
/* compiled from: PG */
final class C125507m extends C125513s {

    /* renamed from: b */
    private final C58485gu f346096b;

    /* renamed from: c */
    private final C125471ag f346097c;

    /* renamed from: d */
    private final Optional f346098d;

    public C125507m(C58485gu guVar, C125471ag agVar, Optional optional) {
        if (guVar != null) {
            this.f346096b = guVar;
            if (agVar != null) {
                this.f346097c = agVar;
                if (optional != null) {
                    this.f346098d = optional;
                    return;
                }
                throw new NullPointerException("Null formattingStabilityInfo");
            }
            throw new NullPointerException("Null leftoverUnformattedText");
        }
        throw new NullPointerException("Null precedingText");
    }

    /* renamed from: a */
    public final C125471ag mo107017a() {
        return this.f346097c;
    }

    /* renamed from: b */
    public final C58485gu mo107018b() {
        return this.f346096b;
    }

    /* renamed from: c */
    public final Optional mo107019c() {
        return this.f346098d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125513s) {
            C125513s sVar = (C125513s) obj;
            return C58597ky.m90218i(this.f346096b, sVar.mo107018b()) && this.f346097c.equals(sVar.mo107017a()) && this.f346098d.equals(sVar.mo107019c());
        }
    }

    public final int hashCode() {
        return ((((this.f346096b.hashCode() ^ 1000003) * 1000003) ^ this.f346097c.hashCode()) * 1000003) ^ this.f346098d.hashCode();
    }

    public final String toString() {
        String obj = this.f346096b.toString();
        String obj2 = this.f346097c.toString();
        String obj3 = this.f346098d.toString();
        return "FormattingState{precedingText=" + obj + ", leftoverUnformattedText=" + obj2 + ", formattingStabilityInfo=" + obj3 + "}";
    }
}
