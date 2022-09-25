package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.chime.googlefeedback.InvokeSendFeedbackActivity;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56990z;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.f */
/* compiled from: PG */
public final class C97675f implements C97671b {

    /* renamed from: a */
    private final Context f272768a;

    public C97675f(Context context) {
        this.f272768a = context;
    }

    /* renamed from: a */
    public final Intent mo90789a(C29827r rVar, C56975k kVar) {
        C56990z zVar;
        Intent addFlags = new Intent().setClass(this.f272768a, InvokeSendFeedbackActivity.class).addFlags(65536);
        if (kVar.f152093b == 7) {
            zVar = (C56990z) kVar.f152094c;
        } else {
            zVar = C56990z.f152131b;
        }
        ProtoParsers.m95531n(addFlags, "staticplugin_chime_googlefeedback", zVar);
        return addFlags;
    }
}
