package com.google.android.apps.gsa.staticplugins.opa;

import android.app.ActivityManager;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lg */
/* compiled from: PG */
public final /* synthetic */ class C109434lg implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ OpaActivity f304762a;

    public /* synthetic */ C109434lg(OpaActivity opaActivity) {
        this.f304762a = opaActivity;
    }

    public final void run() {
        OpaActivity opaActivity = this.f304762a;
        int taskId = opaActivity.getTaskId();
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) opaActivity.getSystemService("activity")).getAppTasks();
        boolean z = !opaActivity.f295636V;
        for (ActivityManager.AppTask next : appTasks) {
            try {
                if (next.getTaskInfo().id == taskId) {
                    next.setExcludeFromRecents(z);
                }
            } catch (RuntimeException e) {
                C59104x c = OpaActivity.f295614j.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaActivity");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22908)).mo56389s("Error setExcludeFromRecents(%b)", Boolean.valueOf(z));
            }
        }
    }
}
