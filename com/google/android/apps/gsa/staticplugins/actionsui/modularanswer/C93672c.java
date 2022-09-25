package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.google.common.base.C58827ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.c */
/* compiled from: PG */
public final class C93672c {
    /* renamed from: a */
    public static final CharSequence m154572a(String str, List list, int i) {
        if (list.isEmpty()) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pattern.quote(((String) it.next()).toLowerCase(Locale.getDefault())));
        }
        Pattern compile = Pattern.compile(String.format(Locale.getDefault(), "\\b(%s)\\b", new Object[]{new C58827ar("|").mo56097d(arrayList)}));
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = compile.matcher(str.toLowerCase(Locale.getDefault()));
        while (matcher.find()) {
            spannableString.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 0);
        }
        return spannableString;
    }
}
