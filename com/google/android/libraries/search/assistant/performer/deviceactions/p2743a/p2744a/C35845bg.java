package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bg */
/* compiled from: PG */
public final class C35845bg {

    /* renamed from: a */
    public static final C59071e f93935a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bg");

    /* renamed from: a */
    public static C52103fi m64241a(String str) {
        C52099fe feVar = (C52099fe) C52103fi.f136729i.createBuilder();
        feVar.copyOnWrite();
        C52103fi fiVar = (C52103fi) feVar.instance;
        str.getClass();
        fiVar.f136731a |= 1;
        fiVar.f136732b = str;
        feVar.copyOnWrite();
        C52103fi fiVar2 = (C52103fi) feVar.instance;
        fiVar2.f136731a |= 2;
        fiVar2.f136733c = true;
        feVar.copyOnWrite();
        C52103fi fiVar3 = (C52103fi) feVar.instance;
        fiVar3.f136734d = 3;
        fiVar3.f136731a |= 4;
        return (C52103fi) feVar.build();
    }

    /* renamed from: b */
    public static C52103fi m64242b() {
        C52099fe feVar = (C52099fe) C52103fi.f136729i.createBuilder();
        feVar.copyOnWrite();
        C52103fi fiVar = (C52103fi) feVar.instance;
        fiVar.f136731a |= 2;
        fiVar.f136733c = false;
        feVar.copyOnWrite();
        C52103fi fiVar2 = (C52103fi) feVar.instance;
        fiVar2.f136734d = 1;
        fiVar2.f136731a |= 4;
        return (C52103fi) feVar.build();
    }

    /* renamed from: c */
    public static C60870cx m64243c(C58485gu guVar, Function function) {
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C58480gp e3 = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) guVar.get(i);
            Optional optional = (Optional) function.apply(str);
            if (optional.isPresent()) {
                e2.mo55395g(str);
                e3.mo55395g((C60870cx) optional.get());
            } else {
                e.mo55395g(str);
            }
        }
        C58485gu f = e2.mo55394f();
        C60870cx o = C60856cj.m92906o(e3.mo55394f());
        C35844bf bfVar = new C35844bf(f, e);
        return C60922j.m93044g(o, C47810es.m84963c(bfVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public static String m64244d(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m64245e(Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry value : map.entrySet()) {
            sb.append((String) value.getValue());
            sb.append(",");
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static String m64246f(C52115fu fuVar) {
        if ((fuVar.f136755a & 16) != 0 && !fuVar.f136760f.isEmpty()) {
            return fuVar.f136760f;
        }
        if ((fuVar.f136755a & 64) == 0 || fuVar.f136762h.isEmpty()) {
            return ((fuVar.f136755a & 1) == 0 || fuVar.f136756b.isEmpty()) ? "SETTING_UNSPECIFIED" : fuVar.f136756b;
        }
        return fuVar.f136762h;
    }
}
