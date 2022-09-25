package com.google.android.libraries.search.assistant.notification.p2711b;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import java.lang.Character;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.m */
/* compiled from: PG */
public final /* synthetic */ class C34865m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f92461a;

    public /* synthetic */ C34865m(String str) {
        this.f92461a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f92461a;
        Optional optional = (Optional) obj;
        Pattern pattern = C34866n.f92462a;
        if (optional.isPresent()) {
            return optional;
        }
        String trim = C34866n.f92462a.matcher(str).replaceAll(BuildConfig.FLAVOR).replaceAll("[@?]", BuildConfig.FLAVOR).replaceAll("\\s{2,}", " ").trim();
        int length = trim.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i >= trim.length()) {
                break;
            }
            char charAt = trim.charAt(i);
            if (z) {
                if (!(charAt == '-' || Character.isLetterOrDigit(charAt) || Character.getType(charAt) == 12 || Character.getType(charAt) == 6 || Character.UnicodeBlock.DEVANAGARI.equals(Character.UnicodeBlock.of(charAt)))) {
                    length = i;
                    break;
                }
            } else if (Character.isLetterOrDigit(charAt)) {
                z = true;
                i2 = i;
            }
            i++;
        }
        if (!z || length <= i2) {
            return Optional.empty();
        }
        return Optional.m71637of(trim.substring(i2, length).trim());
    }
}
