package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32051a;
import com.google.android.libraries.p2460r.p2469c.C32120bh;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.ai */
/* compiled from: PG */
public final class C104866ai {

    /* renamed from: a */
    public final Context f292239a;

    /* renamed from: b */
    public final int f292240b;

    /* renamed from: c */
    Typeface f292241c;

    /* renamed from: d */
    Typeface f292242d;

    public C104866ai(Context context, int i) {
        this.f292239a = context;
        this.f292240b = i;
    }

    /* renamed from: a */
    public final void mo94382a(boolean z, C32051a aVar) {
        Typeface typeface = this.f292241c;
        typeface.getClass();
        if (!z) {
            ((C32120bh) aVar).mo37836a(typeface);
            return;
        }
        if (this.f292242d == null) {
            this.f292242d = Typeface.create(typeface, 2);
        }
        ((C32120bh) aVar).mo37836a(this.f292242d);
    }
}
