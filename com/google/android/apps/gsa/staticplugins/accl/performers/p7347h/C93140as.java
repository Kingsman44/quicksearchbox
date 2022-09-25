package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.as */
/* compiled from: PG */
public final /* synthetic */ class C93140as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259785a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259786b;

    public /* synthetic */ C93140as(C93150bb bbVar, C22434e eVar) {
        this.f259785a = bbVar;
        this.f259786b = eVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C60870cx cxVar;
        C93150bb bbVar = this.f259785a;
        C58833ax axVar = (C58833ax) obj;
        C22407c cVar = (C22407c) this.f259786b;
        C84349ah ahVar = cVar.f61902d.mo56113h() ? (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f() : null;
        if (!axVar.mo56113h()) {
            str = bbVar.f259809j.getString(R.string.empty_standard_notification_punt);
        } else {
            str = String.format(bbVar.f259809j.getString(R.string.sender_message_format_for_standard_message), new Object[]{((StandardNotification) axVar.mo56107c()).f252581b, ((StandardNotification) axVar.mo56107c()).f252562s});
        }
        try {
            cxVar = C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(bbVar.f259805f.mo87471a(C60856cj.m92900i(C58836b.f156633a), new TtsRequest(str, false), ahVar).mo27547b()), C93138aq.f259783a, C60826bg.f164896a), Exception.class, new C93139ar(bbVar), C60826bg.f164896a);
        } catch (IOException e) {
            C59104x d = C93150bb.f259800a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13412)).mo56386p("Exception in playing TTS for standard notification content request.");
            cxVar = C60856cj.m92900i(bbVar.mo87551b("Failed to play standard notification content."));
        }
        C60856cj.m92911t(cxVar, new C93143av(), C60826bg.f164896a);
        return cxVar;
    }
}
