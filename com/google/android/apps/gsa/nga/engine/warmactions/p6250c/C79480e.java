package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81010a;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81560c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81567j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82458fy;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82688ol;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82689om;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.e */
/* compiled from: PG */
public final /* synthetic */ class C79480e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79483h f218162a;

    /* renamed from: b */
    public final /* synthetic */ C79569ab f218163b;

    public /* synthetic */ C79480e(C79483h hVar, C79569ab abVar) {
        this.f218162a = hVar;
        this.f218163b = abVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79483h hVar = this.f218162a;
        C79569ab abVar = this.f218163b;
        if (!((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) C79483h.f218167a.mo56225c()).mo56372aa(5665)).mo56386p("#MWW Session dismissed because it should not run.");
            C81013d dVar = hVar.f218171e;
            for (C79570b bVar : C79720c.m127814b(abVar)) {
                C83305i iVar = ((C81014e) dVar).f222055a;
                C82688ol f = C82689om.m132105f();
                f.mo76312b(bVar.f218339o);
                ((C82458fy) f).f225306b = C81010a.m128931a(11);
                iVar.mo75579d(f.mo76311a());
            }
            return C60856cj.m92899h(new IllegalStateException("#MWW cannot start."));
        }
        C79720c.m127813a(abVar);
        hVar.f218173g.mo73677a(new C81567j(C81560c.WARM_WORDS));
        return hVar.f218170d.mo28210j(hVar.f218170d.mo28210j(hVar.mo74088c(), "[NGA][WA] RecognitionManager.stopRecognitionInternal", new C79478c(hVar)), "[NGA][WA] RecognitionManager.startRecognizer", new C79479d(hVar, C79566g.m127644c(abVar)));
    }
}
