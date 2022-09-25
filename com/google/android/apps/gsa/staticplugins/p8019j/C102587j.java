package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.j */
/* compiled from: PG */
public final /* synthetic */ class C102587j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C102588k f286297a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f286298b;

    /* renamed from: c */
    public final /* synthetic */ C51188c f286299c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f286300d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f286301e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f286302f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f286303g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f286304h;

    /* renamed from: i */
    public final /* synthetic */ C60870cx f286305i;

    /* renamed from: j */
    public final /* synthetic */ C60870cx f286306j;

    public /* synthetic */ C102587j(C102588k kVar, C60870cx cxVar, C51188c cVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C60870cx cxVar6, C60870cx cxVar7, C60870cx cxVar8) {
        this.f286297a = kVar;
        this.f286298b = cxVar;
        this.f286299c = cVar;
        this.f286300d = cxVar2;
        this.f286301e = cxVar3;
        this.f286302f = cxVar4;
        this.f286303g = cxVar5;
        this.f286304h = cxVar6;
        this.f286305i = cxVar7;
        this.f286306j = cxVar8;
    }

    public final Object call() {
        C102588k kVar = this.f286297a;
        C60870cx cxVar = this.f286298b;
        C51188c cVar = this.f286299c;
        C60870cx cxVar2 = this.f286300d;
        C60870cx cxVar3 = this.f286301e;
        C60870cx cxVar4 = this.f286302f;
        C60870cx cxVar5 = this.f286303g;
        C60870cx cxVar6 = this.f286304h;
        C60870cx cxVar7 = this.f286305i;
        C60870cx cxVar8 = this.f286306j;
        try {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
            if (axVar.mo56113h()) {
                C102588k.m170125e(cVar, (C52232kc) axVar.mo56107c());
            }
            C52232kc kcVar = (C52232kc) C60856cj.m92909r(cxVar2);
            if (((C91123v) kVar.f286315c.mo27525b()).mo85390b() && kVar.f286314b.mo79746e(C90086ek.f250252D)) {
                try {
                    boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
                    boolean z = false;
                    if (!booleanValue && C36619a.m65148d(kVar.f286317e)) {
                        z = true;
                    }
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    C51303cs csVar = (C51303cs) ((C51334dw) C62942bv.parseFrom((C62942bv) C51334dw.f133658ab, kaVar.f137061c, C62921ba.f169869a)).toBuilder();
                    csVar.copyOnWrite();
                    C51334dw dwVar = (C51334dw) csVar.instance;
                    dwVar.f133689c |= 4;
                    dwVar.f133679U = z;
                    kcVar = C102588k.m170124b("asst.device.properties", "assistant.api.params.DeviceProperties", ((C51334dw) csVar.build()).toByteString());
                } catch (Exception e) {
                    ((C59052c) ((C59052c) ((C59052c) C102588k.f286307a.mo56225c()).mo56382g(e)).mo56372aa(13948)).mo56386p("Cannot get nls disclaimer heard");
                }
            }
            C102588k.m170125e(cVar, kcVar);
            C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar4);
            if (axVar2.mo56113h()) {
                C102588k.m170125e(cVar, (C52232kc) axVar2.mo56107c());
            }
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) C102588k.f286307a.mo56225c()).mo56382g(e2)).mo56372aa(13943)).mo56386p("Unable to add carrier params/device properties to Assistant Request");
        }
        C58833ax axVar3 = (C58833ax) C60856cj.m92909r(cxVar5);
        if (axVar3.mo56113h()) {
            C102588k.m170125e(cVar, (C52232kc) axVar3.mo56107c());
        }
        C58833ax axVar4 = (C58833ax) C60856cj.m92909r(cxVar6);
        if (axVar4.mo56113h()) {
            C102588k.m170125e(cVar, (C52232kc) axVar4.mo56107c());
        }
        C58833ax axVar5 = (C58833ax) C60856cj.m92909r(cxVar7);
        if (axVar5.mo56113h()) {
            C102588k.m170125e(cVar, (C52232kc) axVar5.mo56107c());
        }
        C58833ax axVar6 = (C58833ax) C60856cj.m92909r(cxVar8);
        if (axVar6.mo56113h()) {
            C102588k.m170125e(cVar, (C52232kc) axVar6.mo56107c());
        }
        C51189d dVar = (C51189d) cVar.build();
        C58976aa aaVar = C58975e.f156826a;
        return dVar;
    }
}
