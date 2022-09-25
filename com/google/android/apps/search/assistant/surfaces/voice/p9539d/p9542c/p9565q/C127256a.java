package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9565q;

import android.content.ComponentName;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2714o.C34917c;
import com.google.android.libraries.search.assistant.p2714o.p2715a.C34913n;
import com.google.assistant.p3897e.p3902c.p3907c.C51054er;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51063f;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51635y;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.integrationcontext.IntegrationContextParamsSupplier$fetchContext$1", mo61344c = "IntegrationContextParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.q.a */
/* compiled from: PG */
final class C127256a extends C69572j implements C69630p {

    /* renamed from: a */
    int f350455a;

    /* renamed from: b */
    final /* synthetic */ C127257b f350456b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127256a(C127257b bVar, C69577g gVar) {
        super(2, gVar);
        this.f350456b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127256a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350455a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx f = ((C34913n) this.f350456b.f350459c).mo39623a();
            this.f350455a = 1;
            obj = C71663i.m104690c(f, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = null;
        ComponentName componentName = (ComponentName) ((C34917c) obj).mo39613b().orElse(null);
        if (componentName != null) {
            str = componentName.getPackageName();
        }
        C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
        C69664n.m101060f(abVar, "newBuilder()");
        C69664n.m101061g(abVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C51233ac) abVar.instance).f133391a);
        C69664n.m101060f(unmodifiableList, "_builder.getAppContextList()");
        new C62883b(unmodifiableList);
        C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
        C69664n.m101060f(zVar, "newBuilder()");
        C51635y a = C69664n.m101061g(zVar, "builder");
        if (str != null) {
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C69664n.m101060f(ggVar, "newBuilder()");
            C51054er a2 = C69664n.m101061g(ggVar, "builder");
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            C69664n.m101060f(esVar, "newBuilder()");
            C51063f a3 = C69664n.m101061g(esVar, "builder");
            a3.mo53516c(str);
            a2.mo53512b(a3.mo53514a());
            a.mo53668b(a2.mo53511a());
        }
        C51231aa a4 = a.mo53667a();
        C69664n.m101061g(a4, "value");
        abVar.mo53558b(a4);
        C62942bv build = abVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a5 = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a6 = C69664n.m101061g(azVar, "builder");
        C52230ka a7 = C127257b.f350458b.mo38879a((C51233ac) build);
        C69664n.m101060f(a7, "PARAMS_KEY.pack(appContextParams)");
        a6.mo38306b(a7);
        a5.mo38303b(a6.mo38305a());
        return a5.mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127256a(this.f350456b, gVar);
    }
}
