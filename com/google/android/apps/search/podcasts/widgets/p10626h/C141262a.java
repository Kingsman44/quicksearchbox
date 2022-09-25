package com.google.android.apps.search.podcasts.widgets.p10626h;

import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.search.podcasts.widgets.h.a */
/* compiled from: PG */
public final class C141262a extends TouchDelegate {

    /* renamed from: a */
    public static final /* synthetic */ int f383502a = 0;

    /* renamed from: b */
    private final Map f383503b = new HashMap();

    /* renamed from: c */
    private final TouchDelegate f383504c;

    public C141262a(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        C58838bb.m90868c(!(touchDelegate instanceof C141262a));
        this.f383504c = touchDelegate;
    }

    /* renamed from: a */
    public static void m229292a(View view, View view2, TouchDelegate touchDelegate) {
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        if (touchDelegate2 == null) {
            view.setTouchDelegate(new C141262a(view2, touchDelegate));
        } else if (touchDelegate2 instanceof C141262a) {
            ((C141262a) touchDelegate2).mo116275b(view2, touchDelegate);
        } else {
            C141262a aVar = new C141262a(view2, touchDelegate2);
            aVar.mo116275b(view2, touchDelegate);
            view.setTouchDelegate(aVar);
        }
    }

    /* renamed from: c */
    public static void m229293c(Rect rect, View view) {
        if (rect.left < 0) {
            rect.right += Math.min(Math.max(0, view.getWidth() - rect.right), -rect.left);
            rect.left = 0;
        }
        if (rect.right > view.getWidth()) {
            rect.left -= Math.min(Math.max(0, rect.left), rect.right - view.getWidth());
            rect.right = view.getWidth();
        }
        if (rect.top < 0) {
            rect.bottom += Math.min(Math.max(0, view.getHeight() - rect.top), -rect.top);
            rect.top = 0;
        }
        if (rect.bottom > view.getHeight()) {
            rect.top -= Math.min(Math.max(0, rect.top), rect.bottom - view.getHeight());
            rect.bottom = view.getHeight();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo116275b(View view, TouchDelegate touchDelegate) {
        this.f383503b.put(view, touchDelegate);
    }

    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        if (this.f383503b.isEmpty()) {
            return super.getTouchDelegateInfo();
        }
        ArrayMap arrayMap = new ArrayMap(this.f383503b.size());
        for (View view : this.f383503b.keySet()) {
            TouchDelegate touchDelegate = (TouchDelegate) this.f383503b.get(view);
            AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = touchDelegate.getTouchDelegateInfo();
            boolean z = true;
            C58838bb.m90883r(!(touchDelegate instanceof C141262a));
            if (touchDelegateInfo.getRegionCount() != 1) {
                z = false;
            }
            C58838bb.m90883r(z);
            arrayMap.put(touchDelegateInfo.getRegionAt(0), view);
        }
        return new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f383504c != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            z = this.f383504c.onTouchEvent(obtain);
            obtain.recycle();
        } else {
            z = false;
        }
        for (TouchDelegate onTouchEvent : this.f383503b.values()) {
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
            z |= onTouchEvent.onTouchEvent(obtain2);
            obtain2.recycle();
        }
        return z;
    }
}
