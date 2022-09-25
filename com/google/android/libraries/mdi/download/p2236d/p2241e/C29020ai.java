package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29395es;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.android.libraries.mdi.download.C29399ew;
import com.google.android.libraries.mdi.download.C29400ex;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.libraries.mdi.download.d.e.ai */
/* compiled from: PG */
public final /* synthetic */ class C29020ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29025an f78781a;

    public /* synthetic */ C29020ai(C29025an anVar) {
        this.f78781a = anVar;
    }

    public final Object apply(Object obj) {
        C29025an anVar = this.f78781a;
        C29396et etVar = (C29396et) obj;
        C29400ex exVar = etVar.f79697e;
        if (exVar == null) {
            exVar = C29400ex.f79706d;
        }
        if ((exVar.f79708a & 1) != 0) {
            return etVar;
        }
        long nextLong = anVar.f78790d.nextLong();
        C29395es esVar = (C29395es) etVar.toBuilder();
        C29400ex exVar2 = etVar.f79697e;
        if (exVar2 == null) {
            exVar2 = C29400ex.f79706d;
        }
        C29399ew ewVar = (C29399ew) exVar2.toBuilder();
        ewVar.copyOnWrite();
        C29400ex exVar3 = (C29400ex) ewVar.instance;
        exVar3.f79708a |= 1;
        exVar3.f79709b = nextLong;
        C63042fg i = C62953e.m95484i(anVar.f78788b.mo34498a());
        ewVar.copyOnWrite();
        C29400ex exVar4 = (C29400ex) ewVar.instance;
        i.getClass();
        exVar4.f79710c = i;
        exVar4.f79708a |= 2;
        esVar.copyOnWrite();
        C29396et etVar2 = (C29396et) esVar.instance;
        C29400ex exVar5 = (C29400ex) ewVar.build();
        exVar5.getClass();
        etVar2.f79697e = exVar5;
        etVar2.f79693a |= 4;
        return (C29396et) esVar.build();
    }
}
