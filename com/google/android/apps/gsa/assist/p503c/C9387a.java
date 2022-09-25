package com.google.android.apps.gsa.assist.p503c;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.c.a */
/* compiled from: PG */
public final class C9387a implements C9388a {

    /* renamed from: a */
    private static final C59071e f32550a = C59071e.m91332i("com.google.android.apps.gsa.assist.c.a");

    /* renamed from: b */
    private final C9394g f32551b;

    /* renamed from: c */
    private final ContentResolver f32552c;

    public C9387a(C9394g gVar, Context context) {
        this.f32551b = gVar;
        this.f32552c = context.getContentResolver();
    }

    /* renamed from: a */
    public final void mo17579a(boolean z) {
        int i = 1;
        if (true == z) {
            i = 3;
        }
        this.f32551b.mo17590b(i);
    }

    /* renamed from: b */
    public final void mo17580b() {
        C59104x d = f32550a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AndroidAssistOptInState");
        ((C59052c) ((C59052c) d).mo56372aa(178)).mo56386p("Opt-out command received but OS controls the setting in this build.");
        this.f32551b.mo17590b(-1);
    }

    /* renamed from: c */
    public final void mo17581c() {
        C59104x d = f32550a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AndroidAssistOptInState");
        ((C59052c) ((C59052c) d).mo56372aa(179)).mo56386p("Unset Assist opt-in was requested, but OS controls the setting in this build.");
        this.f32551b.mo17590b(0);
    }

    /* renamed from: d */
    public final boolean mo17582d() {
        int a = this.f32551b.mo17589a();
        return a > 0 && (a & 2) != 0;
    }

    /* renamed from: e */
    public final boolean mo17583e() {
        boolean z = true;
        if (Settings.Secure.getInt(this.f32552c, "assist_structure_enabled", 1) != 1) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: f */
    public final boolean mo17584f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo17585g() {
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }
}
