package com.google.android.libraries.search.assistant.proactive.p2777i.p2778a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.search.assistant.proactive.C36372z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.d */
/* compiled from: PG */
public final class C36320d {

    /* renamed from: a */
    private static final C59071e f94833a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.i.a.d");

    /* renamed from: a */
    public static C58833ax m64807a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(str) || !str.startsWith("assistant-x-device-timer://android")) {
            return C58836b.f156633a;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("actionType");
        if (C58837ba.m90859h(queryParameter)) {
            C59104x c = f94833a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NTF.XDeviceTimerUriHnd");
            ((C59052c) ((C59052c) c).mo56372aa(52326)).mo56386p("Could not find actionType");
            return C58836b.f156633a;
        } else if (queryParameter.equals("addOneMinuteAction") || queryParameter.equals("stopAction")) {
            String queryParameter2 = parse.getQueryParameter("timerId");
            if (!C58837ba.m90859h(queryParameter2)) {
                return C58833ax.m90834k(new Intent("com.google.android.apps.search.assistant.surfaces.notification.TNG_CLIENT_INPUT_ACTION").setComponent(C36372z.f94984a).putExtra("com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.EXTRA_ACTION_TO_EXECUTE", queryParameter).putExtra("com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.EXTRA_TIMER_ID", queryParameter2));
            }
            C59104x c2 = f94833a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NTF.XDeviceTimerUriHnd");
            ((C59052c) ((C59052c) c2).mo56372aa(52324)).mo56386p("Could not find timerId");
            return C58836b.f156633a;
        } else {
            C59104x c3 = f94833a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "NTF.XDeviceTimerUriHnd");
            ((C59052c) ((C59052c) c3).mo56372aa(52325)).mo56389s("Invalid actionType: %s", queryParameter);
            return C58836b.f156633a;
        }
    }
}
