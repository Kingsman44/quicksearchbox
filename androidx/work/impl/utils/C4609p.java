package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C4380ad;

/* renamed from: androidx.work.impl.utils.p */
/* compiled from: PG */
public final class C4609p {

    /* renamed from: a */
    private static final String f14501a = C4380ad.m12561i("PackageManagerHelper");

    /* renamed from: a */
    public static void m13004a(Context context, Class cls, boolean z) {
        String str;
        String str2 = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            C4380ad h = C4380ad.m12560h();
            String str3 = f14501a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (true != z) {
                str = str2;
            } else {
                str = "enabled";
            }
            sb.append(str);
            h.mo9309a(str3, sb.toString());
        } catch (Exception e) {
            C4380ad h2 = C4380ad.m12560h();
            String str4 = f14501a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (true == z) {
                str2 = "enabled";
            }
            sb2.append(str2);
            h2.mo9310b(str4, sb2.toString(), e);
        }
    }
}
