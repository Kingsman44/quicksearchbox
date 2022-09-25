package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.app.usage.UsageStats;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48662w;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48663x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.k */
/* compiled from: PG */
public final /* synthetic */ class C111093k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111093k f309324a = new C111093k();

    private /* synthetic */ C111093k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        UsageStats usageStats = (UsageStats) obj;
        C58976aa aaVar = C58975e.f156826a;
        C48662w wVar = (C48662w) C48663x.f125761i.createBuilder();
        long firstTimeStamp = usageStats.getFirstTimeStamp();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125763a = firstTimeStamp;
        long lastTimeStamp = usageStats.getLastTimeStamp();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125764b = lastTimeStamp;
        long lastTimeUsed = usageStats.getLastTimeUsed();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125766d = lastTimeUsed;
        long totalTimeInForeground = usageStats.getTotalTimeInForeground();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125769g = totalTimeInForeground;
        long lastTimeForegroundServiceUsed = usageStats.getLastTimeForegroundServiceUsed();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125765c = lastTimeForegroundServiceUsed;
        long lastTimeVisible = usageStats.getLastTimeVisible();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125767e = lastTimeVisible;
        long totalTimeForegroundServiceUsed = usageStats.getTotalTimeForegroundServiceUsed();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125768f = totalTimeForegroundServiceUsed;
        long totalTimeVisible = usageStats.getTotalTimeVisible();
        wVar.copyOnWrite();
        ((C48663x) wVar.instance).f125770h = totalTimeVisible;
        return (C48663x) wVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
