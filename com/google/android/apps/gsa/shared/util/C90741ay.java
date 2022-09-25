package com.google.android.apps.gsa.shared.util;

import android.text.Annotation;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.ay */
/* compiled from: PG */
public final class C90741ay {

    /* renamed from: a */
    public static final C59071e f253816a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.ay");

    /* renamed from: a */
    public static CharSequence m148209a(CharSequence charSequence) {
        return (charSequence == null || (charSequence instanceof String) || (charSequence instanceof SpannedString)) ? charSequence : SpannedString.valueOf(charSequence);
    }

    /* renamed from: b */
    public static String m148210b(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return null;
        }
        for (Annotation annotation : (Annotation[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), Annotation.class)) {
            if (annotation.getKey().equals("recognizerLanguage")) {
                return annotation.getValue();
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m148211c(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Spanned spanned2 = (Spanned) charSequence2;
                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                Object[] spans2 = spanned2.getSpans(0, spanned2.length(), Object.class);
                if (spans.length != spans2.length) {
                    return false;
                }
                for (int i = 0; i < spans.length; i++) {
                    Object obj = spans[i];
                    Object obj2 = spans2[i];
                    if (!C58832aw.m90831a(obj, obj2) || spanned.getSpanStart(obj) != spanned2.getSpanStart(obj2) || spanned.getSpanEnd(obj) != spanned2.getSpanEnd(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!m148212d((Spanned) charSequence, Object.class)) {
                return true;
            } else {
                return false;
            }
        } else if (!(charSequence2 instanceof Spanned) || !m148212d((Spanned) charSequence2, Object.class)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m148212d(Spanned spanned, Class cls) {
        return spanned.getSpans(0, spanned.length(), cls).length != 0;
    }
}
