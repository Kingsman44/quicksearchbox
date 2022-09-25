package com.google.android.libraries.elements.p1728g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p299c.p300a.C5873v;
import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import com.google.android.libraries.elements.p1705a.p1706a.C20682f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.elements.g.w */
/* compiled from: PG */
public final class C21195w {
    /* renamed from: a */
    static Uri m39828a(String str) {
        Uri parse = Uri.parse(str);
        return C58837ba.m90859h(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    /* renamed from: b */
    public static ImageView.ScaleType m39829b(ContentMode contentMode) {
        ContentMode contentMode2 = ContentMode.CONTENT_MODE_UNKNOWN;
        int ordinal = contentMode.ordinal();
        if (ordinal == 2) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* renamed from: c */
    static C6007z m39830c(Context context, ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3, int i, int i2, boolean z) {
        C5873v vVar;
        ImageSourceProxy imageSourceProxy;
        Context context2 = context;
        ImageProxy imageProxy4 = imageProxy2;
        ImageProxy imageProxy5 = imageProxy3;
        if (m39831d(context)) {
            return null;
        }
        C20682f fVar = (C20682f) imageProxy;
        boolean z2 = true;
        C6007z g = (!fVar.f57966b.isEmpty() || fVar.f57965a.mo60123h() == null) ? null : C5543d.m14323c(context).mo12423b(context).mo11869g(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
        if (g == null) {
            C58838bb.m90868c(i >= 0);
            if (i2 < 0) {
                z2 = false;
            }
            C58838bb.m90868c(z2);
            if (imageProxy == null || fVar.f57966b.isEmpty()) {
                imageSourceProxy = null;
            } else {
                ArrayList arrayList = fVar.f57966b;
                int size = arrayList.size();
                imageSourceProxy = null;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    ImageSourceProxy imageSourceProxy2 = (ImageSourceProxy) arrayList.get(i4);
                    if (imageSourceProxy2 != null) {
                        int width = i - ((int) imageSourceProxy2.width());
                        int height = i2 - ((int) imageSourceProxy2.height());
                        int i5 = (width * width) + (height * height);
                        if (imageSourceProxy == null || i5 < i3) {
                            imageSourceProxy = imageSourceProxy2;
                            i3 = i5;
                        }
                    }
                }
            }
            g = (imageSourceProxy == null || TextUtils.isEmpty(imageSourceProxy.url())) ? null : C5543d.m14323c(context).mo12423b(context).mo11865c().mo12445g(m39828a(imageSourceProxy.url()));
        }
        if (g == null) {
            int a = C21174b.m39767a(context, imageProxy);
            if (a == 0) {
                g = null;
            } else {
                g = C5543d.m14323c(context).mo12423b(context).mo11871i(Integer.valueOf(a));
            }
        }
        if (g == null) {
            C58833ax b = C21194v.m39827b(imageProxy);
            g = b.mo56113h() ? C5543d.m14323c(context).mo12423b(context).mo11874l((byte[]) b.mo56107c()) : null;
        }
        if (g == null) {
            if (imageProxy5 == null) {
                return null;
            }
            g = C5543d.m14323c(context).mo12423b(context).mo11872j((Object) null);
        }
        if (imageProxy.contentMode() == ContentMode.CONTENT_MODE_CENTER) {
            if (!z || !C21174b.m39768b(context, imageProxy)) {
                g.mo11989z(C5731x.f17284c);
            }
            g.mo11962O(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        } else {
            if (imageProxy.contentMode().ordinal() != 2) {
                vVar = C5873v.f17472c;
            } else {
                vVar = C5873v.f17471b;
            }
            g.mo11949B(vVar);
        }
        if (imageProxy4 != null) {
            int a2 = C21174b.m39767a(context, imageProxy2);
            if (a2 != 0) {
                g.mo11963P(a2);
            } else {
                C58833ax b2 = C21194v.m39827b(imageProxy2);
                if (b2.mo56113h()) {
                    g.mo11964Q(C21194v.m39826a(context, (byte[]) b2.mo56107c()));
                }
            }
        }
        if (imageProxy5 != null) {
            int a3 = C21174b.m39767a(context, imageProxy5);
            if (a3 != 0) {
                g.mo11952E(a3);
            } else {
                C58833ax b3 = C21194v.m39827b(imageProxy3);
                if (b3.mo56113h()) {
                    g.mo11953F(C21194v.m39826a(context, (byte[]) b3.mo56107c()));
                }
            }
        }
        return g;
    }

    /* renamed from: d */
    static boolean m39831d(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == null || !m39831d(baseContext)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    static void m39832e(Drawable drawable, ImageProxy imageProxy) {
        if (!imageProxy.sources().isEmpty()) {
            int i = 0;
            if (((ImageSourceProxy) imageProxy.sources().get(0)).clientResource() != null && ((ImageSourceProxy) imageProxy.sources().get(0)).clientResource().imageColor() != 0) {
                if (((ImageSourceProxy) imageProxy.sources().get(0)).clientResource() != null) {
                    i = (int) ((ImageSourceProxy) imageProxy.sources().get(0)).clientResource().imageColor();
                }
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            }
        }
    }
}
