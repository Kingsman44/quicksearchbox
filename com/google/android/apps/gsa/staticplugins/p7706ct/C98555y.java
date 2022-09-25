package com.google.android.apps.gsa.staticplugins.p7706ct;

import android.text.TextUtils;
import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.contacts.x;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.contact.C87512aa;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.speech.grammar.pumpkin.C66521m;
import com.google.speech.grammar.pumpkin.C66525q;
import com.google.speech.grammar.pumpkin.C66527s;
import com.google.speech.grammar.pumpkin.Tagger;
import com.google.speech.grammar.pumpkin.UserValidators;
import dagger.C68214a;
import java.io.IOException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.y */
/* compiled from: PG */
public final class C98555y {

    /* renamed from: K */
    private static final C66527s f275207K = C66527s.f180937b;

    /* renamed from: L */
    private static final float[] f275208L = {0.0f, 0.91f, 0.92f, 0.93f, 0.94f, 0.95f, 0.96f, 0.97f, 0.98f, 0.99f};

    /* renamed from: a */
    public static final C59071e f275209a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.y");

    /* renamed from: A */
    public boolean f275210A;

    /* renamed from: B */
    public boolean f275211B = false;

    /* renamed from: C */
    public C98541k f275212C;

    /* renamed from: D */
    public C98541k f275213D;

    /* renamed from: E */
    public C98541k f275214E;

    /* renamed from: F */
    public C98541k f275215F;

    /* renamed from: G */
    public C58495hd f275216G;

    /* renamed from: H */
    public C98551u f275217H;

    /* renamed from: I */
    C98535e f275218I;

    /* renamed from: J */
    public final C91123v f275219J;

    /* renamed from: M */
    private final C85726n f275220M;

    /* renamed from: N */
    private final Map f275221N;

    /* renamed from: b */
    public final Object f275222b = new Object();

    /* renamed from: c */
    public final C0984n f275223c = new C0984n(0);

    /* renamed from: d */
    public final C90931ca f275224d;

    /* renamed from: e */
    public final C98527a f275225e;

    /* renamed from: f */
    public final bg f275226f;

    /* renamed from: g */
    public final C86124t f275227g;

    /* renamed from: h */
    public final C87512aa f275228h;

    /* renamed from: i */
    public final String f275229i;

    /* renamed from: j */
    public final AtomicInteger f275230j;

    /* renamed from: k */
    public final C68214a f275231k;

    /* renamed from: l */
    public final C68214a f275232l;

    /* renamed from: m */
    public final C68214a f275233m;

    /* renamed from: n */
    public final C90476a f275234n;

    /* renamed from: o */
    public final C89859i f275235o;

    /* renamed from: p */
    public final C98532b f275236p;

    /* renamed from: q */
    public final C98537g f275237q;

    /* renamed from: r */
    public final C98540j f275238r;

    /* renamed from: s */
    public final C98533c f275239s;

    /* renamed from: t */
    public final C68214a f275240t;

    /* renamed from: u */
    public final C68214a f275241u;

    /* renamed from: v */
    public final C85596b f275242v;

    /* renamed from: w */
    public final b f275243w;

    /* renamed from: x */
    public final x f275244x;

    /* renamed from: y */
    public UserValidators f275245y;

    /* renamed from: z */
    public Tagger f275246z;

    public C98555y(C85726n nVar, C91123v vVar, C90931ca caVar, C98527a aVar, bg bgVar, C86124t tVar, C87512aa aaVar, String str, C68214a aVar2, C68214a aVar3, C68214a aVar4, C90476a aVar5, C89859i iVar, C98537g gVar, C98532b bVar, C98540j jVar, C98533c cVar, C68214a aVar6, C68214a aVar7, C85596b bVar2, Map map, b bVar3, x xVar) {
        this.f275224d = caVar;
        this.f275225e = aVar;
        this.f275226f = bgVar;
        this.f275227g = tVar;
        this.f275233m = aVar4;
        this.f275230j = new AtomicInteger(0);
        this.f275228h = aaVar;
        this.f275229i = str;
        this.f275231k = aVar2;
        this.f275232l = aVar3;
        this.f275234n = aVar5;
        this.f275235o = iVar;
        this.f275236p = bVar;
        this.f275237q = gVar;
        this.f275239s = cVar;
        this.f275238r = jVar;
        this.f275240t = aVar6;
        this.f275241u = aVar7;
        this.f275242v = bVar2;
        this.f275243w = bVar3;
        this.f275221N = map;
        this.f275244x = xVar;
        this.f275220M = nVar;
        this.f275219J = vVar;
    }

    /* renamed from: b */
    public static C66525q m163250b(C66527s sVar, double d, double d2, List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C66525q qVar : sVar.f180939a) {
            boolean z = false;
            for (C66521m mVar : qVar.f180933c) {
                z |= mVar.f180922b.equals("PUNT_VALIDATOR");
            }
            if (z) {
                hashMap2.put(qVar.f180932b, qVar);
            } else if (!hashMap.containsKey(qVar.f180932b)) {
                double d3 = (double) qVar.f180934d;
                if (d3 > d && d3 <= d2) {
                    hashMap.put(qVar.f180932b, qVar);
                }
            }
        }
        for (String str : hashMap2.keySet()) {
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, (C66525q) hashMap2.get(str));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (hashMap.containsKey(str2)) {
                return (C66525q) hashMap.get(str2);
            }
        }
        return C66525q.f180929f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0195, code lost:
        if (r9.equals("PlanningFollowOn") == false) goto L_0x0199;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.speech.grammar.pumpkin.C66527s mo91168c(java.lang.String r8, int r9, com.google.speech.grammar.pumpkin.ActionFrame r10, long r11, boolean r13) {
        /*
            r7 = this;
            com.google.common.f.e r0 = f275209a
            com.google.common.f.x r1 = r0.mo56224b()
            java.lang.String r2 = "tag(%s)"
            r3 = 30837(0x7875, float:4.3212E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r8)
            com.google.common.base.cz r1 = com.google.common.android.p4521a.C58274c.f155808a
            com.google.common.base.C58872ci.m90947d(r1)
            com.google.speech.grammar.pumpkin.Tagger r1 = r7.f275246z
            if (r1 == 0) goto L_0x01b7
            boolean r1 = r7.f275211B
            if (r1 == 0) goto L_0x001b
            goto L_0x0055
        L_0x001b:
            java.lang.String r1 = "play some music"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play music"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play songs"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play song"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play a song"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play some songs"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "play some song"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0055
            goto L_0x01b7
        L_0x0055:
            com.google.android.apps.gsa.search.core.i.t r1 = r7.f275227g
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250268T
            boolean r1 = r1.mo79746e(r2)
            r2 = 2
            if (r1 == 0) goto L_0x00ba
            java.util.Map r1 = r7.f275221N
            boolean r1 = r1.containsKey(r8)
            if (r1 != 0) goto L_0x0069
            goto L_0x00ba
        L_0x0069:
            com.google.speech.grammar.pumpkin.s r9 = com.google.speech.grammar.pumpkin.C66527s.f180937b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.speech.grammar.pumpkin.r r9 = (com.google.speech.grammar.pumpkin.C66526r) r9
            com.google.speech.grammar.pumpkin.q r10 = com.google.speech.grammar.pumpkin.C66525q.f180929f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.speech.grammar.pumpkin.p r10 = (com.google.speech.grammar.pumpkin.C66524p) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.speech.grammar.pumpkin.q r11 = (com.google.speech.grammar.pumpkin.C66525q) r11
            int r12 = r11.f180931a
            r12 = r12 | r2
            r11.f180931a = r12
            java.lang.String r12 = "Routine"
            r11.f180932b = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.speech.grammar.pumpkin.q r11 = (com.google.speech.grammar.pumpkin.C66525q) r11
            r8.getClass()
            int r12 = r11.f180931a
            r12 = r12 | 8
            r11.f180931a = r12
            r11.f180935e = r8
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.speech.grammar.pumpkin.s r8 = (com.google.speech.grammar.pumpkin.C66527s) r8
            com.google.protobuf.bv r10 = r10.build()
            com.google.speech.grammar.pumpkin.q r10 = (com.google.speech.grammar.pumpkin.C66525q) r10
            r10.getClass()
            r8.mo59672a()
            com.google.protobuf.cq r8 = r8.f180939a
            r8.add(r10)
            com.google.protobuf.bv r8 = r9.build()
            com.google.speech.grammar.pumpkin.s r8 = (com.google.speech.grammar.pumpkin.C66527s) r8
            return r8
        L_0x00ba:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f275230j
            int r1 = r1.get()
            r3 = 3
            if (r1 == r3) goto L_0x01b4
            if (r10 != 0) goto L_0x00c7
            goto L_0x01b4
        L_0x00c7:
            r3 = 0
            if (r1 != r2) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            com.google.common.base.C58838bb.m90883r(r1)
            r1 = 339(0x153, float:4.75E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r1)
            com.google.android.apps.gsa.shared.logger.b.i r1 = r7.f275235o
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_START
            r1.mo83702b(r4)
            java.lang.Object r1 = r7.f275222b
            monitor-enter(r1)
            java.lang.String r8 = r7.mo91170e(r8)     // Catch:{ all -> 0x01b1 }
            com.google.speech.grammar.pumpkin.Tagger r4 = r7.f275246z     // Catch:{ all -> 0x01b1 }
            com.google.speech.grammar.pumpkin.UserValidators r5 = r7.f275245y     // Catch:{ all -> 0x01b1 }
            r6 = 7
            com.google.speech.grammar.pumpkin.s r8 = r4.mo59651a(r8, r10, r5, r6)     // Catch:{ all -> 0x01b1 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b1 }
            boolean r10 = r7.mo91175i(r8)
            if (r10 == 0) goto L_0x0199
            com.google.common.o.uf r10 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.common.o.tz r10 = (com.google.common.p4552o.C60548tz) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r1 = r10.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r4 = r1.f164093a
            r2 = r2 | r4
            r1.f164093a = r2
            r2 = 592(0x250, float:8.3E-43)
            r1.f164258m = r2
            java.lang.String r11 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r11)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            r11.getClass()
            int r1 = r12.f164093a
            r1 = r1 | 4
            r12.f164093a = r1
            r12.f164259n = r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r11 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r10, r11, r11, r11)
            com.google.android.apps.gsa.shared.logger.b.i r10 = r7.f275235o
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_PARSE_SUCCESS
            r10.mo83702b(r11)
            com.google.protobuf.cq r10 = r8.f180939a
            java.lang.Object r10 = r10.get(r3)
            com.google.speech.grammar.pumpkin.q r10 = (com.google.speech.grammar.pumpkin.C66525q) r10
            java.lang.String r10 = r10.f180932b
            boolean r9 = com.google.android.apps.gsa.staticplugins.p7706ct.C98528aa.m163207a(r10, r9)
            if (r9 != 0) goto L_0x0145
            com.google.speech.grammar.pumpkin.s r8 = f275207K
            goto L_0x0199
        L_0x0145:
            if (r13 == 0) goto L_0x0199
            com.google.protobuf.cq r9 = r8.f180939a
            java.lang.Object r9 = r9.get(r3)
            com.google.speech.grammar.pumpkin.q r9 = (com.google.speech.grammar.pumpkin.C66525q) r9
            java.lang.String r9 = r9.f180932b
            java.lang.String r10 = "Planning"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0161
            java.lang.String r10 = "PlanningFollowOn"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0199
        L_0x0161:
            com.google.android.apps.gsa.search.core.i.t r9 = r7.f275227g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250263O
            boolean r9 = r9.mo79746e(r10)
            if (r9 != 0) goto L_0x0197
            com.google.android.apps.gsa.search.core.carassistant.f.n r9 = r7.f275220M
            com.google.protobuf.cq r10 = r8.f180939a
            java.lang.Object r10 = r10.get(r3)
            com.google.speech.grammar.pumpkin.q r10 = (com.google.speech.grammar.pumpkin.C66525q) r10
            boolean r11 = r9.mo79376c()
            if (r11 != 0) goto L_0x0199
            com.google.android.apps.gsa.search.core.i.t r9 = r9.f231793e
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250366bl
            boolean r9 = r9.mo79746e(r11)
            if (r9 == 0) goto L_0x0199
            java.lang.String r9 = r10.f180932b
            java.lang.String r10 = "Planning"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0197
            java.lang.String r10 = "PlanningFollowOn"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0199
        L_0x0197:
            com.google.speech.grammar.pumpkin.s r8 = f275207K
        L_0x0199:
            r9 = 340(0x154, float:4.76E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r9)
            com.google.android.apps.gsa.shared.logger.b.i r9 = r7.f275235o
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_END
            r9.mo83702b(r10)
            com.google.common.f.x r9 = r0.mo56224b()
            java.lang.String r10 = "PumpkinResults: %s"
            r11 = 30838(0x7876, float:4.3213E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56389s(r10, r8)
            return r8
        L_0x01b1:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b1 }
            throw r8
        L_0x01b4:
            com.google.speech.grammar.pumpkin.s r8 = com.google.speech.grammar.pumpkin.C66527s.f180937b
            return r8
        L_0x01b7:
            com.google.speech.grammar.pumpkin.s r8 = f275207K
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.mo91168c(java.lang.String, int, com.google.speech.grammar.pumpkin.ActionFrame, long, boolean):com.google.speech.grammar.pumpkin.s");
    }

    /* renamed from: d */
    public final String mo91169d() {
        if (this.f275227g.mo79746e(C90086ek.f250362bh) && this.f275243w.f() && !TextUtils.isEmpty(this.f275243w.c)) {
            return this.f275243w.c;
        }
        TaggerResult i = ((C87541c) this.f275231k.mo27525b()).mo81647i();
        if (i == null) {
            return null;
        }
        return i.f118518a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo91170e(String str) {
        if (this.f275227g.mo79746e(C90086ek.f250383cB)) {
            C58495hd hdVar = this.f275216G;
            if (hdVar != null && !hdVar.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (!this.f275216G.containsKey(Character.valueOf(str.charAt(i)))) {
                        sb.append(str.charAt(i));
                    } else if (".,".indexOf(str.charAt(i)) == -1 || i >= str.length() - 1 || "0123456789".indexOf(str.charAt(i + 1)) == -1) {
                        sb.append((String) this.f275216G.get(Character.valueOf(str.charAt(i))));
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
                str = sb.toString();
            }
        } else {
            str = Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", BuildConfig.FLAVOR);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '%' && i2 > 0 && Character.isDigit(str.charAt(i2 - 1))) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i2));
        }
        ((C59052c) ((C59052c) f275209a.mo56224b()).mo56372aa(30845)).mo56389s("Preprocessed pumpkin input: %s", sb2);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo91171f() {
        synchronized (this.f275222b) {
            UserValidators userValidators = this.f275245y;
            if (userValidators != null) {
                userValidators.delete();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            mo91171f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo91173g(int i) {
        if (this.f275223c.containsKey(Integer.valueOf(i))) {
            return;
        }
        if (i == 1) {
            this.f275223c.put(1, this.f275225e.mo91160a(C98527a.m163198c("action_select_recipient")));
        } else if (i == 2) {
            this.f275223c.put(2, this.f275225e.mo91160a(C98527a.m163198c("action_disambig")));
        } else if (i != 3) {
            try {
                this.f275223c.put(4, this.f275225e.mo91160a(C98527a.m163198c("action_confirmation")));
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f275209a.mo56225c()).mo56382g(e)).mo56372aa(30860)).mo56387q("Couldn't load assets for action frame: %d.", i);
            }
        } else {
            this.f275223c.put(3, this.f275225e.mo91160a(C98527a.m163198c("action_set_message")));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo91174h(boolean z) {
        if (!this.f275243w.f() || !this.f275227g.mo79746e(C90086ek.f250362bh)) {
            return ((C87541c) this.f275231k.mo27525b()).mo81663y(z);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo91175i(C66527s sVar) {
        return sVar != null && sVar.f180939a.size() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C58833ax mo91176j(TaggerResult taggerResult, C55349pb pbVar, C55421x xVar, C58179b bVar) {
        ActionData actionData = new ActionData(ActionData.f235990a.getAndIncrement(), false, pbVar, (String) null, taggerResult, bVar, 1, (String) null, false, xVar, 0, (C52091ex) null);
        if (actionData.mo81106r() != null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(actionData);
    }

    /* renamed from: a */
    public static float m163249a(String str) {
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            i = str.split(" ").length;
        }
        float[] fArr = f275208L;
        int length = fArr.length;
        return fArr[Math.min(i, 9)];
    }
}
