package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85869b;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.a */
/* compiled from: PG */
public final class C98667a {

    /* renamed from: c */
    private static final Pattern f275620c = Pattern.compile("[?&]adurl(=([^&]*))?(&|$)");

    /* renamed from: d */
    private static final C59071e f275621d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.intent.a");

    /* renamed from: a */
    public final C60950i f275622a;

    /* renamed from: b */
    public final C84474e f275623b;

    /* renamed from: e */
    private final C85869b f275624e;

    public C98667a(C60950i iVar, C85869b bVar, C84474e eVar) {
        this.f275622a = iVar;
        this.f275624e = bVar;
        this.f275623b = eVar;
    }

    /* renamed from: a */
    public final Uri mo91249a(Uri uri, Instant instant) {
        if (!this.f275624e.mo79503b(uri)) {
            return uri;
        }
        String uri2 = uri.toString();
        Matcher matcher = f275620c.matcher(uri2);
        if (!matcher.find()) {
            return uri;
        }
        String substring = uri2.substring(matcher.start() + 1);
        try {
            return Uri.parse(uri2.substring(0, matcher.start() + 1) + ("cst=" + instant.toEpochMilli()) + "&" + substring);
        } catch (ArithmeticException e) {
            ((C59052c) ((C59052c) ((C59052c) f275621d.mo56226d()).mo56382g(e)).mo56372aa(19184)).mo56386p("Parameter value overflow.");
            return uri;
        }
    }
}
