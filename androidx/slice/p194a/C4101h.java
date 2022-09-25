package androidx.slice.p194a;

import android.text.TextUtils;
import androidx.slice.C4093a;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: androidx.slice.a.h */
/* compiled from: PG */
public final class C4101h {
    /* renamed from: a */
    public static SliceItem m11748a(Slice slice, String str, String[] strArr, String[] strArr2) {
        if (slice == null) {
            return null;
        }
        return m11761n(m11762o(slice), new C4098e(str, strArr, strArr2));
    }

    /* renamed from: b */
    public static SliceItem m11749b(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        if (sliceItem == null) {
            return null;
        }
        return m11761n(m11763p(sliceItem), new C4095b(str, strArr, strArr2));
    }

    /* renamed from: c */
    public static SliceItem m11750c(Slice slice, String str, String str2) {
        if (slice == null) {
            return null;
        }
        return m11761n(m11762o(slice), new C4096c(str, str2));
    }

    /* renamed from: d */
    public static SliceItem m11751d(SliceItem sliceItem, String str, String str2) {
        if (sliceItem == null) {
            return null;
        }
        return m11761n(m11763p(sliceItem), new C4097d(str, str2));
    }

    /* renamed from: e */
    public static List m11752e(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        Deque p = m11763p(sliceItem);
        C4099f fVar = new C4099f(str, strArr, strArr2);
        while (!p.isEmpty()) {
            SliceItem sliceItem2 = (SliceItem) p.poll();
            if (fVar.mo8608a(sliceItem2)) {
                arrayList.add(sliceItem2);
            }
            if (sliceItem2 != null && ("slice".equals(sliceItem2.f13092b) || "action".equals(sliceItem2.f13092b))) {
                Collections.addAll(p, sliceItem2.mo8596d().f13088d);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    static boolean m11753f(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.f13092b);
    }

    /* renamed from: g */
    static boolean m11754g(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.f13093c);
    }

    /* renamed from: h */
    public static boolean m11755h(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String a : strArr) {
            if (C4093a.m11737a(sliceItem.f13091a, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m11756i(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !C4093a.m11737a(sliceItem.f13091a, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static SliceItem m11757j(Slice slice) {
        String[] strArr = null;
        return m11748a(slice, "image", (String[]) null, (String[]) null);
    }

    /* renamed from: k */
    public static SliceItem m11758k(Slice slice, String str, String str2) {
        return m11748a(slice, str, new String[]{str2}, new String[]{null});
    }

    /* renamed from: l */
    public static SliceItem m11759l(SliceItem sliceItem, String str, String str2) {
        return m11749b(sliceItem, str, new String[]{str2}, new String[]{null});
    }

    /* renamed from: m */
    public static SliceItem m11760m(Slice slice, String str, String str2, String[] strArr) {
        for (SliceItem sliceItem : slice.f13088d) {
            if (m11753f(sliceItem, str) && m11754g(sliceItem, str2) && m11756i(sliceItem, strArr) && !m11755h(sliceItem, (String[]) null)) {
                return sliceItem;
            }
        }
        return null;
    }

    /* renamed from: n */
    private static SliceItem m11761n(Deque deque, C4100g gVar) {
        while (!deque.isEmpty()) {
            SliceItem sliceItem = (SliceItem) deque.poll();
            if (gVar.mo8608a(sliceItem)) {
                return sliceItem;
            }
            if (sliceItem != null && ("slice".equals(sliceItem.f13092b) || "action".equals(sliceItem.f13092b))) {
                Collections.addAll(deque, sliceItem.mo8596d().f13088d);
            }
        }
        return null;
    }

    /* renamed from: o */
    private static Deque m11762o(Slice slice) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Collections.addAll(arrayDeque, slice.f13088d);
        return arrayDeque;
    }

    /* renamed from: p */
    private static Deque m11763p(SliceItem sliceItem) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(sliceItem);
        return arrayDeque;
    }
}
