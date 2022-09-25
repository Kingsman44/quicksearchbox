package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2365a.C30547a;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2365a.p2366a.C30548a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.r */
/* compiled from: PG */
public final class C30571r {

    /* renamed from: a */
    public Context f82586a;

    /* renamed from: b */
    public CharSequence f82587b;

    /* renamed from: c */
    public Runnable f82588c;

    /* renamed from: d */
    public Drawable f82589d;

    /* renamed from: e */
    public int f82590e;

    /* renamed from: f */
    private final C30547a f82591f = new C30548a();

    /* renamed from: a */
    public final C30572s mo36256a() {
        Context context = this.f82586a;
        int i = this.f82590e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f82586a = new ContextThemeWrapper(new ContextThemeWrapper(context, 2132149670), 2132149637);
            return new C30572s(this.f82586a, this.f82587b, this.f82589d, this.f82588c);
        } else {
            throw new IllegalStateException("Unknown SlimCard theme.");
        }
    }
}
