package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.bq */
/* compiled from: PG */
final class C0547bq {

    /* renamed from: a */
    public int f2128a = 0;

    /* renamed from: b */
    public float f2129b = -1.0f;

    /* renamed from: c */
    public float f2130c = -1.0f;

    /* renamed from: d */
    public float f2131d = -1.0f;

    /* renamed from: e */
    public int[] f2132e = new int[0];

    /* renamed from: f */
    public boolean f2133f = false;

    /* renamed from: g */
    public final TextView f2134g;

    /* renamed from: h */
    public final Context f2135h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0547bq(TextView textView) {
        this.f2134g = textView;
        this.f2135h = textView.getContext();
    }

    /* renamed from: b */
    public static final int[] m2021b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0) {
                Integer valueOf = Integer.valueOf(i);
                if (Collections.binarySearch(arrayList, valueOf) < 0) {
                    arrayList.add(valueOf);
                }
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    public final boolean mo2585a() {
        return !(this.f2134g instanceof C0508af);
    }
}
