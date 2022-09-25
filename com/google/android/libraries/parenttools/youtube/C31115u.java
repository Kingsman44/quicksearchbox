package com.google.android.libraries.parenttools.youtube;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4827ae;
import com.airbnb.lottie.C4964k;

/* renamed from: com.google.android.libraries.parenttools.youtube.u */
/* compiled from: PG */
public final /* synthetic */ class C31115u implements C4827ae {

    /* renamed from: a */
    public final /* synthetic */ ImageView f83812a;

    public /* synthetic */ C31115u(ImageView imageView) {
        this.f83812a = imageView;
    }

    /* renamed from: a */
    public final void mo9783a(Object obj) {
        ImageView imageView = this.f83812a;
        C4825ac acVar = new C4825ac();
        acVar.setCallback(imageView);
        acVar.mo9775l((C4964k) obj);
        acVar.f15342b.setRepeatCount(-1);
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(acVar);
        acVar.start();
    }
}
