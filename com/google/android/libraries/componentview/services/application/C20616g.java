package com.google.android.libraries.componentview.services.application;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.componentview.services.application.g */
/* compiled from: PG */
public final class C20616g extends C20605ce {

    /* renamed from: a */
    public final String f57833a;

    /* renamed from: b */
    public final String f57834b = "tr";

    /* renamed from: c */
    public final C58495hd f57835c;

    public C20616g(String str, C58495hd hdVar) {
        this.f57833a = str;
        this.f57835c = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo25548a() {
        return this.f57835c;
    }

    /* renamed from: b */
    public final String mo25549b() {
        return null;
    }

    /* renamed from: c */
    public final String mo25550c() {
        return this.f57834b;
    }

    /* renamed from: d */
    public final String mo25551d() {
        return this.f57833a;
    }

    /* renamed from: e */
    public final String mo25552e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20605ce) {
            C20605ce ceVar = (C20605ce) obj;
            String str = this.f57833a;
            if (str != null ? str.equals(ceVar.mo25551d()) : ceVar.mo25551d() == null) {
                return ceVar.mo25552e() == null && ceVar.mo25549b() == null && this.f57834b.equals(ceVar.mo25550c()) && C58662ni.m90356o(this.f57835c, ceVar.mo25548a());
            }
        }
    }

    public final String toString() {
        String str = this.f57833a;
        String str2 = this.f57834b;
        String i = C58662ni.m90350i(this.f57835c);
        return "MothershipQueryParams{ved=" + str + ", vet=null, eventId=null, pf=" + str2 + ", additionalHeaders=" + i + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f57833a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((i ^ 1000003) * 583896283) ^ this.f57834b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f57835c.entrySet());
    }
}
