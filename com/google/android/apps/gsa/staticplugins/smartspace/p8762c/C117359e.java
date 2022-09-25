package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50746bk;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.e */
/* compiled from: PG */
public final /* synthetic */ class C117359e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C83802r f325795a;

    public /* synthetic */ C117359e(C83802r rVar) {
        this.f325795a = rVar;
    }

    public final Object apply(Object obj) {
        C83802r rVar = this.f325795a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || !rVar.mo77094d().mo56113h()) {
            return axVar;
        }
        C58833ax b = C92025g.m151033b((C50738bc) rVar.mo77094d().mo56107c());
        if (!b.mo56113h()) {
            return axVar;
        }
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        diVar.mo58885m(C50746bk.f132060c, (C50746bk) b.mo56107c());
        C50813dj djVar = (C50813dj) diVar.build();
        C50790cn cnVar = (C50790cn) ((C50818do) axVar.mo56107c()).toBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        djVar.getClass();
        doVar.f132329z = djVar;
        doVar.f132304a |= 33554432;
        return C58833ax.m90834k((C50818do) cnVar.build());
    }
}
