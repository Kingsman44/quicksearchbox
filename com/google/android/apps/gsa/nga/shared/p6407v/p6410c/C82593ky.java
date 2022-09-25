package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ky */
/* compiled from: PG */
public abstract class C82593ky implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_GMAIL_SEARCH_INTENT_GENERATED_PREDICATE_COUNT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "predicate";
        String b = mo75873b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        b.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = b;
        aec.mo56976a((aee) aed.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo75873b();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f226966aH.mo6453a()).mo24822a(1, str, str2, mo75873b());
    }
}
