package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0816c;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.streamui.RecoverableErrorIntentHandler;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134707e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ah */
/* compiled from: PG */
final class C134814ah implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C134904m f367057a;

    public C134814ah(C134904m mVar) {
        this.f367057a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C134707e eVar = (C134707e) bVar;
        C134904m mVar = this.f367057a;
        C69664n.m101061g(eVar, "event");
        RecoverableErrorIntentHandler recoverableErrorIntentHandler = mVar.f367267P;
        Intent intent = eVar.f366826a;
        C134228q qVar = eVar.f366827b;
        C69664n.m101061g(qVar, "refreshReason");
        if (recoverableErrorIntentHandler.f366800d != null) {
            C59052c cVar = (C59052c) RecoverableErrorIntentHandler.f366797a.mo56226d();
            cVar.mo56379ah(new C59094n(40461));
            cVar.mo56386p("launchIntent called while another intent is already in progress.");
        } else if (recoverableErrorIntentHandler.mo111889h()) {
            C0816c cVar2 = recoverableErrorIntentHandler.f366799c;
            if (cVar2 != null) {
                cVar2.mo526b(intent);
                recoverableErrorIntentHandler.f366800d = qVar;
            }
        } else {
            Context context = recoverableErrorIntentHandler.f366798b.getContext();
            if (context != null) {
                C47810es.m84979s(context, intent);
                recoverableErrorIntentHandler.f366800d = qVar;
            }
        }
        return C47392e.f123115a;
    }
}
