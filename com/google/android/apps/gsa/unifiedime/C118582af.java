package com.google.android.apps.gsa.unifiedime;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.af */
/* compiled from: PG */
final class C118582af {

    /* renamed from: a */
    public String f330844a;

    /* renamed from: b */
    public final List f330845b = new ArrayList();

    /* renamed from: a */
    public final void mo103771a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f330844a;
            if (str2 == null) {
                this.f330844a = str;
            } else if (!TextUtils.equals(str2, str) && !this.f330845b.contains(str)) {
                this.f330845b.add(str);
            }
        }
    }
}
