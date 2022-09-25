package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3897e.p3921j.ach;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.e */
/* compiled from: PG */
public final /* synthetic */ class C11657e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ aco f37631a;

    public /* synthetic */ C11657e(aco aco) {
        this.f37631a = aco;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        ach ach = (ach) this.f37631a.toBuilder();
        if (!str.isEmpty()) {
            ach.copyOnWrite();
            aco aco = (aco) ach.instance;
            str.getClass();
            aco.f134823a |= C89885b.S3REQUEST_VALUE;
            aco.f134841s = str;
        } else {
            C59104x d = C11658f.f37632a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GearheadMsgNotifConv");
            ((C59052c) ((C59052c) d).mo56372aa(43442)).mo56386p("Image cache key is empty.");
        }
        return Optional.m71637of((aco) ach.build());
    }
}
