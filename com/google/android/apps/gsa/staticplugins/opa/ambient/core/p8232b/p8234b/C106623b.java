package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146597e;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C106623b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106623b f297264a = new C106623b();

    private /* synthetic */ C106623b() {
    }

    public final Object apply(Object obj) {
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar = C33425t.ON_DEVICE_MEDIA_APP_RECOMMENDATIONS;
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        C63088z byteString = ((C146597e) obj).toByteString();
        uVar.copyOnWrite();
        C33427v vVar2 = (C33427v) uVar.instance;
        byteString.getClass();
        vVar2.f89525a |= 2;
        vVar2.f89527c = byteString;
        return C58485gu.m89846n((C33427v) uVar.build());
    }
}
