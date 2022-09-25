package com.google.android.material.p3507d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.drawable.C1929b;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.material.d.a */
/* compiled from: PG */
public final class C44603a {
    /* renamed from: a */
    public static PorterDuffColorFilter m79017a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* renamed from: c */
    public static int[] m79019c(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i < length) {
                int i2 = iArr[i];
                if (i2 == 16842912) {
                    return iArr;
                }
                if (i2 == 0) {
                    int[] iArr2 = (int[]) iArr.clone();
                    iArr2[i] = 16842912;
                    return iArr2;
                }
                i++;
            } else {
                int[] copyOf = Arrays.copyOf(iArr, length + 1);
                copyOf[length] = 16842912;
                return copyOf;
            }
        }
    }

    /* renamed from: d */
    public static Drawable m79020d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                C1929b.m5227h(drawable, mode);
            }
        }
        return drawable;
    }

    /* renamed from: e */
    public static AttributeSet m79021e(Context context, int i) {
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            while (true) {
                int next = xml.next();
                if (next != 2) {
                    if (next == 1) {
                        throw new XmlPullParserException("No start tag found");
                    }
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    return Xml.asAttributeSet(xml);
                } else {
                    throw new XmlPullParserException("Must have a <" + "badge" + "> start tag");
                }
            }
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x".concat(String.valueOf(Integer.toHexString(i))));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    /* renamed from: b */
    public static void m79018b(Drawable drawable, int i) {
        if (i != 0) {
            C1929b.m5225f(drawable, i);
        } else {
            C1929b.m5226g(drawable, (ColorStateList) null);
        }
    }
}
