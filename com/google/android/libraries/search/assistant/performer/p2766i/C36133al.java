package com.google.android.libraries.search.assistant.performer.p2766i;

import android.net.Uri;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36186h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36187i;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.al */
/* compiled from: PG */
public final class C36133al implements C35472h {

    /* renamed from: a */
    public static final Uri f94472a = Uri.parse("clock-app://com.google.android.deskclock");

    /* renamed from: b */
    public final C36186h f94473b;

    public C36133al(C36187i iVar, C35470f fVar) {
        this.f94473b = iVar.mo40004a(fVar);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        return C36128ag.m64534b(dyVar, "alarm.REMOVE_ALARM", new C36132ak(this));
    }
}
