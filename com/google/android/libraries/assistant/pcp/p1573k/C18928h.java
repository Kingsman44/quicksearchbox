package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.h */
/* compiled from: PG */
public final class C18928h {

    /* renamed from: a */
    private static final C59071e f53225a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.h");

    /* renamed from: b */
    private final C68214a f53226b;

    public C18928h(C68214a aVar) {
        this.f53226b = aVar;
    }

    /* renamed from: a */
    public final boolean mo24225a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ApplicationInfo applicationInfo = ((PackageManager) this.f53226b.mo27525b()).getApplicationInfo(str, 0);
                if (applicationInfo == null || applicationInfo.category != 1) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                C59104x d = f53225a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TNG.MediaApps");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(47364)).mo56389s("Failed to retrieve application info for package %s", str);
            }
        }
        return false;
    }
}
