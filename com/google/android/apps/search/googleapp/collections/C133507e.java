package com.google.android.apps.search.googleapp.collections;

import android.content.DialogInterface;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;

/* renamed from: com.google.android.apps.search.googleapp.collections.e */
/* compiled from: PG */
final class C133507e implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C133510h f363775a;

    public C133507e(C133510h hVar) {
        this.f363775a = hVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C133505c cVar = this.f363775a.f363778a;
        DialogVisualElements.m53173a(cVar, cVar.requireDialog(), new C133506d(this.f363775a));
    }
}
