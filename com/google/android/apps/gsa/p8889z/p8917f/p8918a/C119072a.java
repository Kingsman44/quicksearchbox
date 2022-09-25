package com.google.android.apps.gsa.p8889z.p8917f.p8918a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8458aa;
import com.google.p395al.p408c.p414c.p416b.C8465ah;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import com.google.p395al.p408c.p414c.p416b.C8482ay;
import com.google.p395al.p408c.p414c.p416b.C8515y;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.f.a.a */
/* compiled from: PG */
public final class C119072a {

    /* renamed from: a */
    private static final C59071e f332156a = C59071e.m91332i("com.google.android.apps.gsa.z.f.a.a");

    /* renamed from: b */
    private static final C58495hd f332157b;

    /* renamed from: c */
    private final C89994f f332158c;

    /* renamed from: d */
    private final C86130z f332159d;

    /* renamed from: e */
    private final C85923cq f332160e;

    /* renamed from: f */
    private final C68214a f332161f;

    /* renamed from: g */
    private String f332162g;

    /* renamed from: h */
    private C8482ay f332163h;

    /* renamed from: i */
    private C8466ai f332164i;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("Dev SSL/HTTPS", "dev-speechs3proto2-pa.sandbox.googleapis.com");
        gzVar.mo55429h("Staging SSL/HTTPS", "staging-speechs3proto2-pa.sandbox.googleapis.com");
        f332157b = gzVar.mo55427f(false);
    }

    public C119072a(C89994f fVar, C86130z zVar, C85923cq cqVar, C68214a aVar) {
        this.f332158c = fVar;
        this.f332159d = zVar;
        this.f332160e = cqVar;
        this.f332161f = aVar;
    }

    /* renamed from: c */
    protected static C8466ai m197672c(C8466ai aiVar, String str) {
        Uri parse = Uri.parse(aiVar.f29398b);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.path("/" + str + parse.getPath());
        String uri = buildUpon.build().toString();
        C8465ah ahVar = (C8465ah) aiVar.toBuilder();
        ahVar.copyOnWrite();
        C8466ai aiVar2 = (C8466ai) ahVar.instance;
        uri.getClass();
        aiVar2.f29397a |= 1;
        aiVar2.f29398b = uri;
        return (C8466ai) ahVar.build();
    }

    /* renamed from: e */
    private static C8458aa m197673e(String str, C92541i iVar) {
        if ((iVar.mo87316a().f29531a & 8192) != 0) {
            C8515y yVar = iVar.mo87316a().f29542l;
            if (yVar == null) {
                yVar = C8515y.f29547b;
            }
            for (C8458aa aaVar : yVar.f29549a) {
                C58976aa aaVar2 = C58975e.f156826a;
                if ((aaVar.f29375a & 1) != 0 && aaVar.f29376b.equals(str)) {
                    return aaVar;
                }
            }
            C59104x c = f332156a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.ServerInfoSupplier");
            ((C59052c) ((C59052c) c).mo56372aa(34321)).mo56389s("Invalid or missing override: %s", str);
            return null;
        }
        C59104x d = f332156a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VS.ServerInfoSupplier");
        ((C59052c) ((C59052c) d).mo56372aa(34323)).mo56386p("Debug info section not found");
        return null;
    }

    /* renamed from: a */
    public final C58833ax mo104106a() {
        String str;
        StringBuilder sb = new StringBuilder();
        String aa = this.f332158c.mo83881aa();
        if (!TextUtils.isEmpty(aa)) {
            sb.append(aa);
            sb.append("-");
            str = "Dev SSL/HTTPS";
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f332158c.mo83884ad();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f332159d.mo79764c(R.string.s3_server_override);
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = (String) f332157b.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                return C58833ax.m90834k(sb.toString());
            }
        }
        return C58836b.f156633a;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p395al.p408c.p414c.p416b.C8466ai mo104107b() {
        /*
            r6 = this;
            dagger.a r0 = r6.f332161f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.speech.n.i r0 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r0
            com.google.al.c.c.b.w r0 = r0.mo87316a()
            int r0 = r0.f29531a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0095
            com.google.android.apps.gsa.shared.m.b.f r0 = r6.f332158c
            com.google.android.apps.gsa.search.core.i.z r1 = r6.f332159d
            dagger.a r2 = r6.f332161f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.speech.n.i r2 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r2
            java.lang.String r3 = r0.mo83881aa()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = "Dev SSL/HTTPS"
            com.google.al.c.c.b.aa r4 = m197673e(r4, r2)
            if (r4 == 0) goto L_0x0050
            com.google.common.f.e r0 = f332156a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "VS.ServerInfoSupplier"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Using manual S3 server override: %s"
            r2 = 34326(0x8616, float:4.8101E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r3)
            com.google.al.c.c.b.ai r0 = r4.f29377c
            if (r0 != 0) goto L_0x004b
            com.google.al.c.c.b.ai r0 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g
        L_0x004b:
            com.google.al.c.c.b.ai r0 = m197672c(r0, r3)
            goto L_0x0091
        L_0x0050:
            java.lang.String r0 = r0.mo83884ad()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0061
            r0 = 2132092022(0x7f152476, float:1.9824429E38)
            java.lang.String r0 = r1.mo79764c(r0)
        L_0x0061:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r1 != 0) goto L_0x0090
            com.google.al.c.c.b.aa r1 = m197673e(r0, r2)
            if (r1 == 0) goto L_0x0090
            com.google.common.f.e r2 = f332156a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "VS.ServerInfoSupplier"
            r2.mo56378ag(r4, r5)
            java.lang.String r4 = "Using s3 override: %s"
            r5 = 34324(0x8614, float:4.8098E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r4, r0)
            int r0 = r1.f29375a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0090
            com.google.al.c.c.b.ai r0 = r1.f29377c
            if (r0 != 0) goto L_0x0091
            com.google.al.c.c.b.ai r0 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g
            goto L_0x0091
        L_0x0090:
            r0 = r3
        L_0x0091:
            if (r0 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            return r0
        L_0x0095:
            com.google.android.apps.gsa.search.core.google.cq r0 = r6.f332160e
            java.lang.String r0 = r0.mo83211i()
            monitor-enter(r6)
            java.lang.String r1 = r6.f332162g     // Catch:{ all -> 0x0101 }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00a8
            com.google.al.c.c.b.ai r0 = r6.f332164i     // Catch:{ all -> 0x0101 }
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            return r0
        L_0x00a8:
            r6.f332162g = r0     // Catch:{ all -> 0x0101 }
            dagger.a r1 = r6.f332161f     // Catch:{ all -> 0x0101 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0101 }
            com.google.android.apps.gsa.speech.n.i r1 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r1     // Catch:{ all -> 0x0101 }
            com.google.al.c.c.b.w r1 = r1.mo87316a()     // Catch:{ all -> 0x0101 }
            com.google.al.c.c.b.ai r1 = r1.f29540j     // Catch:{ all -> 0x0101 }
            if (r1 != 0) goto L_0x00bc
            com.google.al.c.c.b.ai r1 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x0101 }
        L_0x00bc:
            java.lang.String r2 = "sandbox.google"
            int r2 = r0.indexOf(r2)     // Catch:{ all -> 0x0101 }
            if (r2 > 0) goto L_0x00fd
            boolean r2 = r1.f29399c     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r2 = r1.f29398b     // Catch:{ all -> 0x0101 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0101 }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x0101 }
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ all -> 0x0101 }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x0101 }
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ all -> 0x0101 }
            com.google.al.c.c.b.ah r1 = (com.google.p395al.p408c.p414c.p416b.C8465ah) r1     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0101 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0101 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x0101 }
            com.google.al.c.c.b.ai r2 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r2     // Catch:{ all -> 0x0101 }
            r0.getClass()     // Catch:{ all -> 0x0101 }
            int r3 = r2.f29397a     // Catch:{ all -> 0x0101 }
            r3 = r3 | 1
            r2.f29397a = r3     // Catch:{ all -> 0x0101 }
            r2.f29398b = r0     // Catch:{ all -> 0x0101 }
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ all -> 0x0101 }
            r1 = r0
            com.google.al.c.c.b.ai r1 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r1     // Catch:{ all -> 0x0101 }
        L_0x00fd:
            r6.f332164i = r1     // Catch:{ all -> 0x0101 }
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            return r1
        L_0x0101:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a.mo104107b():com.google.al.c.c.b.ai");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p395al.p408c.p414c.p416b.C8482ay mo104108d() {
        /*
            r7 = this;
            dagger.a r0 = r7.f332161f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.speech.n.i r0 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r0
            com.google.al.c.c.b.w r0 = r0.mo87316a()
            int r0 = r0.f29531a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00dd
            com.google.android.apps.gsa.shared.m.b.f r0 = r7.f332158c
            com.google.android.apps.gsa.search.core.i.z r1 = r7.f332159d
            dagger.a r2 = r7.f332161f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.speech.n.i r2 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r2
            java.lang.String r3 = r0.mo83881aa()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0098
            java.lang.String r4 = "Dev SSL/HTTPS"
            com.google.al.c.c.b.aa r4 = m197673e(r4, r2)
            if (r4 == 0) goto L_0x0098
            com.google.common.f.e r0 = f332156a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "VS.ServerInfoSupplier"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Using manual S3 server override: %s"
            r2 = 34329(0x8619, float:4.8105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r3)
            com.google.al.c.c.b.ay r0 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.al.c.c.b.ax r0 = (com.google.p395al.p408c.p414c.p416b.C8481ax) r0
            com.google.al.c.c.b.ay r1 = r4.f29378d
            if (r1 != 0) goto L_0x0053
            com.google.al.c.c.b.ay r1 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d
        L_0x0053:
            com.google.al.c.c.b.ai r1 = r1.f29443b
            if (r1 != 0) goto L_0x0059
            com.google.al.c.c.b.ai r1 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g
        L_0x0059:
            com.google.al.c.c.b.ai r1 = m197672c(r1, r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.al.c.c.b.ay r2 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r2
            r1.getClass()
            r2.f29443b = r1
            int r1 = r2.f29442a
            r1 = r1 | 1
            r2.f29442a = r1
            com.google.al.c.c.b.ay r1 = r4.f29378d
            if (r1 != 0) goto L_0x0075
            com.google.al.c.c.b.ay r1 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d
        L_0x0075:
            com.google.al.c.c.b.ai r1 = r1.f29444c
            if (r1 != 0) goto L_0x007b
            com.google.al.c.c.b.ai r1 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g
        L_0x007b:
            com.google.al.c.c.b.ai r1 = m197672c(r1, r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.al.c.c.b.ay r2 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r2
            r1.getClass()
            r2.f29444c = r1
            int r1 = r2.f29442a
            r1 = r1 | 2
            r2.f29442a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.al.c.c.b.ay r0 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r0
            goto L_0x00d9
        L_0x0098:
            java.lang.String r0 = r0.mo83884ad()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x00a9
            r0 = 2132092022(0x7f152476, float:1.9824429E38)
            java.lang.String r0 = r1.mo79764c(r0)
        L_0x00a9:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r1 != 0) goto L_0x00d8
            com.google.al.c.c.b.aa r1 = m197673e(r0, r2)
            if (r1 == 0) goto L_0x00d8
            com.google.common.f.e r2 = f332156a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "VS.ServerInfoSupplier"
            r2.mo56378ag(r4, r5)
            java.lang.String r4 = "Using s3 override: %s"
            r5 = 34327(0x8617, float:4.8102E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r4, r0)
            int r0 = r1.f29375a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00d8
            com.google.al.c.c.b.ay r0 = r1.f29378d
            if (r0 != 0) goto L_0x00d9
            com.google.al.c.c.b.ay r0 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d
            goto L_0x00d9
        L_0x00d8:
            r0 = r3
        L_0x00d9:
            if (r0 != 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            return r0
        L_0x00dd:
            com.google.android.apps.gsa.search.core.google.cq r0 = r7.f332160e
            java.lang.String r0 = r0.mo83211i()
            monitor-enter(r7)
            java.lang.String r1 = r7.f332162g     // Catch:{ all -> 0x01cf }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x01cf }
            if (r1 == 0) goto L_0x00f0
            com.google.al.c.c.b.ay r0 = r7.f332163h     // Catch:{ all -> 0x01cf }
            monitor-exit(r7)     // Catch:{ all -> 0x01cf }
            return r0
        L_0x00f0:
            r7.f332162g = r0     // Catch:{ all -> 0x01cf }
            dagger.a r1 = r7.f332161f     // Catch:{ all -> 0x01cf }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x01cf }
            com.google.android.apps.gsa.speech.n.i r1 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r1     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.w r1 = r1.mo87316a()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ay r1 = r1.f29539i     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x0104
            com.google.al.c.c.b.ay r1 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d     // Catch:{ all -> 0x01cf }
        L_0x0104:
            java.lang.String r2 = "sandbox.google"
            int r2 = r0.indexOf(r2)     // Catch:{ all -> 0x01cf }
            if (r2 > 0) goto L_0x01cb
            com.google.al.c.c.b.ai r2 = r1.f29444c     // Catch:{ all -> 0x01cf }
            if (r2 != 0) goto L_0x0112
            com.google.al.c.c.b.ai r2 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x01cf }
        L_0x0112:
            boolean r2 = r2.f29399c     // Catch:{ all -> 0x01cf }
            if (r2 != 0) goto L_0x0118
            goto L_0x01cb
        L_0x0118:
            com.google.al.c.c.b.ai r2 = r1.f29443b     // Catch:{ all -> 0x01cf }
            if (r2 != 0) goto L_0x011e
            com.google.al.c.c.b.ai r2 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x01cf }
        L_0x011e:
            java.lang.String r2 = r2.f29398b     // Catch:{ all -> 0x01cf }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x01cf }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x01cf }
            android.net.Uri$Builder r2 = r2.authority(r0)     // Catch:{ all -> 0x01cf }
            android.net.Uri r2 = r2.build()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r3 = r1.f29444c     // Catch:{ all -> 0x01cf }
            if (r3 != 0) goto L_0x0136
            com.google.al.c.c.b.ai r3 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x01cf }
        L_0x0136:
            java.lang.String r3 = r3.f29398b     // Catch:{ all -> 0x01cf }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x01cf }
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ all -> 0x01cf }
            android.net.Uri$Builder r0 = r3.authority(r0)     // Catch:{ all -> 0x01cf }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ay r3 = com.google.p395al.p408c.p414c.p416b.C8482ay.f29440d     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ax r3 = (com.google.p395al.p408c.p414c.p416b.C8481ax) r3     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r4 = r1.f29443b     // Catch:{ all -> 0x01cf }
            if (r4 != 0) goto L_0x0156
            com.google.al.c.c.b.ai r4 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x01cf }
        L_0x0156:
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ah r4 = (com.google.p395al.p408c.p414c.p416b.C8465ah) r4     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            r4.copyOnWrite()     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r5 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r5     // Catch:{ all -> 0x01cf }
            r2.getClass()     // Catch:{ all -> 0x01cf }
            int r6 = r5.f29397a     // Catch:{ all -> 0x01cf }
            r6 = r6 | 1
            r5.f29397a = r6     // Catch:{ all -> 0x01cf }
            r5.f29398b = r2     // Catch:{ all -> 0x01cf }
            r3.copyOnWrite()     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r2 = r3.instance     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ay r2 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r2     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r4 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r4     // Catch:{ all -> 0x01cf }
            r4.getClass()     // Catch:{ all -> 0x01cf }
            r2.f29443b = r4     // Catch:{ all -> 0x01cf }
            int r4 = r2.f29442a     // Catch:{ all -> 0x01cf }
            r4 = r4 | 1
            r2.f29442a = r4     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r1 = r1.f29444c     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x0190
            com.google.al.c.c.b.ai r1 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x01cf }
        L_0x0190:
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ah r1 = (com.google.p395al.p408c.p414c.p416b.C8465ah) r1     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cf }
            r1.copyOnWrite()     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r2 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r2     // Catch:{ all -> 0x01cf }
            r0.getClass()     // Catch:{ all -> 0x01cf }
            int r4 = r2.f29397a     // Catch:{ all -> 0x01cf }
            r4 = r4 | 1
            r2.f29397a = r4     // Catch:{ all -> 0x01cf }
            r2.f29398b = r0     // Catch:{ all -> 0x01cf }
            r3.copyOnWrite()     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r0 = r3.instance     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ay r0 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r0     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x01cf }
            com.google.al.c.c.b.ai r1 = (com.google.p395al.p408c.p414c.p416b.C8466ai) r1     // Catch:{ all -> 0x01cf }
            r1.getClass()     // Catch:{ all -> 0x01cf }
            r0.f29444c = r1     // Catch:{ all -> 0x01cf }
            int r1 = r0.f29442a     // Catch:{ all -> 0x01cf }
            r1 = r1 | 2
            r0.f29442a = r1     // Catch:{ all -> 0x01cf }
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ all -> 0x01cf }
            r1 = r0
            com.google.al.c.c.b.ay r1 = (com.google.p395al.p408c.p414c.p416b.C8482ay) r1     // Catch:{ all -> 0x01cf }
        L_0x01cb:
            r7.f332163h = r1     // Catch:{ all -> 0x01cf }
            monitor-exit(r7)     // Catch:{ all -> 0x01cf }
            return r1
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01cf }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a.mo104108d():com.google.al.c.c.b.ay");
    }
}
