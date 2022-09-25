package com.google.android.apps.search.transcription.p10679ui;

import android.view.View;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141812d;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141826r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.transcription.ui.o */
/* compiled from: PG */
public final /* synthetic */ class C141948o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141952s f385181a;

    public /* synthetic */ C141948o(C141952s sVar) {
        this.f385181a = sVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C141952s sVar = this.f385181a;
        C141826r rVar = (C141826r) sVar.f385187c.f384903c.get(Long.valueOf(sVar.f385190f.f384722b));
        if (rVar != null && (cxVar = rVar.f384892g) != null) {
            rVar.mo116790d("stop listening", C47638k.m84751b(cxVar).mo51520a(new C141812d(rVar), rVar.f384888c));
        }
    }
}
