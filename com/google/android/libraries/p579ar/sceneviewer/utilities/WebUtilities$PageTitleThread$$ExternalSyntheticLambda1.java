package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.text.Spanned;
import com.google.android.libraries.p579ar.sceneviewer.utilities.WebUtilities;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.WebUtilities$PageTitleThread$$ExternalSyntheticLambda1 */
/* compiled from: PG */
public final /* synthetic */ class WebUtilities$PageTitleThread$$ExternalSyntheticLambda1 implements Runnable {
    public /* synthetic */ C10765d f$0;
    public /* synthetic */ Spanned f$1;

    public /* synthetic */ WebUtilities$PageTitleThread$$ExternalSyntheticLambda1(C10765d dVar, Spanned spanned) {
        this.f$0 = dVar;
        this.f$1 = spanned;
    }

    public final void run() {
        C10765d dVar = this.f$0;
        Spanned spanned = this.f$1;
        WebUtilities.PageTitleListener pageTitleListener = (WebUtilities.PageTitleListener) dVar.f35726a.get();
        if (pageTitleListener != null) {
            pageTitleListener.onPageTitleLoaded(spanned);
        }
    }
}
