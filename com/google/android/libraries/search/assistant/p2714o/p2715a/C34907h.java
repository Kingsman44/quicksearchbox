package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.o.a.h */
/* compiled from: PG */
public final /* synthetic */ class C34907h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C34913n f92560a;

    public /* synthetic */ C34907h(C34913n nVar) {
        this.f92560a = nVar;
    }

    public final Object call() {
        C34913n nVar = this.f92560a;
        if (!nVar.mo39626d().isEmpty()) {
            String packageName = ((ComponentName) nVar.mo39626d().get(0)).getPackageName();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            try {
                ResolveInfo resolveActivity = nVar.f92569d.resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    ((C58970a) ((C58970a) C34913n.f92566a.mo56224b()).mo56372aa(51198)).mo56389s("Get launcher package: %s", resolveActivity.activityInfo.packageName);
                }
                if (resolveActivity != null) {
                    return Boolean.valueOf(packageName.equals(resolveActivity.activityInfo.packageName));
                }
                ((C58970a) ((C58970a) C34913n.f92566a.mo56226d()).mo56372aa(51199)).mo56386p("Getting launcher as null");
                return false;
            } catch (RuntimeException e) {
                ((C58970a) ((C58970a) C34913n.f92566a.mo56226d()).mo56372aa(51200)).mo56389s("Exception at getting launcher: %s", e.getMessage());
                return false;
            }
        } else {
            ((C58970a) ((C58970a) C34913n.f92566a.mo56226d()).mo56372aa(51201)).mo56386p("useGetRunningTasks() is empty, could not check if Launcher is in foreground");
            return false;
        }
    }
}
