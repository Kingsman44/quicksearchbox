package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.assistant.performer.p2728a.C35466b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.n */
/* compiled from: PG */
public final /* synthetic */ class C35768n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35778x f93704a;

    /* renamed from: b */
    public final /* synthetic */ C52289mf f93705b;

    /* renamed from: c */
    public final /* synthetic */ C35466b f93706c;

    public /* synthetic */ C35768n(C35778x xVar, C52289mf mfVar, C35466b bVar) {
        this.f93704a = xVar;
        this.f93705b = mfVar;
        this.f93706c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C35778x xVar = this.f93704a;
        C52289mf mfVar = this.f93705b;
        C35466b bVar = this.f93706c;
        Intent intent = (Intent) obj;
        if (mfVar.f137268i) {
            intent.addFlags(C89885b.HTTP_VALUE);
        }
        return C47633f.m84733g(bVar.mo39653g(intent)).mo51515h(new C35770p(xVar), C60826bg.f164896a).mo51513e(Exception.class, new C35771q(xVar), C60826bg.f164896a);
    }
}
