package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130305c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.l */
/* compiled from: PG */
final class C130292l implements C130305c {

    /* renamed from: a */
    final /* synthetic */ C130293m f357148a;

    public C130292l(C130293m mVar) {
        this.f357148a = mVar;
    }

    /* renamed from: a */
    public final void mo109504a(String str, C51655m mVar) {
        C130293m mVar2 = this.f357148a;
        mVar2.f357157i = true;
        TextView a = C130293m.m212719a(mVar2.f357150b);
        this.f357148a.f357155g.mo108811c(a);
        this.f357148a.f357153e.mo109484a(str, Optional.m71637of(mVar));
        C47393f.m84237h(new C130303a(str), a);
    }
}
