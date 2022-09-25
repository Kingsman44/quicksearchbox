package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.settings.shared.C73775r;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cs */
/* compiled from: PG */
public final /* synthetic */ class C73609cs implements C73775r {

    /* renamed from: a */
    public final /* synthetic */ du f194743a;

    public /* synthetic */ C73609cs(du duVar) {
        this.f194743a = duVar;
    }

    /* renamed from: a */
    public final void mo17878a(Drawable drawable) {
        ImageView imageView;
        ImageView imageView2;
        du duVar = this.f194743a;
        boolean z = Math.min(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth()) <= 32;
        if (z) {
            imageView = duVar.m;
        } else {
            imageView = duVar.n;
        }
        if (z) {
            imageView2 = duVar.n;
        } else {
            imageView2 = duVar.m;
        }
        C28292j a = C28295m.m52915a(imageView);
        a.getClass();
        a.mo33794h(2);
        C28292j a2 = C28295m.m52915a(imageView2);
        a2.getClass();
        a2.mo33794h(1);
        imageView.setVisibility(4);
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(drawable);
    }
}
