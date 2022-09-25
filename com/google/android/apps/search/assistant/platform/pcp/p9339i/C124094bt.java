package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bt */
/* compiled from: PG */
public final /* synthetic */ class C124094bt implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124099by f342742a;

    /* renamed from: b */
    public final /* synthetic */ String f342743b;

    /* renamed from: c */
    public final /* synthetic */ C53422nh f342744c;

    /* renamed from: d */
    public final /* synthetic */ C57017i f342745d;

    public /* synthetic */ C124094bt(C124099by byVar, String str, C53422nh nhVar, C57017i iVar) {
        this.f342742a = byVar;
        this.f342743b = str;
        this.f342744c = nhVar;
        this.f342745d = iVar;
    }

    public final C60870cx apply(Object obj) {
        C124099by byVar = this.f342742a;
        String str = this.f342743b;
        C53422nh nhVar = this.f342744c;
        C57017i iVar = this.f342745d;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(new C124096bv(str)).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C60866ct.f164955a;
        }
        return byVar.mo106281a(nhVar, iVar, ((C46108a) guVar.get(0)).mo50209a());
    }
}
