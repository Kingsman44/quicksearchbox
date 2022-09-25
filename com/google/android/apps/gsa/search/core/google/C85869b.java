package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.google.b */
/* compiled from: PG */
public final class C85869b {

    /* renamed from: a */
    private final C85929cw f232177a;

    /* renamed from: b */
    private final C86130z f232178b;

    public C85869b(C85929cw cwVar, C86130z zVar) {
        this.f232177a = cwVar;
        this.f232178b = zVar;
    }

    /* renamed from: a */
    public final boolean mo79502a(Uri uri) {
        return this.f232177a.mo79576q(uri) != null || mo79503b(uri);
    }

    /* renamed from: b */
    public final boolean mo79503b(Uri uri) {
        String path;
        if (uri.isHierarchical() && this.f232178b.mo79764c(R.string.conversion_tracked_ad_url_hostname).equals(uri.getHost()) && (path = uri.getPath()) != null) {
            for (String startsWith : this.f232178b.mo79770k(R.array.google_clicked_ad_paths, false)) {
                if (path.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
