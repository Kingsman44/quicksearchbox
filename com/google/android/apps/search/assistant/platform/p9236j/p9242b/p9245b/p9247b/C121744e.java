package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b;

import android.media.AudioManager;
import com.google.android.libraries.search.p2904c.C37325aa;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.b.e */
/* compiled from: PG */
public final class C121744e implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final C37325aa f337826a;

    /* renamed from: b */
    final /* synthetic */ C121749j f337827b;

    public C121744e(C121749j jVar, C37325aa aaVar) {
        this.f337827b = jVar;
        this.f337826a = aaVar;
    }

    public final void onAudioFocusChange(int i) {
        C121749j jVar = this.f337827b;
        C71803m.m105043d(jVar.f337849b, (C69585o) null, (C71424ay) null, new C121743d(jVar, this, i, (C69577g) null), 3);
    }
}
