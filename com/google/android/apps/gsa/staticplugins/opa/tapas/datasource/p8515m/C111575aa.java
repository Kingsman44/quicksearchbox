package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.UserHandle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113169c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.aa */
/* compiled from: PG */
public final class C111575aa implements C111593r {

    /* renamed from: a */
    public static final C59071e f310299a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.aa");

    /* renamed from: b */
    public C58485gu f310300b = C58485gu.m89845m();

    /* renamed from: c */
    private final LauncherApps f310301c;

    /* renamed from: d */
    private final C86124t f310302d;

    /* renamed from: e */
    private C58881cr f310303e;

    /* renamed from: f */
    private final C68214a f310304f;

    /* renamed from: g */
    private final C68214a f310305g;

    /* renamed from: h */
    private final C68214a f310306h;

    public C111575aa(LauncherApps launcherApps, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f310301c = launcherApps;
        this.f310302d = tVar;
        this.f310304f = aVar;
        this.f310305g = aVar2;
        this.f310306h = aVar3;
    }

    /* renamed from: a */
    public final C58485gu mo99176a(String str) {
        return mo99181f(str);
    }

    /* renamed from: b */
    public final C58485gu mo99177b() {
        if (this.f310302d.mo79746e(C90063do.f249349bp) && !this.f310300b.isEmpty()) {
            return this.f310300b;
        }
        if (!this.f310302d.mo79746e(C90063do.f249348bo)) {
            return mo99181f((String) null);
        }
        C58881cr crVar = this.f310303e;
        if (crVar == null || ((C58485gu) crVar.mo6453a()).isEmpty()) {
            this.f310303e = new C58882cs(new C111594s(this), this.f310302d.mo79743a(C90063do.f249645u), TimeUnit.MINUTES);
        }
        return (C58485gu) this.f310303e.mo6453a();
    }

    /* renamed from: c */
    public final C58528ij mo99178c() {
        return (C58528ij) Collection.EL.stream(mo99177b()).filter(C111596u.f310331a).map(C111597v.f310332a).collect(C58370cn.f155947b);
    }

    /* renamed from: d */
    public final void mo99179d() {
        if (this.f310302d.mo79746e(C90063do.f249349bp)) {
            this.f310300b = mo99181f((String) null);
            if (this.f310302d.mo79746e(C90063do.f249350bq)) {
                C58485gu F = C58485gu.m89836F(Comparator.CC.comparing(C111600y.f310335a), this.f310300b);
                this.f310300b = F;
                HashMap hashMap = new HashMap();
                int size = F.size();
                for (int i = 0; i < size; i++) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) F.get(i);
                    String str = shortcutInfo.getPackage();
                    Map.EL.putIfAbsent(hashMap, str, new ArrayList());
                    ((List) hashMap.get(str)).add(shortcutInfo);
                }
                C60870cx c = ((C113206m) this.f310304f.mo27525b()).mo99844c();
                if (C90877ak.m148480n(c)) {
                    this.f310300b = mo99180e(hashMap, (java.util.Map) C90877ak.m148474h(c));
                    return;
                }
                C111601z zVar = new C111601z(this, hashMap);
                C60856cj.m92911t(c, C47810es.m84974n(zVar), C60826bg.f164896a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C58485gu mo99180e(java.util.Map map, java.util.Map map2) {
        for (Map.Entry key : map.entrySet()) {
            Map.EL.putIfAbsent(map2, (String) key.getKey(), Double.valueOf(C59203do.f157270a));
        }
        List b = ((C113169c) this.f310305g.mo27525b()).mo99897b(((C113169c) this.f310305g.mo27525b()).mo99896a(map, map2, this.f310302d.mo79747m(C90063do.f249247T)));
        b.size();
        long a = this.f310302d.mo79743a(C90063do.f249248U);
        if (a < ((long) b.size())) {
            b = b.subList(0, (int) a);
        }
        return C58485gu.m89842j(b);
    }

    /* renamed from: f */
    public final C58485gu mo99181f(String str) {
        C58528ij ijVar = C58733pz.f156496a;
        if (this.f310302d.mo79746e(C90035cn.f248383h)) {
            ijVar = (C58528ij) Collection.EL.stream((List) ((C112471ap) this.f310306h.mo27525b()).mo99532c(this.f310302d.mo79746e(C90063do.f249341bh)).map(C111598w.f310333a).orElse(C58485gu.m89845m())).filter(new C111599x(this.f310302d.mo79745c(C90035cn.f248376a))).collect(C58370cn.f155947b);
        }
        LauncherApps.ShortcutQuery queryFlags = new LauncherApps.ShortcutQuery().setQueryFlags(11);
        if (str != null) {
            queryFlags.setPackage(str);
        }
        if (!this.f310301c.hasShortcutHostPermission()) {
            return C58485gu.m89845m();
        }
        List<UserHandle> profiles = this.f310301c.getProfiles();
        if (profiles.isEmpty()) {
            return C58485gu.m89845m();
        }
        try {
            List<ShortcutInfo> shortcuts = this.f310301c.getShortcuts(queryFlags, profiles.get(0));
            if (shortcuts == null) {
                return C58485gu.m89845m();
            }
            return (C58485gu) Collection.EL.stream(shortcuts).filter(new C111595t(ijVar)).collect(C58370cn.f155946a);
        } catch (IllegalStateException unused) {
            return C58485gu.m89845m();
        }
    }
}
