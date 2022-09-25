package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.m */
/* compiled from: PG */
public class C79455m {

    /* renamed from: b */
    private static final C58974d f218132b = C58974d.m91136j();

    /* renamed from: a */
    public final AtomicBoolean f218133a = new AtomicBoolean(false);

    /* renamed from: c */
    private final C68214a f218134c;

    /* renamed from: d */
    private final C81013d f218135d;

    protected C79455m(C68214a aVar, C81013d dVar) {
        this.f218134c = aVar;
        this.f218135d = dVar;
    }

    /* renamed from: d */
    public void mo74053d(C10026c cVar) {
        getClass().getName();
        this.f218133a.set(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo74077e(C128461e eVar) {
        if (!eVar.mo108450d().equals(C128460d.START) || this.f218133a.get()) {
            ((C79456n) this.f218134c.mo27525b()).mo74030g(eVar);
            return;
        }
        ((C58970a) ((C58970a) f218132b.mo56226d()).mo56372aa(5621)).mo56389s("#MWW Context handler is not initialized, dropping context: %s", eVar);
        this.f218135d.mo74787c(eVar.mo108448b(), 5);
    }

    /* renamed from: f */
    public void mo74065f() {
        getClass().getName();
        this.f218133a.set(false);
    }
}
