package com.google.android.apps.education.bloom.mathview.render;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MetaKeyKeyListener;
import android.widget.TextView;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3594e.C45795y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.r */
/* compiled from: PG */
public final class C9112r extends ArrowKeyMovementMethod {

    /* renamed from: a */
    private static final C59071e f31384a = C59071e.m91331h();

    /* renamed from: c */
    protected static final boolean m23650c(Spannable spannable) {
        C69664n.m101061g(spannable, "buffer");
        return MetaKeyKeyListener.getMetaState(spannable, 1) == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17424a(TextView textView, Spannable spannable) {
        C69664n.m101061g(textView, "widget");
        C69664n.m101061g(spannable, "buffer");
        return super.left(textView, spannable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo17425b(TextView textView, Spannable spannable) {
        C69664n.m101061g(textView, "widget");
        C69664n.m101061g(spannable, "buffer");
        return super.right(textView, spannable);
    }

    /* access modifiers changed from: protected */
    public final boolean left(TextView textView, Spannable spannable) {
        C69664n.m101061g(textView, "widget");
        C69664n.m101061g(spannable, "buffer");
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        C9111q[] qVarArr = (C9111q[]) spannable.getSpans(selectionStart, selectionStart, C9111q.class);
        C69664n.m101060f(qVarArr, "selectedLatexSpans");
        int length = qVarArr.length;
        if (length == 0) {
            return mo17424a(textView, spannable);
        }
        if (length > 1) {
            C59052c cVar = (C59052c) f31384a.mo56226d();
            cVar.mo56379ah(new C59094n(5));
            cVar.mo56386p("More than one LatexMathSpan at end");
            return true;
        }
        C9111q qVar = (C9111q) C69531o.m100933j(qVarArr);
        int spanStart = spannable.getSpanStart(qVar);
        if (spanStart == selectionStart) {
            return mo17424a(textView, spannable);
        }
        int i = selectionEnd - spanStart;
        C45705v vVar = qVar.f31381b;
        vVar.mo49801b(new C45685b(i, i));
        vVar.mo49803d(1);
        int a = spanStart + ((C45795y) vVar).f120412h.mo49743a();
        if (m23650c(spannable)) {
            Selection.setSelection(spannable, selectionStart, a);
        } else {
            Selection.setSelection(spannable, Math.min(selectionStart, a));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean right(TextView textView, Spannable spannable) {
        C69664n.m101061g(textView, "widget");
        C69664n.m101061g(spannable, "buffer");
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        C9111q[] qVarArr = (C9111q[]) spannable.getSpans(selectionEnd, selectionEnd, C9111q.class);
        C69664n.m101060f(qVarArr, "selectedLatexSpans");
        int length = qVarArr.length;
        if (length == 0) {
            return mo17425b(textView, spannable);
        }
        if (length > 1) {
            C59052c cVar = (C59052c) f31384a.mo56226d();
            cVar.mo56379ah(new C59094n(6));
            cVar.mo56386p("More than one LatexMathSpan at end");
            return true;
        }
        C9111q qVar = (C9111q) C69531o.m100933j(qVarArr);
        int spanStart = spannable.getSpanStart(qVar);
        if (spannable.getSpanEnd(qVar) == selectionEnd) {
            return mo17425b(textView, spannable);
        }
        int i = selectionEnd - spanStart;
        C45705v vVar = qVar.f31381b;
        vVar.mo49801b(new C45685b(i, i));
        vVar.mo49803d(2);
        int a = spanStart + ((C45795y) vVar).f120412h.mo49743a();
        if (m23650c(spannable)) {
            Selection.setSelection(spannable, selectionStart, a);
        } else {
            Selection.setSelection(spannable, Math.max(selectionStart, a));
        }
        return true;
    }
}
