package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18929i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.v */
/* compiled from: PG */
public final class C18907v implements C18927g {

    /* renamed from: a */
    public static final C59071e f53191a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.v");

    /* renamed from: b */
    private final Context f53192b;

    /* renamed from: c */
    private final C21370a f53193c;

    /* renamed from: d */
    private final PackageManager f53194d;

    /* renamed from: e */
    private final Comparator f53195e = Comparator.EL.reversed(Comparator.CC.comparingLong(C18905t.f53190a));

    /* renamed from: f */
    private final C69464a f53196f;

    public C18907v(Context context, C21370a aVar, C69464a aVar2) {
        this.f53192b = context;
        this.f53193c = aVar;
        this.f53194d = context.getPackageManager();
        this.f53196f = aVar2;
    }

    /* renamed from: d */
    private final C58512hu m36346d() {
        C59071e eVar = f53191a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b).mo56372aa(47387)).mo56386p("#getMediaServiceActivities()");
        Intent intent = new Intent("android.media.browse.MediaBrowserService");
        C58506ho hoVar = new C58506ho();
        Collection.EL.stream(this.f53194d.queryIntentServices(intent, 64)).filter(C18895j.f53179a).forEach(new C18896k(hoVar));
        C58512hu g = hoVar.mo55453g();
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b2).mo56372aa(47388)).mo56387q("Media service activities count %d", g.size);
        C58800sl lA = g.mo55465t().iterator();
        while (lA.hasNext()) {
            PackageItemInfo packageItemInfo = (PackageItemInfo) lA.next();
            C59104x b3 = f53191a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
            ((C59052c) ((C59052c) b3).mo56372aa(47389)).mo56354G("Media service activities %s %s", packageItemInfo.packageName, packageItemInfo.name);
        }
        return g;
    }

    /* renamed from: e */
    private final Map m36347e() {
        if (this.f53192b.checkSelfPermission("android.permission.PACKAGE_USAGE_STATS") == -1) {
            C59104x d = f53191a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
            ((C59052c) ((C59052c) d).mo56372aa(47390)).mo56386p("#getAppUsageStats() no PACKAGE_USAGE_STATS permission.");
            return new HashMap();
        }
        long b = this.f53193c.mo26870b();
        return ((UsageStatsManager) this.f53192b.getSystemService("usagestats")).queryAndAggregateUsageStats(b - C62950b.m95473d((C62910ar) this.f53196f.mo17428b()).toMillis(), b);
    }

    /* renamed from: a */
    public final C58485gu mo24217a() {
        C58976aa aaVar = C58975e.f156826a;
        C58512hu d = m36346d();
        C59104x b = f53191a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b).mo56372aa(47376)).mo56387q("#getInstalledApplications() size %d", d.size);
        C58480gp e = C58485gu.m89837e();
        Collection.EL.stream(d.map.entrySet()).filter(C18898m.f53182a).forEach(new C18899n(e));
        return e.mo55394f();
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo24218b(C18929i iVar) {
        return mo24219c(iVar, Duration.ZERO);
    }

    /* renamed from: c */
    public final synchronized C58485gu mo24219c(C18929i iVar, Duration duration) {
        C58485gu guVar;
        C58485gu guVar2;
        C58485gu guVar3;
        Predicate predicate;
        long j;
        C59071e eVar = f53191a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b).mo56372aa(47377)).mo56355H("#getMediaAppComponents() %s shouldFilterByMinimumUsage %s", iVar.name(), !duration.isZero());
        C58512hu d = m36346d();
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b2).mo56372aa(47378)).mo56387q("#getMediaAppComponents() Media service activities size {%d}", d.size);
        ArrayList arrayList = new ArrayList();
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            Map e = m36347e();
            if (e.isEmpty()) {
                C59104x d2 = eVar.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                ((C59052c) ((C59052c) d2).mo56372aa(47386)).mo56386p("#getRecentlyUsedMediaApp() no app usage stats. Fall back to installed apps.");
                guVar2 = mo24217a();
            } else {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                ((C59052c) ((C59052c) b3).mo56372aa(47384)).mo56387q("#getRecentlyUsedMediaApp() {%d} app usage stats.", e.size());
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : e.entrySet()) {
                    String str = (String) entry.getKey();
                    if (d.map.containsKey(str)) {
                        Collection.EL.forEach(d.mo55423a(str), new C18902q(arrayList2, (UsageStats) entry.getValue()));
                    }
                }
                C59104x b4 = f53191a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                ((C59052c) ((C59052c) b4).mo56372aa(47385)).mo56387q("#getRecentlyUsedMediaApp() count %d", arrayList2.size());
                guVar2 = (C58485gu) Collection.EL.stream(arrayList2).filter(new C18903r(duration)).sorted(this.f53195e).map(C18904s.f53189a).collect(C58370cn.f155946a);
            }
            arrayList.addAll(guVar2);
        } else if (ordinal == 1) {
            C59104x b5 = eVar.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
            ((C59052c) ((C59052c) b5).mo56372aa(47380)).mo56386p("#getMostlyUsedMediaApps() no personalization data, fallback to mostly used");
            Map e2 = m36347e();
            if (e2.isEmpty()) {
                C59104x d3 = eVar.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                ((C59052c) ((C59052c) d3).mo56372aa(47383)).mo56386p("#getMostlyUsedMediaApps() no app usage stats. Fall back to installed apps.");
                guVar3 = mo24217a();
            } else {
                ArrayList arrayList3 = new ArrayList();
                C58800sl lA = d.mo55465t().iterator();
                while (lA.hasNext()) {
                    String str2 = ((PackageItemInfo) lA.next()).packageName;
                    if (e2.containsKey(str2)) {
                        UsageStats usageStats = (UsageStats) e2.get(str2);
                        j = usageStats.getTotalTimeInForeground() + usageStats.getTotalTimeForegroundServiceUsed();
                    } else {
                        C59104x d4 = f53191a.mo56226d();
                        d4.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                        ((C59052c) ((C59052c) d4).mo56372aa(47382)).mo56389s("#getMostlyUsedMediaApps(): %s not in usage stats, adding to back of queue", str2);
                        j = 0;
                    }
                    C58800sl lA2 = d.mo55423a(str2).iterator();
                    while (lA2.hasNext()) {
                        arrayList3.add(new C18800a(Long.valueOf(j), (PackageItemInfo) lA2.next()));
                    }
                }
                C59104x b6 = f53191a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
                ((C59052c) ((C59052c) b6).mo56372aa(47381)).mo56387q("#getMostlyUsedMediaApps() count %d", arrayList3.size());
                Stream stream = Collection.EL.stream(arrayList3);
                if (duration.isZero()) {
                    predicate = C18900o.f53184a;
                } else {
                    predicate = new C18901p(duration);
                }
                guVar3 = (C58485gu) stream.filter(predicate).sorted(this.f53195e).map(C18904s.f53189a).collect(C58370cn.f155946a);
            }
            arrayList.addAll(guVar3);
        }
        guVar = (C58485gu) Collection.EL.stream(arrayList).filter(C18894i.f53178a).map(C18897l.f53181a).distinct().collect(C58370cn.f155946a);
        C59104x b7 = f53191a.mo56224b();
        b7.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
        ((C59052c) ((C59052c) b7).mo56372aa(47379)).mo56359L("#getMediaAppComponents() Final {%s} media apps size %d from original size %d", iVar, Integer.valueOf(guVar.size()), Integer.valueOf(arrayList.size()));
        return guVar;
    }
}
