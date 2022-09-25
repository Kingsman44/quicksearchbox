package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cd */
/* compiled from: PG */
public final /* synthetic */ class C77059cd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212675a;

    public /* synthetic */ C77059cd(C77140u uVar) {
        this.f212675a = uVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77140u uVar = this.f212675a;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        if (size == 0) {
            C77089dg.m123752h(uVar, C82835ce.NO_CONVERSATION_ID);
            return Optional.empty();
        } else if (size != 1) {
            C77089dg.m123752h(uVar, C82835ce.MULTIPLE_CONVERSATION_IDS);
            return Optional.empty();
        } else {
            C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
            String str = (String) guVar.get(0);
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str.getClass();
            pjVar.f137437b = 6;
            pjVar.f137438c = str;
            return Optional.m71637of((C52374pj) piVar.build());
        }
    }
}
