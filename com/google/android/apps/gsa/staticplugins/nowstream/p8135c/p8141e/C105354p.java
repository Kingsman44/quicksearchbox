package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91400l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.p */
/* compiled from: PG */
public final /* synthetic */ class C105354p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C105360v f293952a;

    /* renamed from: b */
    public final /* synthetic */ C7642eo f293953b;

    public /* synthetic */ C105354p(C105360v vVar, C7642eo eoVar) {
        this.f293952a = vVar;
        this.f293953b = eoVar;
    }

    public final C60870cx apply(Object obj) {
        C105360v vVar = this.f293952a;
        C7642eo eoVar = this.f293953b;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            return vVar.f293968h.mo28201a("getEntryDataForTab", new C105355q(vVar, eoVar));
        }
        if (num.intValue() == 13) {
            return vVar.f293968h.mo28201a("getEntryDataForTab", new C105356r(vVar, eoVar));
        }
        return C60856cj.m92899h(new C91400l(num.intValue()));
    }
}
