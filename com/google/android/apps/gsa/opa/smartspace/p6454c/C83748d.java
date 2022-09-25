package com.google.android.apps.gsa.opa.smartspace.p6454c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c.d */
/* compiled from: PG */
public final /* synthetic */ class C83748d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83751g f228278a;

    public /* synthetic */ C83748d(C83751g gVar) {
        this.f228278a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83751g gVar = this.f228278a;
        Duration duration = (Duration) obj;
        Duration ofMillis = Duration.ofMillis(gVar.f228281b.mo79743a(C90017bw.f247952bN));
        if (duration.compareTo(ofMillis) > 0) {
            ((C58970a) ((C58970a) gVar.f228284e.mo56226d()).mo56372aa(6853)).mo56350C("Exceeded configured timeout of: %dms by %sms", ofMillis.toMillis(), duration.minus(ofMillis).toMillis());
            gVar.f228282c.mo41708w("TIMEOUT_CANDIDATE", BuildConfig.FLAVOR, false);
            if (gVar.f228281b.mo79746e(C90017bw.f247886aA)) {
                ((C58970a) ((C58970a) gVar.f228284e.mo56225c()).mo56372aa(6854)).mo56386p("Failed due to timeout exceeded.");
                gVar.f228280a.mo110244c(C131650d.f359707a, 4);
                gVar.mo77078b();
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
