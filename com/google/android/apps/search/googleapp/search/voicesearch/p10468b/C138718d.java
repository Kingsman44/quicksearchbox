package com.google.android.apps.search.googleapp.search.voicesearch.p10468b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.b.d */
/* compiled from: PG */
public final class C138718d extends C138716b {

    /* renamed from: a */
    private final String f377290a;

    /* renamed from: b */
    private final C58485gu f377291b;

    /* renamed from: c */
    private final C58495hd f377292c;

    public C138718d(String str, C58485gu guVar, C58495hd hdVar) {
        if (str != null) {
            this.f377290a = str;
            if (guVar != null) {
                this.f377291b = guVar;
                if (hdVar != null) {
                    this.f377292c = hdVar;
                    return;
                }
                throw new NullPointerException("Null bcpToDisplayLanguages");
            }
            throw new NullPointerException("Null additionalLanguages");
        }
        throw new NullPointerException("Null primaryLanguage");
    }

    /* renamed from: a */
    public final C58485gu mo114496a() {
        return this.f377291b;
    }

    /* renamed from: b */
    public final C58495hd mo114497b() {
        return this.f377292c;
    }

    /* renamed from: c */
    public final String mo114498c() {
        return this.f377290a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C138716b) {
            C138716b bVar = (C138716b) obj;
            return this.f377290a.equals(bVar.mo114498c()) && C58597ky.m90218i(this.f377291b, bVar.mo114496a()) && this.f377292c.equals(bVar.mo114497b());
        }
    }

    public final int hashCode() {
        return ((((this.f377290a.hashCode() ^ 1000003) * 1000003) ^ this.f377291b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f377292c.entrySet());
    }

    public final String toString() {
        String str = this.f377290a;
        String obj = this.f377291b.toString();
        String obj2 = this.f377292c.toString();
        return "VoiceSettings{primaryLanguage=" + str + ", additionalLanguages=" + obj + ", bcpToDisplayLanguages=" + obj2 + "}";
    }
}
