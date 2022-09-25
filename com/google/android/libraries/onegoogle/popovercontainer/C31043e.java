package com.google.android.libraries.onegoogle.popovercontainer;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.e */
/* compiled from: PG */
public final /* synthetic */ class C31043e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExpandableDialogView f83630a;

    public /* synthetic */ C31043e(ExpandableDialogView expandableDialogView) {
        this.f83630a = expandableDialogView;
    }

    public final void run() {
        ExpandableDialogView expandableDialogView = this.f83630a;
        expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() & -17);
        if (!expandableDialogView.mo36700l()) {
            expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() | 16);
        }
        expandableDialogView.mo36699k();
    }
}
