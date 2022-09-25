package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8628b;

import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.b.a */
/* compiled from: PG */
public final /* synthetic */ class C114578a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f317802a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f317803b;

    public /* synthetic */ C114578a(C60870cx cxVar, C60870cx cxVar2) {
        this.f317802a = cxVar;
        this.f317803b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f317802a;
        C60870cx cxVar2 = this.f317803b;
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar = C33425t.OPA_STORE_ZEROSTATE_PROACTIVE_DATA_INTERNAL;
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        C33426u uVar2 = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar2 = C33425t.OPA_STORE_ZEROSTATE_CLIENT_RESPONSE;
        uVar2.copyOnWrite();
        C33427v vVar2 = (C33427v) uVar2.instance;
        vVar2.f89526b = tVar2.f89522p;
        vVar2.f89525a |= 1;
        try {
            C63088z byteString = ((C118365g) ((C58833ax) C60856cj.m92909r(cxVar)).mo56107c()).toByteString();
            uVar.copyOnWrite();
            C33427v vVar3 = (C33427v) uVar.instance;
            byteString.getClass();
            vVar3.f89525a |= 2;
            vVar3.f89527c = byteString;
        } catch (IllegalStateException | ExecutionException e) {
            String exc = e.toString();
            uVar.copyOnWrite();
            C33427v vVar4 = (C33427v) uVar.instance;
            exc.getClass();
            vVar4.f89525a |= 4;
            vVar4.f89528d = exc;
        }
        try {
            C63088z byteString2 = ((C53422nh) ((C58833ax) C60856cj.m92909r(cxVar2)).mo56107c()).toByteString();
            uVar2.copyOnWrite();
            C33427v vVar5 = (C33427v) uVar2.instance;
            byteString2.getClass();
            vVar5.f89525a |= 2;
            vVar5.f89527c = byteString2;
        } catch (IllegalStateException | ExecutionException e2) {
            String exc2 = e2.toString();
            uVar2.copyOnWrite();
            C33427v vVar6 = (C33427v) uVar2.instance;
            exc2.getClass();
            vVar6.f89525a |= 4;
            vVar6.f89528d = exc2;
        }
        return C58485gu.m89847o((C33427v) uVar.build(), (C33427v) uVar2.build());
    }
}
