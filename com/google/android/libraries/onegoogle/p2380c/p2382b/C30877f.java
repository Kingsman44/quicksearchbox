package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;

/* renamed from: com.google.android.libraries.onegoogle.c.b.f */
/* compiled from: PG */
final class C30877f extends C30282k {

    /* renamed from: a */
    final /* synthetic */ View f83268a;

    /* renamed from: b */
    final /* synthetic */ int f83269b;

    /* renamed from: c */
    final /* synthetic */ C30878g f83270c;

    public C30877f(C30878g gVar, View view, int i) {
        this.f83270c = gVar;
        this.f83268a = view;
        this.f83269b = i;
    }

    /* renamed from: c */
    public final void mo18106c(Object obj) {
        View view = this.f83268a;
        view.post(new C30876e(this, view, this.f83269b, obj));
    }
}
