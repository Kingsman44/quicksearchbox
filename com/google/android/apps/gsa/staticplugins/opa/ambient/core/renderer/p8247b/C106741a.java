package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8247b;

import android.content.Context;
import android.view.View;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.search.shared.p6930h.C87570m;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.b.a */
/* compiled from: PG */
public final /* synthetic */ class C106741a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106742b f297464a;

    /* renamed from: b */
    public final /* synthetic */ Context f297465b;

    public /* synthetic */ C106741a(C106742b bVar, Context context) {
        this.f297464a = bVar;
        this.f297465b = context;
    }

    public final void onClick(View view) {
        C106742b bVar = this.f297464a;
        Context context = this.f297465b;
        bVar.f297467b.mo86710o(bVar.f297466a);
        boolean z = !C90772bp.m148281H(context);
        if (new C87570m(context, "content://com.android.settings.slices/action/zen_mode_toggle", (SliceView) null).mo81693e(z)) {
            bVar.mo95636c(z);
        }
    }
}
