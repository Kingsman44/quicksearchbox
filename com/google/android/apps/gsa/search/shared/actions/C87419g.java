package com.google.android.apps.gsa.search.shared.actions;

import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.g */
/* compiled from: PG */
public final class C87419g extends C87473p {

    /* renamed from: a */
    private final C87412e f236077a;

    /* renamed from: b */
    private final MatchingProviderInfo f236078b;

    public C87419g(C87412e eVar, MatchingProviderInfo matchingProviderInfo) {
        if (eVar != null) {
            this.f236077a = eVar;
            this.f236078b = matchingProviderInfo;
            return;
        }
        throw new NullPointerException("Null actionProcessorResult");
    }

    /* renamed from: a */
    public final C87412e mo81190a() {
        return this.f236077a;
    }

    /* renamed from: b */
    public final MatchingProviderInfo mo81191b() {
        return this.f236078b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f236078b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.search.shared.actions.C87473p
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.search.shared.actions.p r5 = (com.google.android.apps.gsa.search.shared.actions.C87473p) r5
            com.google.android.apps.gsa.search.shared.actions.e r1 = r4.f236077a
            com.google.android.apps.gsa.search.shared.actions.e r3 = r5.mo81190a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r1 = r4.f236078b
            if (r1 != 0) goto L_0x0022
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r5 = r5.mo81191b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r5 = r5.mo81191b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.C87419g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f236077a.hashCode() ^ 1000003) * 1000003;
        MatchingProviderInfo matchingProviderInfo = this.f236078b;
        if (matchingProviderInfo == null) {
            i = 0;
        } else {
            i = matchingProviderInfo.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f236077a.toString();
        String valueOf = String.valueOf(this.f236078b);
        return "ProcessedActionData{actionProcessorResult=" + obj + ", matchingProviderInfo=" + valueOf + "}";
    }
}
