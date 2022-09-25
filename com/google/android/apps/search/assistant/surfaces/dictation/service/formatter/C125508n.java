package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.n */
/* compiled from: PG */
final class C125508n extends C125471ag {

    /* renamed from: b */
    private final C58485gu f346099b;

    /* renamed from: c */
    private final C125503i f346100c;

    public C125508n(C58485gu guVar, C125503i iVar) {
        if (guVar != null) {
            this.f346099b = guVar;
            if (iVar != null) {
                this.f346100c = iVar;
                return;
            }
            throw new NullPointerException("Null commitableSpansTracker");
        }
        throw new NullPointerException("Null committable");
    }

    /* renamed from: a */
    public final C125503i mo106982a() {
        return this.f346100c;
    }

    /* renamed from: b */
    public final C58485gu mo106983b() {
        return this.f346099b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125471ag) {
            C125471ag agVar = (C125471ag) obj;
            return C58597ky.m90218i(this.f346099b, agVar.mo106983b()) && this.f346100c.equals(agVar.mo106982a());
        }
    }

    public final int hashCode() {
        return ((this.f346099b.hashCode() ^ 1000003) * 1000003) ^ this.f346100c.hashCode();
    }

    public final String toString() {
        String obj = this.f346099b.toString();
        String obj2 = this.f346100c.toString();
        return "LeftoverUnformattedText{committable=" + obj + ", commitableSpansTracker=" + obj2 + "}";
    }
}
