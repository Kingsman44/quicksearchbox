package com.google.android.apps.search.soundsearch.p10664h;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.search.soundsearch.p10656e.C141661a;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.audio.p4107b.p4108a.C54586i;

/* renamed from: com.google.android.apps.search.soundsearch.h.i */
/* compiled from: PG */
public final /* synthetic */ class C141713i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141714j f384623a;

    /* renamed from: b */
    public final /* synthetic */ C54586i f384624b;

    public /* synthetic */ C141713i(C141714j jVar, C54586i iVar) {
        this.f384623a = jVar;
        this.f384624b = iVar;
    }

    public final void onClick(View view) {
        C141714j jVar = this.f384623a;
        C54586i iVar = this.f384624b;
        jVar.f384627b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(jVar.f384629d));
        Intent a = C141661a.m229884a(iVar);
        if (C141661a.m229886c(jVar.f384626a, a)) {
            C47810es.m84979s(jVar.f384626a, a);
            return;
        }
        Intent b = C141661a.m229885b(iVar);
        if (b != null && C141661a.m229886c(jVar.f384626a, b)) {
            C47810es.m84979s(jVar.f384626a, b);
        }
    }
}
