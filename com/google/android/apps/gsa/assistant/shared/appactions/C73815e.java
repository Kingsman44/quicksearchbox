package com.google.android.apps.gsa.assistant.shared.appactions;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.assistant.shared.appactions.e */
/* compiled from: PG */
public final /* synthetic */ class C73815e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChatBubbleDialogLayout f195122a;

    public /* synthetic */ C73815e(ChatBubbleDialogLayout chatBubbleDialogLayout) {
        this.f195122a = chatBubbleDialogLayout;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C73828m) this.f195122a.a.get()).mo18327g();
        dialogInterface.dismiss();
    }
}
