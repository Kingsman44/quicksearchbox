package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.protos.p4985f.p4986a.C64666at;
import com.google.protos.p4985f.p4986a.C64667au;
import com.google.protos.p4985f.p4986a.C64707q;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64710t;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.v */
/* compiled from: PG */
public final /* synthetic */ class C22150v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f61096a;

    /* renamed from: b */
    public final /* synthetic */ boolean f61097b;

    /* renamed from: c */
    public final /* synthetic */ C55084fg f61098c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f61099d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f61100e;

    /* renamed from: f */
    public final /* synthetic */ C64707q f61101f;

    /* renamed from: g */
    public final /* synthetic */ int f61102g;

    public /* synthetic */ C22150v(C60870cx cxVar, boolean z, int i, C55084fg fgVar, C58485gu guVar, C60870cx cxVar2, C64707q qVar) {
        this.f61096a = cxVar;
        this.f61097b = z;
        this.f61102g = i;
        this.f61098c = fgVar;
        this.f61099d = guVar;
        this.f61100e = cxVar2;
        this.f61101f = qVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f61096a;
        boolean z = this.f61097b;
        int i = this.f61102g;
        C55084fg fgVar = this.f61098c;
        C58485gu guVar = this.f61099d;
        C60870cx cxVar2 = this.f61100e;
        C64707q qVar = this.f61101f;
        C58485gu c = C22063au.m41300c((C58485gu) C60856cj.m92909r(cxVar), z);
        if (i == 7 && fgVar == C55084fg.PHONE_NUMBER) {
            c = C22063au.m41301d(c, guVar);
        }
        C64710t tVar = (C64710t) C60856cj.m92909r(cxVar2);
        C64666at atVar = (C64666at) C64667au.f175280f.createBuilder();
        atVar.mo59289a(c);
        atVar.copyOnWrite();
        C64667au auVar = (C64667au) atVar.instance;
        auVar.f175283b = 1;
        auVar.f175282a = 1 | auVar.f175282a;
        C64708r rVar = (C64708r) qVar.build();
        atVar.copyOnWrite();
        C64667au auVar2 = (C64667au) atVar.instance;
        rVar.getClass();
        auVar2.f175285d = rVar;
        auVar2.f175282a |= 2;
        atVar.copyOnWrite();
        C64667au auVar3 = (C64667au) atVar.instance;
        tVar.getClass();
        auVar3.f175286e = tVar;
        auVar3.f175282a |= 4;
        return (C64667au) atVar.build();
    }
}
