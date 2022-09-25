package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.p3924c.C51739j;
import com.google.assistant.p3897e.p3921j.p3924c.C51740k;
import com.google.assistant.p3897e.p3921j.p3924c.C51741l;
import com.google.assistant.p3957l.p3964c.p3965a.p3966a.C52974b;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.m */
/* compiled from: PG */
public final /* synthetic */ class C36165m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36167o f94515a;

    /* renamed from: b */
    public final /* synthetic */ C51739j f94516b;

    public /* synthetic */ C36165m(C36167o oVar, C51739j jVar) {
        this.f94515a = oVar;
        this.f94516b = jVar;
    }

    public final Object apply(Object obj) {
        C36167o oVar = this.f94515a;
        C51739j jVar = this.f94516b;
        Void voidR = (Void) obj;
        oVar.f94521d.mo41705t("SUCCEEDED");
        C51740k kVar = (C51740k) C51741l.f135747c.createBuilder();
        String a = C52974b.m86764a(jVar.f135740c, Optional.empty());
        kVar.copyOnWrite();
        C51741l lVar = (C51741l) kVar.instance;
        lVar.f135749a |= 1;
        lVar.f135750b = a;
        return C36180b.m64577a("create_result", "assistant.api.client_op.productivity.CreateReminderOnDeviceResult", (C51741l) kVar.build());
    }
}
