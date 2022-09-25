package androidx.core.content;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import androidx.core.content.p091b.C1874w;
import androidx.core.p094f.C1888a;
import androidx.core.p097i.C1969d;

/* renamed from: androidx.core.content.h */
/* compiled from: PG */
public class C1882h {
    /* renamed from: c */
    public static int m5137c(Context context, String str) {
        C1969d.m5306a(str, "permission must be non-null");
        if (C1888a.m5150d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C1793aj.m4937b(new C1800aq(context).f5622a) ? 0 : -1;
    }

    /* renamed from: d */
    public static ColorStateList m5138d(Context context, int i) {
        return C1874w.m5105b(context.getResources(), i, context.getTheme());
    }
}
