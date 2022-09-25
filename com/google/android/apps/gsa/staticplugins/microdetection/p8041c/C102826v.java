package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.v */
/* compiled from: PG */
public final class C102826v {

    /* renamed from: a */
    public static final C59071e f287124a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.c.v");

    /* renamed from: c */
    private static int f287125c = 0;

    /* renamed from: b */
    final C86338r f287126b;

    /* renamed from: d */
    private final C118561t f287127d;

    /* renamed from: e */
    private final Context f287128e;

    /* renamed from: f */
    private final String f287129f;

    /* renamed from: g */
    private final C86183b f287130g;

    /* renamed from: h */
    private final C68214a f287131h;

    /* renamed from: i */
    private final C68214a f287132i;

    /* renamed from: j */
    private final C68214a f287133j;

    /* renamed from: k */
    private final C86124t f287134k;

    public C102826v(C86338r rVar, C118561t tVar, Context context, String str, C86183b bVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C86124t tVar2) {
        this.f287126b = rVar;
        this.f287127d = tVar;
        this.f287128e = context;
        this.f287129f = str;
        this.f287130g = bVar;
        this.f287131h = aVar;
        this.f287132i = aVar2;
        this.f287133j = aVar3;
        this.f287134k = tVar2;
    }

    @Deprecated
    /* renamed from: a */
    public static String m170531a(C90584f fVar) {
        C90584f fVar2 = C90584f.UNKNOWN;
        return fVar.ordinal() != 2 ? "last_hotword_model_downloaded_url" : "last_google_home_hotword_model_downloaded_url";
    }

    /* renamed from: e */
    static final void m170532e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C59104x c = f287124a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ModelDnldProcssHelpr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21252)).mo56386p("Exception while closing stream");
            }
        }
    }

    /* renamed from: f */
    private final void m170533f(long j, String str) {
        try {
            this.f287130g.mo79820b(j);
        } catch (Exception e) {
            C59104x d = f287124a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModelDnldProcssHelpr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21231)).mo56388r("Failed removing the downloadId %d.", j);
        }
        C86337q b = this.f287126b.mo80076b();
        b.mo80075j(str);
        b.apply();
    }

    /* renamed from: b */
    public final void mo93472b() {
        if (!this.f287134k.mo79746e(C90082eg.f249999cI)) {
            C92513g.m152176e(this.f287128e, this.f287129f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0212, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r14 = f287124a.mo56225c();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ModelDnldProcssHelpr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r0)).mo56372aa(21230)).mo56386p("Failed reading downloaded model zip.");
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x033f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0340, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x033f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x01ff] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93473c(long r17, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r4 = r19
            java.lang.String r5 = "Invalid input stream for content uri '"
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r1.f287126b
            r6 = 0
            byte[] r0 = r0.mo80079e(r4, r6)
            java.lang.String r7 = "ModelDnldProcssHelpr"
            if (r0 == 0) goto L_0x03b0
            com.google.android.apps.gsa.speech.microdetection.a.b.b r8 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92490b.f258114f     // Catch:{ ct -> 0x039a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r0)     // Catch:{ ct -> 0x039a }
            r8 = r0
            com.google.android.apps.gsa.speech.microdetection.a.b.b r8 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92490b) r8     // Catch:{ ct -> 0x039a }
            if (r8 != 0) goto L_0x003b
            com.google.common.f.e r0 = f287124a     // Catch:{ ct -> 0x039a }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ ct -> 0x039a }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x039a }
            r0.mo56378ag(r2, r7)     // Catch:{ ct -> 0x039a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x039a }
            r2 = 21248(0x5300, float:2.9775E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ ct -> 0x039a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x039a }
            java.lang.String r2 = "Received null when decoding HotwordModelDownloadInfo"
            r0.mo56386p(r2)     // Catch:{ ct -> 0x039a }
            return
        L_0x003b:
            long r9 = r8.f258117b     // Catch:{ ct -> 0x039a }
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            com.google.common.f.e r0 = f287124a     // Catch:{ ct -> 0x039a }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ ct -> 0x039a }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x039a }
            r0.mo56378ag(r5, r7)     // Catch:{ ct -> 0x039a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x039a }
            r5 = 21233(0x52f1, float:2.9754E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ ct -> 0x039a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x039a }
            java.lang.String r5 = "Ignoring download ID %d for hotword model type %s, id %d"
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ ct -> 0x039a }
            long r8 = r8.f258117b     // Catch:{ ct -> 0x039a }
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch:{ ct -> 0x039a }
            r0.mo56359L(r5, r2, r4, r3)     // Catch:{ ct -> 0x039a }
            return
        L_0x0066:
            int r0 = r19.hashCode()
            r9 = -528828719(0xffffffffe07ab6d1, float:-7.2263427E19)
            r10 = 0
            if (r0 == r9) goto L_0x0071
            goto L_0x007b
        L_0x0071:
            java.lang.String r0 = "pending_xgoogle_hotword_model_download_info"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            if (r0 == 0) goto L_0x0081
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE
            goto L_0x0083
        L_0x0081:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
        L_0x0083:
            r9 = r0
            int r0 = r8.f258116a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0387
            java.lang.String r11 = r8.f258118c
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            r12 = 1
            long[] r13 = new long[r12]
            r13[r10] = r2
            android.app.DownloadManager$Query r0 = r0.setFilterById(r13)
            r13 = 24
            android.app.DownloadManager$Query r0 = r0.setFilterByStatus(r13)
            com.google.android.apps.gsa.search.core.n.b r13 = r1.f287130g
            android.database.Cursor r13 = r13.mo79822e(r0)
            if (r13 != 0) goto L_0x00bb
            com.google.common.f.e r0 = f287124a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            java.lang.String r2 = "DownloadManager query cursor is null, no config change will be applied."
            r3 = 21246(0x52fe, float:2.9772E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x00bb:
            boolean r0 = r13.moveToFirst()
            if (r0 == 0) goto L_0x0383
            java.lang.String r0 = "status"
            int r0 = r13.getColumnIndex(r0)
            int r0 = r13.getInt(r0)
            r14 = 16
            if (r0 != r14) goto L_0x01c6
            com.google.common.f.e r0 = f287124a
            com.google.common.f.x r5 = r0.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "reason"
            int r6 = r13.getColumnIndex(r6)
            int r6 = r13.getInt(r6)
            r8 = 21243(0x52fb, float:2.9768E-41)
            java.lang.String r14 = "Hotword model download failed. Reason: %d"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56387q(r14, r6)
            r16.m170533f(r17, r19)
            r2 = 290(0x122, float:4.06E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r2)
            int r2 = f287125c
            int r2 = r2 + r12
            f287125c = r2
            r3 = 5
            if (r2 < r3) goto L_0x00ff
            f287125c = r10
            goto L_0x0383
        L_0x00ff:
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 21251(0x5303, float:2.9779E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = "Download failed(%s,%s), retrying..."
            r0.mo56354G(r2, r9, r11)
            com.google.android.apps.gsa.tasks.ag r0 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.tasks.af r0 = (com.google.android.apps.gsa.tasks.C118471af) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            int r3 = r2.f328821a
            r3 = r3 | r12
            r2.f328821a = r3
            r3 = 60000(0xea60, double:2.9644E-319)
            r2.f328822b = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            r2.f328824d = r12
            int r3 = r2.f328821a
            r3 = r3 | 4
            r2.f328821a = r3
            com.google.android.apps.gsa.tasks.ak r2 = com.google.android.apps.gsa.tasks.C118476ak.f328838a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.tasks.aj r2 = (com.google.android.apps.gsa.tasks.C118475aj) r2
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g.f258128a
            com.google.android.apps.gsa.speech.microdetection.a.b.f r4 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f.f258122e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.speech.microdetection.a.b.c r4 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92491c) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.speech.microdetection.a.b.f r5 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f) r5
            int r6 = r9.f253255d
            r5.f258125b = r6
            int r6 = r5.f258124a
            r6 = r6 | r12
            r5.f258124a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.speech.microdetection.a.b.f r5 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f) r5
            r11.getClass()
            int r6 = r5.f258124a
            r6 = r6 | 4
            r5.f258124a = r6
            r5.f258127d = r11
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.speech.microdetection.a.b.f r4 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f) r4
            r2.mo58885m(r3, r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.tasks.ak r2 = (com.google.android.apps.gsa.tasks.C118476ak) r2
            r2.getClass()
            r3.f328827g = r2
            int r2 = r3.f328821a
            r2 = r2 | 32
            r3.f328821a = r2
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            if (r9 != r2) goto L_0x01b7
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            int r3 = r2.f328821a
            r3 = r3 | r12
            r2.f328821a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.f328822b = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            int r5 = r2.f328821a
            r5 = r5 | 2
            r2.f328821a = r5
            r2.f328823c = r3
        L_0x01b7:
            com.google.android.apps.gsa.tasks.t r2 = r1.f287127d
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.UPDATE_HOTWORD_MODELS
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.tasks.ag r0 = (com.google.android.apps.gsa.tasks.C118472ag) r0
            r2.mo103754e(r3, r0)
            goto L_0x0383
        L_0x01c6:
            r14 = 8
            if (r0 != r14) goto L_0x0383
            com.google.common.f.e r0 = f287124a
            com.google.common.f.x r15 = r0.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r6, r7)
            java.lang.String r6 = "Hotword model download succeeded"
            r12 = 21235(0x52f3, float:2.9757E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r12)).mo56386p(r6)
            dagger.a r6 = r1.f287133j
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ak r6 = (com.google.android.apps.gsa.shared.speech.dumper.C90548ak) r6
            java.lang.String r12 = r8.f258119d
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r12 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r14, r12)
            java.lang.String r14 = ""
            r15 = 3
            r6.mo84668b(r15, r12, r14)
            f287125c = r10
            r6 = 288(0x120, float:4.04E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r6)
            com.google.android.apps.gsa.search.core.n.b r6 = r1.f287130g
            android.net.Uri r6 = r6.mo79823f(r2)
            if (r6 == 0) goto L_0x036f
            android.content.Context r0 = r1.f287128e     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.io.File r12 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152174c(r0, r11, r9)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            if (r12 == 0) goto L_0x033e
            android.content.Context r0 = r1.f287128e     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0212, all -> 0x033f }
            java.io.InputStream r0 = com.google.android.libraries.gsa.util.C23335a.m43765b(r0, r6)     // Catch:{ Exception -> 0x0212, all -> 0x033f }
            goto L_0x0226
        L_0x0212:
            r0 = move-exception
            com.google.common.f.e r14 = f287124a     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r14.mo56378ag(r15, r7)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.lang.String r15 = "Failed reading downloaded model zip."
            r10 = 21230(0x52ee, float:2.975E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r0)).mo56372aa(r10)).mo56386p(r15)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r0 = 0
        L_0x0226:
            if (r0 == 0) goto L_0x0323
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r5.<init>(r12)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            com.google.common.p4541l.C59332o.m92211b(r0, r5)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            m170532e(r0)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.lang.String r0 = m170531a(r9)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.search.core.preferences.r r6 = r1.f287126b     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.search.core.preferences.q r6 = r6.mo80076b()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.lang.String r0 = com.google.android.apps.gsa.shared.util.C90725ai.m148179a(r11, r0)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.lang.String r8 = r8.f258119d     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r6.mo80073h(r0, r8)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r6.mo80075j(r4)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r6.apply()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.search.core.n.b r0 = r1.f287130g     // Catch:{ Exception -> 0x0258 }
            r4 = 1
            long[] r6 = new long[r4]     // Catch:{ Exception -> 0x0258 }
            r4 = 0
            r6[r4] = r2     // Catch:{ Exception -> 0x0258 }
            r0.mo79820b(r6)     // Catch:{ Exception -> 0x0258 }
            goto L_0x0279
        L_0x0258:
            r0 = move-exception
            com.google.common.f.e r4 = f287124a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r4.mo56378ag(r6, r7)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r4 = 21239(0x52f7, float:2.9762E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.lang.String r4 = "Failed removing the downloadId %d."
            r0.mo56388r(r4, r2)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
        L_0x0279:
            r1.mo93474d(r9)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.by r0 = com.google.android.apps.gsa.tasks.C118522by.PROCESS_NEW_HOTWORD_MODEL     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            if (r9 == r2) goto L_0x02ec
            com.google.android.apps.gsa.tasks.ag r2 = com.google.android.apps.gsa.tasks.C118472ag.f328819i     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.af r2 = (com.google.android.apps.gsa.tasks.C118471af) r2     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ak r3 = com.google.android.apps.gsa.tasks.C118476ak.f328838a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.aj r3 = (com.google.android.apps.gsa.tasks.C118475aj) r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g.f258128a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.speech.microdetection.a.b.f r6 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f.f258122e     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.speech.microdetection.a.b.c r6 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92491c) r6     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.speech.microdetection.a.b.f r8 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f) r8     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            int r9 = r9.f253255d     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r8.f258125b = r9     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            int r9 = r8.f258124a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r10 = 1
            r9 = r9 | r10
            r8.f258124a = r9     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.speech.microdetection.a.b.f r6 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f) r6     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3.mo58885m(r4, r6)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r2.copyOnWrite()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ak r3 = (com.google.android.apps.gsa.tasks.C118476ak) r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3.getClass()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r4.f328827g = r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            int r3 = r4.f328821a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3 = r3 | 32
            r4.f328821a = r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.e r3 = f287124a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3.mo56378ag(r4, r7)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.lang.String r4 = "Schedule %s for the new google home hotword model"
            r6 = 21254(0x5306, float:2.9783E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56389s(r4, r0)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.t r3 = r1.f287127d     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3.mo103754e(r0, r2)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            goto L_0x0316
        L_0x02ec:
            com.google.android.apps.gsa.tasks.t r2 = r1.f287127d     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ag r3 = com.google.android.apps.gsa.tasks.C118472ag.f328819i     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.af r3 = (com.google.android.apps.gsa.tasks.C118471af) r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r8 = 30
            long r8 = r4.toMillis(r8)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            int r6 = r4.f328821a     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r6 = r6 | 2
            r4.f328821a = r6     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r4.f328823c = r8     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            r2.mo103754e(r0, r3)     // Catch:{ IOException -> 0x0320, all -> 0x031d }
        L_0x0316:
            r16.mo93472b()     // Catch:{ IOException -> 0x0320, all -> 0x031d }
            m170532e(r5)
            goto L_0x0383
        L_0x031d:
            r0 = move-exception
            r6 = r5
            goto L_0x036b
        L_0x0320:
            r0 = move-exception
            r6 = r5
            goto L_0x0344
        L_0x0323:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r3.append(r2)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0342, all -> 0x033f }
            throw r0     // Catch:{ IOException -> 0x0342, all -> 0x033f }
        L_0x033e:
            return
        L_0x033f:
            r0 = move-exception
            r6 = 0
            goto L_0x036b
        L_0x0342:
            r0 = move-exception
            r6 = 0
        L_0x0344:
            com.google.common.f.e r2 = f287124a     // Catch:{ all -> 0x036a }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x036a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x036a }
            r2.mo56378ag(r3, r7)     // Catch:{ all -> 0x036a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x036a }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x036a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x036a }
            r2 = 21238(0x52f6, float:2.9761E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x036a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x036a }
            java.lang.String r2 = "Unable to move file to internal storage"
            r0.mo56386p(r2)     // Catch:{ all -> 0x036a }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x036a }
            m170532e(r6)
            goto L_0x0383
        L_0x036a:
            r0 = move-exception
        L_0x036b:
            m170532e(r6)
            throw r0
        L_0x036f:
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r7)
            java.lang.String r5 = "Uri for downloaded file is null"
            r6 = 21236(0x52f4, float:2.9758E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r5)
            r16.m170533f(r17, r19)
            return
        L_0x0383:
            r13.close()
            return
        L_0x0387:
            com.google.common.f.e r0 = f287124a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            java.lang.String r2 = "Failed fetching the locale of the download model"
            r3 = 21247(0x52ff, float:2.9773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x039a:
            r0 = move-exception
            com.google.common.f.e r2 = f287124a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r7)
            java.lang.String r3 = "Couldn't decode HotwordModelDownloadInfo"
            r4 = 21234(0x52f2, float:2.9755E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return
        L_0x03b0:
            com.google.common.f.e r0 = f287124a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            java.lang.String r2 = "pending download info for %s is null"
            r3 = 21249(0x5301, float:2.9776E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.p8041c.C102826v.mo93473c(long, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo93474d(C90584f fVar) {
        boolean isEmpty = ((C92371d) this.f287132i.mo27525b()).f257559d.isEmpty();
        C58976aa aaVar = C58975e.f156826a;
        if (!(!isEmpty)) {
            String Z = ((C89994f) this.f287131h.mo27525b()).mo83863Z();
            if (((C89994f) this.f287131h.mo27525b()).mo83834w() && !((C89994f) this.f287131h.mo27525b()).mo83833v(fVar, Z) && fVar == C90584f.OK_HEY_GOOGLE && !((C89994f) this.f287131h.mo27525b()).mo83847J(((C89994f) this.f287131h.mo27525b()).mo83882ab())) {
                ((C89994f) this.f287131h.mo27525b()).mo83832u(fVar, Z);
            }
        }
    }
}
