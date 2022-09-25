package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110619bw;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123853az;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123878w;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123881z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.j.j */
/* compiled from: PG */
public final class C110711j implements C86091a {

    /* renamed from: a */
    public static final C59071e f308477a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.j.j");

    /* renamed from: b */
    public final C123878w f308478b;

    /* renamed from: c */
    public final C123881z f308479c;

    /* renamed from: d */
    private final C123853az f308480d;

    /* renamed from: e */
    private final C83794j f308481e;

    /* renamed from: f */
    private final C110619bw f308482f;

    public C110711j(C123853az azVar, C83794j jVar, C123878w wVar, C123881z zVar, C110619bw bwVar) {
        this.f308480d = azVar;
        this.f308481e = jVar;
        this.f308478b = wVar;
        this.f308479c = zVar;
        this.f308482f = bwVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        C59071e eVar = f308477a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PcpLocalCalendarStartup");
        ((C59052c) ((C59052c) b).mo56372aa(26718)).mo56386p("#onDeviceInstallOrBoot(): Starting PCP calendar tasks.");
        if (!z && !z2) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PcpLocalCalendarStartup");
            ((C59052c) ((C59052c) d).mo56372aa(26720)).mo56386p("#onDeviceInstallOrBoot(): is not Install or Boot, should not start tasks.");
        } else if (!this.f308481e.mo77184w() || !this.f308481e.mo77185x()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PcpLocalCalendarStartup");
            ((C59052c) ((C59052c) b2).mo56372aa(26719)).mo56386p("PCP calendar migration is not enabled.");
            this.f308479c.f342193a.mo50545a("CALENDAR_PERIODIC_SCHEDULER_WORKER");
            C60870cx cxVar = C60866ct.f164955a;
            C123853az azVar = this.f308480d;
            azVar.f342132c.mo50545a("Local_Calendar_Update_Worker_KEY_ONE");
            azVar.f342132c.mo50545a("Local_Calendar_Update_Worker_KEY_TWO");
        } else {
            C60922j.m93045h(this.f308482f.mo98817a(), new C110708g(this), C60826bg.f164896a);
        }
    }
}
