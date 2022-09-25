package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.l */
/* compiled from: PG */
final class C42066l implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C42064j f109957a;

    /* renamed from: b */
    final /* synthetic */ int f109958b;

    /* renamed from: c */
    final /* synthetic */ Chip f109959c;

    public C42066l(C42064j jVar, int i, Chip chip) {
        this.f109957a = jVar;
        this.f109958b = i;
        this.f109959c = chip;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Bitmap bitmap;
        Drawable drawable = (Drawable) obj;
        if (Log.isLoggable("ChipUtils", 3)) {
            Log.d("ChipUtils", "Resource loaded from Glide".concat(String.valueOf(String.valueOf(aVar))));
        }
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        C42068n nVar2 = new C42068n(bitmap);
        if (this.f109957a.f109950n.get() != this.f109958b) {
            return true;
        }
        this.f109959c.mo47694q(nVar2);
        return true;
    }
}
