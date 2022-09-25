package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.b */
/* compiled from: PG */
public final class C130441b {
    /* renamed from: a */
    public static C58528ij m212876a(PackageManager packageManager) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("androidx.core.content.pm.SHORTCUT_LISTENER"), C89885b.S3REQUEST_VALUE);
        C58526ih ihVar = new C58526ih();
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo != null) {
                ihVar.mo55373c(next.activityInfo.packageName);
            }
        }
        return ihVar.mo55486f();
    }
}
