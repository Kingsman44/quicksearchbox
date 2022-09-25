package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124547c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.format.DateTimeParseException;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.j */
/* compiled from: PG */
public final class C95493j {

    /* renamed from: a */
    public static final C59071e f267217a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.m.j");

    /* renamed from: b */
    static final Duration f267218b = Duration.ofMinutes(5);

    /* renamed from: c */
    static final Duration f267219c = Duration.ofDays(7);

    /* renamed from: d */
    static final Duration f267220d = Duration.ofMinutes(10);

    /* renamed from: e */
    public final Context f267221e;

    /* renamed from: f */
    public final C22871g f267222f;

    /* renamed from: g */
    public final C60950i f267223g;

    /* renamed from: h */
    public final C124550f f267224h;

    /* renamed from: i */
    public final C87242k f267225i;

    /* renamed from: j */
    public final ConcurrentHashMap f267226j = new ConcurrentHashMap();

    /* renamed from: k */
    private final C22871g f267227k;

    /* renamed from: l */
    private final C89656k f267228l;

    /* renamed from: m */
    private final C84466a f267229m;

    public C95493j(Context context, C22871g gVar, C22871g gVar2, C60950i iVar, C124550f fVar, C89656k kVar, C84466a aVar, C87242k kVar2) {
        this.f267221e = context;
        this.f267222f = gVar;
        this.f267227k = gVar2;
        this.f267223g = iVar;
        this.f267224h = fVar;
        this.f267228l = kVar;
        this.f267229m = aVar;
        this.f267225i = kVar2;
    }

    /* renamed from: a */
    public static Optional m157947a(C89022at atVar) {
        String a = atVar.mo83000a("last-modified", (String) null);
        if (a != null) {
            try {
                return Optional.m71637of(Instant.from(DateTimeFormatter.RFC_1123_DATE_TIME.parse(a)));
            } catch (DateTimeParseException unused) {
                C58976aa aaVar = C58975e.f156826a;
                return Optional.empty();
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return Optional.empty();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a7 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m157948d(android.content.Intent r7, dagger.C68214a r8) {
        /*
            java.lang.String r0 = "key_device_id"
            java.lang.String r0 = r7.getStringExtra(r0)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            java.lang.String r2 = "DevCusDownloader"
            if (r1 == 0) goto L_0x0021
            com.google.common.f.e r7 = f267217a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r2)
            java.lang.String r8 = "No device ID"
            r0 = 15125(0x3b15, float:2.1195E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x0021:
            java.lang.String r1 = "file_path"
            java.lang.String r7 = r7.getStringExtra(r1)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r7)
            if (r1 == 0) goto L_0x0040
            com.google.common.f.e r7 = f267217a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r2)
            java.lang.String r8 = "No file path"
            r0 = 15124(0x3b14, float:2.1193E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x0040:
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.f r8 = (com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f) r8
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00aa }
            r1.<init>(r7)     // Catch:{ IOException -> 0x00aa }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x008a }
            r3.<init>(r7)     // Catch:{ all -> 0x008a }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0076
            boolean r4 = r3.canRead()     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x005d
            goto L_0x0076
        L_0x005d:
            com.google.android.d.bc r3 = com.google.android.p10712d.C142324bc.f386113s     // Catch:{ all -> 0x008a }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (java.io.InputStream) r1)     // Catch:{ all -> 0x008a }
            com.google.android.d.bc r3 = (com.google.android.p10712d.C142324bc) r3     // Catch:{ all -> 0x008a }
            r8.mo83386ab(r0, r3)     // Catch:{ all -> 0x008a }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008a }
            r1.close()     // Catch:{ IOException -> 0x00aa }
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            r8.delete()
            return
        L_0x0076:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008a }
            r3.exists()     // Catch:{ all -> 0x008a }
            r3.canRead()     // Catch:{ all -> 0x008a }
            r1.close()     // Catch:{ IOException -> 0x00aa }
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            r8.delete()
            return
        L_0x008a:
            r8 = move-exception
            r1.close()     // Catch:{ all -> 0x008f }
            goto L_0x00a7
        L_0x008f:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00a7 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x00a7 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00a7 }
            r1[r5] = r0     // Catch:{ Exception -> 0x00a7 }
            r3.invoke(r8, r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            throw r8     // Catch:{ IOException -> 0x00aa }
        L_0x00a8:
            r8 = move-exception
            goto L_0x00d4
        L_0x00aa:
            r8 = move-exception
            com.google.common.f.e r0 = f267217a     // Catch:{ all -> 0x00a8 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00a8 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a8 }
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x00a8 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00a8 }
            com.google.common.f.x r8 = r0.mo56382g(r8)     // Catch:{ all -> 0x00a8 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00a8 }
            r0 = 15127(0x3b17, float:2.1197E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)     // Catch:{ all -> 0x00a8 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "parse fail"
            r8.mo56386p(r0)     // Catch:{ all -> 0x00a8 }
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            r8.delete()
            return
        L_0x00d4:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r0.delete()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95493j.m157948d(android.content.Intent, dagger.a):void");
    }

    /* renamed from: b */
    public final void mo89389b(String str, C124547c cVar) {
        C60870cx cxVar;
        Uri parse = Uri.parse(String.format(Locale.getDefault(), (this.f267228l.mo83554i() || this.f267228l.mo83560o() || this.f267228l.mo83553h("enableDevDeviceCustomization")) ? "https://www.gstatic.com/bisto/device_customization/%s/dev.pb" : "https://www.gstatic.com/bisto/device_customization/%s/info.pb", new Object[]{cVar.mo106456b()}));
        try {
            URL url = new URL(parse.toString());
            C59104x b = f267217a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DevCusDownloader");
            ((C59052c) ((C59052c) b).mo56372aa(15117)).mo56389s("toDownload = %s", parse);
            C89066v vVar = !cVar.mo106455a().isPresent() ? C89066v.f241382a : C89066v.f241383b;
            C89356b b2 = this.f267229m.mo78026b("DevCusDownloader", C118575h.GRAPH_NETWORK_REQUEST, C118575h.WORKER_BISTO);
            C89019aq b3 = C89020ar.m144757b();
            b3.f241236b = url;
            b3.f241245k = 59;
            C89020ar a = b3.mo82989a();
            if (!cVar.mo106455a().isPresent()) {
                cxVar = C60856cj.m92900i(true);
            } else {
                cxVar = this.f267227k.mo28205e(this.f267227k.mo28209i(this.f267225i.mo80852a(b2, vVar, new C89018ap(a, C89009ag.f241207b)), "get-modified_time", new C95487d((Instant) cVar.mo106455a().get())), "modified-time-error", Exception.class, C95488e.f267210a);
            }
            C60870cx i = this.f267227k.mo28209i(this.f267227k.mo28210j(cxVar, "download", new C95484a(this, url, b2, vVar)), "parse-and-update", new C95485b(this, str));
            this.f267226j.put(str, i);
            this.f267227k.mo28211k(i, "download-finished", new C95491h(this, str, cVar));
        } catch (MalformedURLException e) {
            C59104x c = f267217a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DevCusDownloader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15118)).mo56389s("Invalid Uri %s", parse);
        }
    }

    /* renamed from: c */
    public final void mo89390c(String str, C124547c cVar) {
        if (cVar.mo106455a().isPresent()) {
            this.f267224h.mo83391ag(str);
        }
    }
}
