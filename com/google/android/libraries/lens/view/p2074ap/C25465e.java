package com.google.android.libraries.lens.view.p2074ap;

import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import com.google.android.libraries.lens.view.p2093d.C25758g;

/* renamed from: com.google.android.libraries.lens.view.ap.e */
/* compiled from: PG */
public final /* synthetic */ class C25465e implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C25466f f69400a;

    public /* synthetic */ C25465e(C25466f fVar) {
        this.f69400a = fVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i;
        C25466f fVar = this.f69400a;
        C1926c a = cpVar.f5994b.mo5216a(7);
        C2098m q = cpVar.f5994b.mo5234q();
        if (q == null) {
            i = 0;
        } else {
            i = C2097l.m5780d(q.f6013a);
        }
        int max = Math.max(a.f5822c, i);
        C25463c b = C25464d.m46905b();
        b.mo30498b(max);
        C25464d a2 = b.mo30497a();
        if (!a2.equals(fVar.f69401a.mo3842a())) {
            C25758g gVar = fVar.f69401a;
            a2.getClass();
            gVar.mo5708l(a2);
        }
        return cpVar;
    }
}
