package com.google.android.libraries.assistant.contexttrigger.impl;

import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.impl.C17768l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C17762f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17768l f51002a;

    /* renamed from: b */
    public final /* synthetic */ Intent f51003b;

    public /* synthetic */ C17762f(C17768l lVar, Intent intent) {
        this.f51002a = lVar;
        this.f51003b = intent;
    }

    public final C60870cx apply(Object obj) {
        C17768l lVar = this.f51002a;
        Intent intent = this.f51003b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return ((C17768l.C17769a) C47245e.m84045a(lVar.f51015d, C17768l.C17769a.class, (AccountId) axVar.mo56107c())).mo23459es().mo23439a(intent);
        }
        C59104x d = C17768l.f51012a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CtfBroadcastReceiver");
        ((C59052c) ((C59052c) d).mo56372aa(46993)).mo56386p("the account is not found");
        return C60866ct.f164955a;
    }
}
