package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1147e;

import com.google.android.apps.p453b.p457b.p460b.p462b.C9012l;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.e.g */
/* compiled from: PG */
public final /* synthetic */ class C15622g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15626k f46700a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46701b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f46702c;

    /* renamed from: d */
    public final /* synthetic */ String f46703d;

    public /* synthetic */ C15622g(C15626k kVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f46700a = kVar;
        this.f46701b = cxVar;
        this.f46702c = cxVar2;
        this.f46703d = str;
    }

    public final Object call() {
        C15626k kVar = this.f46700a;
        C60870cx cxVar = this.f46701b;
        C60870cx cxVar2 = this.f46702c;
        String str = this.f46703d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        String str2 = (String) C60856cj.m92909r(cxVar2);
        if (((Boolean) kVar.f46718f.f46794c.mo17428b()).booleanValue() && axVar.mo56113h() && ((C9012l) axVar.mo56107c()).f31139a.size() == 0) {
            C59104x b = C15626k.f46713a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) b).mo56372aa(46214)).mo56389s("Destination not in range for offline downloaded maps: %s.", str);
            C51809dy a = C15669a.m32462a(str2);
            C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
            C52081en b2 = C15669a.m32463b(Arrays.asList(new C51809dy[]{a}), Arrays.asList(new Integer[]{23202}));
            eVar.copyOnWrite();
            C51195j jVar = (C51195j) eVar.instance;
            b2.getClass();
            jVar.f133275j = b2;
            jVar.f133266a |= 128;
            return C58833ax.m90834k((C51195j) eVar.build());
        } else if (!((Boolean) kVar.f46718f.f46795d.mo17428b()).booleanValue() || !axVar.mo56113h() || ((C9012l) axVar.mo56107c()).f31139a.size() <= 1) {
            return C58836b.f156633a;
        } else {
            C59104x b3 = C15626k.f46713a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) b3).mo56372aa(46213)).mo56389s("Destination has > 1 result so triggering SAR: %s.", str);
            return kVar.mo22426b(str);
        }
    }
}
