package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.view.WindowManager;
import com.google.android.libraries.p10982ad.C147445i;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.g */
/* compiled from: PG */
public final /* synthetic */ class C40135g implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C40137i f105418a;

    public /* synthetic */ C40135g(C40137i iVar) {
        this.f105418a = iVar;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C40137i iVar = this.f105418a;
        if (iVar.f105434o != 2) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) iVar.f105427h.getLayoutParams();
            layoutParams.x = ((int) iVar.f105431l.mo42220a().mo42347a()) - (iVar.f105427h.getWidth() / 2);
            layoutParams.y = ((int) iVar.f105431l.mo42220a().mo42348b()) - (iVar.f105427h.getHeight() / 2);
            iVar.f105428i.updateViewLayout(iVar.f105427h, layoutParams);
            iVar.f105430k.mo18517a();
        }
    }
}
