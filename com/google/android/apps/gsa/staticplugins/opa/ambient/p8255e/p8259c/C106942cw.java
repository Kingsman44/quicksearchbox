package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cw */
/* compiled from: PG */
public final class C106942cw extends C106963q {

    /* renamed from: a */
    private final C58974d f297889a;

    /* renamed from: c */
    private final boolean f297890c;

    public C106942cw(Context context, C83564a aVar, C52560wg wgVar, C50690ab abVar, C14626qe qeVar) {
        super(context, aVar, wgVar, abVar);
        this.f297889a = aVar.mo76900a("YoutubeWrapper");
        C14626qe qeVar2 = C14626qe.STATUS_UNKNOWN;
        this.f297890c = qeVar.ordinal() == 1 ? false : true;
    }

    /* renamed from: f */
    public final String mo95705f(int i) {
        ((C58970a) ((C58970a) this.f297889a.mo56224b()).mo56372aa(23423)).mo56386p("Replacing YouTube URI with YTM URI.");
        C52559wf wfVar = (C52559wf) this.f297939b.toBuilder();
        String replace = this.f297939b.f137948d.replace("www.youtube.com", "music.youtube.com");
        wfVar.copyOnWrite();
        C52560wg wgVar = (C52560wg) wfVar.instance;
        replace.getClass();
        wgVar.f137945a |= 1;
        wgVar.f137948d = replace;
        String uri = mo95722b((C52560wg) wfVar.build(), i, this.f297890c).toUri(1);
        ((C58970a) ((C58970a) this.f297889a.mo56224b()).mo56372aa(23424)).mo56389s("#generateIntentUri: %s", uri);
        return uri;
    }
}
