package com.google.android.libraries.search.video.p3196f;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57147d;

/* renamed from: com.google.android.libraries.search.video.f.b */
/* compiled from: PG */
public final /* synthetic */ class C41508b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41511e f108433a;

    /* renamed from: b */
    public final /* synthetic */ C57143b f108434b;

    public /* synthetic */ C41508b(C41511e eVar, C57143b bVar) {
        this.f108433a = eVar;
        this.f108434b = bVar;
    }

    public final void onClick(View view) {
        C41511e eVar = this.f108433a;
        C47709i.m84861a(eVar.f108444h, new Intent("android.intent.action.VIEW", Uri.parse(((C57147d) this.f108434b.f152535f.get(0)).f152563b)));
        C41510d dVar = eVar.f108446j;
        if (dVar != null) {
            C41517k kVar = (C41517k) dVar;
            if (kVar.f108461A != null) {
                C28443m mVar = kVar.f108474g;
                C28442l a = C28442l.m53142h().mo33894a();
                C28439i iVar = kVar.f108461A;
                iVar.getClass();
                mVar.mo33853c(a, iVar);
            }
        }
    }
}
