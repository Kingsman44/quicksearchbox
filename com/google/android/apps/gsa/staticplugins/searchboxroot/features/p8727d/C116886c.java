package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6944c.C88547ac;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88595k;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.c */
/* compiled from: PG */
public final class C116886c extends C88595k {

    /* renamed from: b */
    private final Context f324401b;

    /* renamed from: c */
    private final C117025g f324402c;

    /* renamed from: d */
    private final C91097g f324403d;

    /* renamed from: e */
    private C88547ac f324404e;

    /* renamed from: f */
    private final C68214a f324405f;

    public C116886c(Context context, C117025g gVar, C91097g gVar2, C68214a aVar) {
        this.f324401b = context;
        this.f324402c = gVar;
        this.f324403d = gVar2;
        this.f324405f = aVar;
    }

    /* renamed from: a */
    public final int mo82257a() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0165;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.p6990an.C89234y mo82258b(com.google.android.apps.gsa.shared.search.Query r9, com.google.android.libraries.searchbox.shared.suggestion.Suggestion r10, java.lang.String r11, com.google.common.p4552o.C60456qs r12) {
        /*
            r8 = this;
            java.lang.String r0 = "com.android.vending"
            boolean r1 = r10.mo44265s()
            if (r1 == 0) goto L_0x0050
            com.google.at.h.d.a.aq r1 = r10.f108906A
            int r2 = r1.f142330a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0050
            com.google.at.h.d.a.ae r1 = r1.f142334f
            if (r1 != 0) goto L_0x0016
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0016:
            int r2 = r1.f142290a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0050
            boolean r1 = r1.f142303n
            if (r1 == 0) goto L_0x0050
            dagger.a r10 = r8.f239438a
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.searchbox.a.b r10 = (com.google.android.apps.gsa.searchbox.p6942a.C88533b) r10
            long r0 = r9.f252749G
            r9 = 148(0x94, float:2.07E-43)
            r10.mo82170a(r0, r9, r12)
            java.lang.String r9 = "gsa::expand_action"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x003d
            r9 = 1162(0x48a, float:1.628E-42)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r9)
            goto L_0x004a
        L_0x003d:
            java.lang.String r9 = "gsa::collpase_action"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x004a
            r9 = 1163(0x48b, float:1.63E-42)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r9)
        L_0x004a:
            com.google.android.apps.gsa.shared.an.v r9 = new com.google.android.apps.gsa.shared.an.v
            r9.<init>()
            return r9
        L_0x0050:
            android.net.Uri r1 = android.net.Uri.parse(r11)
            java.lang.String r2 = r1.getScheme()
            if (r2 == 0) goto L_0x019f
            java.lang.String r2 = r1.getScheme()
            java.lang.String r3 = "http"
            boolean r2 = r2.equals(r3)
            r3 = 1
            r4 = 0
            java.lang.String r5 = "android.intent.action.VIEW"
            if (r2 != 0) goto L_0x012a
            java.lang.String r2 = r1.getScheme()
            java.lang.String r6 = "https"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0078
            goto L_0x012a
        L_0x0078:
            java.lang.String r2 = r1.getScheme()
            java.lang.String r6 = "sms"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x012a
            java.lang.String r2 = r1.getScheme()
            java.lang.String r6 = "tel"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0099
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.CALL"
            r11.<init>(r0, r1)
            goto L_0x012f
        L_0x0099:
            java.lang.String r2 = r1.getScheme()
            java.lang.String r6 = "mailto"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x00ae
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.SENDTO"
            r11.<init>(r0, r1)
            goto L_0x012f
        L_0x00ae:
            boolean r2 = com.google.android.apps.gsa.shared.util.p7157a.C90716a.m148159d(r1)
            if (r2 == 0) goto L_0x00bc
            android.content.Context r11 = r8.f324401b
            android.content.Intent r11 = com.google.android.apps.gsa.shared.util.p7157a.C90716a.m148157b(r1, r4, r11)
            goto L_0x012f
        L_0x00bc:
            java.lang.String r2 = r1.getScheme()
            java.lang.String r6 = "market"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x00fc
            android.content.Context r11 = r8.f324401b     // Catch:{ NameNotFoundException -> 0x00f6 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f6 }
            r2 = 0
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00f6 }
            int r11 = r11.versionCode     // Catch:{ NameNotFoundException -> 0x00f6 }
            r2 = 80710000(0x4cf8970, float:4.8791683E-36)
            if (r11 < r2) goto L_0x00f6
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r5)
            r11.setData(r1)
            r11.setPackage(r0)
            java.lang.String r0 = "overlay"
            r11.putExtra(r0, r3)
            android.content.Context r0 = r8.f324401b
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "callerId"
            r11.putExtra(r1, r0)
            goto L_0x012f
        L_0x00f6:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r5, r1)
            goto L_0x012f
        L_0x00fc:
            java.lang.String r0 = r1.getScheme()
            java.lang.String r1 = "search"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            com.google.android.apps.gsa.shared.an.u r11 = new com.google.android.apps.gsa.shared.an.u
            com.google.android.apps.gsa.searchbox.c.ac r0 = r8.f324404e
            java.lang.String r2 = r10.mo44269v()
            java.lang.String r4 = ""
            java.lang.String r5 = "COMPLETE_SERVER"
            r6 = 775(0x307, float:1.086E-42)
            r1 = r9
            r3 = r10
            r7 = r12
            com.google.android.apps.gsa.shared.search.Query r9 = r0.mo82212a(r1, r2, r3, r4, r5, r6, r7)
            r11.<init>(r9)
            return r11
        L_0x0121:
            android.content.Intent r11 = android.content.Intent.parseUri(r11, r3)     // Catch:{ URISyntaxException -> 0x0126 }
            goto L_0x012f
        L_0x0126:
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11 = r4
            goto L_0x012f
        L_0x012a:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r5, r1)
        L_0x012f:
            if (r11 == 0) goto L_0x0197
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r8.f324405f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.cm r0 = (com.google.android.apps.gsa.search.core.google.C85919cm) r0
            if (r12 == 0) goto L_0x0144
            com.google.protobuf.bn r1 = r12.toBuilder()
            r4 = r1
            com.google.common.o.qr r4 = (com.google.common.p4552o.C60455qr) r4
        L_0x0144:
            boolean r1 = r10.mo44265s()
            if (r1 == 0) goto L_0x0161
            com.google.at.h.d.a.aq r1 = r10.f108906A
            int r2 = r1.f142330a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x0161
            com.google.at.h.d.a.l r1 = r1.f142338j
            if (r1 != 0) goto L_0x0158
            com.google.at.h.d.a.l r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54248l.f142431m
        L_0x0158:
            java.lang.String r1 = r1.f142436d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0161
            goto L_0x0165
        L_0x0161:
            java.lang.String r1 = r10.mo44269v()
        L_0x0165:
            com.google.android.apps.gsa.shared.util.c.ca r10 = r0.f232290d
            com.google.android.apps.gsa.search.core.google.ch r2 = new com.google.android.apps.gsa.search.core.google.ch
            r2.<init>(r0, r1, r4, r9)
            r10.mo85139d(r2)
            dagger.a r10 = r8.f239438a
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.searchbox.a.b r10 = (com.google.android.apps.gsa.searchbox.p6942a.C88533b) r10
            long r0 = r9.f252749G
            r9 = 105(0x69, float:1.47E-43)
            r10.mo82170a(r0, r9, r12)
            r9 = 32768(0x8000, float:4.5918E-41)
            r11.addFlags(r9)
            android.content.Context r9 = r8.f324401b
            com.google.android.apps.gsa.staticplugins.searchboxroot.g r10 = r8.f324402c
            java.lang.String r10 = r10.mo103107c()
            com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145468z(r9, r11, r3, r10)
            com.google.android.apps.gsa.shared.util.t.g r9 = r8.f324403d     // Catch:{ ActivityNotFoundException -> 0x0199 }
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.b r10 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116882b.f324397a     // Catch:{ ActivityNotFoundException -> 0x0199 }
            r9.mo65090b(r11, r10)     // Catch:{ ActivityNotFoundException -> 0x0199 }
            goto L_0x0199
        L_0x0197:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0199:
            com.google.android.apps.gsa.shared.an.v r9 = new com.google.android.apps.gsa.shared.an.v
            r9.<init>()
            return r9
        L_0x019f:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.an.v r9 = new com.google.android.apps.gsa.shared.an.v
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116886c.mo82258b(com.google.android.apps.gsa.shared.search.Query, com.google.android.libraries.searchbox.shared.suggestion.Suggestion, java.lang.String, com.google.common.o.qs):com.google.android.apps.gsa.shared.an.y");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f239438a = rVar.f239537h;
        this.f324404e = rVar.f239534e;
    }
}
