package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.speech.audio.C92199j;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4985f.p4988b.p4990b.C64747m;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.bf */
/* compiled from: PG */
public final /* synthetic */ class C93022bf implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93029bm f259481a;

    /* renamed from: b */
    public final /* synthetic */ C64747m f259482b;

    public /* synthetic */ C93022bf(C93029bm bmVar, C64747m mVar) {
        this.f259481a = bmVar;
        this.f259482b = mVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93029bm bmVar = this.f259481a;
        C64747m mVar = this.f259482b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) C93029bm.f259491a.mo56226d()).mo56372aa(13219)).mo56386p("no audio recording is available.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNAVAILABLE, (String) null));
        }
        C92199j b = bmVar.mo87525b(mVar.f175512a, mVar.f175513b, (a) axVar.mo56107c(), C58836b.f156633a);
        if (b != null) {
            return bmVar.mo87526d(mVar, b);
        }
        ((C58970a) ((C58970a) C93029bm.f259491a.mo56225c()).mo56372aa(13218)).mo56386p("insert audio slice failed.");
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, (String) null));
    }
}
