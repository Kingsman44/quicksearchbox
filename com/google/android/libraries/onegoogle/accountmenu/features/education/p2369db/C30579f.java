package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.f */
/* compiled from: PG */
final class C30579f extends C3966s {
    public C30579f(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C30577d dVar = (C30577d) obj;
        String str = dVar.f82606a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        String str2 = dVar.f82607b;
        if (str2 == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, str2);
        }
        lVar.mo8204e(3, (long) dVar.f82608c);
        lVar.mo8204e(4, (long) dVar.f82609d);
        lVar.mo8204e(5, dVar.f82610e ? 1 : 0);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR IGNORE INTO `HighlightState` (`educationName`,`highlightId`,`numHighlightImpressions`,`numHighlightInteractions`,`highlightCompleted`) VALUES (?,?,?,?,?)";
    }
}
