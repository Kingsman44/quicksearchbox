package com.google.android.apps.gsa.staticplugins.p7391an.p7395d;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.d.b */
/* compiled from: PG */
public final class C93971b implements C93968a {

    /* renamed from: a */
    private final C23112h f262442a;

    public C93971b(C23112h hVar) {
        this.f262442a = hVar;
    }

    /* renamed from: e */
    public final void mo88250e() {
        this.f262442a.mo28345s("doodleSearch", "DoodleHeaderEventsDispatcher", new Bundle());
    }

    /* renamed from: f */
    public final void mo88251f(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("doodleVisible", Boolean.valueOf(z).booleanValue());
        this.f262442a.mo28345s("onDoodleViewSwitched_boolean", "DoodleHeaderEventsDispatcher", bundle);
    }

    /* renamed from: h */
    public final void mo88252h() {
        this.f262442a.mo28345s("openDoodle", "DoodleHeaderEventsDispatcher", new Bundle());
    }

    /* renamed from: i */
    public final void mo88253i() {
        this.f262442a.mo28345s("showTooltipOnScroll", "DoodleHeaderEventsDispatcher", new Bundle());
    }
}
