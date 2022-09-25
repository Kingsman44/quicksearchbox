package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.DialogInterface;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.m */
/* compiled from: PG */
public final /* synthetic */ class C10154m implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34536a;

    public /* synthetic */ C10154m(C10166y yVar) {
        this.f34536a = yVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C10166y yVar = this.f34536a;
        ItemView itemView = yVar.f34561i;
        C10098ab abVar = yVar.f34554b.mo18289a().f34391b;
        if (abVar == null) {
            abVar = C10098ab.f34383d;
        }
        C10166y.m25028e(itemView, abVar);
    }
}
