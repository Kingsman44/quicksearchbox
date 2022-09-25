package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.text.Editable;
import android.text.Html;
import android.text.style.RelativeSizeSpan;
import org.xml.sax.XMLReader;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.p */
/* compiled from: PG */
final class C104970p implements Html.TagHandler {
    /* renamed from: a */
    private static void m174025a(boolean z, Editable editable, Object obj, float f) {
        Object obj2;
        if (z) {
            int length = editable.length();
            editable.setSpan(obj, length, length, 17);
            return;
        }
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length2 = editable.length();
        Object[] spans = editable.getSpans(0, editable.length(), obj.getClass());
        int length3 = spans.length;
        if (length3 == 0) {
            obj2 = null;
        } else {
            obj2 = spans[length3 - 1];
        }
        if (obj2 != null) {
            int spanStart = editable.getSpanStart(obj2);
            editable.removeSpan(obj2);
            if (spanStart != length2) {
                editable.setSpan(relativeSizeSpan, spanStart, length2, 33);
            }
        }
    }

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if ("large".equalsIgnoreCase(str)) {
            m174025a(z, editable, new C104967m(), 2.0f);
        } else if ("xlarge".equalsIgnoreCase(str)) {
            m174025a(z, editable, new C104968n(), 3.0f);
        } else if ("xxlarge".equalsIgnoreCase(str)) {
            m174025a(z, editable, new C104969o(), 4.0f);
        }
    }
}
