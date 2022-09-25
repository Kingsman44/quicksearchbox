package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C18748v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52854a;

    public /* synthetic */ C18748v(C18727ah ahVar) {
        this.f52854a = ahVar;
    }

    public final Object apply(Object obj) {
        C51058ev evVar;
        C18727ah ahVar = this.f52854a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return Optional.empty();
        }
        C18932l lVar = ahVar.f52810d;
        C51098gh ghVar = (C51098gh) axVar.mo56107c();
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        return lVar.mo24190a(evVar.f132944b);
    }
}
