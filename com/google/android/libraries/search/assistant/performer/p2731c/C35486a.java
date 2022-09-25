package com.google.android.libraries.search.assistant.performer.p2731c;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C51822aj;
import com.google.assistant.p3897e.p3921j.p3926e.C51823ak;
import com.google.common.base.C58827ar;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.performer.home.ShowCastDeviceControlPerformer$performInternal$1", mo61344c = "ShowCastDeviceControlPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {79})
/* renamed from: com.google.android.libraries.search.assistant.performer.c.a */
/* compiled from: PG */
final class C35486a extends C69572j implements C69630p {

    /* renamed from: a */
    int f93194a;

    /* renamed from: b */
    final /* synthetic */ C51823ak f93195b;

    /* renamed from: c */
    final /* synthetic */ C35487b f93196c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35486a(C51823ak akVar, C35487b bVar, C69577g gVar) {
        super(2, gVar);
        this.f93195b = akVar;
        this.f93196c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C35486a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C51058ev evVar;
        C51058ev evVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f93194a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C51823ak akVar = this.f93195b;
            if ((akVar.f135962a & 1) != 0) {
                C51098gh ghVar = akVar.f135964c;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if (!C69664n.m101066l(evVar.f132944b, "com.google.android.apps.chromecast.app")) {
                    C51098gh ghVar2 = this.f93195b.f135964c;
                    if (ghVar2 == null) {
                        ghVar2 = C51098gh.f133009e;
                    }
                    if (ghVar2.f133012b == 1) {
                        evVar2 = (C51058ev) ghVar2.f133013c;
                    } else {
                        evVar2 = C51058ev.f132941o;
                    }
                    throw new C35471g("Unexpected provider in ShowCastDeviceControlArgs: ".concat(String.valueOf(evVar2.f132944b)));
                }
                C62971cq cqVar = this.f93195b.f135963b;
                C69664n.m101060f(cqVar, "args.devicesAffectedList");
                ArrayList<C51822aj> arrayList = new ArrayList<>();
                for (Object next : cqVar) {
                    if ((((C51822aj) next).f135958a & 1) != 0) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
                for (C51822aj ajVar : arrayList) {
                    arrayList2.add(ajVar.f135959b);
                }
                if (!arrayList2.isEmpty()) {
                    C60870cx f = this.f93196c.f93197a.mo20101f(Intent.parseUri("googlehome://controller/cast?app_device_id=".concat(new C58827ar(",").mo56097d(arrayList2)), 1));
                    C69664n.m101060f(f, "intentStarter.startActivity(intent)");
                    this.f93194a = 1;
                    if (C71663i.m104690c(f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    throw new C35471g("Unable to show cast device control. No available device id.");
                }
            } else {
                throw new C35471g("Missing provider in ShowCastDeviceControlArgs");
            }
        }
        C52070ec ecVar = C36180b.f94545b;
        C69664n.m101060f(ecVar, "ignore()");
        return ecVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C35486a(this.f93195b, this.f93196c, gVar);
    }
}
