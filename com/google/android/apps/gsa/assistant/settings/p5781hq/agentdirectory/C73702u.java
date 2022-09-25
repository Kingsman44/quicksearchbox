package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.u */
/* compiled from: PG */
public final /* synthetic */ class C73702u implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ AgentDirectoryActivity f194950a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f194951b;

    public /* synthetic */ C73702u(AgentDirectoryActivity agentDirectoryActivity, Bundle bundle) {
        this.f194950a = agentDirectoryActivity;
        this.f194951b = bundle;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        AgentDirectoryActivity agentDirectoryActivity = this.f194950a;
        Bundle bundle = this.f194951b;
        C58976aa aaVar = C58975e.f156826a;
        if (agentDirectoryActivity.t) {
            return true;
        }
        if (i != -1) {
            agentDirectoryActivity.finish();
            return true;
        }
        agentDirectoryActivity.y(bundle);
        return true;
    }
}
