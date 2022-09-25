package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.bs */
/* compiled from: PG */
final class C108019bs implements C22868d {

    /* renamed from: a */
    final /* synthetic */ boolean f300510a;

    /* renamed from: b */
    final /* synthetic */ C118827a f300511b;

    /* renamed from: c */
    final /* synthetic */ boolean f300512c;

    /* renamed from: d */
    final /* synthetic */ boolean f300513d;

    public C108019bs(boolean z, C118827a aVar, boolean z2, boolean z3) {
        this.f300510a = z;
        this.f300511b = aVar;
        this.f300512c = z2;
        this.f300513d = z3;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) C108020bt.f300514a.mo56225c()).mo56372aa(27016)).mo56389s("Unable to obtain a ConnectivityInfo: %s", th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118569b bVar;
        C118569b bVar2;
        C118569b bVar3;
        boolean a = ((C89062r) obj).mo83040a();
        long j = 1;
        if (this.f300510a) {
            C118827a aVar = this.f300511b;
            if (a) {
                bVar2 = C118569b.GELLER_GET_CONTACT_ANNOTATIONS_ONLINE_RETRIEVAL_RATE;
            } else {
                bVar2 = C118569b.GELLER_GET_CONTACT_ANNOTATIONS_OFFLINE_RETRIEVAL_RATE;
            }
            aVar.mo77944g(bVar2, C118575h.GELLER_GET_CONTACT_ANNOTATIONS).mo104025g((!this.f300512c || !this.f300513d) ? 0 : 1);
            C118827a aVar2 = this.f300511b;
            if (a) {
                bVar3 = C118569b.GELLER_GET_CONTACT_RELATIONSHIP_LIKE_ONLINE_RETRIEVAL_RATE;
            } else {
                bVar3 = C118569b.GELLER_GET_CONTACT_RELATIONSHIP_LIKE_OFFLINE_RETRIEVAL_RATE;
            }
            aVar2.mo77944g(bVar3, C118575h.GELLER_GET_CONTACTS).mo104025g(true != this.f300512c ? 0 : 1);
        }
        if (!this.f300513d) {
            C118827a aVar3 = this.f300511b;
            if (a) {
                bVar = C118569b.GELLER_GET_CONTACTS_ONLINE_RETRIEVAL_RATE;
            } else {
                bVar = C118569b.GELLER_GET_CONTACTS_OFFINE_RETRIEVAL_RATE;
            }
            C118831d g = aVar3.mo77944g(bVar, C118575h.GELLER_GET_CONTACTS);
            if (true != this.f300512c) {
                j = 0;
            }
            g.mo104025g(j);
        }
    }
}
