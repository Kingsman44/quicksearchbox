package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89201f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21462j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.k */
/* compiled from: PG */
public final class C88579k implements C89201f {

    /* renamed from: b */
    private static final Object f239417b = new Object();

    /* renamed from: c */
    private static final C59071e f239418c = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.b.b.k");

    /* renamed from: d */
    private static C68214a f239419d;

    /* renamed from: a */
    Map f239420a;

    /* renamed from: e */
    private final C58833ax f239421e;

    /* renamed from: f */
    private final C58833ax f239422f;

    /* renamed from: g */
    private final C86123s f239423g;

    /* renamed from: h */
    private final C21462j f239424h;

    public C88579k(C68214a aVar, C86124t tVar, C90129h hVar) {
        C88578j jVar = new C88578j(this);
        this.f239423g = jVar;
        f239419d = aVar;
        C21461i iVar = (C21461i) aVar.mo27525b();
        this.f239424h = C21461i.m40576a("*", "*");
        this.f239422f = C58833ax.m90834k(hVar);
        this.f239421e = C58833ax.m90834k(tVar);
        tVar.mo79738i(jVar);
        mo82251c();
    }

    /* renamed from: a */
    public final void mo82249a() {
        if (this.f239421e.mo56113h()) {
            ((C86124t) this.f239421e.mo56107c()).mo79740k(this.f239423g);
        }
    }

    /* renamed from: b */
    public final Long mo82250b(String str, String str2, Long l) {
        C21461i iVar = (C21461i) f239419d.mo27525b();
        return mo82252d(C21461i.m40576a(str, str2), l);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(1:7)(6:8|9|10|(7:13|(4:16|(2:21|(2:26|(2:31|60)(2:30|59))(2:25|58))(2:20|57)|55|14)|56|32|(2:34|54)(1:53)|52|11)|35|36)|41|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00d7=Splitter:B:41:0x00d7, B:45:0x00dd=Splitter:B:45:0x00dd} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82251c() {
        /*
            r10 = this;
            java.lang.Object r0 = f239417b
            monitor-enter(r0)
            com.google.common.base.ax r1 = r10.f239422f     // Catch:{ all -> 0x00e0 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00de
            com.google.common.base.ax r1 = r10.f239421e     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1     // Catch:{ all -> 0x00e0 }
            com.google.common.base.ax r2 = r10.f239422f     // Catch:{ all -> 0x00e0 }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.gsa.shared.m.h r2 = (com.google.android.apps.gsa.shared.p7066m.C90129h) r2     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.mo79758x(r2)     // Catch:{ all -> 0x00e0 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00e0 }
            r2.<init>()     // Catch:{ all -> 0x00e0 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e0 }
            if (r3 == 0) goto L_0x002c
            goto L_0x00d7
        L_0x002c:
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ all -> 0x00e0 }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ all -> 0x00e0 }
            r4.<init>(r1)     // Catch:{ all -> 0x00e0 }
            r3.<init>(r4)     // Catch:{ all -> 0x00e0 }
            r3.beginArray()     // Catch:{ IOException -> 0x00b3 }
        L_0x0039:
            boolean r1 = r3.hasNext()     // Catch:{ IOException -> 0x00b3 }
            if (r1 == 0) goto L_0x00ad
            r3.beginObject()     // Catch:{ IOException -> 0x00b3 }
            r1 = 0
            r4 = 0
            r5 = r4
            r4 = r1
        L_0x0047:
            boolean r7 = r3.hasNext()     // Catch:{ IOException -> 0x00b3 }
            if (r7 == 0) goto L_0x0094
            java.lang.String r7 = r3.nextName()     // Catch:{ IOException -> 0x00b3 }
            java.lang.String r8 = "package"
            boolean r8 = r7.equals(r8)     // Catch:{ IOException -> 0x00b3 }
            if (r8 == 0) goto L_0x0066
            android.util.JsonToken r8 = r3.peek()     // Catch:{ IOException -> 0x00b3 }
            android.util.JsonToken r9 = android.util.JsonToken.NULL     // Catch:{ IOException -> 0x00b3 }
            if (r8 == r9) goto L_0x0066
            java.lang.String r1 = r3.nextString()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0047
        L_0x0066:
            java.lang.String r8 = "corpus"
            boolean r8 = r7.equals(r8)     // Catch:{ IOException -> 0x00b3 }
            if (r8 == 0) goto L_0x007b
            android.util.JsonToken r8 = r3.peek()     // Catch:{ IOException -> 0x00b3 }
            android.util.JsonToken r9 = android.util.JsonToken.NULL     // Catch:{ IOException -> 0x00b3 }
            if (r8 == r9) goto L_0x007b
            java.lang.String r4 = r3.nextString()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0047
        L_0x007b:
            java.lang.String r8 = "weight"
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x00b3 }
            if (r7 == 0) goto L_0x0090
            android.util.JsonToken r7 = r3.peek()     // Catch:{ IOException -> 0x00b3 }
            android.util.JsonToken r8 = android.util.JsonToken.NULL     // Catch:{ IOException -> 0x00b3 }
            if (r7 == r8) goto L_0x0090
            long r5 = r3.nextLong()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0047
        L_0x0090:
            r3.skipValue()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0047
        L_0x0094:
            r3.endObject()     // Catch:{ IOException -> 0x00b3 }
            if (r1 == 0) goto L_0x0039
            dagger.a r7 = f239419d     // Catch:{ IOException -> 0x00b3 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ IOException -> 0x00b3 }
            com.google.android.libraries.gcoreclient.c.a.i r7 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i) r7     // Catch:{ IOException -> 0x00b3 }
            com.google.android.libraries.gcoreclient.c.a.j r1 = com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i.m40576a(r1, r4)     // Catch:{ IOException -> 0x00b3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x00b3 }
            r2.put(r1, r4)     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0039
        L_0x00ad:
            r3.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00d7
        L_0x00b1:
            r1 = move-exception
            goto L_0x00da
        L_0x00b3:
            r1 = move-exception
            com.google.common.f.e r4 = f239418c     // Catch:{ all -> 0x00b1 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "CorpusConfigHelper"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00b1 }
            com.google.common.f.x r1 = r4.mo56382g(r1)     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b1 }
            r4 = 9968(0x26f0, float:1.3968E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = "Invalid input from icing corpus JSON flag."
            r1.mo56386p(r4)     // Catch:{ all -> 0x00b1 }
            goto L_0x00ad
        L_0x00d7:
            r10.f239420a = r2     // Catch:{ all -> 0x00e0 }
            goto L_0x00de
        L_0x00da:
            r3.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00e0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e3:
            throw r1
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b.C88579k.mo82251c():void");
    }

    /* renamed from: d */
    public final Long mo82252d(C21462j jVar, Long l) {
        synchronized (f239417b) {
            Long l2 = (Long) this.f239420a.get(jVar);
            if (l2 != null) {
                return l2;
            }
            Map map = this.f239420a;
            C21461i iVar = (C21461i) f239419d.mo27525b();
            Long l3 = (Long) map.get(C21461i.m40576a(jVar.f59908a.f387417a, "*"));
            if (l3 != null) {
                return l3;
            }
            Map map2 = this.f239420a;
            C21461i iVar2 = (C21461i) f239419d.mo27525b();
            Long l4 = (Long) map2.get(C21461i.m40576a("*", jVar.f59908a.f387418b));
            if (l4 != null) {
                return l4;
            }
            Long l5 = (Long) this.f239420a.get(this.f239424h);
            if (l5 != null) {
                return l5;
            }
            return l;
        }
    }

    public C88579k(C68214a aVar, Map map) {
        this.f239423g = new C88578j(this);
        f239419d = aVar;
        C21461i iVar = (C21461i) aVar.mo27525b();
        this.f239424h = C21461i.m40576a("*", "*");
        C58836b bVar = C58836b.f156633a;
        this.f239422f = bVar;
        this.f239421e = bVar;
        this.f239420a = map;
    }
}
