package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124663cb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124674cm;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124675cn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124676co;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124677cp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124691dc;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124692dd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124693de;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124694df;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124695dg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124696dh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124703do;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124704dp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124705dq;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124706dr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46681b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.a.o */
/* compiled from: PG */
public final class C124743o implements C124729a {

    /* renamed from: a */
    public final C124659by f344144a;

    /* renamed from: b */
    public final C46407v f344145b;

    /* renamed from: c */
    public final C46778cv f344146c;

    /* renamed from: d */
    public final C60887da f344147d;

    /* renamed from: e */
    private final C46407v f344148e;

    public C124743o(C124659by byVar, C46407v vVar, C46407v vVar2, C46778cv cvVar, C60887da daVar) {
        this.f344144a = byVar;
        this.f344145b = vVar;
        this.f344148e = vVar2;
        this.f344146c = cvVar;
        this.f344147d = daVar;
    }

    /* renamed from: j */
    public static C124677cp m204403j(String str) {
        C124676co coVar = (C124676co) C124677cp.f343952c.createBuilder();
        coVar.copyOnWrite();
        C124677cp cpVar = (C124677cp) coVar.instance;
        str.getClass();
        cpVar.f343954a |= 1;
        cpVar.f343955b = str;
        return (C124677cp) coVar.build();
    }

    /* renamed from: a */
    public final C46689ag mo106595a(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        C124674cm cmVar = (C124674cm) C124675cn.f343946e.createBuilder();
        cmVar.copyOnWrite();
        C124675cn cnVar = (C124675cn) cmVar.instance;
        str.getClass();
        cnVar.f343948a |= 1;
        cnVar.f343949b = str;
        cmVar.copyOnWrite();
        C124675cn cnVar2 = (C124675cn) cmVar.instance;
        cnVar2.f343948a |= 2;
        cnVar2.f343950c = str2;
        C124675cn cnVar3 = (C124675cn) cmVar.build();
        return new C46681b("BistoDeviceCustomizeInfo", this.f344148e, cnVar3, new C124740l(this, cnVar3));
    }

    /* renamed from: b */
    public final C46689ag mo106596b(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C124677cp j = m204403j(str);
        return new C46681b("BistoDeviceStatus", this.f344145b, j, new C124738j(this, j));
    }

    /* renamed from: c */
    public final C60870cx mo106597c(String str) {
        C124677cp j = m204403j(str);
        C124659by byVar = this.f344144a;
        C60870cx a = C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204331a(), byVar.f189040b), m204403j(str));
        C124734f fVar = new C124734f(this, j);
        return C60922j.m93044g(a, C47810es.m84963c(fVar), this.f344147d);
    }

    /* renamed from: d */
    public final C60870cx mo106598d(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C124677cp j = m204403j(str);
        C60870cx c = this.f344144a.mo106577c(j);
        C124739k kVar = new C124739k(this, j);
        return C60922j.m93044g(c, C47810es.m84963c(kVar), this.f344147d);
    }

    /* renamed from: e */
    public final C60870cx mo106599e(String str, boolean z, C124979z zVar) {
        C58976aa aaVar = C58975e.f156826a;
        C63138d dVar = zVar.f344851c;
        if (dVar == null) {
            dVar = C63138d.f170494j;
        }
        C124691dc dcVar = (C124691dc) C124692dd.f343996g.createBuilder();
        dcVar.copyOnWrite();
        C124692dd ddVar = (C124692dd) dcVar.instance;
        str.getClass();
        ddVar.f343998a |= 1;
        ddVar.f343999b = str;
        dcVar.copyOnWrite();
        C124692dd ddVar2 = (C124692dd) dcVar.instance;
        ddVar2.f343998a |= 2;
        ddVar2.f344000c = true;
        String str2 = dVar.f170497b;
        dcVar.copyOnWrite();
        C124692dd ddVar3 = (C124692dd) dcVar.instance;
        str2.getClass();
        ddVar3.f343998a |= 4;
        ddVar3.f344001d = str2;
        C63088z zVar2 = zVar.f344850b;
        dcVar.copyOnWrite();
        C124692dd ddVar4 = (C124692dd) dcVar.instance;
        zVar2.getClass();
        ddVar4.f343998a |= 8;
        ddVar4.f344002e = zVar2;
        dcVar.copyOnWrite();
        C124692dd ddVar5 = (C124692dd) dcVar.instance;
        ddVar5.f343998a |= 16;
        ddVar5.f344003f = !z;
        C124677cp j = m204403j(str);
        return C60922j.m93044g(this.f344144a.mo106578d((C124692dd) dcVar.build()), C47810es.m84963c(new C124741m(this, j)), this.f344147d);
    }

    /* renamed from: f */
    public final C60870cx mo106600f(String str, C124633az azVar) {
        C58976aa aaVar = C58975e.f156826a;
        C124693de deVar = (C124693de) C124694df.f344004d.createBuilder();
        deVar.copyOnWrite();
        C124694df dfVar = (C124694df) deVar.instance;
        str.getClass();
        dfVar.f344006a |= 1;
        dfVar.f344007b = str;
        deVar.copyOnWrite();
        C124694df dfVar2 = (C124694df) deVar.instance;
        dfVar2.f344008c = azVar.f343841h;
        dfVar2.f344006a |= 2;
        C124677cp j = m204403j(str);
        C124659by byVar = this.f344144a;
        return C60922j.m93044g(C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204337g(), byVar.f189040b), (C124694df) deVar.build()), C47810es.m84963c(new C124735g(this, j)), this.f344147d);
    }

    /* renamed from: g */
    public final C60870cx mo106601g(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C124677cp j = m204403j(str);
        C124695dg dgVar = (C124695dg) C124696dh.f344009d.createBuilder();
        dgVar.copyOnWrite();
        C124696dh dhVar = (C124696dh) dgVar.instance;
        str.getClass();
        dhVar.f344011a |= 1;
        dhVar.f344012b = str;
        dgVar.copyOnWrite();
        C124696dh dhVar2 = (C124696dh) dgVar.instance;
        dhVar2.f344011a |= 2;
        dhVar2.f344013c = z;
        C124659by byVar = this.f344144a;
        return C60922j.m93044g(C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204338h(), byVar.f189040b), (C124696dh) dgVar.build()), C47810es.m84963c(new C124737i(this, j)), this.f344147d);
    }

    /* renamed from: h */
    public final C60870cx mo106602h(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C124677cp j = m204403j(str);
        C124705dq dqVar = (C124705dq) C124706dr.f344039d.createBuilder();
        dqVar.copyOnWrite();
        C124706dr drVar = (C124706dr) dqVar.instance;
        str.getClass();
        drVar.f344041a |= 1;
        drVar.f344042b = str;
        dqVar.copyOnWrite();
        C124706dr drVar2 = (C124706dr) dqVar.instance;
        drVar2.f344041a |= 2;
        drVar2.f344043c = z;
        C124659by byVar = this.f344144a;
        C60922j.m93044g(C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204339i(), byVar.f189040b), (C124706dr) dqVar.build()), C47810es.m84963c(new C124742n(this, j)), this.f344147d);
        return C60866ct.f164955a;
    }

    /* renamed from: i */
    public final C60870cx mo106603i(String str, C124979z zVar) {
        C124677cp j = m204403j(str);
        C63138d dVar = zVar.f344851c;
        if (dVar == null) {
            dVar = C63138d.f170494j;
        }
        C124703do doVar = (C124703do) C124704dp.f344029i.createBuilder();
        doVar.copyOnWrite();
        C124704dp dpVar = (C124704dp) doVar.instance;
        str.getClass();
        dpVar.f344031a |= 1;
        dpVar.f344032b = str;
        doVar.copyOnWrite();
        C124704dp dpVar2 = (C124704dp) doVar.instance;
        dpVar2.f344031a |= 16;
        dpVar2.f344036f = true;
        if ((dVar.f170496a & 1) != 0 && !dVar.f170497b.isEmpty()) {
            String str2 = dVar.f170497b;
            doVar.copyOnWrite();
            C124704dp dpVar3 = (C124704dp) doVar.instance;
            str2.getClass();
            dpVar3.f344031a |= 2;
            dpVar3.f344033c = str2;
        }
        if ((dVar.f170496a & 2) != 0) {
            String str3 = dVar.f170499d;
            doVar.copyOnWrite();
            C124704dp dpVar4 = (C124704dp) doVar.instance;
            str3.getClass();
            dpVar4.f344031a |= 4;
            dpVar4.f344034d = str3;
        }
        if ((dVar.f170496a & 64) != 0) {
            boolean z = dVar.f170504i;
            doVar.copyOnWrite();
            C124704dp dpVar5 = (C124704dp) doVar.instance;
            dpVar5.f344031a |= 32;
            dpVar5.f344037g = z;
        }
        if ((zVar.f344849a & 1) != 0) {
            C63088z zVar2 = zVar.f344850b;
            doVar.copyOnWrite();
            C124704dp dpVar6 = (C124704dp) doVar.instance;
            zVar2.getClass();
            dpVar6.f344031a |= 64;
            dpVar6.f344038h = zVar2;
        }
        C124719q qVar = C124719q.GACS_DEVICE;
        doVar.copyOnWrite();
        C124704dp dpVar7 = (C124704dp) doVar.instance;
        dpVar7.f344035e = qVar.f344102e;
        dpVar7.f344031a |= 8;
        C124659by byVar = this.f344144a;
        return C60922j.m93044g(C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204340j(), byVar.f189040b), (C124704dp) doVar.build()), C47810es.m84963c(new C124733e(this, j)), this.f344147d);
    }
}
