package com.google.android.apps.gsa.search.shared.service;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.search.shared.service.z */
/* compiled from: PG */
public final class C88505z extends C88497r {

    /* renamed from: a */
    public volatile C87682aj f239216a;

    /* renamed from: b */
    public volatile C90757ba f239217b;

    /* renamed from: c */
    public volatile C22871g f239218c;

    /* renamed from: d */
    protected final EnumMap f239219d = new EnumMap(C88244um.class);

    /* renamed from: e */
    public final void mo82016e(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        C88504y yVar = new C88504y(this, serviceEventData);
        C22871g gVar = this.f239218c;
        String concat = "UiCallbackStub-".concat("onGenericEvent[ServiceEvent = " + a.f238695cJ + "]");
        if (gVar == null) {
            ((C59052c) ((C59052c) C87673aa.f236983a.mo56226d()).mo56372aa(9741)).mo56389s("%s task was not run. Callback from Service received after client was disposed.", concat);
        } else {
            gVar.mo28212l(concat, yVar);
        }
    }

    /* renamed from: f */
    public final void mo82017f(int i) {
        C90757ba baVar = this.f239217b;
        if (baVar != null) {
            baVar.mo77682fN(i);
        }
    }
}
