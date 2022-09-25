package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.hardware.display.DisplayManager;
import android.view.View;
import androidx.core.p097i.C1967b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.d */
/* compiled from: PG */
public final class C40132d extends C40153y {

    /* renamed from: a */
    public final View f105409a;

    /* renamed from: b */
    public final View f105410b;

    /* renamed from: c */
    public final View f105411c;

    /* renamed from: d */
    public final DisplayManager f105412d;

    /* renamed from: e */
    public final Runnable f105413e;

    /* renamed from: f */
    public final C1967b f105414f;

    public C40132d(View view, View view2, View view3, DisplayManager displayManager, Runnable runnable, C1967b bVar) {
        this.f105409a = view;
        this.f105410b = view2;
        this.f105411c = view3;
        this.f105412d = displayManager;
        this.f105413e = runnable;
        this.f105414f = bVar;
    }

    /* renamed from: a */
    public final DisplayManager mo42229a() {
        return this.f105412d;
    }

    /* renamed from: b */
    public final View mo42230b() {
        return this.f105409a;
    }

    /* renamed from: c */
    public final View mo42231c() {
        return this.f105410b;
    }

    /* renamed from: d */
    public final View mo42232d() {
        return this.f105411c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C1967b mo42233e() {
        return this.f105414f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40153y) {
            C40153y yVar = (C40153y) obj;
            return this.f105409a.equals(yVar.mo42230b()) && this.f105410b.equals(yVar.mo42231c()) && this.f105411c.equals(yVar.mo42232d()) && this.f105412d.equals(yVar.mo42229a()) && this.f105413e.equals(yVar.mo42235f()) && this.f105414f.equals(yVar.mo42233e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Runnable mo42235f() {
        return this.f105413e;
    }

    public final int hashCode() {
        return ((((((((((this.f105409a.hashCode() ^ 1000003) * 1000003) ^ this.f105410b.hashCode()) * 1000003) ^ this.f105411c.hashCode()) * 1000003) ^ this.f105412d.hashCode()) * 1000003) ^ this.f105413e.hashCode()) * 1000003) ^ this.f105414f.hashCode();
    }

    public final String toString() {
        String obj = this.f105409a.toString();
        String obj2 = this.f105410b.toString();
        String obj3 = this.f105411c.toString();
        String obj4 = this.f105412d.toString();
        String obj5 = this.f105413e.toString();
        String obj6 = this.f105414f.toString();
        return "RemoveAnimator{collapsedView=" + obj + ", extendedContainerView=" + obj2 + ", extendedOutsideView=" + obj3 + ", displayManager=" + obj4 + ", onRemoveCallback=" + obj5 + ", onTrashRendererOptionSelectedCallback=" + obj6 + "}";
    }
}
