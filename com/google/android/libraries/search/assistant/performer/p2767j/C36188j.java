package com.google.android.libraries.search.assistant.performer.p2767j;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.j */
/* compiled from: PG */
public final class C36188j {
    /* renamed from: a */
    public static List m64589a(List list, PackageManager packageManager) {
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            ComponentInfo componentInfo = resolveInfo.activityInfo == null ? resolveInfo.serviceInfo : resolveInfo.activityInfo;
            if (componentInfo != null) {
                String obj = packageManager.getApplicationLabel(componentInfo.applicationInfo).toString();
                String str = componentInfo.packageName;
                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
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
                ggVar.copyOnWrite();
                C51098gh ghVar = (C51098gh) ggVar.instance;
                C51058ev evVar3 = (C51058ev) esVar.build();
                evVar3.getClass();
                ghVar.f133013c = evVar3;
                ghVar.f133012b = 1;
                d.add((C51098gh) ggVar.build());
            }
        }
        return d;
    }

    /* renamed from: b */
    public static List m64590b(Intent intent, PackageManager packageManager) {
        if (intent.getComponent() != null) {
            return packageManager.queryIntentActivities(intent, 0);
        }
        return packageManager.queryIntentActivities(intent, 65664);
    }
}
