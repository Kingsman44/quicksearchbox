package com.google.android.apps.gsa.staticplugins.chime.p7660e;

import com.google.common.base.C58810aa;
import com.google.common.base.C58916z;
import com.google.p375ai.p378b.C7666fl;
import com.google.p375ai.p378b.C7668fn;
import com.google.p375ai.p378b.C7669fo;
import com.google.protos.p4816ai.p4819c.C63205a;
import com.google.protos.p4816ai.p4819c.C63207c;
import com.google.protos.p4816ai.p4819c.C63208d;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.e.a */
/* compiled from: PG */
final class C97683a extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo17535b(Object obj) {
        C63208d dVar = (C63208d) obj;
        C7666fl flVar = (C7666fl) C7669fo.f26633e.createBuilder();
        if ((dVar.f170773a & 1) != 0) {
            String str = dVar.f170774b;
            flVar.copyOnWrite();
            C7669fo foVar = (C7669fo) flVar.instance;
            str.getClass();
            foVar.f26635a |= 1;
            foVar.f26636b = str;
        }
        if ((dVar.f170773a & 2) != 0) {
            C58810aa h = C97686d.f272782a.mo56069h();
            C63207c a = C63207c.m96205a(dVar.f170775c);
            if (a == null) {
                a = C63207c.TYPE_UNDEFINED;
            }
            flVar.copyOnWrite();
            C7669fo foVar2 = (C7669fo) flVar.instance;
            foVar2.f26637c = ((C7668fn) ((C58916z) h).f156756a.mo56068fP(a)).f26632m;
            foVar2.f26635a |= 2;
        }
        if ((dVar.f170773a & 4) != 0) {
            long j = dVar.f170776d;
            flVar.copyOnWrite();
            C7669fo foVar3 = (C7669fo) flVar.instance;
            foVar3.f26635a |= 4;
            foVar3.f26638d = j;
        }
        return (C7669fo) flVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C7669fo foVar = (C7669fo) obj;
        C63205a aVar = (C63205a) C63208d.f170771e.createBuilder();
        if ((foVar.f26635a & 1) != 0) {
            String str = foVar.f26636b;
            aVar.copyOnWrite();
            C63208d dVar = (C63208d) aVar.instance;
            str.getClass();
            dVar.f170773a |= 1;
            dVar.f170774b = str;
        }
        if ((foVar.f26635a & 2) != 0) {
            C58810aa aaVar = C97686d.f272782a;
            C7668fn a = C7668fn.m22799a(foVar.f26637c);
            if (a == null) {
                a = C7668fn.TYPE_UNDEFINED;
            }
            aVar.copyOnWrite();
            C63208d dVar2 = (C63208d) aVar.instance;
            dVar2.f170775c = ((C63207c) aaVar.mo56070hd(a)).f170770m;
            dVar2.f170773a |= 2;
        }
        if ((foVar.f26635a & 4) != 0) {
            long j = foVar.f26638d;
            aVar.copyOnWrite();
            C63208d dVar3 = (C63208d) aVar.instance;
            dVar3.f170773a |= 4;
            dVar3.f170776d = j;
        }
        return (C63208d) aVar.build();
    }
}
