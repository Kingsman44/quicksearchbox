package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.hardware.display.DisplayManager;
import android.view.View;
import androidx.core.p097i.C1967b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.d */
/* compiled from: PG */
public final class C97108d extends C97128x {

    /* renamed from: a */
    public final View f271322a;

    /* renamed from: b */
    public final View f271323b;

    /* renamed from: c */
    public final View f271324c;

    /* renamed from: d */
    public final DisplayManager f271325d;

    /* renamed from: e */
    public final Runnable f271326e;

    /* renamed from: f */
    public final C1967b f271327f;

    public C97108d(View view, View view2, View view3, DisplayManager displayManager, Runnable runnable, C1967b bVar) {
        this.f271322a = view;
        this.f271323b = view2;
        this.f271324c = view3;
        this.f271325d = displayManager;
        this.f271326e = runnable;
        this.f271327f = bVar;
    }

    /* renamed from: a */
    public final DisplayManager mo90481a() {
        return this.f271325d;
    }

    /* renamed from: b */
    public final View mo90482b() {
        return this.f271322a;
    }

    /* renamed from: c */
    public final View mo90483c() {
        return this.f271323b;
    }

    /* renamed from: d */
    public final View mo90484d() {
        return this.f271324c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C1967b mo90485e() {
        return this.f271327f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97128x) {
            C97128x xVar = (C97128x) obj;
            return this.f271322a.equals(xVar.mo90482b()) && this.f271323b.equals(xVar.mo90483c()) && this.f271324c.equals(xVar.mo90484d()) && this.f271325d.equals(xVar.mo90481a()) && this.f271326e.equals(xVar.mo90487f()) && this.f271327f.equals(xVar.mo90485e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Runnable mo90487f() {
        return this.f271326e;
    }

    public final int hashCode() {
        return ((((((((((this.f271322a.hashCode() ^ 1000003) * 1000003) ^ this.f271323b.hashCode()) * 1000003) ^ this.f271324c.hashCode()) * 1000003) ^ this.f271325d.hashCode()) * 1000003) ^ this.f271326e.hashCode()) * 1000003) ^ this.f271327f.hashCode();
    }

    public final String toString() {
        String obj = this.f271322a.toString();
        String obj2 = this.f271323b.toString();
        String obj3 = this.f271324c.toString();
        String obj4 = this.f271325d.toString();
        String obj5 = this.f271326e.toString();
        String obj6 = this.f271327f.toString();
        return "RemoveAnimator{collapsedView=" + obj + ", extendedContainerView=" + obj2 + ", extendedOutsideView=" + obj3 + ", displayManager=" + obj4 + ", onRemoveCallback=" + obj5 + ", onTrashRendererOptionSelectedCallback=" + obj6 + "}";
    }
}
