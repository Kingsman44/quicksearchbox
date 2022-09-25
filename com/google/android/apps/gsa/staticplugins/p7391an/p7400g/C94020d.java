package com.google.android.apps.gsa.staticplugins.p7391an.p7400g;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C89974am;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.gsa.p1859d.C22796r;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p337aa.C6598a;
import com.google.p337aa.C6615b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.g.d */
/* compiled from: PG */
final class C94020d extends C90880an {

    /* renamed from: a */
    private static final C59071e f262632a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.g.d");

    /* renamed from: b */
    private static final Uri f262633b = C22796r.f62756a.buildUpon().appendPath("imageloader").appendPath("qsb_super_g_sprite").build();

    /* renamed from: c */
    private final Context f262634c;

    /* renamed from: d */
    private final C58833ax f262635d;

    /* renamed from: e */
    private final C86338r f262636e;

    /* renamed from: f */
    private final C87242k f262637f;

    /* renamed from: g */
    private final C68214a f262638g;

    /* renamed from: h */
    private final C84466a f262639h;

    public C94020d(Context context, C58833ax axVar, C84466a aVar, C87242k kVar, C86338r rVar, C68214a aVar2) {
        super("MaybeFetchDoodleMedia", 1, 12);
        this.f262634c = context;
        this.f262635d = axVar;
        this.f262639h = aVar;
        this.f262637f = kVar;
        this.f262636e = rVar;
        this.f262638g = aVar2;
    }

    /* renamed from: e */
    private final void m155211e() {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = true;
        if (!this.f262636e.contains("qsb_super_g_animation") && !this.f262636e.contains("qsb_super_g_image_path")) {
            z = false;
        }
        C86337q b = this.f262636e.mo80076b();
        b.mo80075j("qsb_super_g_animation");
        b.mo80075j("qsb_super_g_image_path");
        b.apply();
        if (z) {
            this.f262634c.getContentResolver().notifyChange(C22796r.f62757b, (ContentObserver) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo88301b(String str) {
        try {
            C89019aq a = C89020ar.m144756a();
            a.mo82994f(str);
            a.f241244j = false;
            a.f241245k = 26;
            C89020ar a2 = a.mo82989a();
            return ((C89057m) C90877ak.m148472f(this.f262637f.mo80852a(this.f262639h.mo78025a("MaybeFetchDoodleMediaTask", 348, 11), C89066v.f241382a, new C89018ap(a2, C89009ag.f241207b)))).mo83036f();
        } catch (MalformedURLException | ExecutionException e) {
            C59104x d = f262632a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FetchDoodleMediaTask");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19421)).mo56389s("Error downloading doodle image: %s", str);
            int i = C90755l.f253831a;
            return null;
        } catch (C90457d e2) {
            C59104x c = f262632a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FetchDoodleMediaTask");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(19422)).mo56389s("Error downloading doodle image: %s", str);
            return null;
        } catch (C89013ak | InterruptedException e3) {
            C59104x d2 = f262632a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "FetchDoodleMediaTask");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e3)).mo56372aa(19423)).mo56389s("Error downloading doodle image: %s", str);
            return null;
        } catch (CancellationException unused) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (!this.f262635d.mo56113h()) {
            m155211e();
            return this.f262635d;
        }
        DoodleData doodleData = (DoodleData) this.f262635d.mo56107c();
        if (((C86124t) this.f262638g.mo27525b()).mo79746e(C89974am.f246587a)) {
            byte[] bArr = doodleData.f252920A;
            byte[] e = this.f262636e.mo80079e("qsb_super_g_animation", (byte[]) null);
            C6598a aVar = (C6598a) C6615b.f19645c.createBuilder();
            if (bArr != null && bArr.length > 0) {
                try {
                    aVar.mergeFrom(bArr, C62921ba.m95368a());
                } catch (C62974ct e2) {
                    C59104x c = f262632a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "FetchDoodleMediaTask");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(19417)).mo56386p("Error parsing CrushinatedAnimation.");
                }
            }
            if (bArr == null || (((C6615b) aVar.instance).f19647a & 2) == 0 || TextUtils.isEmpty(doodleData.f252959y)) {
                m155211e();
            } else {
                C86337q b = this.f262636e.mo80076b();
                b.mo80070e("doodle_medium_image_background_color", doodleData.f252945k);
                b.apply();
                mo88303d(doodleData.f252959y, "doodlemediatask_superg", "qsb_super_g_image_path");
                mo88303d(doodleData.f252942h, "doodlemediatask_suggest", "qsb_suggest_image_path");
                Uri build = Uri.parse("content://com.google.android.googlequicksearchbox.NetworkImageLoaderContentProvider").buildUpon().appendPath("stream_image").appendQueryParameter("url", ((C6615b) aVar.instance).f19648b).appendQueryParameter("tag", Integer.toString(26)).build();
                String uri = f262633b.toString();
                aVar.copyOnWrite();
                C6615b bVar = (C6615b) aVar.instance;
                uri.getClass();
                bVar.f19647a |= 2;
                bVar.f19648b = uri;
                byte[] byteArray = ((C6615b) aVar.build()).toByteArray();
                String string = this.f262636e.getString("qsb_super_g_sprite", (String) null);
                if (!Arrays.equals(e, byteArray) || !TextUtils.equals(string, build.toString())) {
                    C86337q b2 = this.f262636e.mo80076b();
                    b2.mo80073h("qsb_super_g_sprite", build.toString());
                    b2.mo80068c("qsb_super_g_animation", byteArray);
                    b2.apply();
                    this.f262634c.getContentResolver().notifyChange(C22796r.f62757b, (ContentObserver) null);
                }
            }
        } else {
            m155211e();
        }
        if (doodleData.mo84530a(this.f262634c, false, false)) {
            doodleData.f252958x = true;
        }
        return C58833ax.m90834k(doodleData);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[SYNTHETIC, Splitter:B:22:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC, Splitter:B:26:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88303d(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            byte[] r1 = r4.mo88301b(r5)     // Catch:{ IOException -> 0x0044 }
            if (r1 == 0) goto L_0x006c
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0044 }
            android.content.Context r3 = r4.f262634c     // Catch:{ IOException -> 0x0044 }
            java.io.File r3 = r3.getCacheDir()     // Catch:{ IOException -> 0x0044 }
            r2.<init>(r3, r6)     // Catch:{ IOException -> 0x0044 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0044 }
            if (r3 == 0) goto L_0x001b
            r2.delete()     // Catch:{ IOException -> 0x0044 }
        L_0x001b:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0044 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0044 }
            r3.write(r1)     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            com.google.android.apps.gsa.search.core.preferences.r r0 = r4.f262636e     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            com.google.android.apps.gsa.search.core.preferences.q r0 = r0.mo80076b()     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            java.lang.String r1 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r0.mo80073h(r7, r1)     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r0.apply()     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r2.getCanonicalPath()     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r3.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r5 = move-exception
            r0 = r3
            goto L_0x006d
        L_0x003f:
            r7 = move-exception
            r0 = r3
            goto L_0x0045
        L_0x0042:
            r5 = move-exception
            goto L_0x006d
        L_0x0044:
            r7 = move-exception
        L_0x0045:
            com.google.common.f.e r1 = f262632a     // Catch:{ all -> 0x0042 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0042 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "FetchDoodleMediaTask"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0042 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0042 }
            com.google.common.f.x r7 = r1.mo56382g(r7)     // Catch:{ all -> 0x0042 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0042 }
            r1 = 19420(0x4bdc, float:2.7213E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x0042 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "Failed to write image URL %s to cache file %s"
            r7.mo56354G(r1, r5, r6)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006c
            r0.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            return
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7391an.p7400g.C94020d.mo88303d(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
