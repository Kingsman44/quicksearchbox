package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.staticplugins.chime.p7656a.C97645b;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c */
/* compiled from: PG */
public final class C97669c {

    /* renamed from: a */
    private final Map f272760a;

    public C97669c(Map map) {
        this.f272760a = map;
    }

    /* renamed from: a */
    public final boolean mo90788a(C29827r rVar, C56975k kVar, boolean z) {
        C68214a aVar = (C68214a) this.f272760a.get(C56973i.m88245a(kVar.f152093b));
        if (aVar == null) {
            return false;
        }
        ((C97645b) aVar.mo27525b()).mo90782a(rVar, kVar, z);
        return true;
    }
}
