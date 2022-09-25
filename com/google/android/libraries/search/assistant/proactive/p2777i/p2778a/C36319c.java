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

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.c */
/* compiled from: PG */
public final class C36319c {

    /* renamed from: a */
    private static final C59071e f94832a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.i.a.c");

    /* renamed from: a */
    public static C58833ax m64806a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(str)) {
            return C58836b.f156633a;
        }
        Uri parse = Uri.parse(str);
        if (str.startsWith("assistant-aspire://android/done")) {
            String queryParameter = parse.getQueryParameter("aspirationId");
            if (C58837ba.m90859h(queryParameter)) {
                return C58836b.f156633a;
            }
            Intent putExtra = new Intent("ASPIRE_BUTTON_ACTION").setComponent(C36372z.f94984a).putExtra("button-type", "DONE").putExtra("aspiration-id", queryParameter);
            C59104x b = f94832a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NTF.AspireUriHandler");
            ((C59052c) ((C59052c) b).mo56372aa(52319)).mo56389s("Setting done intent URI: %s", putExtra.toURI());
            return C58833ax.m90834k(putExtra);
        } else if (!str.startsWith("assistant-aspire://android/snooze")) {
            return C58836b.f156633a;
        } else {
            String queryParameter2 = parse.getQueryParameter("aspirationId");
            if (C58837ba.m90859h(queryParameter2)) {
                return C58836b.f156633a;
            }
            Intent putExtra2 = new Intent("ASPIRE_BUTTON_ACTION").setComponent(C36372z.f94984a).putExtra("button-type", "SNOOZE").putExtra("aspiration-id", queryParameter2);
            C59104x b2 = f94832a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NTF.AspireUriHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(52317)).mo56389s("Setting snooze intent URI: %s", putExtra2.toURI());
            return C58833ax.m90834k(putExtra2);
        }
    }
}
