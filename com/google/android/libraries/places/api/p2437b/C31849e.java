package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.e */
/* compiled from: PG */
final class C31849e extends C31858n {

    /* renamed from: a */
    private final String f85490a;

    /* renamed from: b */
    private final LocationBias f85491b;

    /* renamed from: c */
    private final LocationRestriction f85492c;

    /* renamed from: d */
    private final List f85493d;

    /* renamed from: e */
    private final AutocompleteSessionToken f85494e;

    /* renamed from: f */
    private final TypeFilter f85495f;

    /* renamed from: g */
    private final List f85496g;

    /* renamed from: h */
    private final C146004a f85497h;

    public C31849e(String str, LocationBias locationBias, LocationRestriction locationRestriction, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, List list2, C146004a aVar) {
        this.f85490a = str;
        this.f85491b = locationBias;
        this.f85492c = locationRestriction;
        this.f85493d = list;
        this.f85494e = autocompleteSessionToken;
        this.f85495f = typeFilter;
        this.f85496g = list2;
        this.f85497h = aVar;
    }

    /* renamed from: a */
    public final C146004a mo37404a() {
        return this.f85497h;
    }

    /* renamed from: b */
    public final LatLng mo37422b() {
        return null;
    }

    /* renamed from: c */
    public final AutocompleteSessionToken mo37423c() {
        return this.f85494e;
    }

    /* renamed from: d */
    public final LocationBias mo37424d() {
        return this.f85491b;
    }

    /* renamed from: e */
    public final LocationRestriction mo37425e() {
        return this.f85492c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r1 = r4.f85494e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r1 = r4.f85495f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        r1 = r4.f85497h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.p2437b.C31858n
            r2 = 0
            if (r1 == 0) goto L_0x00a9
            com.google.android.libraries.places.api.b.n r5 = (com.google.android.libraries.places.api.p2437b.C31858n) r5
            java.lang.String r1 = r4.f85490a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo37428g()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo37428g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0020:
            com.google.android.libraries.places.api.model.LocationBias r1 = r4.f85491b
            if (r1 != 0) goto L_0x002b
            com.google.android.libraries.places.api.model.LocationBias r1 = r5.mo37424d()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0035
        L_0x002b:
            com.google.android.libraries.places.api.model.LocationBias r3 = r5.mo37424d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0035:
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r4.f85492c
            if (r1 != 0) goto L_0x0040
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r5.mo37425e()
            if (r1 != 0) goto L_0x00a9
            goto L_0x004a
        L_0x0040:
            com.google.android.libraries.places.api.model.LocationRestriction r3 = r5.mo37425e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x004a:
            com.google.android.gms.maps.model.LatLng r1 = r5.mo37422b()
            if (r1 != 0) goto L_0x00a9
            java.util.List r1 = r4.f85493d
            java.util.List r3 = r5.mo37429h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r4.f85494e
            if (r1 != 0) goto L_0x0067
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r5.mo37423c()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0071
        L_0x0067:
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r3 = r5.mo37423c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0071:
            com.google.android.libraries.places.api.model.TypeFilter r1 = r4.f85495f
            if (r1 != 0) goto L_0x007c
            com.google.android.libraries.places.api.model.TypeFilter r1 = r5.mo37427f()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0086
        L_0x007c:
            com.google.android.libraries.places.api.model.TypeFilter r3 = r5.mo37427f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0086:
            java.util.List r1 = r4.f85496g
            java.util.List r3 = r5.mo37431i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            com.google.android.gms.tasks.a r1 = r4.f85497h
            if (r1 != 0) goto L_0x009d
            com.google.android.gms.tasks.a r5 = r5.mo37404a()
            if (r5 != 0) goto L_0x00a9
            goto L_0x00a8
        L_0x009d:
            com.google.android.gms.tasks.a r5 = r5.mo37404a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            return r0
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.p2437b.C31849e.equals(java.lang.Object):boolean");
    }

    @Deprecated
    /* renamed from: f */
    public final TypeFilter mo37427f() {
        return this.f85495f;
    }

    /* renamed from: g */
    public final String mo37428g() {
        return this.f85490a;
    }

    /* renamed from: h */
    public final List mo37429h() {
        return this.f85493d;
    }

    /* renamed from: i */
    public final List mo37431i() {
        return this.f85496g;
    }

    public final String toString() {
        String str = this.f85490a;
        String valueOf = String.valueOf(this.f85491b);
        String valueOf2 = String.valueOf(this.f85492c);
        String obj = this.f85493d.toString();
        String valueOf3 = String.valueOf(this.f85494e);
        String valueOf4 = String.valueOf(this.f85495f);
        String obj2 = this.f85496g.toString();
        String valueOf5 = String.valueOf(this.f85497h);
        return "FindAutocompletePredictionsRequest{query=" + str + ", locationBias=" + valueOf + ", locationRestriction=" + valueOf2 + ", origin=null, countries=" + obj + ", sessionToken=" + valueOf3 + ", typeFilter=" + valueOf4 + ", typesFilter=" + obj2 + ", cancellationToken=" + valueOf5 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f85490a;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (i ^ 1000003) * 1000003;
        LocationBias locationBias = this.f85491b;
        if (locationBias == null) {
            i2 = 0;
        } else {
            i2 = locationBias.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        LocationRestriction locationRestriction = this.f85492c;
        if (locationRestriction == null) {
            i3 = 0;
        } else {
            i3 = locationRestriction.hashCode();
        }
        int hashCode = (((i8 ^ i3) * -721379959) ^ this.f85493d.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.f85494e;
        if (autocompleteSessionToken == null) {
            i4 = 0;
        } else {
            i4 = autocompleteSessionToken.hashCode();
        }
        int i9 = (hashCode ^ i4) * 1000003;
        TypeFilter typeFilter = this.f85495f;
        if (typeFilter == null) {
            i5 = 0;
        } else {
            i5 = typeFilter.hashCode();
        }
        int hashCode2 = (((i9 ^ i5) * 1000003) ^ this.f85496g.hashCode()) * 1000003;
        C146004a aVar = this.f85497h;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return hashCode2 ^ i6;
    }
}
