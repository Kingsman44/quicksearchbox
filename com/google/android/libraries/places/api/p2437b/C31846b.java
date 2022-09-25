package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.b */
/* compiled from: PG */
final class C31846b extends C31855k {

    /* renamed from: a */
    private final String f85477a;

    /* renamed from: b */
    private final List f85478b;

    /* renamed from: c */
    private final AutocompleteSessionToken f85479c;

    /* renamed from: d */
    private final C146004a f85480d;

    public C31846b(String str, List list, AutocompleteSessionToken autocompleteSessionToken, C146004a aVar) {
        this.f85477a = str;
        this.f85478b = list;
        this.f85479c = autocompleteSessionToken;
        this.f85480d = aVar;
    }

    /* renamed from: a */
    public final C146004a mo37404a() {
        return this.f85480d;
    }

    /* renamed from: b */
    public final AutocompleteSessionToken mo37407b() {
        return this.f85479c;
    }

    /* renamed from: c */
    public final String mo37408c() {
        return this.f85477a;
    }

    /* renamed from: d */
    public final List mo37409d() {
        return this.f85478b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f85480d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f85479c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.p2437b.C31855k
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.places.api.b.k r5 = (com.google.android.libraries.places.api.p2437b.C31855k) r5
            java.lang.String r1 = r4.f85477a
            java.lang.String r3 = r5.mo37408c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.util.List r1 = r4.f85478b
            java.util.List r3 = r5.mo37409d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r4.f85479c
            if (r1 != 0) goto L_0x002e
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r5.mo37407b()
            if (r1 != 0) goto L_0x004f
            goto L_0x0038
        L_0x002e:
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r3 = r5.mo37407b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0038:
            com.google.android.gms.tasks.a r1 = r4.f85480d
            if (r1 != 0) goto L_0x0043
            com.google.android.gms.tasks.a r5 = r5.mo37404a()
            if (r5 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0043:
            com.google.android.gms.tasks.a r5 = r5.mo37404a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.p2437b.C31846b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f85477a.hashCode() ^ 1000003) * 1000003) ^ this.f85478b.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.f85479c;
        int i2 = 0;
        if (autocompleteSessionToken == null) {
            i = 0;
        } else {
            i = autocompleteSessionToken.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C146004a aVar = this.f85480d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f85477a;
        String obj = this.f85478b.toString();
        String valueOf = String.valueOf(this.f85479c);
        String valueOf2 = String.valueOf(this.f85480d);
        return "FetchPlaceRequest{placeId=" + str + ", placeFields=" + obj + ", sessionToken=" + valueOf + ", cancellationToken=" + valueOf2 + "}";
    }
}
