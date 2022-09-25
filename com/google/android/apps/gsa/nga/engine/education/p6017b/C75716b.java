package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80176cy;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81306cj;
import com.google.android.apps.gsa.nga.shared.p6345h.C81307ck;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.b */
/* compiled from: PG */
public final /* synthetic */ class C75716b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C75718d f210169a;

    public /* synthetic */ C75716b(C75718d dVar) {
        this.f210169a = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80176cy cyVar;
        C80176cy cyVar2;
        C75718d dVar = this.f210169a;
        C80275dd ddVar = (C80275dd) obj;
        if (ddVar.f220290a == 20) {
            cyVar = (C80176cy) ddVar.f220291b;
        } else {
            cyVar = C80176cy.f219994d;
        }
        boolean z = cyVar.f219997b;
        if (ddVar.f220290a == 20) {
            cyVar2 = (C80176cy) ddVar.f220291b;
        } else {
            cyVar2 = C80176cy.f219994d;
        }
        e a = e.a(cyVar2.f219998c);
        if (a == null) {
            a = e.a;
        }
        C81315k kVar = dVar.f210172b;
        C81306cj cjVar = (C81306cj) C81307ck.f222564d.createBuilder();
        cjVar.copyOnWrite();
        C81307ck ckVar = (C81307ck) cjVar.instance;
        ckVar.f222568c = a.ca;
        ckVar.f222566a |= 2;
        cjVar.copyOnWrite();
        C81307ck ckVar2 = (C81307ck) cjVar.instance;
        ckVar2.f222566a |= 1;
        ckVar2.f222567b = z;
        C80905at.m128763g(kVar.mo74870R((C81307ck) cjVar.build()), C75703a.f210147a);
        return true;
    }
}
