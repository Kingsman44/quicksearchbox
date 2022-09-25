package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.a */
/* compiled from: PG */
public final class C85713a {

    /* renamed from: a */
    private final PackageManager f231783a;

    public C85713a(PackageManager packageManager) {
        this.f231783a = packageManager;
    }

    /* renamed from: a */
    public final C58833ax mo79363a(String str) {
        for (C51058ev evVar : mo79364b()) {
            if (C58890d.m90990e(evVar.f132944b, str)) {
                return C58833ax.m90834k(evVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final List mo79364b() {
        ArrayList arrayList = new ArrayList();
        Intent action = new Intent().setAction("android.intent.action.MAIN");
        action.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = this.f231783a.queryIntentActivities(action, 0);
        if (queryIntentActivities == null) {
            return C58485gu.m89842j(arrayList);
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (!(next.activityInfo == null || next.activityInfo.applicationInfo == null || next.activityInfo.packageName == null)) {
                String str = next.activityInfo.packageName;
                CharSequence applicationLabel = this.f231783a.getApplicationLabel(next.activityInfo.applicationInfo);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                    String obj = applicationLabel.toString();
                    esVar.copyOnWrite();
                    C51058ev evVar = (C51058ev) esVar.instance;
                    obj.getClass();
                    evVar.f132943a |= 16;
                    evVar.f132948f = obj;
                    esVar.copyOnWrite();
                    C51058ev evVar2 = (C51058ev) esVar.instance;
                    str.getClass();
                    evVar2.f132943a |= 1;
                    evVar2.f132944b = str;
                    arrayList.add((C51058ev) esVar.build());
                }
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}
