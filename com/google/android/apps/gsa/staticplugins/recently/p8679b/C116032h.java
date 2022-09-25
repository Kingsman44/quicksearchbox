package com.google.android.apps.gsa.staticplugins.recently.p8679b;

import android.util.Property;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p576aq.p578b.C10503aj;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.b.h */
/* compiled from: PG */
public final class C116032h {

    /* renamed from: a */
    public static final Property f321728a = C10503aj.m25470a(String.class, "AccountName", C116026b.f321720a, C116027c.f321721a);

    /* renamed from: b */
    public static final Property f321729b = C10503aj.m25470a(String.class, "ScreenshotDirectory", C116028d.f321722a, C116029e.f321723a);

    /* renamed from: c */
    public final C22871g f321730c;

    /* renamed from: d */
    public String f321731d;

    /* renamed from: e */
    public String f321732e;

    public C116032h(C22871g gVar) {
        this.f321730c = gVar;
    }

    /* renamed from: a */
    public final File mo102426a(String str, long j) {
        return new File(new File(str), String.format(Locale.US, "%s-%d.jpg", new Object[]{this.f321732e, Long.valueOf(j)}));
    }
}
