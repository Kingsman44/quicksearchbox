package com.google.android.libraries.search.assistant.p2828y.p2853n;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.n.k */
/* compiled from: PG */
public final /* synthetic */ class C37014k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C37015l f96386a;

    public /* synthetic */ C37014k(C37015l lVar) {
        this.f96386a = lVar;
    }

    public final Object apply(Object obj) {
        C37015l lVar = this.f96386a;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        try {
            PackageInfo packageInfo = lVar.f96388b.getPackageInfo(str, 0);
            if (!(packageInfo == null || packageInfo.applicationInfo == null)) {
                if (packageInfo.applicationInfo.enabled) {
                    return Optional.m71637of(lVar.f96389c.mo40608a(str, lVar.f96388b.getPackageInfo(str, 0), true, false));
                }
            }
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) C37015l.f96387a.mo56226d()).mo56382g(e)).mo56372aa(52488)).mo56389s("Failed to fetch sticky app; couldn't find package name %s", str);
            return Optional.empty();
        }
    }
}
