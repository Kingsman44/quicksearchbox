package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import androidx.core.p097i.C1975j;
import androidx.core.p097i.C1977l;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5478h.C69683b;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.d */
/* compiled from: PG */
public final class C9083d extends C69683b {

    /* renamed from: a */
    final /* synthetic */ C9084e f31330a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9083d(C9084e eVar) {
        super((Object) null);
        this.f31330a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17403a(C69713k kVar, Object obj, Object obj2) {
        C69664n.m101061g(kVar, "property");
        Typeface typeface = (Typeface) obj2;
        Typeface typeface2 = (Typeface) obj;
        C9084e eVar = this.f31330a;
        C1975j jVar = new C1975j(eVar.f31326c);
        while (jVar.hasNext()) {
            int intValue = Integer.valueOf(jVar.mo5128a()).intValue();
            SparseArray sparseArray = eVar.f31326c;
            Object obj3 = eVar.f31327d.get(intValue);
            C69664n.m101060f(obj3, "viewIdMap[it]");
            sparseArray.put(intValue, eVar.mo17395b((View) obj3));
        }
        Float a = eVar.mo17400a();
        if (a != null) {
            eVar.f31325b = Math.min(a.floatValue(), eVar.f31324a);
            Iterator a2 = C1977l.m5321a(eVar.f31327d);
            while (a2.hasNext()) {
                eVar.mo17396d((View) a2.next(), eVar.f31325b);
            }
        }
    }
}
