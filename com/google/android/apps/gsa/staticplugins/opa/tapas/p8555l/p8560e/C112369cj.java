package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.google.common.p4522b.C58485gu;
import com.google.research.p5181a.C66297ab;
import com.google.research.p5181a.C66298ac;
import com.google.research.p5181a.C66350e;
import com.google.research.p5181a.C66380i;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import com.google.research.p5181a.p5183b.p5184a.C66308i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.cj */
/* compiled from: PG */
public final class C112369cj {

    /* renamed from: a */
    private static final Duration f311794a = Duration.ofMinutes(10);

    /* renamed from: b */
    private static final Duration f311795b = Duration.ofDays(1);

    /* renamed from: c */
    private final UsageStatsManager f311796c;

    /* renamed from: d */
    private final PackageManager f311797d;

    /* renamed from: e */
    private Instant f311798e;

    public C112369cj(UsageStatsManager usageStatsManager, PackageManager packageManager, Instant instant) {
        this.f311796c = usageStatsManager;
        this.f311797d = packageManager;
        this.f311798e = instant;
    }

    /* renamed from: a */
    public final synchronized List mo99510a(Instant instant) {
        boolean z;
        Float f;
        if (instant.isBefore(this.f311798e)) {
            return C58485gu.m89845m();
        }
        Instant minus = instant.minus(f311795b);
        if (this.f311798e.isAfter(minus)) {
            minus = this.f311798e;
        }
        this.f311798e = instant;
        UsageEvents queryEvents = this.f311796c.queryEvents(minus.toEpochMilli(), instant.toEpochMilli());
        HashMap hashMap = new HashMap();
        List<UsageStats> queryUsageStats = this.f311796c.queryUsageStats(4, instant.minus(f311794a).toEpochMilli(), instant.toEpochMilli());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (UsageStats next : queryUsageStats) {
            float totalTimeInForeground = ((float) next.getTotalTimeInForeground()) / ((float) f311794a.toMillis());
            String packageName = next.getPackageName();
            if (!hashMap2.containsKey(packageName)) {
                hashMap2.put(packageName, Float.valueOf(totalTimeInForeground));
                hashMap3.put(packageName, Long.valueOf(next.getLastTimeStamp()));
            } else {
                Long l = (Long) hashMap3.get(packageName);
                if (l != null && next.getLastTimeStamp() > l.longValue()) {
                    hashMap2.put(packageName, Float.valueOf(totalTimeInForeground));
                    hashMap3.put(packageName, Long.valueOf(next.getLastTimeStamp()));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        while (queryEvents.hasNextEvent()) {
            UsageEvents.Event event = new UsageEvents.Event();
            queryEvents.getNextEvent(event);
            if (event.getEventType() == 1 || event.getEventType() == 8) {
                C66302c cVar = new C66302c();
                float f2 = 0.0f;
                if (hashMap2.containsKey(event.getPackageName()) && (f = (Float) hashMap2.get(event.getPackageName())) != null) {
                    f2 = f.floatValue();
                }
                C66308i iVar = new C66308i();
                long timeStamp = event.getTimeStamp();
                C66297ab abVar = iVar.f180317a;
                abVar.copyOnWrite();
                C66298ac acVar = (C66298ac) abVar.instance;
                C66298ac acVar2 = C66298ac.f180295h;
                acVar.f180297a |= 1;
                acVar.f180298b = timeStamp;
                C66297ab abVar2 = iVar.f180317a;
                abVar2.copyOnWrite();
                C66298ac acVar3 = (C66298ac) abVar2.instance;
                acVar3.f180297a |= 32;
                acVar3.f180303g = f2;
                cVar.mo59471n(iVar);
                C66350e eVar = cVar.f180311a;
                eVar.copyOnWrite();
                C66380i iVar2 = (C66380i) eVar.instance;
                C66380i iVar3 = C66380i.f180482l;
                iVar2.f180484a |= 128;
                iVar2.f180491h = "UsageEventSensor";
                if (hashMap.containsKey(event.getPackageName())) {
                    Boolean bool = (Boolean) hashMap.get(event.getPackageName());
                    bool.getClass();
                    z = bool.booleanValue();
                } else {
                    z = this.f311797d.isInstantApp(event.getPackageName());
                    hashMap.put(event.getPackageName(), Boolean.valueOf(z));
                }
                if (z) {
                    cVar.mo59472o(3);
                    String flattenToString = new ComponentName(event.getPackageName(), "@instantapp").flattenToString();
                    C66350e eVar2 = cVar.f180311a;
                    eVar2.copyOnWrite();
                    C66380i iVar4 = (C66380i) eVar2.instance;
                    flattenToString.getClass();
                    iVar4.f180484a = 1 | iVar4.f180484a;
                    iVar4.f180485b = flattenToString;
                } else if (event.getEventType() == 8) {
                    cVar.mo59472o(4);
                    String format = String.format(Locale.US, "%s%s/%s", new Object[]{"_", event.getPackageName(), event.getShortcutId()});
                    C66350e eVar3 = cVar.f180311a;
                    eVar3.copyOnWrite();
                    C66380i iVar5 = (C66380i) eVar3.instance;
                    format.getClass();
                    iVar5.f180484a = 1 | iVar5.f180484a;
                    iVar5.f180485b = format;
                } else {
                    cVar.mo59472o(1);
                    String packageName2 = event.getPackageName();
                    C66350e eVar4 = cVar.f180311a;
                    eVar4.copyOnWrite();
                    C66380i iVar6 = (C66380i) eVar4.instance;
                    packageName2.getClass();
                    iVar6.f180484a = 1 | iVar6.f180484a;
                    iVar6.f180485b = packageName2;
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
