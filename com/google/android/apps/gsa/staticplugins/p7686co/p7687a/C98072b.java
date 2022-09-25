package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.location.Location;
import com.google.p375ai.p378b.C7702gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.b */
/* compiled from: PG */
final class C98072b extends C98057al {

    /* renamed from: a */
    private final C7702gu f273839a;

    /* renamed from: b */
    private final Location f273840b;

    public C98072b(C7702gu guVar, Location location) {
        if (guVar != null) {
            this.f273839a = guVar;
            this.f273840b = location;
            return;
        }
        throw new NullPointerException("Null entryChanges");
    }

    /* renamed from: a */
    public final Location mo90906a() {
        return this.f273840b;
    }

    /* renamed from: b */
    public final C7702gu mo90907b() {
        return this.f273839a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f273840b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98057al
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.co.a.al r5 = (com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98057al) r5
            com.google.ai.b.gu r1 = r4.f273839a
            com.google.ai.b.gu r3 = r5.mo90907b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            android.location.Location r1 = r4.f273840b
            if (r1 != 0) goto L_0x0022
            android.location.Location r5 = r5.mo90906a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            android.location.Location r5 = r5.mo90906a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98072b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f273839a.hashCode() ^ 1000003) * 1000003;
        Location location = this.f273840b;
        if (location == null) {
            i = 0;
        } else {
            i = location.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f273839a.toString();
        String valueOf = String.valueOf(this.f273840b);
        return "EntryChangesWithLocation{entryChanges=" + obj + ", location=" + valueOf + "}";
    }
}
