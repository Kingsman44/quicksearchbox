package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.j */
/* compiled from: PG */
public final class C107835j {

    /* renamed from: a */
    private static final C59071e f300075a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.j");

    /* renamed from: b */
    private static final Set f300076b = C58528ij.m90015O("tts.OUTPUT", "device.REQUEST_PERMISSION", "ui.SHOW_TEXT", "call.CALL", "chat_message.SEND", "ui.SHOW_INTERPRETER", "ui.EXIT_NATIVE_FORM", "photos.DOWNLOAD_PHOTOS", "ui.SHOW_NATIVE_FORM", "alarm.CREATE_ALARM", "alarm.REMOVE_ALARM", "timer.CREATE_TIMER", "timer.UPDATE_TIMER", "timer.REMOVE_TIMER", "url.OPEN");

    /* renamed from: a */
    public static boolean m179048a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51809dy dyVar = (C51809dy) it.next();
            if (!f300076b.contains(dyVar.f135936b)) {
                C59104x c = f300075a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "FAClientOpsValidator");
                ((C59052c) ((C59052c) c).mo56372aa(26302)).mo56389s("Client op %s is not whitelisted.", dyVar.f135936b);
                return false;
            }
        }
        return true;
    }
}
