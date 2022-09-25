package com.google.android.libraries.search.assistant.performer.permissions.impl;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.assistant.performer.permissions.impl.c */
/* compiled from: PG */
final class C36200c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C2164c f94573a;

    public C36200c(C2164c cVar) {
        this.f94573a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) DirectPermissionsRequesterImpl.f94562a.mo56225c()).mo56382g(th)).mo56372aa(52179)).mo56386p("failed permission request, can not start intent");
        this.f94573a.mo5437b(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59071e eVar = DirectPermissionsRequesterImpl.f94562a;
    }
}
