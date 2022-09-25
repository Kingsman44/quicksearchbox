package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.e */
/* compiled from: PG */
public final /* synthetic */ class C114927e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114930h f318873a;

    public /* synthetic */ C114927e(C114930h hVar) {
        this.f318873a = hVar;
    }

    public final void onClick(View view) {
        C114930h hVar = this.f318873a;
        C114931i iVar = hVar.f318879d;
        int absoluteAdapterPosition = hVar.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition >= 0 && absoluteAdapterPosition < iVar.f318881b.size()) {
            iVar.f318881b.remove(absoluteAdapterPosition);
            iVar.notifyItemRemoved(absoluteAdapterPosition);
            iVar.mObservable.mo2881c(absoluteAdapterPosition, iVar.f318881b.size(), (Object) null);
        }
    }
}
