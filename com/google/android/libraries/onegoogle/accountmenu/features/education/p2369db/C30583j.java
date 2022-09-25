package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.j */
/* compiled from: PG */
final class C30583j extends C3965r {
    public C30583j(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C30576c cVar = (C30576c) obj;
        String str = cVar.f82598a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        lVar.mo8204e(2, cVar.f82599b ? 1 : 0);
        lVar.mo8204e(3, (long) cVar.f82600c);
        lVar.mo8204e(4, (long) cVar.f82601d);
        lVar.mo8204e(5, cVar.f82602e);
        lVar.mo8204e(6, cVar.f82603f);
        lVar.mo8204e(7, cVar.f82604g);
        lVar.mo8204e(8, cVar.f82605h ? 1 : 0);
        String str2 = cVar.f82598a;
        if (str2 == null) {
            lVar.mo8205f(9);
        } else {
            lVar.mo8206g(9, str2);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "UPDATE OR ABORT `EducationState` SET `name` = ?,`enabled` = ?,`numEducationImpressions` = ?,`numEducationInteractions` = ?,`activatedTimestampMs` = ?,`lastImpressionTimestampMs` = ?,`lastInteractionTimestampMs` = ?,`educationCompleted` = ? WHERE `name` = ?";
    }
}
