package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.af */
/* compiled from: PG */
public final class C90722af {

    /* renamed from: a */
    public static final /* synthetic */ int f253805a = 0;

    /* renamed from: b */
    private static final C58528ij f253806b = new C58759qy("com.google.android.apps.gsa.staticplugins.opa.errorui.UdcPuntCardActivity");

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m148173a(android.content.Intent r7) {
        /*
            android.net.Uri r0 = r7.getData()
            r1 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r3 = r1
            goto L_0x0036
        L_0x000a:
            android.net.Uri r0 = r7.getData()
            java.lang.String r3 = "agsa"
            java.lang.String r4 = r0.getScheme()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0008
            java.lang.String r3 = "id"
            java.lang.String r3 = r0.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0008
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0027 }
            goto L_0x0036
        L_0x0027:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.shared.p6997as.p6998a.C89288b.f242088a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "Error parsing Uri %s"
            r6 = 11071(0x2b3f, float:1.5514E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r6)).mo56389s(r5, r0)
            goto L_0x0008
        L_0x0036:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "handover-session-id"
            long r0 = r7.getLongExtra(r0, r1)
            return r0
        L_0x0041:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C90722af.m148173a(android.content.Intent):long");
    }

    /* renamed from: b */
    public static boolean m148174b(Intent intent) {
        return m148173a(intent) != 0;
    }

    /* renamed from: c */
    public static boolean m148175c(Context context, Intent intent, boolean z) {
        List<ResolveInfo> list;
        if (intent == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        C90476a aVar = C91018d.f254254a;
        if (intent.getComponent() != null) {
            list = packageManager.queryIntentActivities(intent, 0);
        } else {
            list = packageManager.queryIntentActivities(intent, 65536);
        }
        if (z) {
            for (ResolveInfo next : list) {
                if (next.activityInfo != null && !next.activityInfo.exported) {
                    C58528ij ijVar = f253806b;
                    if (!((C58759qy) ijVar).f156534a.equals(next.activityInfo.name)) {
                        return false;
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m148176d(Intent intent) {
        return TextUtils.equals(intent.getAction(), "android.intent.action.MAIN");
    }
}
