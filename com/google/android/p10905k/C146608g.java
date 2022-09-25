package com.google.android.p10905k;

import android.content.ContentResolver;

/* renamed from: com.google.android.k.g */
/* compiled from: PG */
public final class C146608g extends C146609h {
    public C146608g(Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    /* renamed from: a */
    public final Integer mo123403a() {
        int i;
        ContentResolver contentResolver = C146609h.f395979a;
        String str = this.f395980b;
        int intValue = ((Integer) this.f395981c).intValue();
        Object b = C146606e.m238840b(contentResolver);
        Integer num = (Integer) C146606e.m238839a(C146606e.f395973h, str, Integer.valueOf(intValue));
        if (num != null) {
            i = num.intValue();
        } else {
            String c = C146606e.m238841c(contentResolver, str, (String) null);
            if (c != null) {
                try {
                    int parseInt = Integer.parseInt(c);
                    num = Integer.valueOf(parseInt);
                    intValue = parseInt;
                } catch (NumberFormatException unused) {
                }
            }
            C146606e.m238843e(b, C146606e.f395973h, str, num);
            i = intValue;
        }
        return Integer.valueOf(i);
    }
}
