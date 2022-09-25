package com.google.android.libraries.lens.view.p2154p.p2156b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4699e.C62231l;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56263bq;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56264br;

/* renamed from: com.google.android.libraries.lens.view.p.b.a */
/* compiled from: PG */
public final /* synthetic */ class C27541a {
    /* renamed from: a */
    public static C58833ax m51301a(C27543c cVar) {
        C58833ax axVar = ((C27544d) cVar).f75330a;
        return (!axVar.mo56113h() || ((C56264br) axVar.mo56107c()).f149960b.isEmpty()) ? C58836b.f156633a : C58833ax.m90834k((C62231l) ((C56264br) axVar.mo56107c()).f149960b.get(0));
    }

    /* renamed from: b */
    public static C56263bq m51302b(C27543c cVar) {
        C58833ax axVar = ((C27544d) cVar).f75330a;
        if (axVar.mo56113h()) {
            return (C56263bq) ((C56264br) axVar.mo56107c()).toBuilder();
        }
        return (C56263bq) C56264br.f149957d.createBuilder();
    }

    /* renamed from: c */
    public static void m51303c(C27543c cVar) {
        if (((C27544d) cVar).f75330a.mo56113h()) {
            C56263bq b = m51302b(cVar);
            b.copyOnWrite();
            C56264br brVar = C56264br.f149957d;
            ((C56264br) b.instance).f149960b = C56264br.emptyProtobufList();
            cVar.mo33115r(C58833ax.m90834k((C56264br) b.build()));
        }
    }

    /* renamed from: d */
    public static void m51304d(C27543c cVar, C62231l lVar) {
        lVar.getClass();
        C56263bq b = m51302b(cVar);
        b.copyOnWrite();
        C56264br brVar = C56264br.f149957d;
        ((C56264br) b.instance).f149960b = C56264br.emptyProtobufList();
        b.mo54346a(lVar);
        cVar.mo33115r(C58833ax.m90834k((C56264br) b.build()));
    }
}
