package com.google.android.apps.gsa.speech.p7272e.p7274b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.libraries.assistant.auto.ondevice.p710d.C11873a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.speech.e.b.j */
/* compiled from: PG */
public final class C92248j {

    /* renamed from: a */
    public static final C59071e f257186a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.b.j");

    /* renamed from: b */
    public static final FileFilter f257187b = new C92246h();

    /* renamed from: k */
    private static final String[] f257188k = {"/system/usr/srec", "/product/usr/srec"};

    /* renamed from: c */
    public final Context f257189c;

    /* renamed from: d */
    public final C92255q f257190d;

    /* renamed from: e */
    public final C90929bz f257191e;

    /* renamed from: f */
    final List f257192f = new ArrayList();

    /* renamed from: g */
    public C92247i f257193g;

    /* renamed from: h */
    public Map f257194h = null;

    /* renamed from: i */
    public int f257195i = 0;

    /* renamed from: j */
    public volatile File f257196j;

    /* renamed from: l */
    private final C69464a f257197l;

    /* renamed from: m */
    private final C11873a f257198m;

    /* renamed from: n */
    private final List f257199n;

    public C92248j(Context context, C92255q qVar, List list, C69464a aVar, C11873a aVar2, C90929bz bzVar) {
        this.f257189c = context;
        this.f257190d = qVar;
        this.f257199n = list;
        this.f257197l = aVar;
        this.f257198m = aVar2;
        this.f257191e = bzVar;
    }

    /* renamed from: c */
    public static List m151461c() {
        return Collections.unmodifiableList(Arrays.asList(f257188k));
    }

    /* renamed from: m */
    public static boolean m151462m(String str) {
        return str.indexOf(45) == 2 || str.indexOf(45) == 3;
    }

    /* renamed from: o */
    private final void m151463o(boolean z) {
        C58838bb.m90883r(this.f257193g != null);
        int i = this.f257195i;
        if (i <= 0 || z) {
            this.f257195i = i + 1;
            this.f257191e.mo85139d(new C92242d(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v mo86923a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo86932k()     // Catch:{ all -> 0x0050 }
            com.google.common.base.C58838bb.m90883r(r0)     // Catch:{ all -> 0x0050 }
            java.util.Map r0 = r4.f257194h     // Catch:{ all -> 0x0050 }
            r4.mo86934n(r0)     // Catch:{ all -> 0x0050 }
            boolean r1 = r0.containsKey(r5)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0050 }
            com.google.android.apps.gsa.speech.e.b.v r5 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v) r5     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x001b:
            java.util.Locale r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148313u(r5)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r1.getCountry()     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004d
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x0050 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0050 }
        L_0x0033:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0050 }
            boolean r3 = com.google.android.apps.gsa.shared.util.C90725ai.m148181c(r2, r5)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r5 = r0.get(r2)     // Catch:{ all -> 0x0050 }
            com.google.android.apps.gsa.speech.e.b.v r5 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v) r5     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x004d:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            r5 = 0
            return r5
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0053:
            throw r5
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j.mo86923a(java.lang.String):com.google.android.apps.gsa.speech.e.b.v");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C92260v mo86924b() {
        return new C92260v(this.f257199n);
    }

    /* renamed from: d */
    public final Map mo86925d() {
        HashMap hashMap = new HashMap();
        synchronized (this) {
            C58838bb.m90883r(mo86932k());
            Map map = this.f257194h;
            mo86934n(map);
            for (C92260v vVar : map.values()) {
                C8476as asVar = vVar.f257244h;
                if (asVar == null) {
                    ((C59052c) ((C59052c) f257186a.mo56226d()).mo56372aa(12294)).mo56389s("found locale resource with no metadata %s", vVar.f257243g);
                } else if (vVar.mo86941b(C92252n.DICTATION) != null || vVar.mo86941b(C92252n.GRAMMAR) != null || vVar.mo86941b(C92252n.VOICE_ACTIONS) != null) {
                    hashMap.put(asVar.f29417b, asVar);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public final synchronized void mo86926e() {
        C90748e.m148224b();
        if (!mo86932k()) {
            mo86927f(false);
        }
    }

    /* renamed from: f */
    public final synchronized void mo86927f(boolean z) {
        C90748e.m148224b();
        m151463o(z);
        mo86930i();
    }

    /* renamed from: g */
    public final synchronized void mo86928g() {
        if (!mo86932k()) {
            m151463o(false);
        }
    }

    /* renamed from: h */
    public final synchronized void mo86929h(C90936cf cfVar) {
        if (!mo86932k()) {
            this.f257192f.add(cfVar);
        } else {
            this.f257191e.mo85151p(cfVar);
        }
        mo86928g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0001, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0009 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo86930i() {
        /*
            r3 = this;
            monitor-enter(r3)
        L_0x0001:
            int r0 = r3.f257195i     // Catch:{ all -> 0x0020 }
            if (r0 <= 0) goto L_0x001e
            r3.wait()     // Catch:{ InterruptedException -> 0x0009 }
            goto L_0x0001
        L_0x0009:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0020 }
            r0.interrupt()     // Catch:{ all -> 0x0020 }
            com.google.common.f.e r0 = f257186a     // Catch:{ all -> 0x0020 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "Interrupted waiting for resource update."
            r2 = 12310(0x3016, float:1.725E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0001
        L_0x001e:
            monitor-exit(r3)
            return
        L_0x0020:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0024
        L_0x0023:
            throw r0
        L_0x0024:
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j.mo86930i():void");
    }

    /* renamed from: j */
    public final boolean mo86931j(String str, C92252n nVar) {
        C92260v a = mo86923a(str);
        if (a == null || a.mo86941b(nVar) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final synchronized boolean mo86932k() {
        return this.f257194h != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.f257243g;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86933l(java.lang.String r2) {
        /*
            r1 = this;
            com.google.android.apps.gsa.speech.e.b.v r2 = r1.mo86923a(r2)
            if (r2 == 0) goto L_0x0014
            java.lang.String r2 = r2.f257243g
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "g3_models"
            int r2 = r2.indexOf(r0)
            if (r2 <= 0) goto L_0x0014
            r2 = 1
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j.mo86933l(java.lang.String):boolean");
    }

    /* renamed from: n */
    public final void mo86934n(Map map) {
        if (((Boolean) this.f257197l.mo17428b()).booleanValue()) {
            this.f257198m.mo20264c();
            C59071e eVar = f257186a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12288)).mo56386p("Update resource map to include MDD downloaded locales");
            HashMap hashMap = new HashMap();
            Map f = this.f257198m.mo20267f();
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12295)).mo56387q("Got %d mdd installed locales", f.size());
            for (Map.Entry entry : f.entrySet()) {
                String str = (String) entry.getKey();
                C92260v b = mo86924b();
                b.f257244h = (C8476as) entry.getValue();
                for (File file : this.f257198m.mo20265d(str)) {
                    C92252n a = C92252n.m151478a(file);
                    if (a != null) {
                        if (b.f257243g == null) {
                            File parentFile = file.getParentFile();
                            while (parentFile != null && !parentFile.getName().startsWith("datadownloadfile_")) {
                                parentFile = parentFile.getParentFile();
                            }
                            if (parentFile != null) {
                                b.f257243g = parentFile.getAbsolutePath();
                            } else {
                                ((C59052c) ((C59052c) C92260v.f257237a.mo56225c()).mo56372aa(12329)).mo56386p("File with path did not have parent! This should not happen if LPs are downloaded correctly");
                            }
                        }
                        b.f257240d.put(a, file.getAbsolutePath());
                    }
                }
                hashMap.put(str, b);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C92260v vVar = (C92260v) entry2.getValue();
                if (!map.containsKey(str2)) {
                    map.put(str2, vVar);
                } else {
                    if (vVar.f257244h.f29419d > ((C92260v) map.get(str2)).f257244h.f29419d) {
                        map.put(str2, vVar);
                    }
                }
            }
        }
    }
}
