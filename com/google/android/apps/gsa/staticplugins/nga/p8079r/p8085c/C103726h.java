package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80178d;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80404f;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.h */
/* compiled from: PG */
public final class C103726h implements C103651a {

    /* renamed from: a */
    private final C84920a f288867a;

    public C103726h(C84920a aVar) {
        this.f288867a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80404f fVar;
        C80404f fVar2;
        C80404f fVar3;
        if (bnVar.f219917a == 24) {
            fVar = (C80404f) bnVar.f219918b;
        } else {
            fVar = C80404f.f220669d;
        }
        if ((fVar.f220671a & 1) == 0) {
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        if (bnVar.f219917a == 24) {
            fVar2 = (C80404f) bnVar.f219918b;
        } else {
            fVar2 = C80404f.f220669d;
        }
        C87693ab abVar = fVar2.f220672b;
        if (abVar == null) {
            abVar = C87693ab.f237115j;
        }
        if (bnVar.f219917a == 24) {
            fVar3 = (C80404f) bnVar.f219918b;
        } else {
            fVar3 = C80404f.f220669d;
        }
        int a = C80178d.m128090a(fVar3.f220673c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            this.f288867a.mo78590e(abVar);
            return C60856cj.m92900i(C80275dd.f220288c);
        } else if (i == 2) {
            return C60922j.m93044g(this.f288867a.mo78586a(abVar), C103722d.f288863a, C60826bg.f164896a);
        } else {
            if (i == 3) {
                return C60922j.m93044g(this.f288867a.mo78588c(abVar), C103723e.f288864a, C60826bg.f164896a);
            }
            if (i == 4) {
                return C60922j.m93044g(this.f288867a.mo78587b(Uri.parse("https://assistant.google.com/shortcuts/view/all"), "com.google.android.googlequicksearchbox"), C103724f.f288865a, C60826bg.f164896a);
            }
            throw new AssertionError("Unexpected request action.");
        }
    }
}
