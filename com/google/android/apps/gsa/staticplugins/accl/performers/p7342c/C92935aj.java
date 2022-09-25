package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C92935aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C92945at f259272a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259273b;

    public /* synthetic */ C92935aj(C92945at atVar, C22434e eVar) {
        this.f259272a = atVar;
        this.f259273b = eVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C92945at atVar = this.f259272a;
        List list = (List) obj;
        C22407c cVar = (C22407c) this.f259273b;
        C84349ah ahVar = cVar.f61902d.mo56113h() ? (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f() : null;
        if (list.isEmpty()) {
            str = atVar.f259286b.getString(R.string.empty_notification_punt);
        } else {
            Collections.sort(list, Comparator.CC.comparing(C92942aq.f259281a));
            StandardNotification standardNotification = (StandardNotification) C58557jl.m90131l(list);
            str = String.format(atVar.f259286b.getString(R.string.sender_message_format_for_standard_message), new Object[]{standardNotification.f252581b, standardNotification.f252562s});
        }
        try {
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(atVar.f259288d.mo87471a(C60856cj.m92900i(C58836b.f156633a), new TtsRequest(str, false), ahVar).mo27547b()), C92943ar.f259282a, C60826bg.f164896a), Exception.class, C92944as.f259283a, C60826bg.f164896a);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C92945at.f259284a.mo56226d()).mo56382g(e)).mo56372aa(13269)).mo56386p("Exception in playing TTS for notification content request.");
            return C60856cj.m92900i(C92945at.m152981b("Failed to play notification content."));
        }
    }
}
