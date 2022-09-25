package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58839bc;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.u */
/* compiled from: PG */
public final /* synthetic */ class C106369u implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ Set f296716a;

    public /* synthetic */ C106369u(Set set) {
        this.f296716a = set;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        Set set = this.f296716a;
        C67438ag agVar = (C67438ag) obj;
        C118928k kVar = C106372x.f296719a;
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            return true;
        }
        String e = C106372x.m177166e(agVar);
        boolean contains = set.contains(e);
        set.add(e);
        if (contains) {
            return false;
        }
        return true;
    }
}
