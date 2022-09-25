package com.google.apps.tiktok.p3674l.p3675a;

import android.content.Context;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.text.TextUtils;
import android.view.View;
import androidx.p043a.p044a.C0782b;
import com.google.apps.tiktok.p3674l.p3679c.C47395h;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.l.a.g */
/* compiled from: PG */
public final class C47363g {

    /* renamed from: a */
    public int f123079a = -1;

    /* renamed from: b */
    public int f123080b = -1;

    /* renamed from: c */
    public int f123081c = -1;

    /* renamed from: d */
    public int f123082d = -1;

    /* renamed from: e */
    public int f123083e = -1;

    /* renamed from: f */
    public int f123084f = -1;

    /* renamed from: g */
    private final C0782b f123085g;

    /* renamed from: h */
    private final C47400m f123086h;

    /* renamed from: i */
    private final C47357a f123087i;

    /* renamed from: j */
    private CharSequence f123088j;

    /* renamed from: k */
    private View f123089k;

    public C47363g(Context context, C47400m mVar, C58833ax axVar) {
        this.f123085g = new C0782b(context, context.getTheme());
        this.f123086h = mVar;
        this.f123087i = (C47357a) axVar.mo56109e(new C47358b());
    }

    /* renamed from: a */
    public final C0392m mo51231a() {
        C0391l lVar;
        int i = this.f123083e;
        if (i == -1) {
            lVar = this.f123087i.mo51229a(this.f123085g);
        } else {
            lVar = this.f123087i.mo51230b(this.f123085g, i);
        }
        int i2 = this.f123079a;
        if (i2 != -1) {
            lVar.mo1299e(i2);
        }
        CharSequence charSequence = this.f123088j;
        if (charSequence != null) {
            lVar.mo1301g(charSequence);
        } else {
            int i3 = this.f123080b;
            if (i3 != -1) {
                lVar.mo1300f(i3);
            }
        }
        int i4 = this.f123081c;
        if (i4 != -1) {
            lVar.setNegativeButton(i4, new C47395h(this.f123086h, new C47361e()));
        }
        int i5 = this.f123082d;
        if (i5 != -1) {
            lVar.setPositiveButton(i5, new C47395h(this.f123086h, new C47362f()));
        }
        int i6 = this.f123084f;
        if (i6 != -1) {
            lVar.mo1307l(i6);
        }
        View view = this.f123089k;
        if (view != null) {
            lVar.setView(view);
        }
        return lVar.create();
    }

    /* renamed from: b */
    public final void mo51232b() {
        boolean z = false;
        if (this.f123088j == null && this.f123080b == -1) {
            z = true;
        }
        C58838bb.m90884s(z, "Cannot set message multiple times.");
    }

    /* renamed from: c */
    public final void mo51233c() {
        C58838bb.m90884s(this.f123081c == -1, "Cannot set negative button multiple times.");
    }

    /* renamed from: d */
    public final void mo51234d() {
        C58838bb.m90884s(this.f123082d == -1, "Cannot set positive button multiple times.");
    }

    /* renamed from: e */
    public final void mo51235e() {
        C58838bb.m90884s(this.f123083e == -1, "Cannot set theme multiple times.");
    }

    /* renamed from: f */
    public final void mo51236f() {
        C58838bb.m90884s(this.f123084f == -1, "Cannot set title multiple times.");
    }

    /* renamed from: g */
    public final void mo51237g(CharSequence charSequence) {
        mo51232b();
        C58838bb.m90869d(!TextUtils.isEmpty(charSequence), "Cannot set an empty message.");
        this.f123088j = charSequence;
    }

    /* renamed from: h */
    public final void mo51238h(View view) {
        boolean z = true;
        C58838bb.m90884s(this.f123089k == null, "Cannot set view multiple times.");
        if (view == null) {
            z = false;
        }
        C58838bb.m90869d(z, "Cannot set a null view.");
        this.f123089k = view;
    }
}
