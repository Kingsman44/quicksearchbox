package com.google.android.libraries.onegoogle.actions;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.actions.e */
/* compiled from: PG */
final class C30804e extends C30807h {

    /* renamed from: a */
    private final int f83120a;

    /* renamed from: b */
    private final Drawable f83121b;

    /* renamed from: c */
    private final String f83122c;

    /* renamed from: d */
    private final int f83123d;

    /* renamed from: e */
    private final View.OnClickListener f83124e;

    /* renamed from: f */
    private final C58833ax f83125f;

    public C30804e(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener, C58833ax axVar) {
        this.f83120a = i;
        this.f83121b = drawable;
        this.f83122c = str;
        this.f83123d = i2;
        this.f83124e = onClickListener;
        this.f83125f = axVar;
    }

    /* renamed from: a */
    public final int mo36494a() {
        return this.f83120a;
    }

    /* renamed from: b */
    public final int mo36495b() {
        return this.f83123d;
    }

    /* renamed from: c */
    public final Drawable mo36496c() {
        return this.f83121b;
    }

    /* renamed from: d */
    public final View.OnClickListener mo36497d() {
        return this.f83124e;
    }

    /* renamed from: e */
    public final C58833ax mo36498e() {
        return this.f83125f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30807h) {
            C30807h hVar = (C30807h) obj;
            return this.f83120a == hVar.mo36494a() && this.f83121b.equals(hVar.mo36496c()) && this.f83122c.equals(hVar.mo36500f()) && this.f83123d == hVar.mo36495b() && this.f83124e.equals(hVar.mo36497d()) && this.f83125f.equals(hVar.mo36498e());
        }
    }

    /* renamed from: f */
    public final String mo36500f() {
        return this.f83122c;
    }

    public final int hashCode() {
        return ((((((((((this.f83120a ^ 1000003) * 1000003) ^ this.f83121b.hashCode()) * 1000003) ^ this.f83122c.hashCode()) * 1000003) ^ this.f83123d) * 1000003) ^ this.f83124e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        int i = this.f83120a;
        String obj = this.f83121b.toString();
        String str = this.f83122c;
        int i2 = this.f83123d;
        String obj2 = this.f83124e.toString();
        return "SimpleActionSpec{id=" + i + ", icon=" + obj + ", label=" + str + ", veId=" + i2 + ", onClickListener=" + obj2 + ", availabilityChecker=Optional.absent()}";
    }
}
