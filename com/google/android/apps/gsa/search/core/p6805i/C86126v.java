package com.google.android.apps.gsa.search.core.p6805i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.p7066m.p7067a.C89961b;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.DesugarCollections;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.search.core.i.v */
/* compiled from: PG */
public class C86126v implements C90021c {

    /* renamed from: a */
    private static final C59071e f232783a = C59071e.m91332i("com.google.android.apps.gsa.search.core.i.v");

    /* renamed from: b */
    private final Map f232784b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: e */
    public volatile Map f232785e = new HashMap();

    /* renamed from: f */
    public volatile C86111g f232786f = C86111g.f232741g;

    /* renamed from: g */
    public volatile C86111g f232787g = C86111g.f232741g;

    /* renamed from: B */
    protected static final void m138489B(String str, int i, RuntimeException runtimeException) {
        ((C59052c) ((C59052c) ((C59052c) f232783a.mo56226d()).mo56382g(runtimeException)).mo56372aa(7602)).mo56352E("Failed to decode %s for flag: %d", str, i);
    }

    /* renamed from: A */
    public final boolean mo79742A(String str) {
        if (str == null) {
            return false;
        }
        return C90763bg.m148264d(str, mo79745c(C90120fr.f250842i));
    }

    /* renamed from: a */
    public long mo79743a(C90102f fVar) {
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(fVar.f250556a));
        if (iVar == null) {
            return fVar.f250557b;
        }
        if (iVar.f232752b == 4) {
            return ((Long) iVar.f232753c).longValue();
        }
        return 0;
    }

    /* renamed from: b */
    public C86113i mo79744b(int i) {
        return (C86113i) this.f232785e.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public C58485gu mo79745c(C90129h hVar) {
        C58485gu guVar;
        try {
            C58485gu guVar2 = (C58485gu) this.f232784b.get(Integer.valueOf(hVar.f251802a));
            if (guVar2 != null) {
                if (!guVar2.isEmpty()) {
                    String str = (String) guVar2.get(0);
                }
                return guVar2;
            }
        } catch (ClassCastException e) {
            ((C59052c) ((C59052c) ((C59052c) f232783a.mo56226d()).mo56382g(e)).mo56372aa(7598)).mo56389s("Wrong cached type for flag %s", hVar);
        }
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(hVar.f251802a));
        if (iVar != null) {
            guVar = C89988b.m146551d(iVar.f232752b == 3 ? (String) iVar.f232753c : BuildConfig.FLAVOR);
        } else {
            Object obj = C89961b.f246482a.get(Integer.valueOf(hVar.f251802a));
            if (obj instanceof String[]) {
                guVar = C58485gu.m89844l((String[]) obj);
            } else {
                guVar = C89988b.m146551d(hVar.f251803b);
            }
        }
        this.f232784b.put(Integer.valueOf(hVar.f251802a), guVar);
        return guVar;
    }

    /* renamed from: e */
    public boolean mo79746e(C90048d dVar) {
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(dVar.f248757a));
        if (iVar == null) {
            return C89961b.m146547b(dVar);
        }
        if (iVar.f232752b == 2) {
            return ((Boolean) iVar.f232753c).booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public final double mo79747m(C90075e eVar) {
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(eVar.f249778a));
        if (iVar != null) {
            return iVar.f232752b == 7 ? ((Double) iVar.f232753c).doubleValue() : C59203do.f157270a;
        }
        return eVar.f249779b;
    }

    /* renamed from: n */
    public final C86111g mo79748n() {
        C86110f fVar = (C86110f) C86111g.f232741g.createBuilder();
        long j = this.f232786f.f232745c;
        fVar.copyOnWrite();
        C86111g gVar = (C86111g) fVar.instance;
        gVar.f232743a |= 1;
        gVar.f232745c = j;
        fVar.mo79729a(mo79759y());
        fVar.mo79730b(this.f232785e.values());
        return (C86111g) fVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo79749o(com.google.android.apps.gsa.shared.p7066m.C90129h r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f232784b     // Catch:{ ClassCastException -> 0x001e }
            int r1 = r5.f251802a     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassCastException -> 0x001e }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ ClassCastException -> 0x001e }
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0.isEmpty()     // Catch:{ ClassCastException -> 0x001e }
            if (r1 != 0) goto L_0x001d
            r1 = 0
            java.lang.Object r1 = r0.get(r1)     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ClassCastException -> 0x001e }
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            com.google.common.f.e r1 = f232783a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Wrong cached type for flag %s"
            r3 = 7596(0x1dac, float:1.0644E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r5)
        L_0x002c:
            java.util.Map r0 = r4.f232785e
            int r1 = r5.f251802a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.apps.gsa.search.core.i.i r0 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r0
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = ""
            int r2 = r0.f232752b     // Catch:{ RuntimeException -> 0x004d }
            r3 = 3
            if (r2 != r3) goto L_0x0048
            java.lang.Object r0 = r0.f232753c     // Catch:{ RuntimeException -> 0x004d }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RuntimeException -> 0x004d }
        L_0x0048:
            com.google.common.b.gu r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146549b(r1)     // Catch:{ RuntimeException -> 0x004d }
            goto L_0x005b
        L_0x004d:
            r0 = move-exception
            java.lang.String r1 = "int array"
            int r2 = r5.f251802a
            m138489B(r1, r2, r0)
        L_0x0055:
            java.lang.String r0 = r5.f251803b
            com.google.common.b.gu r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146549b(r0)
        L_0x005b:
            java.util.Map r1 = r4.f232784b
            int r5 = r5.f251802a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86126v.mo79749o(com.google.android.apps.gsa.shared.m.h):com.google.common.b.gu");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo79750p(com.google.android.apps.gsa.shared.p7066m.C90129h r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f232784b     // Catch:{ ClassCastException -> 0x001e }
            int r1 = r5.f251802a     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassCastException -> 0x001e }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ ClassCastException -> 0x001e }
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0.isEmpty()     // Catch:{ ClassCastException -> 0x001e }
            if (r1 != 0) goto L_0x001d
            r1 = 0
            java.lang.Object r1 = r0.get(r1)     // Catch:{ ClassCastException -> 0x001e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ClassCastException -> 0x001e }
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            com.google.common.f.e r1 = f232783a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Wrong cached type for flag %s"
            r3 = 7597(0x1dad, float:1.0646E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r5)
        L_0x002c:
            java.util.Map r0 = r4.f232785e
            int r1 = r5.f251802a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.apps.gsa.search.core.i.i r0 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r0
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = ""
            int r2 = r0.f232752b     // Catch:{ NumberFormatException -> 0x004d }
            r3 = 3
            if (r2 != r3) goto L_0x0048
            java.lang.Object r0 = r0.f232753c     // Catch:{ NumberFormatException -> 0x004d }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x004d }
        L_0x0048:
            com.google.common.b.gu r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146550c(r1)     // Catch:{ NumberFormatException -> 0x004d }
            goto L_0x005b
        L_0x004d:
            r0 = move-exception
            java.lang.String r1 = "long array"
            int r2 = r5.f251802a
            m138489B(r1, r2, r0)
        L_0x0055:
            java.lang.String r0 = r5.f251803b
            com.google.common.b.gu r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146550c(r0)
        L_0x005b:
            java.util.Map r1 = r4.f232784b
            int r5 = r5.f251802a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86126v.mo79750p(com.google.android.apps.gsa.shared.m.h):com.google.common.b.gu");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58495hd mo79751q(com.google.android.apps.gsa.shared.p7066m.C90129h r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f232784b     // Catch:{ ClassCastException -> 0x000f }
            int r1 = r5.f251802a     // Catch:{ ClassCastException -> 0x000f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ClassCastException -> 0x000f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassCastException -> 0x000f }
            com.google.common.b.hd r0 = (com.google.common.p4522b.C58495hd) r0     // Catch:{ ClassCastException -> 0x000f }
            goto L_0x001e
        L_0x000f:
            r0 = move-exception
            com.google.common.f.e r1 = f232783a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Wrong cached type for flag %s"
            r3 = 7599(0x1daf, float:1.0648E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r5)
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x005e
            java.util.Map r0 = r4.f232785e
            int r1 = r5.f251802a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.apps.gsa.search.core.i.i r0 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = ""
            int r2 = r0.f232752b     // Catch:{ RuntimeException -> 0x0043 }
            r3 = 3
            if (r2 != r3) goto L_0x003c
            java.lang.Object r0 = r0.f232753c     // Catch:{ RuntimeException -> 0x0043 }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RuntimeException -> 0x0043 }
        L_0x003c:
            com.google.android.apps.gsa.shared.util.aj r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.f246752a     // Catch:{ RuntimeException -> 0x0043 }
            com.google.common.b.hd r0 = r0.mo85086b(r1)     // Catch:{ RuntimeException -> 0x0043 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            java.lang.String r1 = "Integer Map"
            int r2 = r5.f251802a
            m138489B(r1, r2, r0)
        L_0x004b:
            java.lang.String r0 = r5.f251803b
            com.google.android.apps.gsa.shared.util.aj r1 = com.google.android.apps.gsa.shared.p7066m.C89988b.f246752a
            com.google.common.b.hd r0 = r1.mo85086b(r0)
        L_0x0053:
            java.util.Map r1 = r4.f232784b
            int r5 = r5.f251802a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r5, r0)
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86126v.mo79751q(com.google.android.apps.gsa.shared.m.h):com.google.common.b.hd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58495hd mo79752r(com.google.android.apps.gsa.shared.p7066m.C90129h r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f232784b     // Catch:{ ClassCastException -> 0x000f }
            int r1 = r5.f251802a     // Catch:{ ClassCastException -> 0x000f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ClassCastException -> 0x000f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassCastException -> 0x000f }
            com.google.common.b.hd r0 = (com.google.common.p4522b.C58495hd) r0     // Catch:{ ClassCastException -> 0x000f }
            goto L_0x001e
        L_0x000f:
            r0 = move-exception
            com.google.common.f.e r1 = f232783a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Wrong cached type for flag %s"
            r3 = 7600(0x1db0, float:1.065E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r5)
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x005e
            java.util.Map r0 = r4.f232785e
            int r1 = r5.f251802a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.apps.gsa.search.core.i.i r0 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = ""
            int r2 = r0.f232752b     // Catch:{ RuntimeException -> 0x0043 }
            r3 = 3
            if (r2 != r3) goto L_0x003c
            java.lang.Object r0 = r0.f232753c     // Catch:{ RuntimeException -> 0x0043 }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RuntimeException -> 0x0043 }
        L_0x003c:
            com.google.android.apps.gsa.shared.util.aj r0 = com.google.android.apps.gsa.shared.p7066m.C89988b.f246752a     // Catch:{ RuntimeException -> 0x0043 }
            com.google.common.b.hd r0 = r0.mo85085a(r1)     // Catch:{ RuntimeException -> 0x0043 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            java.lang.String r1 = "String Map"
            int r2 = r5.f251802a
            m138489B(r1, r2, r0)
        L_0x004b:
            java.lang.String r0 = r5.f251803b
            com.google.android.apps.gsa.shared.util.aj r1 = com.google.android.apps.gsa.shared.p7066m.C89988b.f246752a
            com.google.common.b.hd r0 = r1.mo85085a(r0)
        L_0x0053:
            java.util.Map r1 = r4.f232784b
            int r5 = r5.f251802a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r5, r0)
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86126v.mo79752r(com.google.android.apps.gsa.shared.m.h):com.google.common.b.hd");
    }

    /* renamed from: s */
    public final C63088z mo79753s(C90128g gVar) {
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(gVar.f251801a));
        if (iVar == null) {
            return null;
        }
        if (iVar.f232752b == 6) {
            return (C63088z) iVar.f232753c;
        }
        return C63088z.f170246b;
    }

    /* renamed from: t */
    public final MessageLite mo79754t(C90128g gVar, C63010eb ebVar) {
        C63088z zVar;
        MessageLite messageLite = (MessageLite) this.f232784b.get(Integer.valueOf(gVar.f251801a));
        if (messageLite != null) {
            return messageLite;
        }
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(gVar.f251801a));
        if (iVar != null) {
            try {
                if (iVar.f232752b == 6) {
                    zVar = (C63088z) iVar.f232753c;
                } else {
                    zVar = C63088z.f170246b;
                }
                MessageLite messageLite2 = (MessageLite) ebVar.mo59011j(zVar, C62921ba.m95368a());
                this.f232784b.put(Integer.valueOf(gVar.f251801a), messageLite2);
                return messageLite2;
            } catch (C62974ct unused) {
                ((C59052c) ((C59052c) f232783a.mo56225c()).mo56372aa(7601)).mo56387q("Malformed proto data from Heterodyne for flag %s.", gVar.f251801a);
            }
        }
        return null;
    }

    /* renamed from: u */
    public final Supplier mo79755u(C86111g gVar, C86111g gVar2) {
        HashMap j = C58662ni.m90351j(gVar.f232744b.size() + gVar2.f232744b.size());
        for (C86113i iVar : gVar.f232744b) {
            j.put(Integer.valueOf(iVar.f232755e), iVar);
        }
        for (C86113i iVar2 : gVar2.f232744b) {
            j.put(Integer.valueOf(iVar2.f232755e), iVar2);
        }
        C86125u uVar = new C86125u(this.f232787g.f232744b, j, this.f232785e);
        this.f232786f = gVar;
        this.f232787g = gVar2;
        this.f232785e = j;
        this.f232784b.clear();
        return uVar;
    }

    /* renamed from: v */
    public final String mo79756v() {
        C86111g gVar = this.f232787g;
        if ((gVar.f232743a & 2) != 0) {
            return gVar.f232748f;
        }
        C86111g gVar2 = this.f232786f;
        if ((gVar2.f232743a & 2) != 0) {
            return gVar2.f232748f;
        }
        return null;
    }

    /* renamed from: w */
    public final String mo79757w() {
        if (this.f232786f.f232746d.size() == 0 || mo79746e(C90120fr.f250836c)) {
            return this.f232786f.f232748f;
        }
        return null;
    }

    /* renamed from: x */
    public final String mo79758x(C90129h hVar) {
        C86113i iVar = (C86113i) this.f232785e.get(Integer.valueOf(hVar.f251802a));
        if (iVar != null) {
            return iVar.f232752b == 3 ? (String) iVar.f232753c : BuildConfig.FLAVOR;
        }
        return C89961b.m146546a(hVar);
    }

    @Deprecated
    /* renamed from: y */
    public final List mo79759y() {
        C86111g gVar = this.f232787g;
        return gVar.f232746d.size() > 0 ? gVar.f232746d : this.f232786f.f232746d;
    }

    /* renamed from: z */
    public final boolean mo79760z() {
        return this.f232786f.f232744b.size() > 0;
    }
}
