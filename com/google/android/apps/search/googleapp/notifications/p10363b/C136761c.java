package com.google.android.apps.search.googleapp.notifications.p10363b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.notifications.feedback.InvokeSendFeedbackActivity;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56990z;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.b.c */
/* compiled from: PG */
public final class C136761c implements C136760b {

    /* renamed from: a */
    private final Context f372290a;

    public C136761c(Context context) {
        C69664n.m101061g(context, "context");
        this.f372290a = context;
    }

    /* renamed from: a */
    public final Intent mo113353a(C29827r rVar, C56975k kVar) {
        C56990z zVar;
        C69664n.m101061g(rVar, "chimethread");
        C69664n.m101061g(kVar, "chimeAction");
        Intent addFlags = new Intent().setClass(this.f372290a, InvokeSendFeedbackActivity.class).addFlags(65536);
        C69664n.m101060f(addFlags, "Intent()\n        .setCla…AG_ACTIVITY_NO_ANIMATION)");
        if (kVar.f152093b == 7) {
            zVar = (C56990z) kVar.f152094c;
        } else {
            zVar = C56990z.f152131b;
        }
        ProtoParsers.m95531n(addFlags, "googleapp_notifications_googlefeedback", zVar);
        return addFlags;
    }
}
