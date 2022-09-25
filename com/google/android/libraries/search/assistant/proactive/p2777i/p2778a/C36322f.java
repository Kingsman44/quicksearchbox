package com.google.android.libraries.search.assistant.proactive.p2777i.p2778a;

import android.content.Intent;
import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.f */
/* compiled from: PG */
public final class C36322f {

    /* renamed from: a */
    private static final C59071e f94835a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.i.a.f");

    /* renamed from: a */
    public static C58833ax m64809a(String str) {
        if (C58837ba.m90859h(str) || !str.startsWith("assistant-reminders://android")) {
            return C58836b.f156633a;
        }
        if (str.contains("listAction")) {
            return C58833ax.m90834k(new Intent("com.google.android.googlequicksearchbox.MY_REMINDERS").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.VelvetIntentDispatcher"));
        }
        if (!str.contains("buttonAction")) {
            return C58836b.f156633a;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("reminderId");
        if (C58837ba.m90859h(queryParameter)) {
            ((C59052c) ((C59052c) f94835a.mo56225c()).mo56372aa(52332)).mo56386p("Could not find reminderId");
            return C58836b.f156633a;
        }
        boolean parseBoolean = Boolean.parseBoolean(parse.getQueryParameter("deleteNotificationonSuccess"));
        int i = 1;
        int i2 = true != parseBoolean ? 90 : 248;
        Intent className = new Intent("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_EXECUTE_REMINDER_ACTION").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver");
        if (true != parseBoolean) {
            i = 2;
        }
        Intent putExtra = className.putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ACTION_TO_EXECUTE", i).putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ID", queryParameter);
        return C58833ax.m90834k(putExtra.setData(Uri.parse("assistant-reminders://android/" + i2)));
    }
}
