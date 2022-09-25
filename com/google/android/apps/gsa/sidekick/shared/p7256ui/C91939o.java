package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.text.Editable;
import android.text.Html;
import android.text.style.StrikethroughSpan;
import org.xml.sax.XMLReader;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.o */
/* compiled from: PG */
public final class C91939o implements Html.TagHandler {

    /* renamed from: a */
    static final C91938n f256404a = new C91938n();

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        Object obj;
        if (!"strike".equalsIgnoreCase(str)) {
            return;
        }
        if (z) {
            int length = editable.length();
            editable.setSpan(f256404a, length, length, 17);
            return;
        }
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length2 = editable.length();
        Object[] spans = editable.getSpans(0, editable.length(), C91938n.class);
        int length3 = spans.length;
        if (length3 == 0) {
            obj = null;
        } else {
            obj = spans[length3 - 1];
        }
        int spanStart = editable.getSpanStart(obj);
        editable.removeSpan(obj);
        if (spanStart != length2) {
            editable.setSpan(strikethroughSpan, spanStart, length2, 33);
        }
    }
}
