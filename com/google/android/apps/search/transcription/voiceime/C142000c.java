package com.google.android.apps.search.transcription.voiceime;

import android.view.GestureDetector;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47769dg;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.transcription.voiceime.c */
/* compiled from: PG */
public final class C142000c {

    /* renamed from: a */
    public final C141993bd f385308a;

    /* renamed from: b */
    public final C47770dh f385309b;

    /* renamed from: c */
    public final GestureDetector f385310c;

    /* renamed from: d */
    private final C141989b f385311d;

    /* renamed from: e */
    private final AtomicReference f385312e = new AtomicReference((Object) null);

    public C142000c(C141993bd bdVar, BackspaceView backspaceView, C47274n nVar, C47770dh dhVar) {
        C141989b bVar = new C141989b(this);
        this.f385311d = bVar;
        this.f385308a = bdVar;
        this.f385309b = dhVar;
        this.f385310c = new GestureDetector(nVar, new C47769dg(dhVar, bVar, bVar));
        backspaceView.setOnTouchListener(new C141957a(this));
    }

    /* renamed from: a */
    public final void mo116959a(C60870cx cxVar) {
        C60870cx cxVar2 = (C60870cx) this.f385312e.getAndSet(cxVar);
        if (cxVar2 != null) {
            cxVar2.cancel(false);
        }
    }
}
