package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import androidx.lifecycle.C2358bf;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.C121181d;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17517t;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.TtsPlayerViewModel */
/* compiled from: PG */
public final class TtsPlayerViewModel extends C2358bf {

    /* renamed from: a */
    public final C71422aw f354634a;

    /* renamed from: b */
    public final C69585o f354635b;

    /* renamed from: c */
    public final C60870cx f354636c;

    /* renamed from: d */
    public final AtomicReference f354637d = new AtomicReference((Object) null);

    /* renamed from: e */
    public final C17361a f354638e;

    public TtsPlayerViewModel(C121181d dVar, C71422aw awVar, C69585o oVar, C17362b bVar) {
        C69664n.m101061g(awVar, "coroutineScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f354634a = awVar;
        this.f354635b = oVar;
        this.f354636c = dVar.mo105070a();
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17517t tVar = (C17517t) C17518u.f50532a.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        a.mo23377c(C69664n.m101061g(tVar, "builder").mo23378a());
        this.f354638e = bVar.mo23309a(a.mo23375a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C71643cp cpVar = (C71643cp) this.f354637d.get();
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
    }
}
