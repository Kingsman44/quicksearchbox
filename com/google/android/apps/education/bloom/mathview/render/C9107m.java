package com.google.android.apps.education.bloom.mathview.render;

import android.text.Editable;
import com.google.android.apps.education.bloom.mathview.render.comm.C9064h;
import com.google.android.apps.education.bloom.mathview.render.comm.KeyboardCommand;
import com.google.apps.p3589d.p3590a.C45705v;
import java.util.ArrayList;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.m */
/* compiled from: PG */
final class C9107m extends C69665o implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C69615a f31373a;

    /* renamed from: b */
    final /* synthetic */ LatexEditText f31374b;

    /* renamed from: c */
    final /* synthetic */ Editable f31375c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9107m(C69615a aVar, LatexEditText latexEditText, Editable editable) {
        super(3);
        this.f31373a = aVar;
        this.f31374b = latexEditText;
        this.f31375c = editable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C9111q qVar = (C9111q) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        C69664n.m101061g(qVar, "span");
        ArrayList<KeyboardCommand> arrayList = (ArrayList) this.f31373a.mo5672a();
        int selectionStart = this.f31374b.getSelectionStart() - intValue;
        int selectionEnd = this.f31374b.getSelectionEnd() - intValue;
        C69664n.m101061g(arrayList, "commands");
        C45705v vVar = qVar.f31381b;
        C69664n.m101061g(vVar, "editor");
        C69664n.m101061g(arrayList, "commands");
        if (arrayList.iterator().hasNext()) {
            C9064h.m23604a(selectionStart, selectionEnd);
            for (KeyboardCommand keyboardCommand : arrayList) {
                try {
                    C69664n.m101061g(vVar, "editor");
                    C9064h.m23604a(selectionStart, selectionEnd);
                    selectionEnd = keyboardCommand.mo17344a(vVar, selectionEnd);
                    selectionStart = selectionEnd;
                } catch (Throwable th) {
                    new StringBuilder("Failed to execute ").append(keyboardCommand);
                    throw new RuntimeException("Failed to execute ".concat(String.valueOf(keyboardCommand)), th);
                }
            }
            qVar.f31380a.mo49044i(qVar.f31381b);
            String b = qVar.mo17421b();
            this.f31375c.removeSpan(qVar);
            this.f31375c.replace(intValue, intValue2, b);
            if (!C69764m.m101229h(b)) {
                this.f31375c.setSpan(qVar, intValue, b.length(), 33);
            }
            this.f31374b.setSelection(intValue + selectionStart);
            return C69788q.f186170a;
        }
        throw new IllegalArgumentException("Command list cannot be empty");
    }
}
