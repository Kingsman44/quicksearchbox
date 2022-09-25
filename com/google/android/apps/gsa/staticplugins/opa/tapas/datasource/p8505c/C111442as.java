package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111593r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113170ca;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113171cb;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113172cc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113173cd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.libraries.assistant.p1594s.p1597b.C19176d;
import com.google.android.libraries.assistant.p1594s.p1597b.C19193u;
import com.google.android.libraries.assistant.p1594s.p1597b.C19195w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.base.C58835az;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import dagger.p5295b.C68283d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.as */
/* compiled from: PG */
public final class C111442as extends C113409et {

    /* renamed from: a */
    public static final C121537f f310031a = C121537f.m200840b("datasource/TapasAppShortcutsSource", C121511c.f337208a);

    /* renamed from: k */
    private static final C59071e f310032k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.as");

    /* renamed from: b */
    public final C68214a f310033b;

    /* renamed from: c */
    public final C86124t f310034c;

    /* renamed from: d */
    public final C68214a f310035d;

    /* renamed from: e */
    public final C68214a f310036e;

    /* renamed from: f */
    public final C68214a f310037f;

    /* renamed from: g */
    public final C68214a f310038g;

    /* renamed from: h */
    public final C68214a f310039h;

    /* renamed from: i */
    public Map f310040i;

    /* renamed from: j */
    public final C68214a f310041j;

    /* renamed from: m */
    private final C68214a f310042m;

    /* renamed from: n */
    private final Executor f310043n;

    /* renamed from: o */
    private final C68214a f310044o;

    /* renamed from: p */
    private final C48674ai f310045p;

    /* renamed from: q */
    private final Optional f310046q;

    public C111442as(C68214a aVar, C86124t tVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C90851k kVar, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C48674ai aiVar, C68214a aVar9, Optional optional) {
        this.f310033b = aVar;
        this.f310034c = tVar;
        this.f310035d = aVar2;
        this.f310036e = aVar3;
        this.f310042m = aVar4;
        this.f310038g = aVar6;
        this.f310037f = aVar5;
        this.f310039h = aVar7;
        this.f310044o = aVar8;
        this.f310045p = aiVar;
        this.f310041j = aVar9;
        this.f310046q = optional;
        if (tVar.mo79746e(C90063do.f249347bn)) {
            this.f310043n = kVar.mo85210c("TapasLightweightExecutor");
        } else {
            this.f310043n = C60826bg.f164896a;
        }
    }

    /* renamed from: o */
    public static String m185203o(C113405ep epVar) {
        return epVar.mo100033p().toLowerCase(Locale.getDefault()).trim();
    }

    /* renamed from: p */
    public static boolean m185204p(C113405ep epVar) {
        C19195w wVar = epVar.mo100022f().f53690r;
        if (wVar == null) {
            wVar = C19195w.f53744e;
        }
        C19176d dVar = wVar.f53749d;
        if (dVar == null) {
            dVar = C19176d.f53709f;
        }
        return dVar.f53713c;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.APP_SHORTCUTS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final double mo99140b(C113405ep epVar, double d, String str, String str2) {
        if (this.f310034c.mo79746e(C90063do.f249346bm)) {
            double c = ((C113126ak) this.f310042m.mo27525b()).mo99889c(epVar, str, str2);
            C58976aa aaVar = C58975e.f156826a;
            if (c > d) {
                return c;
            }
            return C59203do.f157270a;
        } else if (!C58890d.m90988c(str).contains(C58890d.m90988c(str2))) {
            return C59203do.f157270a;
        } else {
            double length = (double) str2.length();
            double length2 = (double) str.length();
            Double.isNaN(length);
            Double.isNaN(length2);
            return length / length2;
        }
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C59104x b = f310032k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "tapasAppShortcutSr");
        ((C59052c) ((C59052c) b).mo56372aa(27195)).mo56389s("#fetchSuggestionsThrottled: prefix='%s'", epVar.mo100033p());
        C60870cx cxVar = (C60870cx) map.get(C48672ag.ICING);
        if (cxVar != null && this.f310034c.mo79746e(C90063do.f249352bs)) {
            return mo99145h(epVar, new C111427ad(cxVar));
        }
        C121537f fVar = f310031a;
        C60870cx g = mo99144g(epVar, (C113408es) null);
        fVar.mo105244m("fetchSuggestionInternal", g);
        return g;
    }

    /* renamed from: d */
    public final double mo99141d(C113405ep epVar, String str, boolean z) {
        double d;
        String o = m185203o(epVar);
        if (z) {
            d = epVar.mo100022f().f53683k;
        } else {
            d = epVar.mo100022f().f53682j;
        }
        return mo99140b(epVar, d, str, o);
    }

    /* renamed from: e */
    public final C58485gu mo99142e(C113405ep epVar, C130332g gVar) {
        return (C58485gu) Collection.EL.stream(((C111593r) this.f310033b.mo27525b()).mo99177b()).filter(new C111461s(epVar, gVar)).collect(C58370cn.f155946a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C58485gu mo99143f(C113405ep epVar, C58495hd hdVar, Map map) {
        return (C58485gu) Collection.EL.stream(hdVar.entrySet()).map(new C111435al(this, epVar, map)).filter(C111436am.f310021a).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    public final C60870cx mo99144g(C113405ep epVar, C113408es esVar) {
        C60870cx cxVar;
        String p = epVar.mo100033p();
        if (!epVar.mo100031n().isPresent() && (((long) p.length()) < this.f310034c.mo79743a(C90063do.f249246S) || ((long) p.length()) > this.f310034c.mo79743a(C90063do.f249245R))) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C121537f fVar = f310031a;
        if (this.f310034c.mo79746e(C90063do.f249328bU)) {
            C60870cx c = ((C113206m) this.f310036e.mo27525b()).mo99844c();
            if (C90877ak.m148480n(c)) {
                cxVar = mo99148k(epVar, esVar, (Map) C90877ak.m148474h(c));
            } else {
                C111430ag agVar = new C111430ag(this, epVar, esVar);
                cxVar = C60922j.m93045h(c, C47810es.m84966f(agVar), this.f310043n);
            }
        } else {
            cxVar = mo99148k(epVar, esVar, new HashMap());
        }
        fVar.mo105244m("retrieveSuggestions", cxVar);
        return cxVar;
    }

    /* renamed from: h */
    public final C60870cx mo99145h(C113405ep epVar, C68283d dVar) {
        if (TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p()))) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        if (dVar == null || !this.f310034c.mo79746e(C90063do.f249352bs)) {
            return mo99144g(epVar, (C113408es) null);
        }
        C60870cx gq = dVar.mo60297gq();
        C111449g gVar = new C111449g(this, epVar);
        return C60922j.m93045h(gq, C47810es.m84966f(gVar), this.f310043n);
    }

    /* renamed from: i */
    public final C60870cx mo99146i(C113405ep epVar, Map map, Map map2, C58485gu guVar) {
        C121537f fVar = f310031a;
        fVar.mo105239h("shortcut_info_size", (long) guVar.size());
        if (epVar.mo100031n().isPresent()) {
            C60870cx o = C60856cj.m92906o(mo99143f(((C113190cu) this.f310044o.mo27525b()).mo99904b(BuildConfig.FLAVOR, epVar.mo100022f(), C51331dt.FULLY_TRUSTED, this.f310045p).mo100001a(), (C58495hd) Collection.EL.stream(guVar).map(new C111465w(this, map2)).filter(C111439ap.f310028a).map(C111466x.f310100a).collect(C58370cn.m89403c(C111467y.f310101a, C111468z.f310102a, C111424aa.f309995a)), map));
            fVar.mo105244m("getShortcutsForOfflineRequest", o);
            return o;
        }
        C58976aa aaVar = C58975e.f156826a;
        epVar.mo100033p();
        C60870cx o2 = C60856cj.m92906o((C58485gu) Collection.EL.stream(guVar).map(new C111451i(this, epVar, map2, map)).filter(C111436am.f310021a).collect(C58370cn.f155946a));
        fVar.mo105244m("getShortcutsFilteredByScoreFuture", o2);
        return o2;
    }

    /* renamed from: j */
    public final C60870cx mo99147j(C113405ep epVar, C113408es esVar, Map map, C130332g gVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C113405ep epVar2 = epVar;
        Map map2 = map;
        C130332g gVar2 = gVar;
        String p = epVar.mo100033p();
        if (!this.f310034c.mo79746e(C90063do.f249352bs) || epVar.mo100022f().f53686n) {
            C121537f fVar = f310031a;
            C58485gu guVar = (C58485gu) fVar.mo105235d("getAllValidDynamicShortcutsFromCache", new C111462t(this, epVar2, gVar2));
            Map map3 = this.f310040i;
            if (map3 != null) {
                cxVar = mo99146i(epVar2, map2, map3, guVar);
            } else if (!this.f310034c.mo79746e(C90063do.f249345bl)) {
                cxVar = mo99146i(epVar2, map2, new HashMap(), guVar);
            } else {
                C58495hd hdVar = (C58495hd) Collection.EL.stream(guVar).map(C111452j.f310066a).distinct().collect(C58370cn.m89403c(C111453k.f310067a, new C111454l(this), C111455m.f310069a));
                ArrayList arrayList = new ArrayList(hdVar.size());
                for (Map.Entry entry : hdVar.entrySet()) {
                    C111428ae aeVar = new C111428ae(entry.getKey());
                    arrayList.add(C60922j.m93044g((C60870cx) entry.getValue(), C47810es.m84963c(aeVar), this.f310043n));
                }
                C60870cx o = C60856cj.m92906o(arrayList);
                C111429af afVar = C111429af.f310004a;
                C60870cx g = C60922j.m93044g(o, C47810es.m84963c(afVar), this.f310043n);
                C111463u uVar = new C111463u(this, epVar2, map2, guVar);
                cxVar = C60922j.m93045h(g, C47810es.m84966f(uVar), this.f310043n);
            }
            f310031a.mo105244m("getSuggestionsListFutureInternal", cxVar);
            C111464v vVar = C111464v.f310097a;
            C60870cx g2 = C60922j.m93044g(cxVar, C47810es.m84963c(vVar), this.f310043n);
            fVar.mo105244m("fetchSuggestionsUsingPureAndroidApi", g2);
            return g2;
        } else if (esVar == null) {
            C59104x c = f310032k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "tapasAppShortcutSr");
            ((C59052c) ((C59052c) c).mo56372aa(27196)).mo56386p("#retrieveSuggestionsInternal - Expected dependent response from Icing.");
            return C60856cj.m92900i(C113408es.f314036b);
        } else {
            C121537f fVar2 = f310031a;
            C58495hd hdVar2 = (C58495hd) Collection.EL.stream(esVar.mo100053o()).filter(C113170ca.f313486a).collect(C58370cn.m89403c(C113171cb.f313487a, C113172cc.f313488a, C113173cd.f313489a));
            C58976aa aaVar = C58975e.f156826a;
            HashMap hashMap = new HashMap();
            if (this.f310034c.mo79746e(C90063do.f249345bl)) {
                HashMap hashMap2 = new HashMap();
                Map.EL.forEach(hdVar2, new C111459q(this, epVar, p, gVar, hashMap2));
                hashMap.putAll(C58495hd.m89898l(hashMap2));
            }
            if (this.f310034c.mo79746e(C90063do.f249530fK)) {
                C58485gu e = mo99142e(epVar2, gVar2);
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) e.get(i);
                    CharSequence e2 = ((C113188cs) this.f310038g.mo27525b()).mo99903e(shortcutInfo);
                    if (e2 != null) {
                        String obj = e2.toString();
                        ShortcutInfo shortcutInfo2 = shortcutInfo;
                        double b = mo99140b(epVar, epVar.mo100022f().f53682j, obj, p);
                        String str = shortcutInfo2.getPackage();
                        if (b > C59203do.f157270a) {
                            shortcutInfo2.getLongLabel();
                            if (hdVar2.containsKey(str)) {
                                cxVar2 = C60856cj.m92900i(Optional.m71637of((CharSequence) hdVar2.get(str)));
                            } else {
                                cxVar2 = ((C113251ad) this.f310035d.mo27525b()).mo99927d(str);
                            }
                            C111445c cVar = new C111445c();
                            cVar.mo99137b(cxVar2);
                            cVar.f310048b = Double.valueOf(b);
                            Map.EL.merge(hashMap, shortcutInfo2, cVar.mo99136a(), C111426ac.f310001a);
                        }
                    }
                }
            }
            C60870cx o2 = C60856cj.m92906o(mo99143f(epVar2, C58495hd.m89898l(hashMap), map2));
            C111450h hVar = C111450h.f310061a;
            C60870cx g3 = C60922j.m93044g(o2, C47810es.m84963c(hVar), this.f310043n);
            fVar2.mo105244m("transformAppNameFutureToSuggestionsIcing", g3);
            return g3;
        }
    }

    /* renamed from: k */
    public final C60870cx mo99148k(C113405ep epVar, C113408es esVar, java.util.Map map) {
        if (!m185204p(epVar)) {
            return mo99147j(epVar, esVar, map, C130332g.f357230b);
        }
        if (this.f310046q.isEmpty()) {
            C59104x c = f310032k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "tapasAppShortcutSr");
            ((C59052c) ((C59052c) c).mo56372aa(27197)).mo56386p("#retrieveSuggestionsInternalWithAppPreferences: AppPreferencesDataStore not present.");
            return mo99147j(epVar, esVar, map, C130332g.f357230b);
        }
        C60870cx a = ((C130333h) this.f310046q.get()).mo109665a();
        if (C90877ak.m148480n(a)) {
            return mo99147j(epVar, esVar, map, (C130332g) C90877ak.m148474h(a));
        }
        f310031a.mo105244m("getAppPreferencesData", a);
        C111448f fVar = new C111448f(this, epVar, esVar, map);
        return C60922j.m93045h(a, C47810es.m84966f(fVar), this.f310043n);
    }

    /* renamed from: l */
    public final Optional mo99149l(ShortcutInfo shortcutInfo, Double d, String str, java.util.Map map) {
        if (d.doubleValue() <= C59203do.f157270a) {
            return Optional.empty();
        }
        C111445c cVar = new C111445c();
        cVar.f310048b = d;
        Optional optional = (Optional) map.get(str);
        if (optional == null || !optional.isPresent()) {
            cVar.mo99137b(((C113251ad) this.f310035d.mo27525b()).mo99927d(str));
        } else {
            cVar.f310047a = C60856cj.m92900i(optional);
        }
        return Optional.m71637of(new C58835az(shortcutInfo, cVar.mo99136a()));
    }

    /* renamed from: m */
    public final Optional mo99150m(C113405ep epVar, ShortcutInfo shortcutInfo, C60870cx cxVar, double d, java.util.Map map) {
        return (Optional) f310031a.mo105235d("convertShortcutInfoToTextSuggestion", new C111431ah(this, cxVar, shortcutInfo, epVar, shortcutInfo.getPackage(), map, d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Optional mo99151n(ShortcutInfo shortcutInfo, C113405ep epVar, java.util.Map map, java.util.Map map2) {
        ShortcutInfo shortcutInfo2 = shortcutInfo;
        C113405ep epVar2 = epVar;
        java.util.Map map3 = map;
        String o = m185203o(epVar);
        CharSequence e = ((C113188cs) this.f310038g.mo27525b()).mo99903e(shortcutInfo);
        if (e == null) {
            return Optional.empty();
        }
        String obj = e.toString();
        String str = shortcutInfo.getPackage();
        C58976aa aaVar = C58975e.f156826a;
        shortcutInfo.getLongLabel();
        if (epVar.mo100022f().f53686n) {
            Optional empty = Optional.empty();
            C19195w wVar = epVar.mo100022f().f53690r;
            if (wVar == null) {
                wVar = C19195w.f53744e;
            }
            C19176d dVar = wVar.f53749d;
            if (dVar == null) {
                dVar = C19176d.f53709f;
            }
            if (dVar.f53712b) {
                empty = (Optional) f310031a.mo105235d("appUtils.getPrefetchedOrCachedAppName", new C111456n(this, str));
            }
            Optional optional = empty;
            String str2 = (String) optional.orElse(BuildConfig.FLAVOR);
            C19195w wVar2 = epVar.mo100022f().f53690r;
            if (wVar2 == null) {
                wVar2 = C19195w.f53744e;
            }
            C19176d dVar2 = wVar2.f53749d;
            if (dVar2 == null) {
                dVar2 = C19176d.f53709f;
            }
            int a = C19193u.m36587a(dVar2.f53715e);
            C48712bt btVar = (C48712bt) f310031a.mo105235d("prefixMatcher.calculateTapasQueryCompletionScore", new C111457o(this, o, str2, obj, a != 0 && a == 3));
            double max = Math.max(btVar.f126028c, btVar.f126029d);
            if (max < 1.0E-4d) {
                return Optional.empty();
            }
            double d = btVar.f126027b;
            return mo99150m(epVar, shortcutInfo, C60856cj.m92900i(Optional.m71637of((CharSequence) optional.orElse(BuildConfig.FLAVOR))), max, map2);
        }
        boolean e2 = this.f310034c.mo79746e(C90063do.f249530fK);
        double d2 = C59203do.f157270a;
        if (e2) {
            d2 = Math.max(C59203do.f157270a, ((Double) f310031a.mo105235d("getQueryMatchScoreShortcutName", new C111458p(this, epVar, obj))).doubleValue());
        }
        if (this.f310034c.mo79746e(C90063do.f249345bl)) {
            Optional optional2 = (Optional) Map.EL.getOrDefault(map3, str, Optional.empty());
            if (optional2.isPresent()) {
                d2 = Math.max(d2, ((Double) f310031a.mo105235d("getQueryMatchScoreAppName", new C111460r(this, epVar, optional2))).doubleValue());
            }
        }
        Optional l = mo99149l(shortcutInfo, Double.valueOf(d2), str, map3);
        if (l.isEmpty()) {
            return Optional.empty();
        }
        Optional m = mo99150m(epVar, (ShortcutInfo) ((C58835az) l.get()).f156631a, ((C111444b) ((C58835az) l.get()).f156632b).mo99152b(), ((C111444b) ((C58835az) l.get()).f156632b).mo99153c().doubleValue(), map2);
        return m.isEmpty() ? Optional.empty() : m;
    }
}
