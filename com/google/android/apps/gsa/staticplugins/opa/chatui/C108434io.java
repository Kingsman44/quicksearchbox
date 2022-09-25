package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.libraries.logging.C28285c;
import com.google.assistant.p3897e.p3921j.p3922a.C51652j;
import com.google.assistant.p3897e.p3921j.p3922a.C51654l;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.io */
/* compiled from: PG */
public final class C108434io extends LinkMovementMethod {

    /* renamed from: a */
    private final C108321ej f301629a;

    public C108434io(C108321ej ejVar) {
        this.f301629a = ejVar;
    }

    /* renamed from: a */
    private final boolean m180255a(TextView textView, Spannable spannable, C51655m mVar) {
        int a;
        if (mVar == null || (mVar.f134591a & 8) == 0 || (a = C51652j.m86263a(mVar.f134595e)) == 0 || a == 1 || spannable.length() <= 0 || this.f301629a == null) {
            return false;
        }
        C108488w wVar = new C108488w();
        wVar.f301856b = spannable.toString();
        wVar.f301857c = 0;
        wVar.f301858d = new C90735as(mVar.f134592b, mVar.f134593c);
        wVar.f301859e = true;
        int a2 = C51654l.m86264a(mVar.f134594d);
        wVar.f301860f = Boolean.valueOf(a2 == 0 || a2 == 1);
        wVar.f301861g = C58833ax.m90834k((List) Collection.EL.stream(mVar.f134596f).map(C108433in.f301628a).collect(C58370cn.f155946a));
        C89949q.m146521e(C28285c.m52882i(textView, 39, (Integer) null), false);
        this.f301629a.mo96780b(wVar.mo96774a());
        return true;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY), (float) ((((int) x) - totalPaddingLeft) + scrollX));
            C108432im[] imVarArr = (C108432im[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C108432im.class);
            if (imVarArr != null && imVarArr.length > 0) {
                return m180255a(textView, spannable, imVarArr[0].f301624a);
            }
            ComboBoxUnderlineSpan[] comboBoxUnderlineSpanArr = (ComboBoxUnderlineSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ComboBoxUnderlineSpan.class);
            if (comboBoxUnderlineSpanArr != null && comboBoxUnderlineSpanArr.length > 0) {
                return m180255a(textView, spannable, comboBoxUnderlineSpanArr[0].f300888a);
            }
            ComboBoxBackgroundColorSpan[] comboBoxBackgroundColorSpanArr = (ComboBoxBackgroundColorSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ComboBoxBackgroundColorSpan.class);
            if (comboBoxBackgroundColorSpanArr != null && comboBoxBackgroundColorSpanArr.length > 0) {
                return m180255a(textView, spannable, comboBoxBackgroundColorSpanArr[0].f300887a);
            }
        }
        return false;
    }
}
