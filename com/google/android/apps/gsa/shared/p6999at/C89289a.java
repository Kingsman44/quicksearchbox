package com.google.android.apps.gsa.shared.p6999at;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.at.a */
/* compiled from: PG */
public final class C89289a {

    /* renamed from: a */
    private static final C59071e f242089a = C59071e.m91332i("com.google.android.apps.gsa.shared.at.a");

    /* renamed from: b */
    private final C91142g f242090b;

    public C89289a(C91142g gVar) {
        this.f242090b = gVar;
    }

    /* renamed from: a */
    public final ResolveInfo mo83229a(Context context) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        try {
            Intent intent = new Intent();
            intent.setAction("com.google.android.googlequicksearchbox.REQUEST_MINUS_ONE_CONTENT");
            for (ResolveInfo next : packageManager.queryIntentServices(intent, 128)) {
                int i = next.serviceInfo.applicationInfo.flags;
                boolean z = false;
                if (this.f242090b.mo85405j(C90138q.f251851y) && (i & 2) != 0) {
                    z = true;
                }
                boolean j = this.f242090b.mo85405j(C90138q.f251847u);
                if (((i & 1) != 0 || z || j) && (string = next.serviceInfo.metaData.getString("partner_id")) != null && string.matches("^[a-zA-Z_-]+$")) {
                    return next;
                }
            }
            return null;
        } catch (NullPointerException e) {
            C59104x c = f242089a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SMOUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11072)).mo56386p("Failed to load partner package meta-data, NullPointer");
            return null;
        }
    }

    /* renamed from: b */
    public final String mo83230b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.google.android.googlequicksearchbox.REQUEST_MINUS_ONE_CONTENT");
        return packageManager.resolveService(intent, 128).serviceInfo.metaData.getString("partner_id");
    }
}
