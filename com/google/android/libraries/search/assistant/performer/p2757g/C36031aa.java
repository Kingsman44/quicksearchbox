package com.google.android.libraries.search.assistant.performer.p2757g;

import android.util.Base64;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36953a;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36954b;
import com.google.assistant.p3897e.p3921j.C52192iq;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.aa */
/* compiled from: PG */
public final /* synthetic */ class C36031aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36037ag f94254a;

    /* renamed from: b */
    public final /* synthetic */ C52192iq f94255b;

    public /* synthetic */ C36031aa(C36037ag agVar, C52192iq iqVar) {
        this.f94254a = agVar;
        this.f94255b = iqVar;
    }

    public final Object apply(Object obj) {
        C36037ag agVar = this.f94254a;
        C52192iq iqVar = this.f94255b;
        C36953a aVar = (C36953a) ((C36954b) obj).toBuilder();
        C52428rj rjVar = iqVar.f136986b;
        if (rjVar == null) {
            rjVar = C52428rj.f137558m;
        }
        String encodeToString = Base64.encodeToString(rjVar.toByteArray(), 0);
        aVar.copyOnWrite();
        C36954b bVar = (C36954b) aVar.instance;
        encodeToString.getClass();
        bVar.f96229a |= 1;
        bVar.f96230b = encodeToString;
        long b = agVar.f94262b.mo26870b();
        long j = iqVar.f136987c;
        aVar.copyOnWrite();
        C36954b bVar2 = (C36954b) aVar.instance;
        bVar2.f96229a |= 2;
        bVar2.f96231c = b + j;
        return (C36954b) aVar.build();
    }
}
