package com.airbnb.lottie.p237b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.C4826ad;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.b */
/* compiled from: PG */
public final class C4840b {

    /* renamed from: d */
    private static final Object f15415d = new Object();

    /* renamed from: a */
    public final Context f15416a;

    /* renamed from: b */
    public final String f15417b;

    /* renamed from: c */
    public final Map f15418c;

    public C4840b(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f15417b = str;
        } else {
            this.f15417b = String.valueOf(str).concat("/");
        }
        if (!(callback instanceof View)) {
            ((C4946c) C4947d.f15711a).mo9784a("LottieDrawable must be inside of a view for images to work.", (Throwable) null);
            this.f15418c = new HashMap();
            this.f15416a = null;
            return;
        }
        this.f15416a = ((View) callback).getContext();
        this.f15418c = map;
    }

    /* renamed from: a */
    public final void mo9796a(String str, Bitmap bitmap) {
        synchronized (f15415d) {
            ((C4826ad) this.f15418c.get(str)).f15361e = bitmap;
        }
    }
}
