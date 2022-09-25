package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.apps.tiktok.p3674l.p3675a.C47361e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.j */
/* compiled from: PG */
final class C102210j implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C102209i f285204a;

    public C102210j(C102209i iVar) {
        this.f285204a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        Bundle bundle;
        C47361e eVar = (C47361e) bVar;
        C102209i iVar = this.f285204a;
        C101765e eVar2 = new C101765e();
        eVar2.mo92562b(2);
        Bundle arguments = iVar.f285201b.getArguments();
        Intent intent = null;
        if (!(arguments == null || (bundle = arguments.getBundle("ERROR_RESULT_CONTAINER")) == null)) {
            intent = new Intent();
            intent.putExtras(bundle);
        }
        eVar2.f283865a = intent;
        C47393f.m84235f(eVar2.mo92561a(), iVar.f285201b);
        return C47392e.f123115a;
    }
}
