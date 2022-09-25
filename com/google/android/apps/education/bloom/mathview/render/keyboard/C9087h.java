package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.graphics.Typeface;
import androidx.core.p097i.C1977l;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5478h.C69683b;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.h */
/* compiled from: PG */
public final class C9087h extends C69683b {
    public C9087h() {
        super((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17403a(C69713k kVar, Object obj, Object obj2) {
        C69664n.m101061g(kVar, "property");
        Typeface typeface = (Typeface) obj2;
        Typeface typeface2 = (Typeface) obj;
        Iterator a = C1977l.m5321a(C9088i.f31341c);
        while (a.hasNext()) {
            ((C9084e) a.next()).mo17404f(typeface);
        }
    }
}
