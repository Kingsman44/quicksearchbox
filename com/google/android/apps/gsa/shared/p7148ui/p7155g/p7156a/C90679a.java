package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.gsa.shared.p7195y.C91188at;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.a */
/* compiled from: PG */
public final class C90679a {

    /* renamed from: a */
    private final C90682d f253575a;

    public C90679a(C90682d dVar) {
        this.f253575a = dVar;
    }

    /* renamed from: a */
    public final void mo84981a(Context context, ImageView imageView, String str, String str2) {
        Drawable drawable;
        if (!TextUtils.isEmpty(str)) {
            Resources resources = context.getResources();
            if (C90684f.f253600a == null) {
                C90684f.f253600a = resources.obtainTypedArray(R.array.letter_tile_colors);
                C90684f.f253601b = resources.getInteger(R.integer.letter_tile_colors_length);
                C90684f.f253602c = C1878d.m5128a(context, R.color.letter_tile_default_color);
            }
            drawable = new C90683e(context, resources, str, C90684f.m148052a(str));
        } else {
            drawable = C1877c.m5125a(context, R.drawable.product_logo_avatar_circle_blue_color_48);
        }
        if (TextUtils.isEmpty(str2) || !C90682d.m148049a(str2)) {
            imageView.setImageDrawable(drawable);
            return;
        }
        C90682d dVar = this.f253575a;
        if (C90682d.m148049a(str2)) {
            C91188at a = dVar.f253586c.mo85410a(context);
            a.f254570e.mo11962O(256, 256);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            dVar.f253585b.mo28211k(a.mo85426n(Uri.parse(str2), (C5593j) null), "LoadImageIntoImageView", new C90680b(imageView, context, atomicBoolean, drawable, str2));
            if (drawable != null) {
                dVar.f253585b.mo28212l("Set default image", new C90681c(atomicBoolean, imageView, drawable));
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawable);
    }
}
