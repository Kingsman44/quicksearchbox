package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import android.text.SpannableStringBuilder;
import com.google.assistant.p3897e.p3921j.p3922a.C51654l;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.d */
/* compiled from: PG */
public final class C130306d {

    /* renamed from: a */
    private static final C59071e f357177a = C59071e.m91331h();

    /* renamed from: a */
    public static final CharSequence m212747a(C51656n nVar, boolean z) {
        C69664n.m101061g(nVar, "args");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nVar.f134600b);
        for (C51655m mVar : nVar.f134601c) {
            int i = mVar.f134591a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                C69664n.m101060f(mVar, "span");
                int i2 = mVar.f134592b;
                int min = Math.min(mVar.f134593c, spannableStringBuilder.length());
                if (spannableStringBuilder.length() == 0) {
                    C59052c cVar = (C59052c) f357177a.mo56226d();
                    cVar.mo56379ah(new C59094n(38805));
                    cVar.mo56386p("#setHighlightSpan: Text is empty.");
                } else if (min <= i2) {
                    C59052c cVar2 = (C59052c) f357177a.mo56226d();
                    cVar2.mo56379ah(new C59094n(38804));
                    cVar2.mo56386p("#setHighlightSpan: Range is empty or negative.");
                } else {
                    boolean isWhitespace = Character.isWhitespace(spannableStringBuilder.charAt(i2));
                    int i3 = i2 + 1;
                    while (i3 < min) {
                        if (isWhitespace != Character.isWhitespace(spannableStringBuilder.charAt(i3))) {
                            m212748b(spannableStringBuilder, i2, i3, mVar, z);
                            isWhitespace = !isWhitespace;
                            i2 = i3;
                        }
                        i3++;
                    }
                    m212748b(spannableStringBuilder, i2, i3, mVar, z);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private static final void m212748b(SpannableStringBuilder spannableStringBuilder, int i, int i2, C51655m mVar, boolean z) {
        int a;
        if (z || (a = C51654l.m86264a(mVar.f134594d)) == 0 || a == 1) {
            spannableStringBuilder.setSpan(new TranscriptionBackgroundColorSpan(mVar), i, i2, 17);
        } else {
            spannableStringBuilder.setSpan(new TranscriptionUnderlineSpan(mVar), i, i2, 17);
        }
    }
}
