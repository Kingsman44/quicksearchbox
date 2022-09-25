package com.google.android.apps.education.bloom.mathview.render;

import android.text.Editable;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3594e.C45795y;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.o */
/* compiled from: PG */
final class C9109o extends C69665o implements C69631q {

    /* renamed from: a */
    final /* synthetic */ LatexEditText f31377a;

    /* renamed from: b */
    final /* synthetic */ Editable f31378b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9109o(LatexEditText latexEditText, Editable editable) {
        super(3);
        this.f31377a = latexEditText;
        this.f31378b = editable;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C9111q qVar = (C9111q) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        C69664n.m101061g(qVar, "span");
        this.f31377a.getSelectionStart();
        int selectionEnd = this.f31377a.getSelectionEnd() - intValue;
        C45705v vVar = qVar.f31381b;
        vVar.mo49801b(new C45685b(selectionEnd, selectionEnd));
        vVar.mo49802c();
        int a = ((C45795y) vVar).f120412h.mo49743a();
        qVar.f31380a.mo49044i(qVar.f31381b);
        String b = qVar.mo17421b();
        this.f31378b.removeSpan(qVar);
        this.f31378b.replace(intValue, intValue2, b);
        if (!C69764m.m101229h(b)) {
            this.f31378b.setSpan(qVar, intValue, b.length(), 33);
        }
        this.f31377a.setSelection(intValue + a);
        return C69788q.f186170a;
    }
}
