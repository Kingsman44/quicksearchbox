package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92410p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.bc */
/* compiled from: PG */
public final /* synthetic */ class C101956bc implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101959bf f284452a;

    public /* synthetic */ C101956bc(C101959bf bfVar) {
        this.f284452a = bfVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C92173d dVar;
        C101959bf bfVar = this.f284452a;
        bfVar.f284475k.mo24532e();
        Map map = bfVar.f284476l;
        if (bfVar.f284470f.mo83850M()) {
            dVar = C92173d.TISID_ENROLLMENT;
        } else {
            dVar = bfVar.f284468d;
        }
        List list = (List) map.get(dVar);
        boolean z = true;
        int i = true != bfVar.f284470f.mo83850M() ? 2 : 1;
        C92410p pVar = bfVar.f284472h;
        list.getClass();
        if (bfVar.f284473i.mo70891j() || bfVar.f284473i.mo70887e().mo70853a().mo70880d()) {
            z = false;
        }
        return C60922j.m93045h(pVar.mo87051b(list, i, z), C47810es.m84966f(new C101947au(bfVar)), C60826bg.f164896a);
    }
}
