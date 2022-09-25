package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.speech.p5208h.C66585bk;
import com.google.speech.p5208h.C66586bl;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.w */
/* compiled from: PG */
public final /* synthetic */ class C106371w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f296718a;

    public /* synthetic */ C106371w(boolean z) {
        this.f296718a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f296718a;
        C67438ag agVar = (C67438ag) obj;
        C118928k kVar = C106372x.f296719a;
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C66585bk bkVar = (C66585bk) C66586bl.f181121c.createBuilder();
        bkVar.copyOnWrite();
        C66586bl blVar = (C66586bl) bkVar.instance;
        agVar.getClass();
        blVar.f181125b = agVar;
        blVar.f181124a |= 1;
        new C118928k(C58833ax.m90834k((C66586bl) bkVar.build()), C66586bl.f181122d).mo104073a(cdVar);
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2 && z) {
            C106372x.f296719a.mo104073a(cdVar);
        }
        return (C66607ce) cdVar.build();
    }
}
