package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.common.C30905ae;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cs */
/* compiled from: PG */
public abstract class C30418cs {
    /* renamed from: d */
    public static C30418cs m56635d(Drawable drawable) {
        return new C30449q(drawable, false);
    }

    /* renamed from: e */
    public static C30418cs m56636e(Drawable drawable) {
        return new C30449q(drawable, true);
    }

    /* renamed from: a */
    public abstract Drawable mo35985a();

    /* renamed from: b */
    public abstract boolean mo35986b();

    /* renamed from: c */
    public final Drawable mo35987c(int i) {
        if (!mo35986b()) {
            return mo35985a();
        }
        Drawable a = mo35985a();
        C30905ae.m57696b(a, i);
        return a;
    }
}
