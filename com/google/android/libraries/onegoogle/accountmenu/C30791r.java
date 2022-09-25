package com.google.android.libraries.onegoogle.accountmenu;

import android.widget.ImageView;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.r */
/* compiled from: PG */
public final /* synthetic */ class C30791r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30799z f83094a;

    /* renamed from: b */
    public final /* synthetic */ boolean f83095b;

    public /* synthetic */ C30791r(C30799z zVar, boolean z) {
        this.f83094a = zVar;
        this.f83095b = z;
    }

    public final void run() {
        C30799z zVar = this.f83094a;
        boolean z = this.f83095b;
        SelectedAccountDisc selectedAccountDisc = zVar.f83106b;
        int i = 0;
        selectedAccountDisc.f81902c.setVisibility(true != z ? 0 : 8);
        ImageView imageView = selectedAccountDisc.f81901b;
        if (true != z) {
            i = 8;
        }
        imageView.setVisibility(i);
        zVar.mo36484c();
    }
}
