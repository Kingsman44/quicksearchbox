package com.google.android.apps.search.transcription.p10670f.p10678g;

import android.content.AttributionSource;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionService;
import androidx.core.p094f.C1888a;
import com.google.android.apps.search.transcription.p10670f.C141786ae;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.transcription.f.g.am */
/* compiled from: PG */
public final class C141886am implements C141908u {

    /* renamed from: a */
    final /* synthetic */ RecognitionService.Callback f384997a;

    /* renamed from: b */
    final /* synthetic */ Intent f384998b;

    /* renamed from: c */
    final /* synthetic */ C141888ao f384999c;

    public C141886am(C141888ao aoVar, RecognitionService.Callback callback, Intent intent) {
        this.f384999c = aoVar;
        this.f384997a = callback;
        this.f384998b = intent;
    }

    /* renamed from: k */
    private static final void m230294k(C141887an anVar) {
        try {
            anVar.mo116865a();
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C141888ao.f385000a.mo56225c()).mo56382g(e)).mo56372aa(41951)).mo56384n();
        }
    }

    /* renamed from: a */
    public final AttributionSource mo20696a() {
        return this.f384997a.getCallingAttributionSource();
    }

    /* renamed from: b */
    public final void mo20697b() {
        RecognitionService.Callback callback = this.f384997a;
        Objects.requireNonNull(callback);
        m230294k(new C141883aj(callback));
    }

    /* renamed from: c */
    public final void mo20698c() {
        if (C141786ae.m230052f(this.f384998b) == null) {
            m230294k(new C141884ak(this.f384997a));
        } else if (C1888a.m5150d()) {
            RecognitionService.Callback callback = this.f384997a;
            Objects.requireNonNull(callback);
            m230294k(new C141885al(callback));
        }
        this.f384999c.f385001b.remove(this.f384997a);
    }

    /* renamed from: d */
    public final void mo20699d() {
        RecognitionService.Callback callback = this.f384997a;
        Objects.requireNonNull(callback);
        m230294k(new C141879af(callback));
    }

    /* renamed from: e */
    public final void mo20700e(int i) {
        m230294k(new C141876ac(this.f384997a, i));
        this.f384999c.f385001b.remove(this.f384997a);
    }

    /* renamed from: f */
    public final void mo20701f(Bundle bundle) {
        this.f384999c.mo116866a();
        m230294k(new C141877ad(this.f384997a, bundle));
    }

    /* renamed from: g */
    public final void mo20702g(Bundle bundle) {
        m230294k(new C141880ag(this.f384997a, bundle));
    }

    /* renamed from: h */
    public final void mo20703h(Bundle bundle) {
        this.f384999c.mo116866a();
        m230294k(new C141881ah(this.f384997a, bundle));
        this.f384999c.f385001b.remove(this.f384997a);
    }

    /* renamed from: i */
    public final void mo20704i(float f) {
        m230294k(new C141882ai(this.f384997a, f));
    }

    /* renamed from: j */
    public final void mo20705j(Bundle bundle) {
        this.f384999c.mo116866a();
        if (C141786ae.m230052f(this.f384998b) == null) {
            bundle.putBoolean("final_result", true);
            m230294k(new C141875ab(this.f384997a, bundle));
        } else if (C1888a.m5150d()) {
            m230294k(new C141878ae(this.f384997a, bundle));
        }
    }
}
