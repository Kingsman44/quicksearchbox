package com.google.android.apps.gsa.speech.p7272e.p7273a;

import androidx.annotation.C0825a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92261w;
import com.google.android.apps.gsa.speech.p7277g.C92297b;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.soda.p1603b.C19252e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.e.a.c */
/* compiled from: PG */
public final class C92237c {

    /* renamed from: d */
    private static final C59071e f257162d = C59071e.m91332i("com.google.android.apps.gsa.speech.e.a.c");

    /* renamed from: a */
    final C92248j f257163a;

    /* renamed from: b */
    final Set f257164b = new HashSet();

    /* renamed from: c */
    volatile C89784a f257165c;

    /* renamed from: e */
    private final C86124t f257166e;

    /* renamed from: f */
    private final C90929bz f257167f;

    /* renamed from: g */
    private final C118561t f257168g;

    /* renamed from: h */
    private final C19252e f257169h;

    /* renamed from: i */
    private String f257170i;

    public C92237c(C92248j jVar, C86124t tVar, C90929bz bzVar, C118561t tVar2, C19252e eVar) {
        this.f257163a = jVar;
        this.f257166e = tVar;
        this.f257167f = bzVar;
        this.f257168g = tVar2;
        this.f257169h = eVar;
    }

    /* renamed from: f */
    private final void m151449f(int i) {
        this.f257167f.mo85151p(new C92236b(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo86912a(C92249k... kVarArr) {
        if (this.f257165c != null) {
            int length = kVarArr.length;
            int i = 0;
            while (i < length) {
                C92249k kVar = kVarArr[i];
                C58838bb.m90883r(this.f257163a.mo86932k());
                C92261w wVar = C92261w.f257246a;
                if (kVar.f257211k == C92252n.VOICE_ACTIONS) {
                    wVar = C92261w.f257247b;
                }
                C92260v a = this.f257163a.mo86923a(this.f257170i);
                if (a != null) {
                    C92248j jVar = this.f257163a;
                    String str = this.f257170i;
                    if (jVar.mo86931j(str, wVar.f257248c) && jVar.mo86931j(str, wVar.f257249d)) {
                        C8476as asVar = a.f257244h;
                        if (asVar != null) {
                            if (asVar.f29419d >= wVar.f257251f) {
                                C92248j jVar2 = this.f257163a;
                                C92260v a2 = jVar2.mo86923a(this.f257170i);
                                String str2 = null;
                                if (a2 != null) {
                                    String a3 = jVar2.f257190d.mo86936a(kVar);
                                    if (a3 != null) {
                                        if (a2.mo86942c(kVar, a3) != null) {
                                            str2 = a3;
                                        }
                                    }
                                }
                                if (str2 == null) {
                                    C8476as asVar2 = a.f257244h;
                                    if (asVar2 == null || asVar2.f29419d >= kVar.f257213m) {
                                        this.f257164b.add(kVar);
                                        C92297b.m151558a(this.f257170i, kVar, this.f257168g, true, this.f257169h);
                                        this.f257164b.add(kVar);
                                    }
                                }
                                i++;
                            }
                        }
                        ((C59052c) ((C59052c) f257162d.mo56224b()).mo56372aa(12267)).mo56393w("LP version %d too low for recognition mode. Must upgrade to v%d.", a.f257244h.f29419d, wVar.f257251f);
                        this.f257165c.mo49086a(3);
                        return;
                    }
                }
                ((C59052c) ((C59052c) f257162d.mo56224b()).mo56372aa(12266)).mo56354G("no resources %s %s", this.f257170i, kVar);
                this.f257165c.mo49086a(3);
                return;
            }
            if (this.f257164b.isEmpty()) {
                this.f257165c.mo49086a(1);
            }
            this.f257165c.mo49086a(1);
        }
    }

    /* renamed from: b */
    public final synchronized void mo86913b() {
        C92297b.m151559b(this.f257168g, this.f257166e, this.f257169h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo86914c(com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set r0 = r2.f257164b     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            com.google.android.apps.gsa.shared.i.a r0 = r2.f257165c     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0047
        L_0x000e:
            if (r4 != 0) goto L_0x0032
            com.google.android.apps.gsa.speech.e.b.n r4 = r3.f257211k     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.speech.e.b.n r0 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.VOICE_ACTIONS     // Catch:{ all -> 0x0049 }
            if (r4 != r0) goto L_0x0024
            com.google.common.f.e r4 = f257162d     // Catch:{ all -> 0x0049 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "Ignoring compilaton error for %s"
            r1 = 12277(0x2ff5, float:1.7204E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r1)).mo56389s(r0, r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0032
        L_0x0024:
            java.util.Set r3 = r2.f257164b     // Catch:{ all -> 0x0049 }
            r3.clear()     // Catch:{ all -> 0x0049 }
            r3 = 4
            r2.m151449f(r3)     // Catch:{ all -> 0x0049 }
            r3 = 0
            r2.f257165c = r3     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)
            return
        L_0x0032:
            java.util.Set r4 = r2.f257164b     // Catch:{ all -> 0x0049 }
            r4.remove(r3)     // Catch:{ all -> 0x0049 }
            java.util.Set r3 = r2.f257164b     // Catch:{ all -> 0x0049 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0045
            r3 = 1
            r2.m151449f(r3)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)
            return
        L_0x0045:
            monitor-exit(r2)
            return
        L_0x0047:
            monitor-exit(r2)
            return
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7273a.C92237c.mo86914c(com.google.android.apps.gsa.speech.e.b.k, boolean):void");
    }

    /* renamed from: d */
    public final synchronized void mo86915d(C89784a aVar, String str, C92249k... kVarArr) {
        C22872h.m42743c(C0825a.class);
        if (this.f257165c != aVar || this.f257164b.isEmpty()) {
            this.f257170i = str;
            this.f257165c = aVar;
            this.f257164b.clear();
            if (this.f257163a.mo86932k()) {
                mo86912a(kVarArr);
            } else {
                this.f257163a.mo86929h(new C92235a(this, kVarArr));
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo86916e() {
    }
}
