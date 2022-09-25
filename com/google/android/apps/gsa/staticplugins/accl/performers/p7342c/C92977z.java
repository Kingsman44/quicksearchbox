package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8373k.p8374a.C109337a;
import com.google.android.libraries.gcoreclient.p1770i.p1771a.C21564c;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21675e;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21678h;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21682l;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21683m;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52463sr;
import com.google.assistant.p3897e.p3921j.C52465st;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.z */
/* compiled from: PG */
public final class C92977z extends C22538o {

    /* renamed from: a */
    public static final C59071e f259349a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.z");

    /* renamed from: b */
    public final Context f259350b;

    /* renamed from: c */
    public final C86124t f259351c;

    /* renamed from: d */
    public final C22871g f259352d;

    /* renamed from: e */
    public final C22720x f259353e;

    /* renamed from: f */
    public final C109337a f259354f;

    /* renamed from: g */
    public final C21682l f259355g;

    /* renamed from: h */
    public final C21683m f259356h;

    /* renamed from: i */
    public final C21675e f259357i;

    /* renamed from: j */
    private final C22871g f259358j;

    /* renamed from: k */
    private final C21678h f259359k;

    public C92977z(Context context, C86124t tVar, C21682l lVar, C21683m mVar, C21678h hVar, C21675e eVar, C22871g gVar, C22871g gVar2, C22720x xVar, C109337a aVar) {
        this.f259350b = context;
        this.f259351c = tVar;
        this.f259355g = lVar;
        this.f259356h = mVar;
        this.f259359k = hVar;
        this.f259357i = eVar;
        this.f259358j = gVar;
        this.f259352d = gVar2;
        this.f259353e = xVar;
        this.f259354f = aVar;
    }

    /* renamed from: b */
    public static C52070ec m153017b(C52465st stVar, String str) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "carrier_plan_info";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = stVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.CarrierPlanInfo";
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.INTERNAL;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = str;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        ecVar.f136654b = kgVar3;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: c */
    public static C52070ec m153018c(C52465st stVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "carrier_plan_info";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = stVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.CarrierPlanInfo";
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58833ax axVar;
        C60870cx cxVar;
        C60870cx cxVar2;
        C58976aa aaVar = C58975e.f156826a;
        int a = (int) this.f259351c.mo79743a(C90014bt.f247338fK);
        String x = this.f259351c.mo79758x(C90014bt.f247339fL);
        if (a == 0 || C58837ba.m90859h(x)) {
            axVar = C58836b.f156633a;
        } else {
            C52463sr srVar = (C52463sr) C52465st.f137722h.createBuilder();
            srVar.copyOnWrite();
            C52465st stVar = (C52465st) srVar.instance;
            x.getClass();
            stVar.f137724a |= 1;
            stVar.f137725b = x;
            srVar.copyOnWrite();
            C52465st stVar2 = (C52465st) srVar.instance;
            x.getClass();
            stVar2.f137724a |= 2;
            stVar2.f137726c = x;
            long j = (long) a;
            srVar.copyOnWrite();
            C52465st stVar3 = (C52465st) srVar.instance;
            stVar3.f137724a |= 4;
            stVar3.f137727d = j;
            C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
            usVar.copyOnWrite();
            C52522uw uwVar = (C52522uw) usVar.instance;
            x.getClass();
            uwVar.f137866a |= 8;
            uwVar.f137870e = x;
            usVar.copyOnWrite();
            C52522uw uwVar2 = (C52522uw) usVar.instance;
            x.getClass();
            uwVar2.f137866a |= 16;
            uwVar2.f137871f = x;
            usVar.copyOnWrite();
            C52522uw uwVar3 = (C52522uw) usVar.instance;
            uwVar3.f137866a |= 4;
            uwVar3.f137869d = j;
            C52522uw uwVar4 = (C52522uw) usVar.build();
            srVar.copyOnWrite();
            C52465st stVar4 = (C52465st) srVar.instance;
            uwVar4.getClass();
            stVar4.f137730g = uwVar4;
            stVar4.f137724a |= 32;
            axVar = C58833ax.m90834k((C52465st) srVar.build());
        }
        if (axVar.mo56113h()) {
            cxVar = C60856cj.m92900i((C52465st) axVar.mo56107c());
        } else {
            C58872ci d = C58872ci.m90947d(C58274c.f155808a);
            try {
                cxVar2 = C21564c.m40696a(this.f259355g.mo27053a(this.f259350b, this.f259356h.mo27054a().mo27055a()).mo27050a(this.f259359k.mo27070a("AIzaSyCqrNxCAJrrk_NQqIUp1-baqW05d3JYeOc")));
            } catch (Exception e) {
                cxVar2 = C60856cj.m92899h(e);
            }
            C60870cx e2 = C90877ak.m148471e(cxVar2, 5, TimeUnit.SECONDS, this.f259352d);
            C60870cx i = this.f259352d.mo28209i(e2, "Transform carrierPlanIdFuture to carrierPlanInfo", C92973v.f259342a);
            C60856cj.m92911t(e2, new C92976y(this, d), C60826bg.f164896a);
            cxVar = this.f259352d.mo28205e(i, "Catching exception from getMdpCarrierPlanId API call", Exception.class, C92974w.f259343a);
        }
        return this.f259358j.mo28210j(cxVar, "Handle carrier information to get FETCH_CARRIER_INFO clientop result", new C92975x(this, dyVar, eVar));
    }
}
