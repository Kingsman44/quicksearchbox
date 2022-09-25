package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.view.View;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.b */
/* compiled from: PG */
final class C107588b extends C107608s {

    /* renamed from: a */
    private final View f299307a;

    /* renamed from: b */
    private final C58833ax f299308b;

    /* renamed from: c */
    private final C28292j f299309c;

    /* renamed from: d */
    private final C58833ax f299310d;

    /* renamed from: e */
    private final C58833ax f299311e;

    public C107588b(View view, C58833ax axVar, C28292j jVar, C58833ax axVar2, C58833ax axVar3) {
        this.f299307a = view;
        this.f299308b = axVar;
        this.f299309c = jVar;
        this.f299310d = axVar2;
        this.f299311e = axVar3;
    }

    /* renamed from: a */
    public final View mo96048a() {
        return this.f299307a;
    }

    /* renamed from: b */
    public final C28292j mo96049b() {
        return this.f299309c;
    }

    /* renamed from: c */
    public final C58833ax mo96050c() {
        return this.f299310d;
    }

    /* renamed from: d */
    public final C58833ax mo96051d() {
        return this.f299308b;
    }

    /* renamed from: e */
    public final C58833ax mo96052e() {
        return this.f299311e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107608s) {
            C107608s sVar = (C107608s) obj;
            return this.f299307a.equals(sVar.mo96048a()) && this.f299308b.equals(sVar.mo96051d()) && this.f299309c.equals(sVar.mo96049b()) && this.f299310d.equals(sVar.mo96050c()) && this.f299311e.equals(sVar.mo96052e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f299307a.hashCode() ^ 1000003) * 1000003) ^ this.f299308b.hashCode()) * 1000003) ^ this.f299309c.hashCode()) * 1000003) ^ this.f299310d.hashCode()) * 1000003) ^ this.f299311e.hashCode();
    }

    public final String toString() {
        String obj = this.f299307a.toString();
        String valueOf = String.valueOf(this.f299308b);
        String obj2 = this.f299309c.toString();
        String valueOf2 = String.valueOf(this.f299310d);
        String valueOf3 = String.valueOf(this.f299311e);
        return "RichInputItem{contentView=" + obj + ", queryText=" + valueOf + ", ve=" + obj2 + ", opaImmersiveCanvasIntent=" + valueOf2 + ", zeroStateIntent=" + valueOf3 + "}";
    }
}
