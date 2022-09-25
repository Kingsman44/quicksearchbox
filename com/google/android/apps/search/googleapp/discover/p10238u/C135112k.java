package com.google.android.apps.search.googleapp.discover.p10238u;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134288h;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134289i;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57319dt;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57320du;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.k */
/* compiled from: PG */
public final class C135112k {
    /* renamed from: a */
    public static final void m219116a(C57320du duVar, String str) {
        C135111j jVar = new C135111j(NumberFormat.getIntegerInstance());
        String[] split = TextUtils.split(str, "\\.");
        int length = split.length;
        if (length > 0) {
            try {
                String str2 = split[0];
                C69664n.m101060f(str2, "values[0]");
                int intValue = jVar.mo5761a(str2).intValue();
                duVar.copyOnWrite();
                C57321dv dvVar = (C57321dv) duVar.instance;
                C57321dv dvVar2 = C57321dv.f153009i;
                dvVar.f153011a |= 1;
                dvVar.f153012b = intValue;
                if (length >= 2) {
                    String str3 = split[1];
                    C69664n.m101060f(str3, "values[1]");
                    int intValue2 = jVar.mo5761a(str3).intValue();
                    duVar.copyOnWrite();
                    C57321dv dvVar3 = (C57321dv) duVar.instance;
                    dvVar3.f153011a |= 2;
                    dvVar3.f153013c = intValue2;
                    if (length >= 3) {
                        String str4 = split[2];
                        C69664n.m101060f(str4, "values[2]");
                        int intValue3 = jVar.mo5761a(str4).intValue();
                        duVar.copyOnWrite();
                        C57321dv dvVar4 = (C57321dv) duVar.instance;
                        dvVar4.f153011a |= 4;
                        dvVar4.f153014d = intValue3;
                        if (length >= 4) {
                            String str5 = split[3];
                            C69664n.m101060f(str5, "values[3]");
                            int intValue4 = jVar.mo5761a(str5).intValue();
                            duVar.copyOnWrite();
                            C57321dv dvVar5 = (C57321dv) duVar.instance;
                            dvVar5.f153011a |= 8;
                            dvVar5.f153015e = intValue4;
                        }
                    }
                }
            } catch (ParseException e) {
                C59052c cVar = (C59052c) ((C59052c) C135123v.f368020a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40385));
                cVar.mo56389s("Invalid int value while parsing string version: %s", str);
            }
        } else {
            C59052c cVar2 = (C59052c) C135123v.f368020a.mo56226d();
            cVar2.mo56379ah(new C59094n(40384));
            cVar2.mo56389s("Invalid format while parsing string version: %s", str);
        }
    }

    /* renamed from: b */
    public static final C134289i m219117b(String str, C57229ak akVar) {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C134288h(pVar, akVar.f152777b));
        C134297q.m217877a("Width", akVar.f152778c, pVar, arrayList);
        C134297q.m217877a("Height", akVar.f152779d, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        return C134268c.m217846a(str, dVar);
    }

    /* renamed from: c */
    public static final C134289i m219118c(C57321dv dvVar, String str) {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C59071e eVar = C135123v.f368020a;
        StringBuilder sb = new StringBuilder();
        if ((dvVar.f153011a & 1) != 0) {
            sb.append(dvVar.f153012b);
        }
        if ((dvVar.f153011a & 2) != 0) {
            sb.append('.');
            sb.append(dvVar.f153013c);
        }
        if ((dvVar.f153011a & 4) != 0) {
            sb.append('.');
            sb.append(dvVar.f153014d);
        }
        if ((dvVar.f153011a & 8) != 0) {
            sb.append('.');
            sb.append(dvVar.f153015e);
        }
        C134297q.m217880d("Version", sb.toString(), pVar, arrayList);
        C134297q.m217877a("Api Version", dvVar.f153018h, pVar, arrayList);
        C57319dt a = C57319dt.m88312a(dvVar.f153017g);
        if (a == null) {
            a = C57319dt.UNKNOWN_BUILD_TYPE;
        }
        C69664n.m101060f(a, "this@toDebugFeature.buildType");
        C134297q.m217879c("BuildType", a, pVar, arrayList);
        C57317dr a2 = C57317dr.m88310a(dvVar.f153016f);
        if (a2 == null) {
            a2 = C57317dr.UNKNOWN_ARCHITECTURE;
        }
        C69664n.m101060f(a2, "this@toDebugFeature.architecture");
        C134297q.m217879c("Architecture", a2, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        return C134268c.m217846a(str, dVar);
    }

    /* renamed from: d */
    public static final void m219119d() {
        C59052c cVar = (C59052c) C135123v.f368020a.mo56226d();
        cVar.mo56379ah(new C59094n(40381));
        cVar.mo56386p("Unknown NetworkInfo.");
    }
}
