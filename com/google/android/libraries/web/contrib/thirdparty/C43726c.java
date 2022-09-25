package com.google.android.libraries.web.contrib.thirdparty;

import android.app.ActivityManager;
import android.net.Uri;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.contrib.thirdparty.c */
/* compiled from: PG */
public final class C43726c implements C43873a {

    /* renamed from: a */
    private static final C59071e f114062a = C59071e.m91332i("com.google.android.libraries.web.contrib.thirdparty.c");

    /* renamed from: b */
    private static final C58485gu f114063b = C58485gu.m89849q("javascript", "data", "file", "content");

    public C43726c(C43269t tVar, ActivityManager activityManager) {
        if (tVar.mo46385c().equals(C43271v.WEB_VIEW) && activityManager.isLowRamDevice()) {
            ((C59052c) ((C59052c) f114062a.mo56226d()).mo56372aa(54119)).mo56386p("Loading third-party URLs without out-of-process rendering is unsafe and will be unsupported in the future.");
        }
    }

    /* renamed from: a */
    public final boolean mo46765a(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        return Collection.EL.stream(f114063b).noneMatch(new C43725b(scheme.toLowerCase(Locale.US)));
    }
}
