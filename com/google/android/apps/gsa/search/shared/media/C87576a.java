package com.google.android.apps.gsa.search.shared.media;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.shared.media.a */
/* compiled from: PG */
public final class C87576a {

    /* renamed from: a */
    private static final C59071e f236617a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.media.a");

    /* renamed from: b */
    private final C68214a f236618b;

    public C87576a(C68214a aVar) {
        this.f236618b = aVar;
    }

    /* renamed from: a */
    public final boolean mo81719a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ApplicationInfo applicationInfo = ((PackageManager) this.f236618b.mo27525b()).getApplicationInfo(str, 0);
                if (applicationInfo == null || applicationInfo.category != 1) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f236617a.mo56226d()).mo56382g(e)).mo56372aa(9613)).mo56389s("Failed to retrieve application info for package %s", str);
            }
        }
        return false;
    }
}
