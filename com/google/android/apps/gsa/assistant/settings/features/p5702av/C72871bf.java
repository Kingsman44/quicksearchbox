package com.google.android.apps.gsa.assistant.settings.features.p5702av;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.av.bf */
/* compiled from: PG */
final class C72871bf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ba f193494a;

    public C72871bf(ba baVar) {
        this.f193494a = baVar;
    }

    public final void onClick(View view) {
        ba baVar = this.f193494a;
        aw awVar = baVar.a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52494c = baVar.e.b();
        awVar.startActivityForResult(c.mo24020b().mo24031a(), 0);
    }
}
