package com.bumptech.glide.p285d;

import com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: com.bumptech.glide.d.c */
/* compiled from: PG */
public final class C5546c {
    /* renamed from: a */
    public static TikTokCronetGlideModule m14332a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m14333b(cls, e);
            } catch (IllegalAccessException e2) {
                m14333b(cls, e2);
            } catch (NoSuchMethodException e3) {
                m14333b(cls, e3);
            } catch (InvocationTargetException e4) {
                m14333b(cls, e4);
            }
            if (obj instanceof TikTokCronetGlideModule) {
                return (TikTokCronetGlideModule) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(obj))));
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: b */
    private static void m14333b(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }
}
