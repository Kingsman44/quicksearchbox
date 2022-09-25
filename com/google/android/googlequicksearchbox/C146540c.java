package com.google.android.googlequicksearchbox;

import android.content.Intent;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.util.C91972aw;
import com.google.android.apps.search.googleapp.p10310h.C136122c;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10310h.C136130k;
import com.google.android.apps.search.googleapp.p10310h.C136131l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7682ga;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;

/* renamed from: com.google.android.googlequicksearchbox.c */
/* compiled from: PG */
public final /* synthetic */ class C146540c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f395757a;

    public /* synthetic */ C146540c(Intent intent) {
        this.f395757a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f395757a;
        C57315dp dpVar = (C57315dp) obj;
        C136122c cVar = (C136122c) C136123d.f370743d.createBuilder();
        cVar.copyOnWrite();
        C136123d dVar = (C136123d) cVar.instance;
        dpVar.getClass();
        dVar.f370746b = dpVar;
        dVar.f370745a |= 1;
        C58833ax b = C91972aw.m150927b(intent);
        if (!(!b.mo56113h() || (((C91788al) b.mo56107c()).f255959a & 1) == 0 || (((C91788al) b.mo56107c()).f255959a & 2) == 0)) {
            C136130k kVar = (C136130k) C136131l.f370752d.createBuilder();
            C7682ga gaVar = ((C91788al) b.mo56107c()).f255960b;
            if (gaVar == null) {
                gaVar = C7682ga.f26836d;
            }
            kVar.copyOnWrite();
            C136131l lVar = (C136131l) kVar.instance;
            gaVar.getClass();
            lVar.f370755b = gaVar;
            lVar.f370754a |= 1;
            C57057b bVar = ((C91788al) b.mo56107c()).f255961c;
            if (bVar == null) {
                bVar = C57057b.f152311e;
            }
            kVar.copyOnWrite();
            C136131l lVar2 = (C136131l) kVar.instance;
            bVar.getClass();
            lVar2.f370756c = bVar;
            lVar2.f370754a |= 2;
            cVar.copyOnWrite();
            C136123d dVar2 = (C136123d) cVar.instance;
            C136131l lVar3 = (C136131l) kVar.build();
            lVar3.getClass();
            dVar2.f370747c = lVar3;
            dVar2.f370745a |= 2;
        }
        return (C136123d) cVar.build();
    }
}
