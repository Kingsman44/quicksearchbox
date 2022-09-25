package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.s */
/* compiled from: PG */
public final class C106965s extends C106963q {

    /* renamed from: a */
    private final C58974d f297946a;

    /* renamed from: c */
    private final C52560wg f297947c;

    public C106965s(Context context, C83564a aVar, C50690ab abVar, C52560wg wgVar, C52560wg wgVar2) {
        super(context, aVar, wgVar, abVar);
        this.f297946a = aVar.mo76900a("PodcastsWrapper");
        this.f297947c = wgVar2;
    }

    /* renamed from: f */
    public final String mo95705f(int i) {
        String uri = mo95722b(this.f297947c, i, false).toUri(1);
        ((C58970a) ((C58970a) this.f297946a.mo56224b()).mo56372aa(23353)).mo56389s("#generateIntentUri: %s", uri);
        return uri;
    }
}
