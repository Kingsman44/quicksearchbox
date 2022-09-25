package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ae */
/* compiled from: PG */
public final /* synthetic */ class C136047ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136053ak f370507a;

    public /* synthetic */ C136047ae(C136053ak akVar) {
        this.f370507a = akVar;
    }

    public final void accept(Object obj) {
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.f370507a.f370522j;
        lockableBottomSheetBehavior.f370625c = lockableBottomSheetBehavior.mo47504A() + ((C135767j) obj).f369810d.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_peekheight_googleoncontent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
