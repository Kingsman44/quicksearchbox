package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.logging.p2185ve.C28442l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.c */
/* compiled from: PG */
public final /* synthetic */ class C16804c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C16813l f49206a;

    /* renamed from: b */
    public final /* synthetic */ Optional f49207b;

    /* renamed from: c */
    public final /* synthetic */ C16656u f49208c;

    /* renamed from: d */
    public final /* synthetic */ C12991i f49209d;

    public /* synthetic */ C16804c(C16813l lVar, Optional optional, C16656u uVar, C12991i iVar) {
        this.f49206a = lVar;
        this.f49207b = optional;
        this.f49208c = uVar;
        this.f49209d = iVar;
    }

    public final void onClick(View view) {
        C16813l lVar = this.f49206a;
        Optional optional = this.f49207b;
        C16656u uVar = this.f49208c;
        C12991i iVar = this.f49209d;
        lVar.f49230e.mo23050b(lVar.f49229d, optional, C28442l.m53142h().mo33894a());
        C16782d dVar = lVar.f49228c;
        C16744be beVar = uVar.f48785e;
        if (beVar == null) {
            beVar = C16744be.f48963e;
        }
        C16770t tVar = beVar.f48966b;
        if (tVar == null) {
            tVar = C16770t.f49073f;
        }
        dVar.mo20955d(C16813l.m33844b(tVar, iVar));
    }
}
