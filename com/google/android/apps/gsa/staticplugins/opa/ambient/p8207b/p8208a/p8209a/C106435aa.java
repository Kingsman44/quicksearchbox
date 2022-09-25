package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C106435aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106447am f296887a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f296888b;

    public /* synthetic */ C106435aa(C106447am amVar, C58485gu guVar) {
        this.f296887a = amVar;
        this.f296888b = guVar;
    }

    public final Object apply(Object obj) {
        C106447am amVar;
        C106447am amVar2 = this.f296887a;
        C58485gu guVar = this.f296888b;
        List list = (List) obj;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(list).filter(new C106475p(amVar2.f296914f.mo79743a(C90017bw.f248027d))).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) amVar2.f296910b.mo56224b()).mo56372aa(23075)).mo56393w("Filter by connection duration limit. Initial count: %d, post filtering count: %d", list.size(), guVar2.size());
        if (guVar2.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar).map(C106476q.f296964a).collect(C58370cn.f155946a);
        long epochMilli = amVar2.f296915g.mo57444a().toEpochMilli();
        long millis = Duration.ofDays(30).toMillis();
        C58495hd hdVar = (C58495hd) amVar2.f296916h.mo95540a().map(new C106439ae(epochMilli - millis, epochMilli, (List) Collection.EL.stream(guVar).map(C106476q.f296964a).collect(C58370cn.f155946a))).orElse(C58729pv.f156485a);
        HashMap hashMap = new HashMap();
        ((C58970a) ((C58970a) amVar2.f296910b.mo56224b()).mo56372aa(23076)).mo56389s("Common media applications: %s", guVar3);
        int size = guVar2.size();
        int i = 0;
        while (i < size) {
            C50682r rVar = (C50682r) guVar2.get(i);
            HashMap hashMap2 = new HashMap();
            Optional a = amVar2.f296916h.mo95540a();
            if (!a.isPresent()) {
                amVar = amVar2;
            } else {
                amVar = amVar2;
                Iterator<UsageStats> it = ((UsageStatsManager) a.get()).queryUsageStats(4, rVar.f131857c, rVar.f131858d).iterator();
                while (it.hasNext()) {
                    UsageStats next = it.next();
                    if (guVar3.contains(next.getPackageName())) {
                        String packageName = next.getPackageName();
                        double totalTimeInForeground = (double) (next.getTotalTimeInForeground() + next.getTotalTimeForegroundServiceUsed());
                        Iterator<UsageStats> it2 = it;
                        double abs = (double) Math.abs(rVar.f131858d - rVar.f131857c);
                        Double.isNaN(totalTimeInForeground);
                        Double.isNaN(abs);
                        hashMap2.put(packageName, Double.valueOf(totalTimeInForeground / abs));
                        it = it2;
                        guVar2 = guVar2;
                        guVar3 = guVar3;
                    }
                }
            }
            C58485gu guVar4 = guVar2;
            C58485gu guVar5 = guVar3;
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((String) entry.getKey(), Double.valueOf(((Double) Map.EL.getOrDefault(hashMap, entry.getKey(), Double.valueOf(C59203do.f157270a))).doubleValue() + ((Double) entry.getValue()).doubleValue()));
            }
            i++;
            amVar2 = amVar;
            guVar2 = guVar4;
            guVar3 = guVar5;
        }
        return (C58485gu) Collection.EL.stream(guVar).filter(new C106477r(hashMap)).map(new C106478s(hashMap, list, hdVar)).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C106479t.f296969a))).collect(C58370cn.f155946a);
    }
}
