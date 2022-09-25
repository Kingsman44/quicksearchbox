package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.C93416f;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.t */
/* compiled from: PG */
final class C93288t implements C93416f {

    /* renamed from: a */
    final /* synthetic */ C93289u f260167a;

    public C93288t(C93289u uVar) {
        this.f260167a = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo87615a(ClockResult clockResult) {
        return C87489k.m142013a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r3.f260167a.f260171d.getPackageManager();
        r4 = r0.getLaunchIntentForPackage(r4);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo87616b(com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult r4) {
        /*
            r3 = this;
            com.google.android.apps.gsa.staticplugins.actions.a.u r4 = r3.f260167a
            boolean r0 = r4.f260170c
            if (r0 == 0) goto L_0x0032
            android.content.Context r4 = r4.f260171d
            java.lang.String r4 = android.provider.Telephony.Sms.getDefaultSmsPackage(r4)
            if (r4 == 0) goto L_0x0032
            com.google.android.apps.gsa.staticplugins.actions.a.u r0 = r3.f260167a
            android.content.Context r0 = r0.f260171d
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r4 = r0.getLaunchIntentForPackage(r4)
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r1 = r0.resolveActivity(r4, r1)
            if (r1 == 0) goto L_0x0032
            r2 = 0
            com.google.bb.a.pn r4 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142024a(r1, r4, r0, r2)
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = new com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r2 = 0
            r0.<init>(r1, r4, r2)
            goto L_0x0036
        L_0x0032:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93288t.mo87616b(com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult):java.lang.Object");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo87617c() {
        return C87489k.m142013a();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo87619e() {
        return C87489k.m142013a();
    }
}
