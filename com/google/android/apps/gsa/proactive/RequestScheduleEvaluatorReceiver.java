package com.google.android.apps.gsa.proactive;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class RequestScheduleEvaluatorReceiver extends C84157b {

    /* renamed from: c */
    public static final C59071e f229098c = C59071e.m91332i("com.google.android.apps.gsa.proactive.RequestScheduleEvaluatorReceiver");

    /* renamed from: d */
    public C68214a f229099d;

    /* renamed from: e */
    public C84175k f229100e;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(14);
        mo77588b(context);
        if (intent.getAction().equals("com.google.android.apps.gsa.kato.ACTION_CONTEXT_FENCE_TRANSITION")) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                ((C90929bz) this.f229099d.mo27525b()).mo85142g(this.f229100e.mo77641d(intent), new C84176l(goAsync()));
            } catch (RuntimeException e) {
                C59104x c = f229098c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "RequestScheduleEvalRcv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7071)).mo56386p("Failed to schedule transition");
            }
        } else {
            C59104x d = f229098c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RequestScheduleEvalRcv");
            ((C59052c) ((C59052c) d).mo56372aa(7069)).mo56389s("Unrecognized intent action %s", intent.getAction());
        }
    }
}
