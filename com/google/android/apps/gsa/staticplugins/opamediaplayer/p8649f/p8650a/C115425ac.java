package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85329g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C115425ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f320248a;

    /* renamed from: b */
    public final /* synthetic */ C52174hz f320249b;

    public /* synthetic */ C115425ac(C86124t tVar, C52174hz hzVar) {
        this.f320248a = tVar;
        this.f320249b = hzVar;
    }

    public final Object apply(Object obj) {
        C52583xc xcVar;
        C86124t tVar = this.f320248a;
        String str = (String) obj;
        C52568wo woVar = this.f320249b.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52582xb a = C52582xb.m86658a(xcVar.f138076l);
        if (a == null) {
            a = C52582xb.UNKNOWN_TRIGGER_TYPE;
        }
        int size = C85329g.m136793a(tVar, str, C58833ax.m90834k(a)).size();
        boolean z = true;
        if (size <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
