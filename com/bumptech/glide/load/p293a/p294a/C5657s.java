package com.bumptech.glide.load.p293a.p294a;

import android.graphics.Bitmap;
import com.bumptech.glide.p291h.C5632s;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.a.a.s */
/* compiled from: PG */
public final class C5657s implements C5652n {

    /* renamed from: a */
    public static final Bitmap.Config[] f17040a;

    /* renamed from: b */
    public static final Bitmap.Config[] f17041b;

    /* renamed from: c */
    public static final Bitmap.Config[] f17042c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    public static final Bitmap.Config[] f17043d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    public static final Bitmap.Config[] f17044e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    public final C5656r f17045f = new C5656r();

    /* renamed from: g */
    public final C5646h f17046g = new C5646h();

    /* renamed from: h */
    private final Map f17047h = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f17040a = configArr;
        f17041b = configArr;
    }

    /* renamed from: b */
    static String m14695b(int i, Bitmap.Config config) {
        String valueOf = String.valueOf(config);
        return "[" + i + "](" + valueOf + ")";
    }

    /* renamed from: a */
    public final String mo12129a(Bitmap bitmap) {
        return m14695b(C5632s.m14608a(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public final NavigableMap mo12134c(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f17047h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f17047h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: d */
    public final void mo12135d(Integer num, Bitmap bitmap) {
        NavigableMap c = mo12134c(bitmap.getConfig());
        Integer num2 = (Integer) c.get(num);
        if (num2 == null) {
            String a = mo12129a(bitmap);
            String obj = toString();
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a + ", this: " + obj);
        } else if (num2.intValue() == 1) {
            c.remove(num);
        } else {
            c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f17046g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f17047h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f17047h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }
}
