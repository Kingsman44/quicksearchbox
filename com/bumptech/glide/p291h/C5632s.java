package com.bumptech.glide.p291h;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p297b.C5759ak;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.h.s */
/* compiled from: PG */
public final class C5632s {

    /* renamed from: a */
    public static final char[] f16974a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f16975b = new char[64];

    /* renamed from: c */
    private static volatile Handler f16976c;

    private C5632s() {
    }

    /* renamed from: a */
    public static int m14608a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + valueOf + "[" + width + "x" + height + "] " + valueOf2);
        }
    }

    /* renamed from: b */
    public static int m14609b(int i, int i2, Bitmap.Config config) {
        return i * i2 * m14610c(config);
    }

    /* renamed from: c */
    public static int m14610c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C5631r.f16973a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public static int m14611d(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: e */
    public static int m14612e(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: f */
    public static Handler m14613f() {
        if (f16976c == null) {
            synchronized (C5632s.class) {
                if (f16976c == null) {
                    f16976c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f16976c;
    }

    /* renamed from: g */
    public static List m14614g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static Queue m14615h(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: i */
    public static void m14616i() {
        if (!m14620m()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: j */
    public static void m14617j() {
        if (!m14621n()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: k */
    public static boolean m14618k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C5759ak) {
            return ((C5759ak) obj).mo12264a();
        }
        return obj.equals(obj2);
    }

    /* renamed from: l */
    public static boolean m14619l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: m */
    public static boolean m14620m() {
        return !m14621n();
    }

    /* renamed from: n */
    public static boolean m14621n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: o */
    public static boolean m14622o(int i, int i2) {
        return m14623p(i) && m14623p(i2);
    }

    /* renamed from: p */
    private static boolean m14623p(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
