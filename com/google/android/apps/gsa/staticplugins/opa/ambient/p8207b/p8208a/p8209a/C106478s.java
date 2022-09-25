package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStats;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3886c.p3887a.C50675k;
import com.google.assistant.p3886c.p3887a.C50676l;
import com.google.common.p4535g.C59203do;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C106478s implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f296966a;

    /* renamed from: b */
    public final /* synthetic */ List f296967b;

    /* renamed from: c */
    public final /* synthetic */ Map f296968c;

    public /* synthetic */ C106478s(Map map, List list, Map map2) {
        this.f296966a = map;
        this.f296967b = list;
        this.f296968c = map2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        double d;
        Map map = this.f296966a;
        List list = this.f296967b;
        Map map2 = this.f296968c;
        C130701b bVar = (C130701b) obj;
        Double d2 = (Double) map.get(bVar.mo109797h());
        if (d2 == null) {
            d = C59203do.f157270a;
        } else {
            double doubleValue = d2.doubleValue();
            double size = (double) list.size();
            Double.isNaN(size);
            d = doubleValue / size;
        }
        UsageStats usageStats = (UsageStats) map2.get(bVar.mo109797h());
        C50675k kVar = (C50675k) C50676l.f131826h.createBuilder();
        String h = bVar.mo109797h();
        kVar.copyOnWrite();
        C50676l lVar = (C50676l) kVar.instance;
        h.getClass();
        lVar.f131828a |= 1;
        lVar.f131829b = h;
        kVar.copyOnWrite();
        C50676l lVar2 = (C50676l) kVar.instance;
        lVar2.f131828a |= 2;
        lVar2.f131830c = d;
        Optional f = bVar.mo109795f();
        Objects.requireNonNull(kVar);
        f.ifPresent(new C106482w(kVar));
        Optional g = bVar.mo109796g();
        Objects.requireNonNull(kVar);
        g.ifPresent(new C106484y(kVar));
        if (usageStats != null) {
            long totalTimeInForeground = usageStats.getTotalTimeInForeground();
            kVar.copyOnWrite();
            C50676l lVar3 = (C50676l) kVar.instance;
            lVar3.f131828a |= 16;
            lVar3.f131833f = totalTimeInForeground;
            long totalTimeForegroundServiceUsed = usageStats.getTotalTimeForegroundServiceUsed();
            kVar.copyOnWrite();
            C50676l lVar4 = (C50676l) kVar.instance;
            lVar4.f131828a |= 32;
            lVar4.f131834g = totalTimeForegroundServiceUsed;
        }
        return (C50676l) kVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
