package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.k */
/* compiled from: PG */
final class C16167k extends C16143co {

    /* renamed from: a */
    private final String f47706a;

    /* renamed from: b */
    private final String f47707b;

    /* renamed from: c */
    private final String f47708c;

    /* renamed from: d */
    private final boolean f47709d;

    /* renamed from: e */
    private final String f47710e;

    /* renamed from: f */
    private final String f47711f;

    /* renamed from: g */
    private final C16335ai f47712g;

    /* renamed from: h */
    private final C16169m f47713h;

    /* renamed from: i */
    private final C16330ad f47714i;

    public C16167k(String str, String str2, String str3, boolean z, String str4, String str5, C16335ai aiVar, C16169m mVar, C16330ad adVar) {
        this.f47706a = str;
        this.f47707b = str2;
        this.f47708c = str3;
        this.f47709d = z;
        this.f47710e = str4;
        this.f47711f = str5;
        this.f47712g = aiVar;
        this.f47713h = mVar;
        this.f47714i = adVar;
    }

    /* renamed from: a */
    public final C16169m mo22797a() {
        return this.f47713h;
    }

    /* renamed from: b */
    public final C16330ad mo22798b() {
        return this.f47714i;
    }

    /* renamed from: c */
    public final C16335ai mo22799c() {
        return this.f47712g;
    }

    /* renamed from: d */
    public final String mo22800d() {
        return this.f47707b;
    }

    /* renamed from: e */
    public final String mo22801e() {
        return this.f47711f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = r4.f47711f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co
            r2 = 0
            if (r1 == 0) goto L_0x007e
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.co r5 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co) r5
            java.lang.String r1 = r4.f47706a
            java.lang.String r3 = r5.mo22804h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r4.f47707b
            java.lang.String r3 = r5.mo22800d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r4.f47708c
            java.lang.String r3 = r5.mo22802f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            boolean r1 = r4.f47709d
            boolean r3 = r5.mo22805i()
            if (r1 != r3) goto L_0x007e
            java.lang.String r1 = r4.f47710e
            java.lang.String r3 = r5.mo22803g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r4.f47711f
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = r5.mo22801e()
            if (r1 != 0) goto L_0x007e
            goto L_0x0059
        L_0x004e:
            java.lang.String r3 = r5.mo22801e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0059
            goto L_0x007e
        L_0x0059:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r1 = r4.f47712g
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r3 = r5.mo22799c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r1 = r4.f47713h
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r3 = r5.mo22797a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r1 = r4.f47714i
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r5 = r5.mo22798b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x007e
            return r0
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16167k.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo22802f() {
        return this.f47708c;
    }

    /* renamed from: g */
    public final String mo22803g() {
        return this.f47710e;
    }

    /* renamed from: h */
    public final String mo22804h() {
        return this.f47706a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f47706a.hashCode() ^ 1000003) * 1000003) ^ this.f47707b.hashCode()) * 1000003) ^ this.f47708c.hashCode()) * 1000003) ^ (true != this.f47709d ? 1237 : 1231)) * 1000003) ^ this.f47710e.hashCode()) * 1000003;
        String str = this.f47711f;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f47712g.hashCode()) * 1000003) ^ this.f47713h.hashCode()) * 1000003) ^ this.f47714i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo22805i() {
        return this.f47709d;
    }

    public final String toString() {
        String str = this.f47706a;
        String str2 = this.f47707b;
        String str3 = this.f47708c;
        boolean z = this.f47709d;
        String str4 = this.f47710e;
        String str5 = this.f47711f;
        String obj = this.f47712g.toString();
        String obj2 = this.f47713h.toString();
        String obj3 = this.f47714i.toString();
        return "SuggestionToDisplay{id=" + str + ", candidateSuggestionId=" + str2 + ", displayId=" + str3 + ", isDisplayedNow=" + z + ", displayText=" + str4 + ", description=" + str5 + ", displayMetadata=" + obj + ", source=" + obj2 + ", actionFulfillmentData=" + obj3 + "}";
    }
}
