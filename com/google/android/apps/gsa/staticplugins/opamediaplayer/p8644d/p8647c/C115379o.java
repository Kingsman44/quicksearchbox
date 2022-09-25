package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85342k;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85331i;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.o */
/* compiled from: PG */
public final /* synthetic */ class C115379o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52174hz f320152a;

    public /* synthetic */ C115379o(C52174hz hzVar) {
        this.f320152a = hzVar;
    }

    public final Object apply(Object obj) {
        C52174hz hzVar = this.f320152a;
        C85342k kVar = (C85342k) C85343l.f231127h.createBuilder();
        kVar.copyOnWrite();
        C85343l lVar = (C85343l) kVar.instance;
        lVar.f231129a |= 4;
        lVar.f231132d = "read_it_now_agsa";
        C119103al a = C85331i.m136799a(hzVar, true);
        kVar.copyOnWrite();
        C85343l lVar2 = (C85343l) kVar.instance;
        a.getClass();
        lVar2.f231130b = a;
        lVar2.f231129a |= 1;
        String str = (String) ((C58833ax) obj).mo56109e(BuildConfig.FLAVOR);
        kVar.copyOnWrite();
        C85343l lVar3 = (C85343l) kVar.instance;
        str.getClass();
        lVar3.f231129a |= 8;
        lVar3.f231133e = str;
        return (C85343l) kVar.build();
    }
}
