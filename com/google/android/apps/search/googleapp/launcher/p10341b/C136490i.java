package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i */
/* compiled from: PG */
final class C136490i {

    /* renamed from: a */
    private final Context f371601a;

    /* renamed from: b */
    private final boolean f371602b;

    /* renamed from: c */
    private boolean f371603c = false;

    public C136490i(boolean z, Context context) {
        this.f371602b = z;
        this.f371601a = context;
    }

    /* renamed from: c */
    private final void m221804c(String str) {
        this.f371601a.sendOrderedBroadcast(new Intent(str).setPackage("com.google.android.googlequicksearchbox"), "android.permission.MANAGE_VOICE_KEYPHRASES");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo113085a() {
        if (this.f371602b) {
            C19559g.m37304c();
            if (!this.f371603c) {
                this.f371603c = true;
                m221804c("com.google.android.googlequicksearchbox.START_HOTWORD");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo113086b() {
        if (this.f371602b) {
            C19559g.m37304c();
            if (this.f371603c) {
                this.f371603c = false;
                m221804c("com.google.android.googlequicksearchbox.STOP_HOTWORD");
            }
        }
    }
}
