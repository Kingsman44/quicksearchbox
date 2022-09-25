package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1174a.p1175a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16387w;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.assistant.p3994s.p3995a.C53063a;
import com.google.assistant.p3994s.p3995a.C53090b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15787a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C15787a f47020a = new C15787a();

    private /* synthetic */ C15787a() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C53063a aVar = (C53063a) C53090b.f139119c.createBuilder();
        if (axVar.mo56113h()) {
            C16389y a = C16389y.m33345a(((C16387w) axVar.mo56107c()).f48232a);
            if (a == null) {
                a = C16389y.DRIVE_STATUS_UNKNOWN;
            }
            aVar.copyOnWrite();
            C53090b bVar = (C53090b) aVar.instance;
            bVar.f139122b = a.f48241f;
            bVar.f139121a |= 1;
        }
        return (C53090b) aVar.build();
    }
}
