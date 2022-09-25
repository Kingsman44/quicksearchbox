package com.airbnb.lottie.p237b;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.p238c.C4894i;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.a */
/* compiled from: PG */
public final class C4839a {

    /* renamed from: a */
    public final C4894i f15410a = new C4894i();

    /* renamed from: b */
    public final Map f15411b = new HashMap();

    /* renamed from: c */
    public final Map f15412c = new HashMap();

    /* renamed from: d */
    public final AssetManager f15413d;

    /* renamed from: e */
    public final String f15414e = ".ttf";

    public C4839a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            ((C4946c) C4947d.f15711a).mo9784a("LottieDrawable must be inside of a view for images to work.", (Throwable) null);
            this.f15413d = null;
            return;
        }
        this.f15413d = ((View) callback).getContext().getAssets();
    }
}
