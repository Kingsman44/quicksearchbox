package com.google.android.libraries.onegoogle.tooltip;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30559f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.e */
/* compiled from: PG */
public final class C31069e extends C31080p {

    /* renamed from: a */
    public final C58833ax f83696a;

    /* renamed from: b */
    public final C58833ax f83697b;

    /* renamed from: c */
    public final View f83698c;

    /* renamed from: d */
    public final PopupWindow.OnDismissListener f83699d;

    /* renamed from: e */
    public final int f83700e;

    /* renamed from: f */
    public final C30559f f83701f;

    public C31069e(C58833ax axVar, C58833ax axVar2, View view, PopupWindow.OnDismissListener onDismissListener, int i, C30559f fVar) {
        this.f83696a = axVar;
        this.f83697b = axVar2;
        this.f83698c = view;
        this.f83699d = onDismissListener;
        this.f83700e = i;
        this.f83701f = fVar;
    }

    /* renamed from: a */
    public final View mo36787a() {
        return this.f83698c;
    }

    /* renamed from: b */
    public final PopupWindow.OnDismissListener mo36788b() {
        return this.f83699d;
    }

    /* renamed from: c */
    public final C58833ax mo36789c() {
        return this.f83696a;
    }

    /* renamed from: d */
    public final C58833ax mo36790d() {
        return this.f83697b;
    }

    /* renamed from: e */
    public final int mo36791e() {
        return this.f83700e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31080p) {
            C31080p pVar = (C31080p) obj;
            return this.f83696a.equals(pVar.mo36789c()) && this.f83697b.equals(pVar.mo36790d()) && this.f83698c.equals(pVar.mo36787a()) && this.f83699d.equals(pVar.mo36788b()) && this.f83700e == pVar.mo36791e() && this.f83701f.equals(pVar.mo36793f());
        }
    }

    /* renamed from: f */
    public final C30559f mo36793f() {
        return this.f83701f;
    }

    public final int hashCode() {
        return ((((((((((this.f83696a.hashCode() ^ 1000003) * 1000003) ^ this.f83697b.hashCode()) * 1000003) ^ this.f83698c.hashCode()) * 1000003) ^ this.f83699d.hashCode()) * 1000003) ^ this.f83700e) * 1000003) ^ this.f83701f.hashCode();
    }

    public final String toString() {
        String obj = this.f83696a.toString();
        String obj2 = this.f83697b.toString();
        String obj3 = this.f83698c.toString();
        String obj4 = this.f83699d.toString();
        String str = this.f83700e != 2 ? "START" : "BELOW";
        String obj5 = this.f83701f.toString();
        return "TooltipModel{backgroundColor=" + obj + ", scrimColor=" + obj2 + ", contentView=" + obj3 + ", dismissListener=" + obj4 + ", placement=" + str + ", readyListener=" + obj5 + "}";
    }
}
