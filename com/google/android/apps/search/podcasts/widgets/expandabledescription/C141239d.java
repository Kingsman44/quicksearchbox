package com.google.android.apps.search.podcasts.widgets.expandabledescription;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.XMLReader;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.expandabledescription.d */
/* compiled from: PG */
public final class C141239d implements Html.TagHandler {

    /* renamed from: a */
    public static final /* synthetic */ int f383448a = 0;

    /* renamed from: b */
    private final ArrayDeque f383449b = new ArrayDeque();

    /* renamed from: a */
    private final void m229259a(boolean z, int i) {
        if (z) {
            this.f383449b.push(Integer.valueOf(i));
        } else if (!this.f383449b.isEmpty()) {
            this.f383449b.pop();
        }
    }

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        String str2;
        Integer num;
        C69664n.m101061g(str, "tag");
        C69664n.m101061g(editable, "output");
        C69664n.m101061g(xMLReader, "xmlReader");
        int hashCode = str.hashCode();
        if (hashCode != 3165143) {
            if (hashCode != 3165239) {
                if (hashCode == 3165425 && str.equals("gaul")) {
                    m229259a(z, -1);
                }
            } else if (str.equals("gaol")) {
                m229259a(z, 0);
            }
        } else if (str.equals("gali") && z) {
            if (this.f383449b.isEmpty() || ((num = (Integer) this.f383449b.peek()) != null && num.equals(-1))) {
                str2 = "•   ";
            } else {
                int intValue = ((Number) this.f383449b.pop()).intValue() + 1;
                this.f383449b.push(Integer.valueOf(intValue));
                str2 = intValue + ".   ";
            }
            editable.append("\n".concat(str2));
        }
    }
}
