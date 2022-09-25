package com.google.android.libraries.web.p3423l.p3424a;

import android.net.Uri;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.l.a.b */
/* compiled from: PG */
public final class C43875b implements C43873a {

    /* renamed from: a */
    private static final C59071e f114332a = C59071e.m91331h();

    /* renamed from: b */
    private final C43873a f114333b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.libraries.web.l.a.a, code=com.google.android.libraries.web.l.a, for r4v0, types: [com.google.android.libraries.web.l.a.a, java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43875b(com.google.android.libraries.web.shared.p3444d.C44089a r2, com.google.android.libraries.web.base.C43269t r3, com.google.android.libraries.web.p3423l.C43873a r4) {
        /*
            r1 = this;
            java.lang.String r0 = "urlCheckerProvider"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.lang.String r0 = "webCoordinatorInfo"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.lang.String r0 = "firstPartyUrlChecker"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            r1.<init>()
            java.lang.Class<com.google.android.libraries.web.l.a> r0 = com.google.android.libraries.web.p3423l.C43873a.class
            java.util.Set r3 = r3.mo46387e(r0)
            java.lang.Class<com.google.android.libraries.web.l.a> r0 = com.google.android.libraries.web.p3423l.C43873a.class
            java.lang.Object r2 = r2.mo47061a(r3, r0)
            com.google.android.libraries.web.l.a r2 = (com.google.android.libraries.web.p3423l.C43873a) r2
            if (r2 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r4 = r2
        L_0x0024:
            r1.f114333b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.p3423l.p3424a.C43875b.<init>(com.google.android.libraries.web.shared.d.a, com.google.android.libraries.web.base.t, com.google.android.libraries.web.l.a.a):void");
    }

    /* renamed from: a */
    public final boolean mo46765a(Uri uri) {
        C69664n.m101061g(uri, "uri");
        boolean a = this.f114333b.mo46765a(uri);
        if (!a) {
            C59052c cVar = (C59052c) f114332a.mo56225c();
            cVar.mo56379ah(new C59094n(54170));
            cVar.mo56386p("Tried to load a URL which this client does not have permission for (go/webx-thirdparty).");
        }
        return a;
    }
}
