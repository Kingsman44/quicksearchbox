package com.google.android.apps.gsa.search.core.google.p6796f;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.google.f.d */
/* compiled from: PG */
public final class C85982d {

    /* renamed from: a */
    private static final C59071e f232501a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.f.d");

    /* renamed from: a */
    public static void m138242a(C85981c cVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            cVar.mo79638d("source", str);
            return;
        }
        ((C59052c) ((C59052c) f232501a.mo56226d()).mo56372aa(8187)).mo56386p("Not setting source on url. This shouldn't happen. See go/agsa-sources.");
        int i = C90755l.f253831a;
    }
}
