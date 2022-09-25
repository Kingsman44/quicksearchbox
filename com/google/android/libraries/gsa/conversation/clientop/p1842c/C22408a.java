package com.google.android.libraries.gsa.conversation.clientop.p1842c;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.c.a */
/* compiled from: PG */
public final class C22408a extends C22538o {

    /* renamed from: a */
    private final C22695ah f61905a;

    public C22408a(C22695ah ahVar) {
        this.f61905a = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("geo_actions.LAUNCH_DRIVING_MODE")) {
            C22695ah ahVar = this.f61905a;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity"));
            intent.setFlags(268435456);
            intent.putExtra("INTENT_TRIGGERING_SOURCE_KEY", C51474ja.QUERY.f134124v);
            ahVar.mo27807a(intent);
            return C60856cj.m92900i(C22402a.f61894b);
        }
        throw new C22428d(dyVar);
    }
}
