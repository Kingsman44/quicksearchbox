package com.google.android.libraries.places.widget.internal.common;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.common.$AutoValue_AutocompleteOptions  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AutocompleteOptions extends AutocompleteOptions {

    /* renamed from: a */
    public final AutocompleteActivityMode f85811a;

    /* renamed from: b */
    public final C58485gu f85812b;

    /* renamed from: c */
    public final AutocompleteActivityOrigin f85813c;

    /* renamed from: d */
    public final String f85814d;

    /* renamed from: e */
    public final String f85815e;

    /* renamed from: f */
    public final LocationBias f85816f;

    /* renamed from: g */
    public final LocationRestriction f85817g;

    /* renamed from: h */
    public final C58485gu f85818h;

    /* renamed from: i */
    public final TypeFilter f85819i;

    /* renamed from: j */
    public final C58485gu f85820j;

    /* renamed from: k */
    public final int f85821k;

    /* renamed from: l */
    public final int f85822l;

    public C$AutoValue_AutocompleteOptions(AutocompleteActivityMode autocompleteActivityMode, C58485gu guVar, AutocompleteActivityOrigin autocompleteActivityOrigin, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, C58485gu guVar2, TypeFilter typeFilter, C58485gu guVar3, int i, int i2) {
        if (autocompleteActivityMode != null) {
            this.f85811a = autocompleteActivityMode;
            if (guVar != null) {
                this.f85812b = guVar;
                if (autocompleteActivityOrigin != null) {
                    this.f85813c = autocompleteActivityOrigin;
                    this.f85814d = str;
                    this.f85815e = str2;
                    this.f85816f = locationBias;
                    this.f85817g = locationRestriction;
                    if (guVar2 != null) {
                        this.f85818h = guVar2;
                        this.f85819i = typeFilter;
                        if (guVar3 != null) {
                            this.f85820j = guVar3;
                            this.f85821k = i;
                            this.f85822l = i2;
                            return;
                        }
                        throw new NullPointerException("Null typesFilter");
                    }
                    throw new NullPointerException("Null countries");
                }
                throw new NullPointerException("Null origin");
            }
            throw new NullPointerException("Null placeFields");
        }
        throw new NullPointerException("Null mode");
    }

    /* renamed from: a */
    public final int mo37654a() {
        return this.f85821k;
    }

    /* renamed from: b */
    public final int mo37655b() {
        return this.f85822l;
    }

    /* renamed from: c */
    public final LocationBias mo37656c() {
        return this.f85816f;
    }

    /* renamed from: d */
    public final LocationRestriction mo37657d() {
        return this.f85817g;
    }

    @Deprecated
    /* renamed from: e */
    public final TypeFilter mo37658e() {
        return this.f85819i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f85814d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.f85815e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1 = r4.f85816f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r1 = r4.f85817g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r1 = r4.f85819i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.widget.internal.common.AutocompleteOptions
            r2 = 0
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.widget.internal.common.AutocompleteOptions r5 = (com.google.android.libraries.places.widget.internal.common.AutocompleteOptions) r5
            com.google.android.libraries.places.widget.model.AutocompleteActivityMode r1 = r4.f85811a
            com.google.android.libraries.places.widget.model.AutocompleteActivityMode r3 = r5.mo37661g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            com.google.common.b.gu r1 = r4.f85812b
            com.google.common.b.gu r3 = r5.mo37664i()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin r1 = r4.f85813c
            com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin r3 = r5.mo37660f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = r4.f85814d
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.mo37667l()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0044
        L_0x003a:
            java.lang.String r3 = r5.mo37667l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0044:
            java.lang.String r1 = r4.f85815e
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r5.mo37666k()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0059
        L_0x004f:
            java.lang.String r3 = r5.mo37666k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0059:
            com.google.android.libraries.places.api.model.LocationBias r1 = r4.f85816f
            if (r1 != 0) goto L_0x0064
            com.google.android.libraries.places.api.model.LocationBias r1 = r5.mo37656c()
            if (r1 != 0) goto L_0x00c2
            goto L_0x006e
        L_0x0064:
            com.google.android.libraries.places.api.model.LocationBias r3 = r5.mo37656c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x006e:
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r4.f85817g
            if (r1 != 0) goto L_0x0079
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r5.mo37657d()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0083
        L_0x0079:
            com.google.android.libraries.places.api.model.LocationRestriction r3 = r5.mo37657d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0083:
            com.google.common.b.gu r1 = r4.f85818h
            com.google.common.b.gu r3 = r5.mo37662h()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.api.model.TypeFilter r1 = r4.f85819i
            if (r1 != 0) goto L_0x009a
            com.google.android.libraries.places.api.model.TypeFilter r1 = r5.mo37658e()
            if (r1 != 0) goto L_0x00c2
            goto L_0x00a5
        L_0x009a:
            com.google.android.libraries.places.api.model.TypeFilter r3 = r5.mo37658e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a5
            goto L_0x00c2
        L_0x00a5:
            com.google.common.b.gu r1 = r4.f85820j
            com.google.common.b.gu r3 = r5.mo37665j()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00c2
            int r1 = r4.f85821k
            int r3 = r5.mo37654a()
            if (r1 != r3) goto L_0x00c2
            int r1 = r4.f85822l
            int r5 = r5.mo37655b()
            if (r1 != r5) goto L_0x00c2
            return r0
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.common.C$AutoValue_AutocompleteOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final AutocompleteActivityOrigin mo37660f() {
        return this.f85813c;
    }

    /* renamed from: g */
    public final AutocompleteActivityMode mo37661g() {
        return this.f85811a;
    }

    /* renamed from: h */
    public final C58485gu mo37662h() {
        return this.f85818h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((((this.f85811a.hashCode() ^ 1000003) * 1000003) ^ this.f85812b.hashCode()) * 1000003) ^ this.f85813c.hashCode()) * 1000003;
        String str = this.f85814d;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str2 = this.f85815e;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        LocationBias locationBias = this.f85816f;
        if (locationBias == null) {
            i3 = 0;
        } else {
            i3 = locationBias.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        LocationRestriction locationRestriction = this.f85817g;
        if (locationRestriction == null) {
            i4 = 0;
        } else {
            i4 = locationRestriction.hashCode();
        }
        int hashCode2 = (((i8 ^ i4) * 1000003) ^ this.f85818h.hashCode()) * 1000003;
        TypeFilter typeFilter = this.f85819i;
        if (typeFilter != null) {
            i5 = typeFilter.hashCode();
        }
        return ((((((hashCode2 ^ i5) * 1000003) ^ this.f85820j.hashCode()) * 1000003) ^ this.f85821k) * 1000003) ^ this.f85822l;
    }

    /* renamed from: i */
    public final C58485gu mo37664i() {
        return this.f85812b;
    }

    /* renamed from: j */
    public final C58485gu mo37665j() {
        return this.f85820j;
    }

    /* renamed from: k */
    public final String mo37666k() {
        return this.f85815e;
    }

    /* renamed from: l */
    public final String mo37667l() {
        return this.f85814d;
    }

    public final String toString() {
        String obj = this.f85811a.toString();
        String obj2 = this.f85812b.toString();
        String obj3 = this.f85813c.toString();
        String str = this.f85814d;
        String str2 = this.f85815e;
        String valueOf = String.valueOf(this.f85816f);
        String valueOf2 = String.valueOf(this.f85817g);
        String obj4 = this.f85818h.toString();
        String valueOf3 = String.valueOf(this.f85819i);
        String obj5 = this.f85820j.toString();
        int i = this.f85821k;
        int i2 = this.f85822l;
        return "AutocompleteOptions{mode=" + obj + ", placeFields=" + obj2 + ", origin=" + obj3 + ", initialQuery=" + str + ", hint=" + str2 + ", locationBias=" + valueOf + ", locationRestriction=" + valueOf2 + ", countries=" + obj4 + ", typeFilter=" + valueOf3 + ", typesFilter=" + obj5 + ", primaryColor=" + i + ", primaryColorDark=" + i2 + "}";
    }
}
