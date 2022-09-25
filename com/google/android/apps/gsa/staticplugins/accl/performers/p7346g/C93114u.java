package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.u */
/* compiled from: PG */
public final /* synthetic */ class C93114u implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C93114u f259742a = new C93114u();

    private /* synthetic */ C93114u() {
    }

    public final Object apply(Object obj) {
        Exception exc = (Exception) obj;
        C59104x c = C93081ad.f259632a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(13322)).mo56386p("Failed to play media with OpaMediaMediaPlayer");
        return C22402a.m41822b(C52235kf.INTERNAL, exc.getMessage());
    }
}
