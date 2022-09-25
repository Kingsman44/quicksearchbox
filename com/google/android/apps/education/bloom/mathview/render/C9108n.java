package com.google.android.apps.education.bloom.mathview.render;

import android.text.Editable;
import com.evernote.android.state.BuildConfig;
import p5462h.C69788q;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.n */
/* compiled from: PG */
final class C9108n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ LatexEditText f31376a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9108n(LatexEditText latexEditText) {
        super(1);
        this.f31376a = latexEditText;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C9111q qVar;
        C69615a aVar = (C69615a) obj;
        C69664n.m101061g(aVar, "getCommandsFn");
        Editable text = this.f31376a.getText();
        if (text != null) {
            if (this.f31376a.getSelectionStart() != this.f31376a.getSelectionEnd()) {
                text.clear();
            }
            LatexEditText latexEditText = this.f31376a;
            C9107m mVar = new C9107m(aVar, latexEditText, text);
            C9111q[] qVarArr = (C9111q[]) text.getSpans(latexEditText.getSelectionStart(), this.f31376a.getSelectionEnd(), C9111q.class);
            C69788q qVar2 = null;
            if (!(qVarArr == null || (qVar = (C9111q) C69531o.m100934k(qVarArr)) == null)) {
                mVar.mo17419a(qVar, Integer.valueOf(text.getSpanStart(qVar)), Integer.valueOf(text.getSpanEnd(qVar)));
                qVar2 = C69788q.f186170a;
            }
            if (qVar2 == null) {
                LatexEditText latexEditText2 = this.f31376a;
                C9111q b = latexEditText2.mo17329b(BuildConfig.FLAVOR);
                if (b != null) {
                    mVar.mo17419a(b, Integer.valueOf(latexEditText2.getSelectionStart()), Integer.valueOf(latexEditText2.getSelectionEnd()));
                } else {
                    throw new RuntimeException("Failed to create empty math span");
                }
            }
            this.f31376a.invalidate();
            this.f31376a.requestLayout();
        }
        return C69788q.f186170a;
    }
}
