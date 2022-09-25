package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p872e.p873a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15487m;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.common.base.C58833ax;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.e.a.b */
/* compiled from: PG */
public final class C12959b {
    /* renamed from: a */
    public static C15474b m29196a(C15474b bVar, C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return bVar;
        }
        C15471a aVar = (C15471a) bVar.toBuilder();
        aVar.mo22359a(C15487m.m32219b((Throwable) axVar.mo56107c()));
        return (C15474b) aVar.build();
    }

    /* renamed from: b */
    public static C62722b m29197b(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C62722b.UNKNOWN;
        }
        Throwable th = (Throwable) axVar.mo56107c();
        if (th instanceof TimeoutException) {
            return C62722b.DEADLINE_EXCEEDED;
        }
        if ((th instanceof IllegalArgumentException) || (th instanceof NullPointerException)) {
            return C62722b.INVALID_ARGUMENT;
        }
        return C62722b.UNKNOWN;
    }
}
