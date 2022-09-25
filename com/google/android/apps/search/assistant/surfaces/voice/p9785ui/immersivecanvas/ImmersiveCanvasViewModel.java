package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import androidx.lifecycle.C2358bf;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129722e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129746a;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.contrib.androidx.p3696a.C47615b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.ImmersiveCanvasViewModel */
/* compiled from: PG */
public final class ImmersiveCanvasViewModel extends C2358bf {

    /* renamed from: b */
    private static final C59071e f355931b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.ImmersiveCanvasViewModel");

    /* renamed from: a */
    public boolean f355932a;

    /* renamed from: c */
    private final C129746a f355933c;

    /* renamed from: d */
    private final C47615b f355934d;

    /* renamed from: e */
    private final C129722e f355935e;

    public ImmersiveCanvasViewModel(C129722e eVar, C129746a aVar, C47615b bVar) {
        this.f355935e = eVar;
        this.f355933c = aVar;
        this.f355934d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C47573bx a = this.f355934d.mo51503a();
        try {
            ((C59052c) ((C59052c) f355931b.mo56224b()).mo56372aa(38427)).mo56386p("Stopping CMM on ViewModel cleared");
            this.f355935e.mo109206a();
            this.f355933c.mo109221a();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
