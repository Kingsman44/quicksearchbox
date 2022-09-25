package com.facebook.litho;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.p313c.C6061t;

/* renamed from: com.facebook.litho.ds */
/* compiled from: PG */
public final class C6199ds implements C6061t {

    /* renamed from: a */
    public static final C6199ds f18343a = new C6199ds();

    /* renamed from: a */
    public final /* synthetic */ boolean mo12653a(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo12654b(Object obj, Object obj2) {
        C6185de deVar = ((C6201du) obj2).f18345a;
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            if (drawable.getCallback() instanceof View) {
                C6563y.m17863b((View) drawable.getCallback(), drawable, deVar.f18257g, deVar.f18253c);
            }
        }
        deVar.f18255e.mo12798Q(deVar.f18251a, obj);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12655c(Object obj, Object obj2) {
        C6185de deVar = ((C6201du) obj2).f18345a;
        deVar.f18255e.mo12813ad(deVar.f18251a, obj);
    }
}
