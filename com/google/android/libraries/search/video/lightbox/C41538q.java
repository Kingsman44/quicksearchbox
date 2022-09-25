package com.google.android.libraries.search.video.lightbox;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;

/* renamed from: com.google.android.libraries.search.video.lightbox.q */
/* compiled from: PG */
final class C41538q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C41539r f108556a;

    public C41538q(C41539r rVar) {
        this.f108556a = rVar;
    }

    public final void onClick(View view) {
        this.f108556a.f108562f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C57194y yVar = this.f108556a.f108559c.f152648b;
        if (yVar == null) {
            yVar = C57194y.f152692i;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(yVar.f152699f));
        this.f108556a.mo44062d(12);
        C47709i.m84861a(this.f108556a.f108560d, intent);
    }
}
