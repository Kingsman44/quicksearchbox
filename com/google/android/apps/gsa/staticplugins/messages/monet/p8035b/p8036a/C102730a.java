package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.p8036a;

import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102722c;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102723d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.a.a */
/* compiled from: PG */
public final class C102730a {

    /* renamed from: a */
    public static final C59071e f286800a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.messages.monet.b.a.a");

    /* renamed from: a */
    public static C102723d m170324a() {
        C102722c cVar = (C102722c) C102723d.f286770e.createBuilder();
        C102721b bVar = C102721b.RETRY;
        cVar.copyOnWrite();
        C102723d dVar = (C102723d) cVar.instance;
        dVar.f286773b = bVar.f286769o;
        dVar.f286772a |= 1;
        cVar.copyOnWrite();
        C102723d dVar2 = (C102723d) cVar.instance;
        dVar2.f286772a |= 2;
        dVar2.f286774c = R.string.network_error_try_again;
        cVar.copyOnWrite();
        C102723d dVar3 = (C102723d) cVar.instance;
        dVar3.f286772a |= 4;
        dVar3.f286775d = R.drawable.quantum_ic_replay_grey600_24;
        return (C102723d) cVar.build();
    }
}
