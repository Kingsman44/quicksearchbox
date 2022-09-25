package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62962ci;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.af */
/* compiled from: PG */
public final /* synthetic */ class C124051af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C51303cs f342628a;

    public /* synthetic */ C124051af(C51303cs csVar) {
        this.f342628a = csVar;
    }

    public final C60870cx apply(Object obj) {
        C51303cs csVar = this.f342628a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C124053ah.f342631a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.ClientContext");
            ((C59052c) ((C59052c) b).mo56372aa(35388)).mo56386p("Couldn't generate client instance Id.");
        } else {
            C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
            String str = (String) optional.get();
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            str.getClass();
            rjVar.f137560a |= 4;
            rjVar.f137562c = str;
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            C52428rj rjVar2 = (C52428rj) riVar.build();
            C62962ci ciVar = C51334dw.f133657N;
            rjVar2.getClass();
            dwVar.f133696j = rjVar2;
            dwVar.f133685a |= 256;
        }
        return C60856cj.m92900i((C51334dw) csVar.build());
    }
}
