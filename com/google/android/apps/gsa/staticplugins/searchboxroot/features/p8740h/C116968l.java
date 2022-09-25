package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42782f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.C72668e;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.l */
/* compiled from: PG */
public final class C116968l extends C88582c implements C89196a {

    /* renamed from: i */
    private static final C59071e f324713i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.l");

    /* renamed from: a */
    public final Object f324714a = new Object();

    /* renamed from: b */
    public C72668e f324715b = null;

    /* renamed from: c */
    public String f324716c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public Map f324717d = new HashMap();

    /* renamed from: e */
    public Map f324718e = new HashMap();

    /* renamed from: f */
    public Map f324719f = new HashMap();

    /* renamed from: g */
    public Map f324720g = new HashMap();

    /* renamed from: h */
    C22871g f324721h;

    /* renamed from: j */
    private final Object f324722j = new Object();

    /* renamed from: k */
    private final C86124t f324723k;

    /* renamed from: l */
    private C60870cx f324724l = null;

    /* renamed from: m */
    private final C86338r f324725m;

    /* renamed from: n */
    private final C21370a f324726n;

    /* renamed from: o */
    private final C42813k f324727o;

    /* renamed from: p */
    private C60870cx f324728p = null;

    /* renamed from: q */
    private final C29409fd f324729q;

    public C116968l(C86124t tVar, C86338r rVar, C42813k kVar, C21370a aVar, C29409fd fdVar) {
        this.f324723k = tVar;
        this.f324725m = rVar;
        this.f324726n = aVar;
        this.f324727o = kVar;
        this.f324729q = fdVar;
    }

    /* renamed from: b */
    public static int[] m194372b(List list, Map map) {
        int[] iArr = new int[10];
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                iArr[10 - (i + 1)] = ((Integer) map.get(list.get(i))).intValue();
            }
        }
        return iArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0063 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map m194373d(com.google.android.libraries.storage.p3304a.C42813k r6, java.util.Map r7, java.lang.String r8) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r7.containsKey(r8)
            if (r1 == 0) goto L_0x007a
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0064 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x0064 }
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch:{ IOException -> 0x0064 }
            com.google.android.libraries.storage.a.f.l r3 = new com.google.android.libraries.storage.a.f.l     // Catch:{ IOException -> 0x0064 }
            r3.<init>()     // Catch:{ IOException -> 0x0064 }
            r4 = 1
            r3.f112052a = r4     // Catch:{ IOException -> 0x0064 }
            java.lang.Object r6 = r6.mo45889c(r2, r3)     // Catch:{ IOException -> 0x0064 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ IOException -> 0x0064 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0064 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0064 }
            r6 = 1
        L_0x0033:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0043
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0047 }
            r8.put(r1, r2)     // Catch:{ all -> 0x0047 }
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0043:
            r0.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0079
        L_0x0047:
            r6 = move-exception
            r0.close()     // Catch:{ all -> 0x004c }
            goto L_0x0063
        L_0x004c:
            r0 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r3 = 0
            r1[r3] = r2     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0063 }
            r2[r3] = r0     // Catch:{ Exception -> 0x0063 }
            r1.invoke(r6, r2)     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            throw r6     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r6 = move-exception
            com.google.common.f.e r0 = f324713i
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "MODSSource"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "MODS Model File Loading error. %s"
            r2 = 32532(0x7f14, float:4.5587E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r6)).mo56372aa(r2)).mo56389s(r1, r7)
        L_0x0079:
            return r8
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116968l.m194373d(com.google.android.libraries.storage.a.k, java.util.Map, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103075a(Map map) {
        C90727ak.m148184a("suggest_jni");
        try {
            if (map.containsKey("tflite_model")) {
                long b = this.f324726n.mo26870b();
                try {
                    MappedByteBuffer mappedByteBuffer = (MappedByteBuffer) this.f324727o.mo45889c(Uri.parse((String) map.get("tflite_model")), new C42782f());
                    mappedByteBuffer.load();
                    synchronized (this.f324714a) {
                        C72668e eVar = this.f324715b;
                        if (eVar != null) {
                            eVar.close();
                            this.f324715b = null;
                        }
                        this.f324715b = new C72668e(mappedByteBuffer);
                    }
                    C59104x c = f324713i.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "MODSSource");
                    ((C59052c) ((C59052c) c).mo56372aa(32535)).mo56388r("TFLite Model Loadtime: %d", this.f324726n.mo26870b() - b);
                } catch (Exception e) {
                    C59104x c2 = f324713i.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "MODSSource");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32536)).mo56389s("Failed to MODS into memory. %s", e);
                }
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
        } catch (UnsatisfiedLinkError e2) {
            C59104x c3 = f324713i.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "MODSSource");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(32534)).mo56389s("MODS Model loading error. %s", e2);
        }
        this.f324717d = m194373d(this.f324727o, map, "context_fullquery");
        this.f324718e = m194373d(this.f324727o, map, "context_unigrams");
        this.f324719f = m194373d(this.f324727o, map, "context_bigrams");
        this.f324720g = (Map) Collection.EL.stream(m194373d(this.f324727o, map, "label_fullquery").entrySet()).collect(Collectors.toMap(C116962f.f324707a, C116963g.f324708a));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
        if (this.f324723k.mo79746e(C90085ej.f250201bc) && this.f324724l == null && this.f324721h != null) {
            C29409fd fdVar = this.f324729q;
            C28804cs f = C28805ct.m53747f();
            ((C29663j) f).f80313a = "mosaicondevice";
            C60870cx i = this.f324721h.mo28209i(fdVar.mo34717f(f.mo34447a()), "Get Mosaic FileGroup", C116959c.f324704a);
            this.f324724l = i;
            new C90873ag(i, this.f324721h, "Initializing Mosaic OnDeviceSuggest Model", new C116960d(this)).mo85223a(C116961e.f324706a);
        }
    }

    /* renamed from: hF */
    public final void mo82225hF(C22871g gVar) {
        this.f324721h = gVar;
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f324722j) {
            C60870cx cxVar = this.f324728p;
            if (cxVar != null && !cxVar.isDone()) {
                this.f324728p.cancel(true);
            }
            C22871g gVar = this.f324721h;
            if (gVar == null) {
                return null;
            }
            C60870cx a = gVar.mo28201a("Fetching Mosaic OnDevice TFLite", new C116966j(this, aVar));
            this.f324728p = a;
            return a;
        }
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C60870cx cxVar = this.f324724l;
        if (cxVar != null && cxVar.isDone()) {
            if (this.f324723k.mo79746e(C90085ej.f250161al)) {
                this.f324716c = this.f324725m.getString("previous_query", BuildConfig.FLAVOR);
            }
            C88616t tVar = (C88616t) aVar;
            if (tVar.f239556a.mo84352bk().isEmpty() || tVar.f239557b != 1 || this.f324716c.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
