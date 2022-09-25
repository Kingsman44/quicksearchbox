package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.aw */
/* compiled from: PG */
final class C132604aw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C53245gt f361883a;

    public C132604aw(C53245gt gtVar) {
        this.f361883a = gtVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56382g(th)).mo56372aa(39725)).mo56386p("updatePcp#onFailure().");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f361883a.f139569c.size() > 0) {
            C59052c cVar = (C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39728);
            String str = ((C53230ge) this.f361883a.f139569c.get(0)).f139507c;
            C53245gt gtVar = this.f361883a;
            Boolean valueOf = Boolean.valueOf(gtVar.f139574h);
            String str2 = ((C53230ge) gtVar.f139569c.get(0)).f139512h;
            C53242gq gqVar = this.f361883a.f139577k;
            if (gqVar == null) {
                gqVar = C53242gq.f139546f;
            }
            String str3 = gqVar.f139550c;
            C53245gt gtVar2 = this.f361883a;
            C53242gq gqVar2 = gtVar2.f139577k;
            if (gqVar2 == null) {
                gqVar2 = C53242gq.f139546f;
            }
            Boolean valueOf2 = Boolean.valueOf(gqVar2.f139551d);
            C53234gi giVar = gtVar2.f139573g;
            if (giVar == null) {
                giVar = C53234gi.f139523e;
            }
            cVar.mo56362O("Write Weather: temp: %s useCelsius: %s iconUrl: %s location %s isFallback %s hourly forecast count %s", str, valueOf, str2, str3, valueOf2, Integer.valueOf(giVar.f139528d.size()));
        } else {
            C59052c cVar2 = (C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39726);
            C53245gt gtVar3 = this.f361883a;
            Boolean valueOf3 = Boolean.valueOf(gtVar3.f139574h);
            C53242gq gqVar3 = gtVar3.f139577k;
            if (gqVar3 == null) {
                gqVar3 = C53242gq.f139546f;
            }
            String str4 = gqVar3.f139550c;
            C53242gq gqVar4 = this.f361883a.f139577k;
            if (gqVar4 == null) {
                gqVar4 = C53242gq.f139546f;
            }
            cVar2.mo56359L("Write Weather: temp: __ useCelsius: %s iconUrl: __ location %s isFallback %s", valueOf3, str4, Boolean.valueOf(gqVar4.f139551d));
        }
        ((C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39727)).mo56386p("updatePcp#onSuccess()");
    }
}
