package com.google.android.apps.gsa.assist.p507f.p508a;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.assist.p507f.C9416b;
import com.google.android.apps.gsa.shared.p7008az.C89333b;
import com.google.android.apps.gsa.shared.p7008az.C89334c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.assist.f.a.b */
/* compiled from: PG */
public final class C9413b implements C9416b {

    /* renamed from: c */
    private static final C59071e f32702c = C59071e.m91332i("com.google.android.apps.gsa.assist.f.a.b");

    /* renamed from: a */
    public boolean f32703a = false;

    /* renamed from: b */
    public boolean f32704b = false;

    /* renamed from: d */
    private final Context f32705d;

    /* renamed from: e */
    private final C89333b f32706e;

    /* renamed from: f */
    private SettableFuture f32707f;

    /* renamed from: g */
    private SettableFuture f32708g;

    /* renamed from: h */
    private final C90021c f32709h;

    /* renamed from: i */
    private final C90929bz f32710i;

    /* renamed from: j */
    private C90936cf f32711j;

    public C9413b(Context context, C89334c cVar, C90021c cVar2, C90929bz bzVar) {
        this.f32705d = context;
        this.f32706e = cVar.mo83282a("assist", "com.google.android.apps.gsa.staticplugins.assist.screenshot.ScreenshotProvider");
        this.f32707f = new SettableFuture();
        this.f32708g = new SettableFuture();
        this.f32709h = cVar2;
        this.f32710i = bzVar;
        this.f32711j = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e7 A[Catch:{ IOException | CancellationException -> 0x00eb }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.assist.p507f.C9411a m23938g(android.graphics.Bitmap r12) {
        /*
            r11 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            r0 = 0
            java.util.Date r1 = new java.util.Date     // Catch:{ IOException | CancellationException -> 0x00eb }
            r1.<init>()     // Catch:{ IOException | CancellationException -> 0x00eb }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r4 = "yyyyMMdd-HHmmss"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ IOException | CancellationException -> 0x00eb }
            r3.<init>(r4, r5)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r3 = r3.format(r1)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r4 = 0
            r2[r4] = r3     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r3 = "Screenshot_%s.png"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.content.Context r3 = r11.f32705d     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | CancellationException -> 0x00eb }
            r4.<init>()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.assist.screenshot.ScreenshotProvider"
            android.net.Uri$Builder r4 = r4.authority(r5)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r5 = "ScreenAssistScreenshots"
            android.net.Uri$Builder r4 = r4.appendPath(r5)     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.net.Uri$Builder r4 = r4.appendPath(r2)     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.net.Uri r4 = r4.build()     // Catch:{ IOException | CancellationException -> 0x00eb }
            com.google.android.apps.gsa.shared.az.b r5 = r11.f32706e     // Catch:{ IOException | CancellationException -> 0x00eb }
            android.net.Uri r4 = r5.mo83278a(r4)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r5 = "w"
            java.io.OutputStream r5 = r3.openOutputStream(r4, r5)     // Catch:{ all -> 0x00e3 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00e1 }
            r7 = 100
            r12.compress(r6, r7, r5)     // Catch:{ all -> 0x00e1 }
            r5.flush()     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x005e
            r5.close()     // Catch:{ IOException | CancellationException -> 0x00eb }
        L_0x005e:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.<init>()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "_data"
            java.lang.String r7 = r4.toString()     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "title"
            r5.put(r6, r2)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "_display_name"
            r5.put(r6, r2)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "datetaken"
            long r7 = r1.getTime()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "date_added"
            long r7 = r1.getTime()     // Catch:{ IOException | CancellationException -> 0x00eb }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r6, r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "date_modified"
            long r7 = r1.getTime()     // Catch:{ IOException | CancellationException -> 0x00eb }
            long r7 = r7 / r9
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r6, r1)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r1 = "mime_type"
            java.lang.String r6 = "image/png"
            r5.put(r1, r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r1 = "width"
            int r6 = r12.getWidth()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r1, r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r1 = "height"
            int r6 = r12.getHeight()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r1, r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = r4.toString()     // Catch:{ IOException | CancellationException -> 0x00eb }
            r1.<init>(r6)     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.String r6 = "_size"
            long r7 = r1.length()     // Catch:{ IOException | CancellationException -> 0x00eb }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r5.put(r6, r1)     // Catch:{ IOException | CancellationException -> 0x00eb }
            r3.insert(r4, r5)     // Catch:{ IOException | CancellationException -> 0x00eb }
            com.google.android.apps.gsa.assist.f.a r1 = new com.google.android.apps.gsa.assist.f.a     // Catch:{ IOException | CancellationException -> 0x00eb }
            r1.<init>(r4, r2, r12)     // Catch:{ IOException | CancellationException -> 0x00eb }
            return r1
        L_0x00e1:
            r12 = move-exception
            goto L_0x00e5
        L_0x00e3:
            r12 = move-exception
            r5 = r0
        L_0x00e5:
            if (r5 == 0) goto L_0x00ea
            r5.close()     // Catch:{ IOException | CancellationException -> 0x00eb }
        L_0x00ea:
            throw r12     // Catch:{ IOException | CancellationException -> 0x00eb }
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assist.p507f.p508a.C9413b.m23938g(android.graphics.Bitmap):com.google.android.apps.gsa.assist.f.a");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|(2:11|12)(2:13|14)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.assist.p507f.C9411a mo17665a() {
        /*
            r7 = this;
            java.lang.String r0 = "ScreenshotManager"
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            r1 = 0
            com.google.common.util.concurrent.SettableFuture r2 = r7.f32707f     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r2.value     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            boolean r2 = r2 instanceof com.google.common.util.concurrent.C60873d.C60875b     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            if (r2 == 0) goto L_0x0013
            goto L_0x0065
        L_0x0013:
            com.google.common.util.concurrent.SettableFuture r2 = r7.f32707f     // Catch:{ TimeoutException -> 0x0028 }
            com.google.android.apps.gsa.shared.m.c r3 = r7.f32709h     // Catch:{ TimeoutException -> 0x0028 }
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90028cg.f248177g     // Catch:{ TimeoutException -> 0x0028 }
            long r3 = r3.mo79743a(r4)     // Catch:{ TimeoutException -> 0x0028 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x0028 }
            com.google.android.apps.gsa.shared.s.a.a r6 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ TimeoutException -> 0x0028 }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ TimeoutException -> 0x0028 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ TimeoutException -> 0x0028 }
            goto L_0x0043
        L_0x0028:
            com.google.common.f.e r2 = f32702c     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            r2.mo56378ag(r3, r0)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            r3 = 193(0xc1, float:2.7E-43)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            java.lang.String r3 = "Timout while getting screenshot."
            r2.mo56386p(r3)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            r2 = r1
        L_0x0043:
            if (r2 != 0) goto L_0x0060
            com.google.common.f.e r2 = f32702c     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            r2.mo56378ag(r3, r0)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            r3 = 191(0xbf, float:2.68E-43)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            java.lang.String r3 = "Screenshot was not allowed"
            r2.mo56386p(r3)     // Catch:{ CancellationException -> 0x006a, ExecutionException -> 0x0068, InterruptedException -> 0x0066 }
            return r1
        L_0x0060:
            com.google.android.apps.gsa.assist.f.a r0 = r7.m23938g(r2)
            return r0
        L_0x0065:
            return r1
        L_0x0066:
            r2 = move-exception
            goto L_0x006b
        L_0x0068:
            r2 = move-exception
            goto L_0x006b
        L_0x006a:
            r2 = move-exception
        L_0x006b:
            com.google.common.f.e r3 = f32702c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r0)
            java.lang.String r0 = "Failed to get screenshot."
            r4 = 192(0xc0, float:2.69E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assist.p507f.p508a.C9413b.mo17665a():com.google.android.apps.gsa.assist.f.a");
    }

    /* renamed from: b */
    public final C60870cx mo17666b() {
        if (this.f32707f == null) {
            this.f32707f = new SettableFuture();
        }
        return C60856cj.m92901j(this.f32707f);
    }

    /* renamed from: c */
    public final void mo17667c() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f32704b) {
            SettableFuture settableFuture = this.f32707f;
            if (settableFuture != null) {
                settableFuture.cancel(true);
            }
            this.f32707f = new SettableFuture();
            this.f32708g = new SettableFuture();
            this.f32703a = false;
        }
    }

    /* renamed from: d */
    public final void mo17668d(Bitmap bitmap) {
        C58976aa aaVar = C58975e.f156826a;
        if (bitmap == null) {
            C59104x b = f32702c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ScreenshotManager");
            ((C59052c) ((C59052c) b).mo56372aa(208)).mo56386p("#setScreenshot. Screenshot is null.");
        }
        if (this.f32707f == null) {
            this.f32707f = new SettableFuture();
        }
        if (this.f32708g == null) {
            this.f32708g = new SettableFuture();
        }
        SettableFuture settableFuture = this.f32707f;
        settableFuture.getClass();
        settableFuture.mo57356n(bitmap);
        C59104x b2 = f32702c.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ScreenshotManager");
        ((C59052c) ((C59052c) b2).mo56372aa(207)).mo56386p("#setScreenshot. screenshot is ready");
    }

    /* renamed from: e */
    public final void mo17669e(Bitmap bitmap) {
        if (!this.f32709h.mo79746e(C90014bt.f247449hP) || bitmap != null) {
            C90936cf cfVar = this.f32711j;
            if (cfVar != null) {
                this.f32710i.mo85149n(cfVar);
            }
            SettableFuture settableFuture = this.f32707f;
            if (settableFuture == null || settableFuture.isDone()) {
                mo17667c();
            }
            this.f32711j = new C9412a(this);
            mo17668d(bitmap);
            C90936cf cfVar2 = this.f32711j;
            if (cfVar2 != null) {
                this.f32710i.mo85150o(cfVar2, this.f32709h.mo79743a(C90014bt.f247081aS));
            }
        }
    }

    /* renamed from: f */
    public final int mo17670f() {
        if (this.f32703a) {
            C59104x c = f32702c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ScreenshotManager");
            ((C59052c) ((C59052c) c).mo56372aa(203)).mo56386p("Screenshot is disabled.");
            return 1;
        } else if (!mo17666b().isDone()) {
            C59104x c2 = f32702c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ScreenshotManager");
            ((C59052c) ((C59052c) c2).mo56372aa(202)).mo56386p("Screenshot future is not available.");
            return 2;
        } else {
            try {
                C60870cx b = mo17666b();
                C90476a aVar = C91018d.f254254a;
                Bitmap bitmap = (Bitmap) b.get();
                if (bitmap == null) {
                    C59104x c3 = f32702c.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "ScreenshotManager");
                    ((C59052c) ((C59052c) c3).mo56372aa(199)).mo56386p("Screenshot is null.");
                    return 3;
                } else if (!bitmap.isRecycled()) {
                    return 4;
                } else {
                    C59104x c4 = f32702c.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "ScreenshotManager");
                    ((C59052c) ((C59052c) c4).mo56372aa(201)).mo56386p("Screenshot is recycled.");
                    return 2;
                }
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                C59104x c5 = f32702c.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "ScreenshotManager");
                ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e)).mo56372aa(200)).mo56386p("error capturing screenshot");
                return 2;
            }
        }
    }
}
