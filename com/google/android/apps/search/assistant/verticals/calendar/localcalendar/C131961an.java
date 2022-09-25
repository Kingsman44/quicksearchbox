package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import android.text.TextUtils;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131982a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.an */
/* compiled from: PG */
public final /* synthetic */ class C131961an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131963ap f360292a;

    public /* synthetic */ C131961an(C131963ap apVar) {
        this.f360292a = apVar;
    }

    public final C60870cx apply(Object obj) {
        C131963ap apVar = this.f360292a;
        String str = (String) obj;
        boolean z = !TextUtils.isEmpty(str);
        ((C19567d) apVar.f360300g.f102846ad.mo6453a()).mo24822a(1, Boolean.valueOf(z));
        if (!z) {
            ((C59052c) ((C59052c) C131963ap.f360294a.mo56224b()).mo56372aa(39498)).mo56386p("No logged in Assistant account. Don't analyze local calendars.");
            return C60856cj.m92900i(false);
        }
        apVar.f360301h.mo19974a(C37176a.f96855aZ);
        C60870cx a = ((C131982a) apVar.f360296c.mo27525b()).mo110365a();
        C132004f fVar = (C132004f) apVar.f360297d.mo27525b();
        C60870cx a2 = fVar.f360346c.mo110357a("calendar_settings:read_google_calendar", C131945a.f360259a);
        C60870cx b = fVar.f360347d.mo50215b(fVar.f360345b);
        C47633f a3 = C47636i.m84746e(a2, b).mo51518a(new C131975b(a2, b), fVar.f360344a);
        C131979bd bdVar = (C131979bd) apVar.f360298e.mo27525b();
        C47633f h = C47633f.m84733g(bdVar.f360320b.mo110357a("productivity_settings#productivity_account#google_account#", C131977bb.f360317a)).mo51515h(C131978bc.f360318a, bdVar.f360319a);
        C60870cx a4 = ((C131952ae) apVar.f360299f.mo27525b()).mo110356a();
        C47633f a5 = C47636i.m84746e(a, a3, h, a4).mo51518a(new C131960am(apVar, a, a3, h, a4, str), apVar.f360295b);
        C60856cj.m92911t(a5.f164926b, C47810es.m84974n(new C131962ao(apVar)), apVar.f360295b);
        return a5;
    }
}
