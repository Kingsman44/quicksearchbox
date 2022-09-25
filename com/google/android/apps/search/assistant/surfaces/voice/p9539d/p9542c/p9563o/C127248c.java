package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9563o;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.assistant.p3897e.p3917i.p3918a.C51369fd;
import com.google.assistant.p3897e.p3921j.C52230ka;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71745ea;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.devicesettings.DeviceSettingsSupplier$fetchContext$1", mo61344c = "DeviceSettingsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {66})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.o.c */
/* compiled from: PG */
final class C127248c extends C69572j implements C69630p {

    /* renamed from: a */
    int f350418a;

    /* renamed from: b */
    final /* synthetic */ C127250e f350419b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127248c(C127250e eVar, C69577g gVar) {
        super(2, gVar);
        this.f350419b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127248c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350418a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            long millis = C127250e.f350423a.toMillis();
            C127247b bVar = new C127247b(this.f350419b, (C69577g) null);
            this.f350418a = 1;
            obj = C71745ea.m104930b(millis, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C51369fd fdVar = (C51369fd) obj;
        if (fdVar != null) {
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            C32803ay a = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C32808bc a2 = C69664n.m101061g(azVar, "builder");
            C52230ka a3 = C127250e.f350424b.mo38879a(fdVar);
            C69664n.m101060f(a3, "PARAMS_KEY.pack(result)");
            a2.mo38306b(a3);
            a.mo38303b(a2.mo38305a());
            return a.mo38302a();
        }
        throw new RuntimeException("Getting Device Settings failed");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127248c(this.f350419b, gVar);
    }
}
