package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a;

import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.apps.tiktok.dataservice.C46688af;
import java.util.Collection;
import java.util.Map;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.smartdevicecontrol.dataservice.SmartDeviceDataService$deviceDataSource$2", mo61344c = "SmartDeviceDataService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.a.b */
/* compiled from: PG */
public final class C129149b extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C129152e f354774a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129149b(C129152e eVar, C69577g gVar) {
        super(1, gVar);
        this.f354774a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C129149b(this.f354774a, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Map map = this.f354774a.f354785e;
        Collection<C23404ag> values = map.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (C23404ag b : values) {
                if (!b.mo28855b().isEmpty()) {
                    return C46688af.m83205b(map, 0);
                }
            }
        }
        return C46688af.f121976a;
    }
}
