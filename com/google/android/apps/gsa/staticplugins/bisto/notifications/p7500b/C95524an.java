package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.TtsSpan;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import java.util.Calendar;
import java.util.Date;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.an */
/* compiled from: PG */
public final class C95524an implements C95538m {

    /* renamed from: a */
    private final Context f267317a;

    /* renamed from: b */
    private final C95307m f267318b;

    /* renamed from: c */
    private final C21370a f267319c;

    /* renamed from: d */
    private final Optional f267320d;

    public C95524an(Context context, C95307m mVar, C21370a aVar, Optional optional) {
        this.f267317a = context;
        this.f267318b = mVar;
        this.f267319c = aVar;
        this.f267320d = optional;
    }

    /* renamed from: a */
    public final C94640d mo89393a() {
        Context context = this.f267317a;
        Long valueOf = Long.valueOf(this.f267319c.mo26870b());
        Object[] objArr = {valueOf};
        Long l = valueOf;
        long longValue = valueOf.longValue();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(longValue);
        SpannableString spannableString = new SpannableString(DateFormat.getTimeFormat(context).format(new Date(longValue)));
        spannableString.setSpan(new TtsSpan.TimeBuilder(instance.get(10), instance.get(12)).build(), 0, spannableString.length(), 17);
        objArr[0] = spannableString;
        String obj = context.getString(R.string.time_announcement, objArr).toString();
        if (this.f267320d.isPresent()) {
            obj = String.format("%s %s", new Object[]{obj, this.f267320d.get()});
        }
        return new C95523am(this.f267317a, this.f267318b, this.f267319c, obj);
    }

    /* renamed from: b */
    public final void mo89394b() {
    }

    /* renamed from: c */
    public final boolean mo89395c() {
        return false;
    }
}
