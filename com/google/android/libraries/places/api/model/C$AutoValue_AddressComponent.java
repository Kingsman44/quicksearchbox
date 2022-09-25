package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_AddressComponent  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AddressComponent extends AddressComponent {

    /* renamed from: a */
    public final String f85502a;

    /* renamed from: b */
    public final String f85503b;

    /* renamed from: c */
    public final List f85504c;

    public C$AutoValue_AddressComponent(String str, String str2, List list) {
        if (str != null) {
            this.f85502a = str;
            this.f85503b = str2;
            if (list != null) {
                this.f85504c = list;
                return;
            }
            throw new NullPointerException("Null types");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final String mo37450a() {
        return this.f85502a;
    }

    /* renamed from: b */
    public final String mo37451b() {
        return this.f85503b;
    }

    /* renamed from: c */
    public final List mo37452c() {
        return this.f85504c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f85503b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.model.AddressComponent
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.places.api.model.AddressComponent r5 = (com.google.android.libraries.places.api.model.AddressComponent) r5
            java.lang.String r1 = r4.f85502a
            java.lang.String r3 = r5.mo37450a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.f85503b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo37451b()
            if (r1 != 0) goto L_0x003a
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = r5.mo37451b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            java.util.List r1 = r4.f85504c
            java.util.List r5 = r5.mo37452c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.C$AutoValue_AddressComponent.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f85502a.hashCode() ^ 1000003) * 1000003;
        String str = this.f85503b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f85504c.hashCode();
    }

    public final String toString() {
        String str = this.f85502a;
        String str2 = this.f85503b;
        String obj = this.f85504c.toString();
        return "AddressComponent{name=" + str + ", shortName=" + str2 + ", types=" + obj + "}";
    }
}
