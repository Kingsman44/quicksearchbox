package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.t */
/* compiled from: PG */
public final /* synthetic */ class C93113t implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C93113t f259741a = new C93113t();

    private /* synthetic */ C93113t() {
    }

    public final Object apply(Object obj) {
        C84272l lVar = (C84272l) obj;
        C59071e eVar = C93081ad.f259632a;
        if (lVar != C84272l.FAILURE) {
            return C22402a.f61893a;
        }
        C59104x c = C93081ad.f259632a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) c).mo56372aa(13321)).mo56386p("Failed to play media with OpaMediaPlayer");
        return C22402a.m41822b(C52235kf.INTERNAL, (String) null);
    }
}
