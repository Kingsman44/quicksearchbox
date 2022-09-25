package com.google.android.libraries.assistant.pcp.p1557g.p1563d;

import com.google.assistant.p3803ag.p3809c.C49028du;
import com.google.assistant.p3803ag.p3809c.C49029dv;
import com.google.assistant.p3803ag.p3809c.C49041eg;
import com.google.assistant.p3803ag.p3809c.C49042eh;
import com.google.assistant.p3803ag.p3809c.C49100gl;
import com.google.assistant.p3803ag.p3809c.C49101gm;
import com.google.assistant.p3803ag.p3809c.C49112gx;
import com.google.assistant.p3803ag.p3809c.C49113gy;
import com.google.assistant.p3803ag.p3809c.C49119hd;
import com.google.assistant.p3803ag.p3809c.C49120he;
import com.google.assistant.p3803ag.p3809c.C49147q;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.d */
/* compiled from: PG */
public final /* synthetic */ class C18760d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f52867a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52868b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52869c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f52870d;

    public /* synthetic */ C18760d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f52867a = cxVar;
        this.f52868b = cxVar2;
        this.f52869c = cxVar3;
        this.f52870d = cxVar4;
    }

    public final Object call() {
        C60870cx cxVar = this.f52867a;
        C60870cx cxVar2 = this.f52868b;
        C60870cx cxVar3 = this.f52869c;
        C60870cx cxVar4 = this.f52870d;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        Optional optional3 = (Optional) C60856cj.m92909r(cxVar3);
        Optional optional4 = (Optional) C60856cj.m92909r(cxVar4);
        C49041eg egVar = (C49041eg) C49042eh.f126842d.createBuilder();
        if (optional.isPresent()) {
            C51334dw dwVar = (C51334dw) optional.get();
            egVar.copyOnWrite();
            C49042eh ehVar = (C49042eh) egVar.instance;
            dwVar.getClass();
            ehVar.f126846c = dwVar;
            ehVar.f126844a |= 2;
        }
        if (optional2.isPresent()) {
            C51715bm bmVar = (C51715bm) optional2.get();
            egVar.copyOnWrite();
            C49042eh ehVar2 = (C49042eh) egVar.instance;
            bmVar.getClass();
            ehVar2.f126845b = bmVar;
            ehVar2.f126844a |= 1;
        }
        C49119hd hdVar = (C49119hd) C49120he.f127037e.createBuilder();
        C49112gx gxVar = (C49112gx) C49113gy.f127022c.createBuilder();
        gxVar.copyOnWrite();
        C49113gy gyVar = (C49113gy) gxVar.instance;
        C49042eh ehVar3 = (C49042eh) egVar.build();
        ehVar3.getClass();
        gyVar.f127025b = ehVar3;
        gyVar.f127024a |= 1;
        hdVar.copyOnWrite();
        C49120he heVar = (C49120he) hdVar.instance;
        C49113gy gyVar2 = (C49113gy) gxVar.build();
        gyVar2.getClass();
        heVar.f127040b = gyVar2;
        heVar.f127039a |= 1;
        if (optional3.isPresent()) {
            C49100gl glVar = (C49100gl) C49101gm.f126991c.createBuilder();
            C49147q qVar = (C49147q) optional3.get();
            glVar.copyOnWrite();
            C49101gm gmVar = (C49101gm) glVar.instance;
            qVar.getClass();
            gmVar.f126994b = qVar;
            gmVar.f126993a |= 1;
            C49101gm gmVar2 = (C49101gm) glVar.build();
            hdVar.copyOnWrite();
            C49120he heVar2 = (C49120he) hdVar.instance;
            gmVar2.getClass();
            heVar2.f127042d = gmVar2;
            heVar2.f127039a |= 4;
        }
        if (optional4.isPresent()) {
            C49028du duVar = (C49028du) C49029dv.f126818b.createBuilder();
            Iterable iterable = (Iterable) optional4.get();
            duVar.copyOnWrite();
            C49029dv dvVar = (C49029dv) duVar.instance;
            C62971cq cqVar = dvVar.f126820a;
            if (!cqVar.mo58948c()) {
                dvVar.f126820a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) dvVar.f126820a);
            hdVar.copyOnWrite();
            C49120he heVar3 = (C49120he) hdVar.instance;
            C49029dv dvVar2 = (C49029dv) duVar.build();
            dvVar2.getClass();
            heVar3.f127041c = dvVar2;
            heVar3.f127039a |= 2;
        }
        return (C49120he) hdVar.build();
    }
}
