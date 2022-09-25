package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.DialogInterface;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.w */
/* compiled from: PG */
final class C10164w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C10166y f34550a;

    public C10164w(C10166y yVar) {
        this.f34550a = yVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10166y yVar = this.f34550a;
        ItemView itemView = yVar.f34561i;
        C10098ab abVar = yVar.f34554b.mo18289a().f34391b;
        if (abVar == null) {
            abVar = C10098ab.f34383d;
        }
        C10166y.m25028e(itemView, abVar);
    }
}
