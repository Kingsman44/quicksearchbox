package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.C1824k;
import androidx.core.app.C1825l;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.content.k */
/* compiled from: PG */
public final class C1885k {
    /* renamed from: a */
    public static int m5142a(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d = C1824k.m5000d(str);
        if (d == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int myUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (myUid2 != myUid || !C1968c.m5305b(packageName2, packageName)) {
            i = C1824k.m4998b((AppOpsManager) C1824k.m4999c(context, AppOpsManager.class), d, packageName);
        } else {
            AppOpsManager b = C1825l.m5002b(context);
            i = C1825l.m5001a(b, d, Binder.getCallingUid(), packageName);
            if (i == 0) {
                i = C1825l.m5001a(b, d, myUid, C1825l.m5003c(context));
            }
        }
        if (i != 0) {
            return -2;
        }
        return 0;
    }
}
