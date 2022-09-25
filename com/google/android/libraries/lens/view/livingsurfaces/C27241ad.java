package com.google.android.libraries.lens.view.livingsurfaces;

import android.webkit.JavascriptInterface;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ad */
/* compiled from: PG */
final class C27241ad {

    /* renamed from: a */
    private final Executor f74516a;

    /* renamed from: b */
    private final C27245d f74517b;

    public C27241ad(Executor executor, C27245d dVar) {
        this.f74516a = executor;
        this.f74517b = dVar;
    }

    @JavascriptInterface
    public void onError(int i) {
        Executor executor = this.f74516a;
        C27245d dVar = this.f74517b;
        Objects.requireNonNull(dVar);
        executor.execute(new C27240ac(dVar));
        ((C58970a) ((C58970a) C27242ae.f74518a.mo56225c()).mo56372aa(49646)).mo56387q("Error playing YouTube Lens video (code: %d)", i);
    }

    @JavascriptInterface
    public void onReadyToShow() {
        Executor executor = this.f74516a;
        C27245d dVar = this.f74517b;
        Objects.requireNonNull(dVar);
        executor.execute(new C27238aa(dVar));
    }

    @JavascriptInterface
    public void onReadyToStart() {
        Executor executor = this.f74516a;
        C27245d dVar = this.f74517b;
        Objects.requireNonNull(dVar);
        executor.execute(new C27272z(dVar));
    }

    @JavascriptInterface
    public void onRestart() {
        Executor executor = this.f74516a;
        C27245d dVar = this.f74517b;
        Objects.requireNonNull(dVar);
        executor.execute(new C27239ab(dVar));
    }
}
