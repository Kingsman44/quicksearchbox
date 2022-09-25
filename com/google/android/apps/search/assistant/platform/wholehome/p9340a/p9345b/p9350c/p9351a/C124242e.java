package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32780ab;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C124242e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124248k f343042a;

    /* renamed from: b */
    public final /* synthetic */ String f343043b;

    /* renamed from: c */
    public final /* synthetic */ List f343044c;

    public /* synthetic */ C124242e(C124248k kVar, String str, List list) {
        this.f343042a = kVar;
        this.f343043b = str;
        this.f343044c = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124248k kVar = this.f343042a;
        String str = this.f343043b;
        List list = this.f343044c;
        if (kVar.f343061e.containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            C58801sm G = ((C58485gu) list).listIterator(0);
            while (G.hasNext()) {
                String str2 = (String) G.next();
                C32780ab abVar = (C32780ab) C32781ac.f87950e.createBuilder();
                C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
                ajVar.copyOnWrite();
                C32796ar arVar = (C32796ar) ajVar.instance;
                str2.getClass();
                arVar.f87975a = 1;
                arVar.f87976b = str2;
                abVar.copyOnWrite();
                C32781ac acVar = (C32781ac) abVar.instance;
                C32796ar arVar2 = (C32796ar) ajVar.build();
                arVar2.getClass();
                acVar.f87953b = arVar2;
                acVar.f87952a |= 1;
                arrayList.add(C60922j.m93045h(((C32603b) kVar.f343061e.get(str)).mo38181c((C32781ac) abVar.build()), C47810es.m84966f(new C124238a(kVar, str, str2)), kVar.f343059c));
            }
            return C47638k.m84752c(arrayList).mo51521b(new C124239b(arrayList), kVar.f343059c);
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Failed to find Context AccessSession for id: %s.", new Object[]{str}));
    }
}
