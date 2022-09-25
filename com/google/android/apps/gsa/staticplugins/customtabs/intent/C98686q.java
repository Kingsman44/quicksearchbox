package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.q */
/* compiled from: PG */
public final class C98686q {

    /* renamed from: a */
    public final Context f275672a;

    public C98686q(Context context) {
        this.f275672a = context;
    }

    /* renamed from: b */
    public static final boolean m163479b(ResolveInfo resolveInfo, C98574j jVar) {
        if (resolveInfo.activityInfo == null) {
            return false;
        }
        return jVar.mo91179a().contains(resolveInfo.activityInfo.packageName);
    }

    /* renamed from: c */
    public static final boolean m163480c(List list, C98574j jVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!m163479b((ResolveInfo) it.next(), jVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List mo91262a(Intent intent) {
        C90476a aVar = C91018d.f254254a;
        return this.f275672a.getPackageManager().queryIntentActivities(intent, 65536);
    }
}
