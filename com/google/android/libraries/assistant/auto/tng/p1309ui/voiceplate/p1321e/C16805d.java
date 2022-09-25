package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.logging.p2185ve.C28442l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.d */
/* compiled from: PG */
public final /* synthetic */ class C16805d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C16813l f49210a;

    /* renamed from: b */
    public final /* synthetic */ C16644i f49211b;

    /* renamed from: c */
    public final /* synthetic */ Optional f49212c;

    /* renamed from: d */
    public final /* synthetic */ C12991i f49213d;

    public /* synthetic */ C16805d(C16813l lVar, C16644i iVar, Optional optional, C12991i iVar2) {
        this.f49210a = lVar;
        this.f49211b = iVar;
        this.f49212c = optional;
        this.f49213d = iVar2;
    }

    public final void onClick(View view) {
        C16813l lVar = this.f49210a;
        C16644i iVar = this.f49211b;
        Optional optional = this.f49212c;
        C12991i iVar2 = this.f49213d;
        C16744be beVar = iVar.f48748h;
        if (beVar == null) {
            beVar = C16744be.f48963e;
        }
        C16770t tVar = beVar.f48966b;
        if (tVar == null) {
            tVar = C16770t.f49073f;
        }
        C16770t a = C16813l.m33843a(tVar, lVar.f49229d, view);
        lVar.f49230e.mo23050b(lVar.f49229d, optional, C28442l.m53142h().mo33894a());
        lVar.f49228c.mo20955d(C16813l.m33844b(a, iVar2));
    }
}
