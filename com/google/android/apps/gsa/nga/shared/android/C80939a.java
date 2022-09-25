package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.a */
/* compiled from: PG */
public final class C80939a {

    /* renamed from: a */
    private static final C58974d f221915a = C58974d.m91136j();

    /* renamed from: b */
    private final PackageManager f221916b;

    /* renamed from: c */
    private final C80947c f221917c;

    public C80939a(PackageManager packageManager, C80947c cVar) {
        this.f221916b = packageManager;
        this.f221917c = cVar;
    }

    /* renamed from: a */
    public final Optional mo74724a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of(Intent.parseUri(str, 0));
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) f221915a.mo56226d()).mo56382g(e)).mo56372aa(5787)).mo56389s("Can't parse Intent from  uri: %s", str);
            return Optional.empty();
        }
    }

    /* renamed from: b */
    public final Optional mo74725b(Intent intent, boolean z) {
        ResolveInfo resolveActivity = this.f221916b.resolveActivity(intent, 0);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName == null) {
            return Optional.empty();
        }
        String str = resolveActivity.activityInfo.packageName;
        if (z || !this.f221917c.mo74732b(str)) {
            return Optional.m71637of(str);
        }
        return Optional.empty();
    }
}
