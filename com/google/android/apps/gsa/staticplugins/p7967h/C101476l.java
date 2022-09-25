package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.assistant.p3803ag.p3804a.C48801ai;
import com.google.assistant.p3803ag.p3804a.C48803ak;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48879v;
import com.google.assistant.p3803ag.p3804a.C48880w;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.l */
/* compiled from: PG */
public final /* synthetic */ class C101476l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C101476l f283125a = new C101476l();

    private /* synthetic */ C101476l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C101483s.f283139m;
        C48879v vVar = (C48879v) C48880w.f126488d.createBuilder();
        C48851br brVar = ((C83683b) obj).f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        vVar.copyOnWrite();
        C48880w wVar = (C48880w) vVar.instance;
        brVar.getClass();
        wVar.f126492c = brVar;
        wVar.f126490a |= 2;
        C48801ai aiVar = (C48801ai) C48803ak.f126274c.createBuilder();
        aiVar.copyOnWrite();
        C48803ak akVar = (C48803ak) aiVar.instance;
        akVar.f126277b = 1;
        akVar.f126276a |= 1;
        vVar.copyOnWrite();
        C48880w wVar2 = (C48880w) vVar.instance;
        C48803ak akVar2 = (C48803ak) aiVar.build();
        akVar2.getClass();
        wVar2.f126491b = akVar2;
        wVar2.f126490a |= 1;
        return (C48880w) vVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
