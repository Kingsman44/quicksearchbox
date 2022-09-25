package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60563un;
import com.google.common.p4552o.C60663yf;
import com.google.common.p4552o.C60666yi;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4552o.p4570p.C60383d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.f */
/* compiled from: PG */
public final class C84131f extends C84149x {

    /* renamed from: a */
    public static final C59071e f229063a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.f");

    /* renamed from: b */
    public final C89012aj f229064b;

    /* renamed from: c */
    private final C68214a f229065c;

    /* renamed from: d */
    private final C22871g f229066d;

    /* renamed from: e */
    private final C85923cq f229067e;

    public C84131f(C68214a aVar, C22871g gVar, C89012aj ajVar, C85923cq cqVar) {
        this.f229065c = aVar;
        this.f229066d = gVar;
        this.f229064b = ajVar;
        this.f229067e = cqVar;
    }

    /* renamed from: j */
    private final void m134069j(Uri uri) {
        this.f229066d.mo28212l("Interaction Logging", new C84130e(this, uri));
    }

    /* renamed from: k */
    private static final void m134070k(Query query, long j, C60220t tVar, int i) {
        C60663yf yfVar = (C60663yf) C60666yi.f164570j.createBuilder();
        yfVar.copyOnWrite();
        C60666yi yiVar = (C60666yi) yfVar.instance;
        yiVar.f164577f = 1;
        yiVar.f164572a |= 16;
        yfVar.copyOnWrite();
        C60666yi yiVar2 = (C60666yi) yfVar.instance;
        yiVar2.f164578g = 1;
        yiVar2.f164572a |= 32;
        if (i == 534) {
            yfVar.copyOnWrite();
            C60666yi yiVar3 = (C60666yi) yfVar.instance;
            yiVar3.f164572a |= 4;
            yiVar3.f164575d = j;
        } else if (i == 535) {
            yfVar.copyOnWrite();
            C60666yi yiVar4 = (C60666yi) yfVar.instance;
            yiVar4.f164572a |= 2;
            yiVar4.f164574c = j;
        } else if (i != 539) {
            ((C59052c) ((C59052c) f229063a.mo56225c()).mo56372aa(7049)).mo56395y("Unknown type %d for request ID '%s'", i, C39191a.m68623b(query.f252749G));
        } else {
            yfVar.copyOnWrite();
            C60666yi yiVar5 = (C60666yi) yfVar.instance;
            yiVar5.f164572a |= 8;
            yiVar5.f164576e = j;
        }
        if (tVar != null) {
            yfVar.copyOnWrite();
            C60666yi yiVar6 = (C60666yi) yfVar.instance;
            yiVar6.f164579h = tVar;
            yiVar6.f164572a |= 64;
            long nanos = TimeUnit.MILLISECONDS.toNanos(query.f252747E);
            yfVar.copyOnWrite();
            C60666yi yiVar7 = (C60666yi) yfVar.instance;
            yiVar7.f164572a |= 128;
            yiVar7.f164580i = nanos;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60666yi yiVar8 = (C60666yi) yfVar.build();
        yiVar8.getClass();
        ufVar3.f164105aL = yiVar8;
        ufVar3.f164250e |= 1073741824;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: a */
    public final void mo77563a(byte[] bArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.f229067e.mo83212j()).encodedAuthority(this.f229067e.mo83211i()).appendPath("gen_204");
        try {
            builder.appendQueryParameter("ei", C28294l.m52914d((C60220t) C62942bv.parseFrom((C62942bv) C60220t.f162931e, bArr)));
            builder.appendQueryParameter("atyp", "i");
            builder.appendQueryParameter("cad", BuildConfig.FLAVOR);
            builder.appendQueryParameter("ct", "backbutton");
            m134069j(builder.build());
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f229063a.mo56225c()).mo56382g(e)).mo56372aa(7048)).mo56386p("Failed to parse event ID");
            mo77565c(458763, (Bundle) null);
        }
    }

    /* renamed from: b */
    public final void mo77564b(AgsaLogData agsaLogData) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.f229067e.mo83212j()).encodedAuthority(this.f229067e.mo83211i()).appendPath("url");
        builder.appendQueryParameter("ved", agsaLogData.mo77540a().mo25464g());
        builder.appendQueryParameter("sa", "T");
        if (!TextUtils.isEmpty(agsaLogData.mo77540a().mo25459c())) {
            builder.appendQueryParameter("sig2", agsaLogData.mo77540a().mo25459c());
        }
        if (!TextUtils.isEmpty(agsaLogData.mo77540a().mo25461e())) {
            builder.appendQueryParameter("url", agsaLogData.mo77540a().mo25461e());
        }
        if (!TextUtils.isEmpty(agsaLogData.mo77540a().mo25458b())) {
            builder.appendQueryParameter("psig", agsaLogData.mo77540a().mo25458b());
        }
        if (!TextUtils.isEmpty(agsaLogData.mo77540a().mo25463f())) {
            builder.appendQueryParameter("ust", agsaLogData.mo77540a().mo25463f());
        }
        if (agsaLogData.mo77541b()) {
            builder.appendQueryParameter("sqi", "2");
        }
        m134069j(builder.build());
    }

    /* renamed from: c */
    public final void mo77565c(int i, Bundle bundle) {
        C90452a aVar;
        if (bundle == null) {
            ((C89911f) this.f229065c.mo27525b()).mo83756b(new C90452a(457, i)).mo83721a();
            return;
        }
        Throwable th = (Throwable) bundle.getSerializable("exception");
        if (th != null) {
            aVar = new C90452a(th, 457, i);
        } else {
            aVar = new C90452a(457, i);
        }
        ((C89911f) this.f229065c.mo27525b()).mo83756b(aVar).mo83721a();
    }

    /* renamed from: d */
    public final void mo77566d(int i, int i2, Bundle bundle, byte[] bArr) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164129aj = 10;
        ufVar.f164199c |= C89885b.S3REQUEST_VALUE;
        if (bundle != null) {
            C59753ej a = C22814a.m42629a(i2, (Throwable) bundle.getSerializable("exception"));
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            a.getClass();
            ufVar2.f164076J = a;
            ufVar2.f164146b |= 8192;
        } else {
            C59753ej a2 = C22814a.m42629a(i2, (Throwable) null);
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            a2.getClass();
            ufVar3.f164076J = a2;
            ufVar3.f164146b |= 8192;
        }
        if (bArr != null) {
            try {
                C60383d dVar = (C60383d) C62942bv.parseFrom((C62942bv) C60383d.f163411e, bArr, C62921ba.m95368a());
                tzVar.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar.instance;
                dVar.getClass();
                ufVar4.f164130ak = dVar;
                ufVar4.f164199c |= C89885b.HTTP_VALUE;
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f229063a.mo56226d()).mo56382g(e)).mo56372aa(7050)).mo56386p("Fail to parse CanvasEvent");
            }
        }
        amo a3 = amo.m92435a(i);
        if (a3 != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164070D = a3.f159234au;
            ufVar5.f164146b |= 8;
            tzVar.copyOnWrite();
            C60555uf ufVar6 = (C60555uf) tzVar.instance;
            ufVar6.f164093a |= 2;
            ufVar6.f164258m = 457;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: e */
    public final void mo77567e(int i, int i2) {
        int a = C60563un.m92619a(i2);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 897;
        if (a == 0) {
            a = 1;
        }
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164187bo = a - 1;
        ufVar2.f164252g |= 4194304;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164093a = 1 | ufVar3.f164093a;
        ufVar3.f164257l = (long) i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77568f(com.google.android.apps.gsa.shared.search.Query r18, long r19, long r21, long r23, long r25, byte[] r27) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r21
            r5 = r23
            r7 = r25
            r0 = r27
            r9 = 0
            if (r0 == 0) goto L_0x0032
            com.google.common.o.l.t r10 = com.google.common.p4552o.p4566l.C60220t.f162931e     // Catch:{ Exception -> 0x0018 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r0)     // Catch:{ Exception -> 0x0018 }
            com.google.common.o.l.t r0 = (com.google.common.p4552o.p4566l.C60220t) r0     // Catch:{ Exception -> 0x0018 }
            goto L_0x0033
        L_0x0018:
            r0 = move-exception
            com.google.common.f.e r10 = f229063a
            com.google.common.f.x r10 = r10.mo56225c()
            long r11 = r2.f252749G
            java.lang.String r11 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r11)
            r12 = 7052(0x1b8c, float:9.882E-42)
            java.lang.String r13 = "Failed to parse event ID for request ID '%s'"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56382g(r0)).mo56372aa(r12)).mo56389s(r13, r11)
            r0 = 458763(0x7000b, float:6.42864E-40)
            r1.mo77565c(r0, r9)
        L_0x0032:
            r0 = r9
        L_0x0033:
            r10 = 535(0x217, float:7.5E-43)
            m134070k(r2, r3, r0, r10)
            r10 = 534(0x216, float:7.48E-43)
            m134070k(r2, r5, r0, r10)
            r10 = 539(0x21b, float:7.55E-43)
            m134070k(r2, r7, r0, r10)
            if (r0 == 0) goto L_0x0110
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            com.google.android.apps.gsa.search.core.google.cq r10 = r1.f229067e
            java.lang.String r10 = r10.mo83212j()
            android.net.Uri$Builder r10 = r9.scheme(r10)
            com.google.android.apps.gsa.search.core.google.cq r11 = r1.f229067e
            java.lang.String r11 = r11.mo83211i()
            android.net.Uri$Builder r10 = r10.encodedAuthority(r11)
            java.lang.String r11 = "gen_204"
            r10.appendPath(r11)
            java.lang.String r10 = "ei"
            java.lang.String r0 = com.google.android.libraries.logging.C28294l.m52914d(r0)
            r9.appendQueryParameter(r10, r0)
            java.lang.String r0 = "s"
            java.lang.String r10 = "web"
            r9.appendQueryParameter(r0, r10)
            java.lang.String r0 = "atyp"
            java.lang.String r10 = "csi"
            r9.appendQueryParameter(r0, r10)
            long r10 = r2.f252747E
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r12 = r19
            long r12 = r0.toMillis(r12)
            long r12 = java.lang.Math.max(r12, r10)
            long r14 = r2.f252748F
            r0 = 0
            int r16 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x00b0
            com.google.common.f.e r16 = f229063a
            com.google.common.f.x r16 = r16.mo56226d()
            r0 = r16
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 7055(0x1b8f, float:9.886E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            long r1 = r2.f252749G
            java.lang.String r1 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r1)
            java.lang.String r2 = "Unexpected negative speech duration %dms for request ID '%s'"
            r0.mo56351D(r2, r14, r1)
            r0 = 0
            r14 = 0
        L_0x00b0:
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bd
            java.lang.String r2 = "qsd"
            java.lang.String r0 = java.lang.String.valueOf(r14)
            r9.appendQueryParameter(r2, r0)
        L_0x00bd:
            long r0 = r12 - r10
            long r0 = r0 - r14
            r10 = 0
            long r0 = java.lang.Math.max(r10, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = r2.toMillis(r3)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = r4.toMillis(r5)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = r6.toMillis(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "qsubts."
            r8.<init>(r10)
            r8.append(r0)
            java.lang.String r0 = ",rst."
            r8.append(r0)
            long r2 = r2 - r12
            r8.append(r2)
            java.lang.String r0 = ",aft."
            r8.append(r0)
            long r4 = r4 - r12
            r8.append(r4)
            java.lang.String r0 = ",iml."
            r8.append(r0)
            long r6 = r6 - r12
            r8.append(r6)
            java.lang.String r0 = "rt"
            java.lang.String r1 = r8.toString()
            r9.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r9.build()
            r1 = r17
            r1.m134069j(r0)
            return
        L_0x0110:
            com.google.common.f.e r0 = f229063a
            com.google.common.f.x r0 = r0.mo56225c()
            long r2 = r2.f252749G
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r2)
            r3 = 7051(0x1b8b, float:9.88E-42)
            java.lang.String r4 = "Failed to issue CSI ping because of null event id for request ID '%s'"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r4, r2)
            r0 = 458762(0x7000a, float:6.42862E-40)
            r1.mo77565c(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84131f.mo77568f(com.google.android.apps.gsa.shared.search.Query, long, long, long, long, byte[]):void");
    }

    /* renamed from: g */
    public final void mo77569g(String str) {
        m134069j(Uri.parse(str));
    }

    /* renamed from: h */
    public final void mo77570h(String str, String str2, String str3, Map map) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.f229067e.mo83212j()).encodedAuthority(this.f229067e.mo83211i()).appendPath("gen_204");
        builder.appendQueryParameter("atyp", "i");
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("ved", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter("vet", str2);
        }
        builder.appendQueryParameter("ei", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        m134069j(builder.build());
    }

    /* renamed from: i */
    public final void mo77571i(byte[] bArr) {
        C60321oe oeVar;
        try {
            oeVar = (C60321oe) C62942bv.parseFrom((C62942bv) C60321oe.f163224i, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f229063a.mo56225c()).mo56382g(e)).mo56372aa(7053)).mo56386p("unable to parse clientVeProtoBytes");
            oeVar = null;
        }
        if (oeVar != null) {
            C89949q.m146525j((C60555uf) null, oeVar, (C63196b) null, (String) null);
        }
    }
}
