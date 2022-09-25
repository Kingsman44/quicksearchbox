package com.google.android.apps.search.googleapp.amp.silk;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.amp.p10138a.C133459h;
import com.google.android.apps.search.googleapp.amp.p10138a.C133460i;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.c */
/* compiled from: PG */
public final class C133467c {

    /* renamed from: a */
    private static final C59071e f363682a = C59071e.m91332i("com.google.android.apps.search.googleapp.amp.silk.c");

    /* renamed from: b */
    private final Context f363683b;

    /* renamed from: c */
    private final String f363684c;

    /* renamed from: d */
    private final boolean f363685d;

    public C133467c(Context context, String str, boolean z) {
        this.f363683b = context;
        this.f363684c = str;
        this.f363685d = z;
    }

    /* renamed from: a */
    public final Uri mo111182a(Uri uri, Instant instant) {
        String str;
        C133459h b = mo111183b(uri);
        if (this.f363685d) {
            try {
                str = String.valueOf(instant.toEpochMilli());
            } catch (ArithmeticException e) {
                ((C59052c) ((C59052c) ((C59052c) f363682a.mo56226d()).mo56382g(e)).mo56372aa(40053)).mo56386p("Invalid amp_ct timestamp");
                str = null;
            }
            if (str != null) {
                b.mo111165c("amp_ct", str);
            }
        }
        return b.mo111163a();
    }

    /* renamed from: b */
    public final C133459h mo111183b(Uri uri) {
        C133459h a = C133460i.m216626a(uri);
        a.mo111166d("amp_gsa", "1");
        a.mo111165c("referrer", Uri.encode("https://www.google.com"));
        a.mo111165c("amp_tf", Uri.encode(this.f363683b.getString(R.string.amp_cache_source_header)));
        if (!this.f363684c.isEmpty()) {
            a.mo111165c("amp_agsa_csa", Uri.encode(this.f363684c));
        }
        return a;
    }
}
