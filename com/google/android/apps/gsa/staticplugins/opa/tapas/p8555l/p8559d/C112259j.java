package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.assistant.p3781ad.p3787c.p3788a.C48486ae;
import com.google.assistant.p3781ad.p3787c.p3788a.C48488ag;
import com.google.assistant.p3781ad.p3787c.p3788a.C48498aq;
import com.google.assistant.p3781ad.p3787c.p3788a.C48502au;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.j */
/* compiled from: PG */
public final /* synthetic */ class C112259j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C112267r f311561a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f311562b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f311563c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f311564d;

    /* renamed from: e */
    public final /* synthetic */ Map f311565e;

    /* renamed from: f */
    public final /* synthetic */ long f311566f;

    public /* synthetic */ C112259j(C112267r rVar, C60870cx cxVar, C60870cx cxVar2, C58485gu guVar, Map map, long j) {
        this.f311561a = rVar;
        this.f311562b = cxVar;
        this.f311563c = cxVar2;
        this.f311564d = guVar;
        this.f311565e = map;
        this.f311566f = j;
    }

    public final Object call() {
        C112267r rVar = this.f311561a;
        C60870cx cxVar = this.f311562b;
        C60870cx cxVar2 = this.f311563c;
        C58485gu guVar = this.f311564d;
        Map map = this.f311565e;
        long j = this.f311566f;
        C48486ae aeVar = (C48486ae) C60856cj.m92909r(cxVar);
        C48488ag agVar = (C48488ag) C60856cj.m92909r(cxVar2);
        if (aeVar.f125252c.size() != agVar.f125257c.size()) {
            rVar.mo99479c(Level.SEVERE, "ModelRequest (%d) and ModelResponse (%d) have different number of suggestions", Integer.valueOf(aeVar.f125252c.size()), Integer.valueOf(agVar.f125257c.size()));
            return C121438d.f337093a;
        }
        ArrayList arrayList = new ArrayList(guVar);
        int i = 0;
        for (int i2 = 0; i2 < aeVar.f125252c.size(); i2++) {
            float f = ((C48498aq) agVar.f125257c.get(i2)).f125282b;
            double d = (double) f;
            if (((C113415ez) guVar.get(i2)).mo100201a() != d) {
                i++;
            }
            rVar.mo99479c(Level.FINEST, "Suggestion=[%s - %s] score=[%f]", ((C113415ez) guVar.get(i2)).mo100199L(), ((C48502au) aeVar.f125252c.get(i2)).f125295c, Float.valueOf(f));
            C113414ey h = ((C113415ez) guVar.get(i2)).mo100208h();
            h.mo100163h(d);
            arrayList.set(i2, h.mo100156a());
        }
        map.clear();
        map.putAll(C113339cj.m187496d(arrayList));
        C121437c a = C121438d.m200684a();
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        brVar.copyOnWrite();
        C59496bt btVar = (C59496bt) brVar.instance;
        btVar.f157862a |= 1;
        btVar.f157863b = i;
        long b = rVar.f311586b.mo26870b();
        brVar.copyOnWrite();
        C59496bt btVar2 = (C59496bt) brVar.instance;
        btVar2.f157862a |= 8;
        btVar2.f157867f = b - j;
        a.mo105147b((C59496bt) brVar.build());
        return a.mo105146a();
    }
}
