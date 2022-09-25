package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p3055n.C39275ay;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.r */
/* compiled from: PG */
public final /* synthetic */ class C120878r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39275ay f336089a;

    /* renamed from: b */
    public final /* synthetic */ String f336090b;

    public /* synthetic */ C120878r(C39275ay ayVar, String str) {
        this.f336089a = ayVar;
        this.f336090b = str;
    }

    public final Object apply(Object obj) {
        C39275ay ayVar = this.f336089a;
        String str = this.f336090b;
        ayVar.mo41753a(str);
        ayVar.copyOnWrite();
        C39276az azVar = (C39276az) ayVar.instance;
        C39276az azVar2 = C39276az.f103456b;
        azVar.mo41754a();
        C62947c.addAll((Iterable) Collection.EL.stream((C58485gu) obj).distinct().filter(new C120868h(str)).collect(C58370cn.f155946a), (List) azVar.f103458a);
        return null;
    }
}
