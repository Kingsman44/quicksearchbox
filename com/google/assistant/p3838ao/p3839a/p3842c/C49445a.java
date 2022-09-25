package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49669i;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49589cs;
import com.google.assistant.p3838ao.p3839a.p3845e.C49591cu;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.a */
/* compiled from: PG */
public final class C49445a implements C49477be {
    static {
        C58974d.m91134h("CallChipGenerator");
    }

    /* renamed from: a */
    public final C58485gu mo53269a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo53270b(C49692r rVar) {
        Optional optional = ((C49381a) rVar).f127638d;
        if (optional.isEmpty()) {
            return C58485gu.m89845m();
        }
        C62971cq cqVar = ((C49669i) optional.get()).f128189f.f127937f;
        if (cqVar.isEmpty()) {
            return C58485gu.m89845m();
        }
        C49589cs csVar = (C49589cs) cqVar.get(0);
        String t = rVar.mo53333t(R.string.nga_suggestion_chip_call_entity, csVar.f127962b);
        C49591cu cuVar = csVar.f127963c;
        if (cuVar == null) {
            cuVar = C49591cu.f127964c;
        }
        return C58485gu.m89846n(C49681l.m85669b(t, t, cuVar.f127967b, Optional.empty()));
    }
}
