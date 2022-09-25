package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.assistant.p3897e.p3921j.p3922a.C51652j;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.e */
/* compiled from: PG */
public final class C130307e extends LinkMovementMethod {

    /* renamed from: a */
    private final C130305c f357178a;

    public C130307e(C130305c cVar) {
        C69664n.m101061g(cVar, "handler");
        this.f357178a = cVar;
    }

    /* renamed from: a */
    private final boolean m212749a(String str, Spannable spannable, C51655m mVar) {
        int a;
        if ((mVar.f134591a & 8) == 0 || (a = C51652j.m86263a(mVar.f134595e)) == 0 || a == 1 || spannable.length() <= 0) {
            return false;
        }
        this.f357178a.mo109504a(str, mVar);
        return true;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C69664n.m101061g(textView, "textView");
        C69664n.m101061g(spannable, "buffer");
        C69664n.m101061g(motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY), (float) ((((int) x) - totalPaddingLeft) + scrollX));
            TranscriptionUnderlineSpan[] transcriptionUnderlineSpanArr = (TranscriptionUnderlineSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TranscriptionUnderlineSpan.class);
            if (transcriptionUnderlineSpanArr != null && transcriptionUnderlineSpanArr.length > 0) {
                return m212749a(textView.getText().toString(), spannable, transcriptionUnderlineSpanArr[0].f357174a);
            }
            TranscriptionBackgroundColorSpan[] transcriptionBackgroundColorSpanArr = (TranscriptionBackgroundColorSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TranscriptionBackgroundColorSpan.class);
            if (transcriptionBackgroundColorSpanArr != null && transcriptionBackgroundColorSpanArr.length > 0) {
                return m212749a(textView.getText().toString(), spannable, transcriptionBackgroundColorSpanArr[0].f357173a);
            }
        }
        return false;
    }
}
