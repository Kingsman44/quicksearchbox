package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.i.i */
/* compiled from: PG */
final class C105378i implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        if (rect.top != rect2.top) {
            i = rect.top;
            i2 = rect2.top;
        } else if (rect.bottom != rect2.bottom) {
            i = rect.bottom;
            i2 = rect2.bottom;
        } else if (rect.left != rect2.left) {
            i = rect.left;
            i2 = rect2.left;
        } else {
            i = rect.right;
            i2 = rect2.right;
        }
        return i - i2;
    }
}
