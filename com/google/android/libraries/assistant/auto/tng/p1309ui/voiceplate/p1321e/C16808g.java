package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.logging.p2185ve.C28442l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.g */
/* compiled from: PG */
public final /* synthetic */ class C16808g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C16813l f49219a;

    /* renamed from: b */
    public final /* synthetic */ Optional f49220b;

    /* renamed from: c */
    public final /* synthetic */ C16658w f49221c;

    /* renamed from: d */
    public final /* synthetic */ C12991i f49222d;

    public /* synthetic */ C16808g(C16813l lVar, Optional optional, C16658w wVar, C12991i iVar) {
        this.f49219a = lVar;
        this.f49220b = optional;
        this.f49221c = wVar;
        this.f49222d = iVar;
    }

    public final void onClick(View view) {
        C16813l lVar = this.f49219a;
        Optional optional = this.f49220b;
        C16658w wVar = this.f49221c;
        C12991i iVar = this.f49222d;
        lVar.f49230e.mo23050b(lVar.f49229d, optional, C28442l.m53142h().mo33894a());
        C16782d dVar = lVar.f49228c;
        C16744be beVar = wVar.f48792d;
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
