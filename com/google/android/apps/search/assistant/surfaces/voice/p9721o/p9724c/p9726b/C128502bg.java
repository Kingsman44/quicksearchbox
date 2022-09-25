package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.content.res.Resources;
import android.text.Spanned;
import android.text.SpannedString;
import androidx.core.p096h.C1951d;
import java.util.ArrayList;
import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.bg */
/* compiled from: PG */
public final class C128502bg {
    /* renamed from: a */
    public static final Spanned m209703a(Resources resources, int i, Spanned... spannedArr) {
        C69664n.m101061g(resources, "<this>");
        C69664n.m101061g(spannedArr, "args");
        ArrayList arrayList = new ArrayList(r1);
        for (Spanned b : spannedArr) {
            arrayList.add(m209704b(b));
        }
        Object[] array = arrayList.toArray(new String[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        String b2 = m209704b(new SpannedString(resources.getText(i)));
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b2, Arrays.copyOf(copyOf, copyOf.length));
        C69664n.m101060f(format, "format(format, *args)");
        Spanned a = C1951d.m5280a(format, 0);
        C69664n.m101060f(a, "fromHtml(formatted, Html…at.FROM_HTML_MODE_LEGACY)");
        return a;
    }

    /* renamed from: b */
    public static final String m209704b(Spanned spanned) {
        C69664n.m101061g(spanned, "<this>");
        String c = C1951d.m5282c(spanned, 0);
        C69664n.m101060f(c, "toHtml(this, HtmlCompat.…AGRAPH_LINES_CONSECUTIVE)");
        String u = C69764m.m101201u(c, "<p dir=\"ltr\">", c);
        return C69764m.m101202v(u, "</p>", u);
    }
}
