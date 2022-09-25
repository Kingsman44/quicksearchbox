package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.r */
/* compiled from: PG */
public final /* synthetic */ class C35772r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35778x f93710a;

    /* renamed from: b */
    public final /* synthetic */ C52289mf f93711b;

    /* renamed from: c */
    public final /* synthetic */ C35470f f93712c;

    public /* synthetic */ C35772r(C35778x xVar, C52289mf mfVar, C35470f fVar) {
        this.f93710a = xVar;
        this.f93711b = mfVar;
        this.f93712c = fVar;
    }

    public final C60870cx apply(Object obj) {
        C35778x xVar = this.f93710a;
        C52289mf mfVar = this.f93711b;
        C35470f fVar = this.f93712c;
        Intent intent = (Intent) obj;
        if (mfVar.f137268i) {
            intent.addFlags(C89885b.HTTP_VALUE);
        }
        if (xVar.mo39836e()) {
            xVar.mo39835d(mfVar);
        }
        ((C59052c) ((C59052c) C35778x.f93719a.mo56224b()).mo56372aa(51605)).mo56386p("real handle call");
        return C47633f.m84733g(fVar.mo20101f(intent)).mo51515h(new C35766l(xVar), C60826bg.f164896a).mo51513e(Exception.class, new C35767m(xVar), C60826bg.f164896a);
    }
}
