package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.google.apps.tiktok.inject.p3657c.C47215a;

/* renamed from: com.google.apps.tiktok.account.api.controller.f */
/* compiled from: PG */
public final class C46032f implements C46041i {

    /* renamed from: a */
    private final C0167am f120886a;

    /* renamed from: b */
    private final C47215a f120887b;

    /* renamed from: c */
    private C0816c f120888c;

    /* renamed from: d */
    private C0816c f120889d;

    public C46032f(C0167am amVar, C47215a aVar) {
        this.f120886a = amVar;
        this.f120887b = aVar;
    }

    /* renamed from: a */
    public final Intent mo50167a() {
        return this.f120886a.getIntent();
    }

    /* renamed from: b */
    public final C0816c mo50168b() {
        return this.f120889d;
    }

    /* renamed from: c */
    public final C0816c mo50169c() {
        return this.f120888c;
    }

    /* renamed from: d */
    public final void mo50170d(C0815b bVar, C0815b bVar2) {
        C0167am amVar = this.f120886a;
        this.f120888c = amVar.mo3336s(new C0813f(), amVar.f2708i, bVar);
        C0167am amVar2 = this.f120886a;
        this.f120889d = amVar2.mo3336s(new C0813f(), amVar2.f2708i, bVar2);
    }

    /* renamed from: e */
    public final void mo50171e(Intent intent) {
        this.f120886a.setIntent(intent);
    }

    /* renamed from: f */
    public final boolean mo50172f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo50173g() {
        return this.f120886a.isChangingConfigurations();
    }

    /* renamed from: h */
    public final boolean mo50174h() {
        return this.f120886a.isFinishing();
    }

    /* renamed from: i */
    public final boolean mo50175i() {
        return this.f120887b.mo51122q().mo461ab();
    }
}
