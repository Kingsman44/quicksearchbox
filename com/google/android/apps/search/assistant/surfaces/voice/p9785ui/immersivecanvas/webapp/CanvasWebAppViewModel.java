package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import androidx.lifecycle.C2358bf;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127353a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129750e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.C129819a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.C129834j;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.contrib.androidx.p3696a.C47615b;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppViewModel */
/* compiled from: PG */
public final class CanvasWebAppViewModel extends C2358bf {

    /* renamed from: a */
    public final C129819a f356176a;

    /* renamed from: b */
    public boolean f356177b = false;

    /* renamed from: c */
    private final C129750e f356178c;

    /* renamed from: d */
    private final C127353a f356179d;

    /* renamed from: e */
    private final C47615b f356180e;

    public CanvasWebAppViewModel(C129819a aVar, C129750e eVar, C127353a aVar2, C47615b bVar) {
        this.f356176a = aVar;
        this.f356178c = eVar;
        this.f356179d = aVar2;
        this.f356180e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C47573bx a = this.f356180e.mo51503a();
        try {
            ((C129834j) this.f356176a).f356224e.mo23308c();
            this.f356178c.mo109227a();
            C127353a aVar = this.f356179d;
            ((C59052c) ((C59052c) C127353a.f350711a.mo56224b()).mo56372aa(37297)).mo56386p("Clearing CanvasStateStore.");
            aVar.f350712b.set(Optional.empty());
            this.f356177b = false;
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
