package com.google.android.libraries.search.assistant.invocation.p2651n.p2653b;

import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33974a;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33995l;
import com.google.common.base.C58810aa;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.b.a */
/* compiled from: PG */
class C33977a extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C33974a aVar = (C33974a) obj;
        C33995l lVar = C33995l.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return C33995l.UNKNOWN;
        }
        if (ordinal == 1) {
            return C33995l.VOICE_INTERACTION_SERVICE_NOT_RUNNING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aVar.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C33995l lVar = (C33995l) obj;
        C33974a aVar = C33974a.UNKNOWN;
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            return C33974a.UNKNOWN;
        }
        if (ordinal == 1) {
            return C33974a.VOICE_INTERACTION_SERVICE_NOT_RUNNING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(lVar.getNumber())));
    }
}
