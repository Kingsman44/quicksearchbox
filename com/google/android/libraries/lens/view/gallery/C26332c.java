package com.google.android.libraries.lens.view.gallery;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.gallery.data.C26405x;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.android.libraries.lens.view.gallery.p2111d.C26361g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.gallery.c */
/* compiled from: PG */
public final /* synthetic */ class C26332c implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26420g f71581a;

    public /* synthetic */ C26332c(C26420g gVar) {
        this.f71581a = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26420g gVar = this.f71581a;
        C26406y yVar = (C26406y) obj;
        C26361g gVar2 = gVar.f71903h;
        if (gVar2 != null) {
            C26405x b = yVar.mo31579b();
            C58485gu f = yVar.mo31606f(gVar.f71896a);
            if (!b.equals(gVar2.f71661a) || !C58597ky.m90218i(f, gVar2.f71662b)) {
                gVar2.f71661a = b;
                gVar2.f71662b = f;
                gVar2.mObservable.mo2879a();
            }
        }
    }
}
