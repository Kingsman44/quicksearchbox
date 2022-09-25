package com.google.android.apps.gsa.staticplugins.accl.performers.p7343d;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35922br;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d.i */
/* compiled from: PG */
public final class C93065i extends C22538o {

    /* renamed from: a */
    private static final C59071e f259599a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.d.i");

    /* renamed from: b */
    private final C35922br f259600b;

    /* renamed from: c */
    private final KeyguardManager f259601c;

    public C93065i(Context context, C35922br brVar) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        keyguardManager.getClass();
        this.f259601c = keyguardManager;
        this.f259600b = brVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59071e eVar2 = f259599a;
        C59104x b = eVar2.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpenUrlWrapper");
        ((C59052c) ((C59052c) b).mo56372aa(13286)).mo56386p("#perform");
        if (!this.f259601c.isKeyguardLocked()) {
            return this.f259600b.mo20766a(dyVar);
        }
        C59104x d = eVar2.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpenUrlWrapper");
        ((C59052c) ((C59052c) d).mo56372aa(13287)).mo56389s("%s", "Screen is locked, op-op for open url.");
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.CANCELLED, "Screen is locked, op-op for open url."));
    }
}
