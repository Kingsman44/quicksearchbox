package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.UserHandle;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.response.C41654i;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3825an.p3830c.p3831a.C49271aq;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.l */
/* compiled from: PG */
public final class C116863l implements C89196a {

    /* renamed from: a */
    public final C86124t f324337a;

    /* renamed from: b */
    public final C86054o f324338b;

    /* renamed from: c */
    public final i f324339c;

    /* renamed from: d */
    public C60870cx f324340d = C60856cj.m92900i(Optional.empty());

    /* renamed from: e */
    public C22871g f324341e;

    /* renamed from: f */
    private final C58881cr f324342f;

    /* renamed from: g */
    private final Map f324343g = new HashMap();

    /* renamed from: h */
    private final AtomicReference f324344h = new AtomicReference(Optional.empty());

    public C116863l(C58881cr crVar, C86124t tVar, C86054o oVar, i iVar) {
        this.f324342f = crVar;
        this.f324338b = oVar;
        this.f324339c = iVar;
        this.f324337a = tVar;
    }

    /* renamed from: d */
    public static String m194167d(RootSuggestion rootSuggestion) {
        C41693s sVar = rootSuggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109059e;
    }

    /* renamed from: k */
    public static List m194168k(List list) {
        return (List) Collection.EL.stream(list).sorted(Comparator.CC.comparing(C116852a.f324317a)).collect(Collectors.toCollection(C116854c.f324319a));
    }

    /* renamed from: l */
    public static void m194169l(C41626a aVar) {
        C41654i.m73050a(aVar.f108837b, 29);
    }

    /* renamed from: m */
    public static boolean m194170m(C58495hd hdVar, String str) {
        if (!hdVar.containsKey(str)) {
            return false;
        }
        C49271aq aqVar = ((C49301bt) hdVar.get(str)).f127428d;
        if (aqVar == null) {
            aqVar = C49271aq.f127363b;
        }
        return !aqVar.f127365a.isEmpty();
    }

    /* renamed from: n */
    private final boolean m194171n(int i) {
        return this.f324337a.mo79745c(C90085ej.f250123a).contains(i != 1 ? i != 2 ? i != 3 ? "CURATED" : "PINNED" : "MANIFEST" : "DYNAMIC");
    }

    /* renamed from: a */
    public final int mo103034a(C41626a aVar, List list, int i) {
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        int min = Math.min(i, list.size());
        if (!this.f324337a.mo79746e(C90085ej.f250153ad)) {
            aVar.f108836a.addAll(list.subList(0, min));
        }
        return min;
    }

    /* renamed from: b */
    public final C60870cx mo103035b() {
        if (!m194171n(4)) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        C60870cx cxVar = (C60870cx) ((Optional) DesugarAtomicReference.updateAndGet(this.f324344h, new C116861j(this))).get();
        cxVar.getClass();
        return cxVar;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
        if (this.f324337a.mo79746e(C90085ej.f250248z)) {
            C22871g gVar = this.f324341e;
            C58881cr crVar = this.f324342f;
            Objects.requireNonNull(crVar);
            this.f324340d = gVar.mo28201a("Initialize Launcher Apps", new C116853b(crVar));
            return;
        }
        this.f324340d = C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: hF */
    public final void mo82225hF(C22871g gVar) {
        this.f324341e = gVar;
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: j */
    public final List mo103036j(RootSuggestion rootSuggestion, LauncherApps launcherApps, int i) {
        java.util.Collection collection;
        C41693s sVar = rootSuggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        String str = sVar.f109059e;
        if (this.f324343g.containsKey(str)) {
            collection = (List) this.f324343g.get(str);
        } else {
            boolean n = m194171n(1);
            if (m194171n(2)) {
                n |= true;
            }
            if (m194171n(3)) {
                n |= true;
            }
            LauncherApps.ShortcutQuery queryFlags = new LauncherApps.ShortcutQuery().setQueryFlags(n ? 1 : 0);
            queryFlags.setPackage(str);
            if (!launcherApps.hasShortcutHostPermission()) {
                collection = C58485gu.m89845m();
            } else {
                List<UserHandle> profiles = launcherApps.getProfiles();
                if (profiles.isEmpty()) {
                    collection = C58485gu.m89845m();
                } else {
                    try {
                        List<ShortcutInfo> shortcuts = launcherApps.getShortcuts(queryFlags, profiles.get(0));
                        collection = shortcuts == null ? C58485gu.m89845m() : C58485gu.m89842j(shortcuts);
                    } catch (IllegalStateException unused) {
                        collection = C58485gu.m89845m();
                    }
                }
            }
        }
        this.f324343g.put(str, collection);
        C41679e eVar = rootSuggestion.f108907B;
        C41693s sVar2 = eVar.f109009c;
        if (sVar2 == null) {
            sVar2 = C41693s.f109053h;
        }
        return (List) Collection.EL.stream(collection).filter(C116866o.f324347a).filter(C116867p.f324348a).map(new C116868q(i, eVar, sVar2.f109059e)).collect(Collectors.toList());
    }
}
