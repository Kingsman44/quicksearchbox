package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.ag */
/* compiled from: PG */
final class C122587ag extends C122589ai {

    /* renamed from: a */
    public final String f339757a;

    /* renamed from: b */
    public final C58485gu f339758b;

    public C122587ag(String str, C58485gu guVar) {
        if (str != null) {
            this.f339757a = str;
            if (guVar != null) {
                this.f339758b = guVar;
                return;
            }
            throw new NullPointerException("Null contactIds");
        }
        throw new NullPointerException("Null rawText");
    }

    /* renamed from: a */
    public final C58485gu mo105683a() {
        return this.f339758b;
    }

    /* renamed from: b */
    public final String mo105684b() {
        return this.f339757a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122589ai) {
            C122589ai aiVar = (C122589ai) obj;
            return this.f339757a.equals(aiVar.mo105684b()) && C58597ky.m90218i(this.f339758b, aiVar.mo105683a());
        }
    }

    public final int hashCode() {
        return ((this.f339757a.hashCode() ^ 1000003) * 1000003) ^ this.f339758b.hashCode();
    }

    public final String toString() {
        String str = this.f339757a;
        String obj = this.f339758b.toString();
        return "NgaPerson{rawText=" + str + ", contactIds=" + obj + "}";
    }
}
