package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.logging.p2185ve.C28442l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.e */
/* compiled from: PG */
public final /* synthetic */ class C16806e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C16813l f49214a;

    /* renamed from: b */
    public final /* synthetic */ C16646k f49215b;

    /* renamed from: c */
    public final /* synthetic */ Optional f49216c;

    /* renamed from: d */
    public final /* synthetic */ C12991i f49217d;

    public /* synthetic */ C16806e(C16813l lVar, C16646k kVar, Optional optional, C12991i iVar) {
        this.f49214a = lVar;
        this.f49215b = kVar;
        this.f49216c = optional;
        this.f49217d = iVar;
    }

    public final void onClick(View view) {
        C16813l lVar = this.f49214a;
        C16646k kVar = this.f49215b;
        Optional optional = this.f49216c;
        C12991i iVar = this.f49217d;
        C16744be beVar = kVar.f48757e;
        if (beVar == null) {
            beVar = C16744be.f48963e;
        }
        C16770t tVar = beVar.f48966b;
        if (tVar == null) {
            tVar = C16770t.f49073f;
        }
        C16770t a = C16813l.m33843a(tVar, lVar.f49229d, view);
        lVar.f49230e.mo23050b(lVar.f49229d, optional, C28442l.m53142h().mo33894a());
        lVar.f49228c.mo20955d(C16813l.m33844b(a, iVar));
    }
}
