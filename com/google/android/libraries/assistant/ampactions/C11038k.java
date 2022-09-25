package com.google.android.libraries.assistant.ampactions;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;

/* renamed from: com.google.android.libraries.assistant.ampactions.k */
/* compiled from: PG */
public final class C11038k extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C11039l f36253a;

    public C11038k(C11039l lVar) {
        this.f36253a = lVar;
    }

    public final void onHideCustomView() {
        super.onHideCustomView();
        C11039l lVar = this.f36253a;
        if (lVar.f36257d != null) {
            WindowManager.LayoutParams attributes = ((Activity) lVar.getContext()).getWindow().getAttributes();
            attributes.flags &= -1025;
            attributes.flags &= -129;
            ((Activity) this.f36253a.getContext()).getWindow().setAttributes(attributes);
            this.f36253a.f36258e.setVisibility(0);
            this.f36253a.f36255b.setVisibility(0);
            this.f36253a.f36259f.setVisibility(8);
            this.f36253a.f36257d.setVisibility(8);
            C11039l lVar2 = this.f36253a;
            lVar2.f36259f.removeView(lVar2.f36257d);
            this.f36253a.f36256c.onCustomViewHidden();
            this.f36253a.f36257d = null;
        }
    }

    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C11039l lVar = this.f36253a;
        if (lVar.f36257d != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        lVar.f36257d = view;
        lVar.f36258e.setVisibility(8);
        this.f36253a.f36255b.setVisibility(8);
        this.f36253a.f36259f.setVisibility(0);
        WindowManager.LayoutParams attributes = ((Activity) this.f36253a.getContext()).getWindow().getAttributes();
        attributes.flags |= 1024;
        attributes.flags |= 128;
        ((Activity) this.f36253a.getContext()).getWindow().setAttributes(attributes);
        this.f36253a.f36259f.addView(view, new ViewGroup.LayoutParams(-1, -1));
        this.f36253a.f36256c = customViewCallback;
    }
}
