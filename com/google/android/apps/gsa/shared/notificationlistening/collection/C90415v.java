package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.v */
/* compiled from: PG */
public final class C90415v extends C90399f {

    /* renamed from: a */
    private static final Pattern f252507a = Pattern.compile("⁨(.*)⁩.*");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo84104a(Context context, C90396c cVar, C60242lp lpVar, boolean z) {
        CharSequence charSequence = cVar.f252472b;
        if (charSequence == null) {
            C90366ae.m146974m(lpVar, 11, Collections.singletonList(C60244lr.NO_EXTRA_TITLE_OR_EXTRA_TEXT));
            return null;
        }
        Matcher matcher = f252507a.matcher(charSequence);
        if (matcher.matches()) {
            return C90391y.m146997d(matcher.group(1));
        }
        return cVar.f252472b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo84105b() {
        return 11;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C90389w mo84101i(Context context, Notification notification, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.toString().toLowerCase(Locale.US).equals("video")) {
            return new C90389w(context.getString(R.string.shared_video), "video");
        }
        if (charSequence.toString().toLowerCase(Locale.US).equals("audio")) {
            return new C90389w(context.getString(R.string.shared_audio), "audio");
        }
        return charSequence.toString().toLowerCase(Locale.US).equals("image") ? new C90389w(context.getString(R.string.shared_photo), "image") : new C90389w(charSequence, "text/plain");
    }
}
