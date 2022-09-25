package androidx.media3.p174ui;

import android.support.p033v7.widget.LinearLayoutManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.media3.common.p135a.C2566b;
import com.google.common.base.C58839bc;

/* renamed from: androidx.media3.ui.v */
/* compiled from: PG */
final class C3658v {
    /* renamed from: a */
    public static float m10613a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }

    /* renamed from: b */
    public static void m10614b(C2566b bVar) {
        bVar.f7075k = -3.4028235E38f;
        bVar.f7074j = LinearLayoutManager.INVALID_OFFSET;
        CharSequence charSequence = bVar.f7065a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                bVar.f7065a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = bVar.f7065a;
            charSequence2.getClass();
            m10615c((Spannable) charSequence2, C3657u.f11789a);
        }
    }

    /* renamed from: c */
    public static void m10615c(Spannable spannable, C58839bc bcVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (bcVar.mo5941a(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
