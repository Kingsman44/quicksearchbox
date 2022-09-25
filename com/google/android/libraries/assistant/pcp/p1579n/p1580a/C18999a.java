package com.google.android.libraries.assistant.pcp.p1579n.p1580a;

import com.google.assistant.p3803ag.p3809c.C49031dx;
import com.google.assistant.p3803ag.p3809c.C49122hg;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.n.a.a */
/* compiled from: PG */
public final /* synthetic */ class C18999a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18999a f53373a = new C18999a();

    private /* synthetic */ C18999a() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C19000b.f53374a.mo56226d()).mo56372aa(47518)).mo56386p("SYNC_DATA_RESPONSE is empty");
            return C58485gu.m89845m();
        }
        C49031dx dxVar = ((C49122hg) optional.get()).f127047b;
        if (dxVar == null) {
            dxVar = C49031dx.f126821b;
        }
        return dxVar.f126823a;
    }
}
