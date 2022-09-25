package androidx.core.p098j.p099a;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: androidx.core.j.a.h */
/* compiled from: PG */
public final class C1988h {

    /* renamed from: a */
    public static final C1988h f5903a = new C1988h((Object) null, 1, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: b */
    public static final C1988h f5904b = new C1988h((Object) null, 2, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: c */
    public static final C1988h f5905c = new C1988h((Object) null, 16, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: d */
    public static final C1988h f5906d = new C1988h((Object) null, 32, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: e */
    public static final C1988h f5907e = new C1988h((Object) null, 4096, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: f */
    public static final C1988h f5908f = new C1988h((Object) null, 8192, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: g */
    public static final C1988h f5909g = new C1988h((Object) null, C89885b.HTTP_VALUE, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: h */
    public static final C1988h f5910h = new C1988h((Object) null, 524288, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: i */
    public static final C1988h f5911i = new C1988h((Object) null, 1048576, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: j */
    public static final C1988h f5912j = new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: k */
    public static final C1988h f5913k = new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C1981aa) null, (Class) null);

    /* renamed from: l */
    public static final C1988h f5914l = new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (C1981aa) null, C2004x.class);

    /* renamed from: m */
    final Object f5915m;

    /* renamed from: n */
    public final int f5916n;

    /* renamed from: o */
    public final Class f5917o;

    /* renamed from: p */
    public final C1981aa f5918p;

    static {
        new C1988h((Object) null, 4, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 8, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 64, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 128, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 256, (CharSequence) null, (C1981aa) null, C2000t.class);
        new C1988h((Object) null, 512, (CharSequence) null, (C1981aa) null, C2000t.class);
        new C1988h((Object) null, 1024, (CharSequence) null, (C1981aa) null, C2001u.class);
        new C1988h((Object) null, 2048, (CharSequence) null, (C1981aa) null, C2001u.class);
        new C1988h((Object) null, 16384, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 32768, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, 65536, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h((Object) null, C89885b.S3REQUEST_VALUE, (CharSequence) null, (C1981aa) null, C2005y.class);
        new C1988h((Object) null, C89885b.NOW_VALUE, (CharSequence) null, (C1981aa) null, C2006z.class);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C1981aa) null, C2003w.class);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence) null, (C1981aa) null, C2002v.class);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (CharSequence) null, (C1981aa) null, (Class) null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new C1988h(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (C1981aa) null, (Class) null);
        new C1988h(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (C1981aa) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        new C1988h(accessibilityAction, 16908376, (CharSequence) null, (C1981aa) null, (Class) null);
    }

    public C1988h(Object obj, int i, CharSequence charSequence, C1981aa aaVar, Class cls) {
        this.f5916n = i;
        this.f5918p = aaVar;
        this.f5915m = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.f5917o = cls;
    }

    /* renamed from: a */
    public final int mo5148a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5915m).getId();
    }

    /* renamed from: b */
    public final CharSequence mo5149b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5915m).getLabel();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1988h) && this.f5915m.equals(((C1988h) obj).f5915m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5915m.hashCode();
    }
}
