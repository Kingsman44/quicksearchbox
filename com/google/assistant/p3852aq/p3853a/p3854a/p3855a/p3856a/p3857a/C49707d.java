package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.d */
/* compiled from: PG */
final class C49707d implements C2166e {

    /* renamed from: a */
    final /* synthetic */ Intent f128283a;

    /* renamed from: b */
    final /* synthetic */ C49710g f128284b;

    public C49707d(C49710g gVar, Intent intent) {
        this.f128284b = gVar;
        this.f128283a = intent;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        if (this.f128284b.f128293g.checkCallingOrSelfPermission("com.google.android.apps.nest.CAST_AUTH_SERVICE") == 0) {
            C49710g gVar = this.f128284b;
            gVar.f128293g.bindService(this.f128283a, 1, gVar.f128290d, new C49708e(cVar));
            return "Waiting for service binding";
        }
        ((C59052c) ((C59052c) C49710g.f128287a.mo56225c()).mo56372aa(54853)).mo56386p("Do not have permission for bind CastAuthContentService.");
        cVar.mo5439d(new SecurityException("Do not have permission for bind CastAuthContentService."));
        return "Waiting for service binding";
    }
}
