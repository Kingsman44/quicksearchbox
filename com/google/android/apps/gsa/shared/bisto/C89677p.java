package com.google.android.apps.gsa.shared.bisto;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.p10712d.C142373cy;
import com.google.android.p10712d.C142374cz;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.base.C58886cw;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.bisto.p */
/* compiled from: PG */
public final class C89677p implements C89656k {

    /* renamed from: a */
    private static final C59071e f242798a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.p");

    /* renamed from: b */
    private static final C58881cr f242799b = C58886cw.m90973a(C89657l.f242766a);

    /* renamed from: c */
    private static final C58881cr f242800c = C58886cw.m90973a(C89674m.f242794a);

    /* renamed from: d */
    private static final C58881cr f242801d = C58886cw.m90973a(C89675n.f242795a);

    /* renamed from: e */
    private static final C58881cr f242802e = new C58885cv(C58729pv.f156485a);

    /* renamed from: f */
    private final C91142g f242803f;

    public C89677p(C91142g gVar) {
        this.f242803f = gVar;
    }

    /* renamed from: a */
    public final long mo83546a(String str) {
        C89676o oVar = (C89676o) ((C58495hd) ((C58885cv) f242802e).f156729a).get(str);
        C91142g gVar = this.f242803f;
        if (gVar == null || oVar == null) {
            C58881cr crVar = f242799b;
            if (!((C58495hd) crVar.mo6453a()).containsKey(str)) {
                return 0;
            }
            Object obj = ((C58495hd) crVar.mo6453a()).get(str);
            obj.getClass();
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException unused) {
                return (long) ((Integer) obj).intValue();
            }
        } else {
            try {
                return this.f242803f.mo85398c(oVar.f242797b, gVar.mo85399d((C90102f) oVar.f242796a));
            } catch (ClassCastException e) {
                C59104x d = f242798a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConfigHelper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10210)).mo56389s("Wrong type for config key %s", str);
                return 0;
            }
        }
    }

    /* renamed from: b */
    public final C142374cz mo83547b() {
        C142373cy cyVar = (C142373cy) C142374cz.f386329e.createBuilder();
        cyVar.copyOnWrite();
        C142374cz czVar = (C142374cz) cyVar.instance;
        czVar.f386331a |= 1;
        czVar.f386332b = 16000;
        cyVar.copyOnWrite();
        C142374cz czVar2 = (C142374cz) cyVar.instance;
        czVar2.f386331a |= 4;
        czVar2.f386334d = 1200;
        cyVar.copyOnWrite();
        C142374cz czVar3 = (C142374cz) cyVar.instance;
        czVar3.f386331a |= 2;
        czVar3.f386333c = 24;
        return (C142374cz) cyVar.build();
    }

    /* renamed from: c */
    public final String mo83548c(String str) {
        C91142g gVar = this.f242803f;
        if (gVar != null) {
            C89676o oVar = (C89676o) ((C58495hd) f242800c.mo6453a()).get(str);
            if (oVar == null) {
                return BuildConfig.FLAVOR;
            }
            try {
                return gVar.mo85402g(oVar.f242797b, gVar.mo85403h((C90129h) oVar.f242796a));
            } catch (ClassCastException e) {
                C59104x d = f242798a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConfigHelper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10211)).mo56389s("Wrong type for config key %s", str);
                return BuildConfig.FLAVOR;
            }
        } else {
            C58881cr crVar = f242799b;
            if (((C58495hd) crVar.mo6453a()).containsKey(str)) {
                return (String) ((C58495hd) crVar.mo6453a()).get(str);
            }
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: d */
    public final String mo83549d(String str) {
        C58881cr crVar = f242799b;
        String str2 = ((C58495hd) crVar.mo6453a()).containsKey(str) ? (String) ((C58495hd) crVar.mo6453a()).get(str) : null;
        C91142g gVar = this.f242803f;
        if (gVar != null) {
            try {
                return gVar.mo85402g(str, str2);
            } catch (ClassCastException e) {
                C59104x d = f242798a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConfigHelper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10212)).mo56389s("Wrong type for config key %s", str);
            }
        }
        return str2;
    }

    /* renamed from: e */
    public final void mo83550e() {
        C58976aa aaVar = C58975e.f156826a;
        C91142g gVar = this.f242803f;
        if (gVar != null) {
            gVar.mo78242b();
        }
    }

    /* renamed from: f */
    public final boolean mo83551f() {
        return mo83553h("enableForceSpeakerIdOff") || mo83553h("bistoSpeechTestingMode");
    }

    /* renamed from: g */
    public final boolean mo83552g(String str) {
        C89676o oVar = (C89676o) ((C58495hd) f242801d.mo6453a()).get(str);
        C91142g gVar = this.f242803f;
        if (gVar == null || oVar == null) {
            C58881cr crVar = f242799b;
            if (!((C58495hd) crVar.mo6453a()).containsKey(str)) {
                return false;
            }
            Object obj = ((C58495hd) crVar.mo6453a()).get(str);
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }
        try {
            return this.f242803f.mo85406k(oVar.f242797b, gVar.mo85405j((C90048d) oVar.f242796a));
        } catch (ClassCastException e) {
            C59104x d = f242798a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConfigHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10214)).mo56389s("Wrong type for config key %s", str);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b A[SYNTHETIC, Splitter:B:8:0x002b] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83553h(java.lang.String r6) {
        /*
            r5 = this;
            com.google.common.base.cr r0 = f242799b
            java.lang.Object r1 = r0.mo6453a()
            com.google.common.b.hd r1 = (com.google.common.p4522b.C58495hd) r1
            boolean r1 = r1.containsKey(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.Object r0 = r0.mo6453a()
            com.google.common.b.hd r0 = (com.google.common.p4522b.C58495hd) r0
            java.lang.Object r0 = r0.get(r6)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.google.android.apps.gsa.shared.util.v.g r1 = r5.f242803f
            if (r1 == 0) goto L_0x0046
            boolean r6 = r1.mo85406k(r6, r0)     // Catch:{ ClassCastException -> 0x0030 }
            return r6
        L_0x0030:
            r0 = move-exception
            com.google.common.f.e r1 = f242798a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "ConfigHelper"
            r1.mo56378ag(r3, r4)
            java.lang.String r3 = "Wrong type for config key %s"
            r4 = 10215(0x27e7, float:1.4314E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r4)).mo56389s(r3, r6)
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.C89677p.mo83553h(java.lang.String):boolean");
    }

    /* renamed from: i */
    public final boolean mo83554i() {
        String c = mo83548c("user_group_name");
        return c != null && c.toLowerCase(Locale.getDefault()).startsWith("dogfood");
    }

    /* renamed from: j */
    public final boolean mo83555j(int i) {
        C58528ij ijVar;
        String c = mo83548c("enabled_features");
        if (C58832aw.m90831a(c, C89685x.f242816b)) {
            ijVar = C89685x.f242817c;
        } else if (C58837ba.m90859h(c)) {
            ijVar = C58733pz.f156496a;
        } else {
            C58526ih ihVar = new C58526ih();
            for (String str : C58869cf.m90936b(new C58903m(',')).mo56153g(c)) {
                if (!str.isEmpty()) {
                    try {
                        ihVar.mo55373c(Integer.valueOf(Integer.parseInt(str)));
                    } catch (NumberFormatException unused) {
                        C59104x d = C89685x.f242815a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "FeatureHelper");
                        ((C59052c) ((C59052c) d).mo56372aa(10255)).mo56389s("Bad feature format: %s", str);
                        int i2 = C90755l.f253831a;
                    }
                }
            }
            C89685x.f242817c = ihVar.mo55486f();
            C89685x.f242816b = c;
            ijVar = C89685x.f242817c;
        }
        return ijVar.contains(Integer.valueOf(i));
    }

    /* renamed from: k */
    public final boolean mo83556k() {
        return mo83553h("bistoPii");
    }

    /* renamed from: l */
    public final boolean mo83557l() {
        return mo83555j(173);
    }

    /* renamed from: m */
    public final boolean mo83558m() {
        return mo83553h("key_send_diagnostics") || mo83554i() || mo83560o();
    }

    /* renamed from: n */
    public final boolean mo83559n() {
        return mo83553h("bistoSpeechTestingMode");
    }

    /* renamed from: o */
    public final boolean mo83560o() {
        String c = mo83548c("user_group_name");
        return c != null && c.toLowerCase(Locale.getDefault()).startsWith("teamfood");
    }

    /* renamed from: p */
    public final boolean mo83561p() {
        return mo83553h("key_personal_results_settings_migration_complete");
    }

    /* renamed from: q */
    public final double mo83562q() {
        C58881cr crVar = f242799b;
        if (!((C58495hd) crVar.mo6453a()).containsKey("tts_rate")) {
            return C59203do.f157270a;
        }
        Object obj = ((C58495hd) crVar.mo6453a()).get("tts_rate");
        obj.getClass();
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException unused) {
            return (double) ((Float) obj).floatValue();
        }
    }
}
