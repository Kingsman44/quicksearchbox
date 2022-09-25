package com.google.android.apps.gsa.nga.shared.p6304ad;

import com.google.android.apps.gsa.assistant.shared.s;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.C18095i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ad.a */
/* compiled from: PG */
public final /* synthetic */ class C80553a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C80553a f221108a = new C80553a();

    private /* synthetic */ C80553a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C18095i iVar = (C18095i) obj;
        C58974d dVar = C80555c.f221110a;
        if (iVar.mo23509a() != null || iVar.mo23510b() != null) {
            return C58833ax.m90834k(new s(iVar.mo23509a(), iVar.mo23510b()));
        }
        ((C58970a) ((C58970a) C80555c.f221110a.mo56225c()).mo56372aa(6120)).mo56389s("Received malformed response: %s", iVar);
        return C58836b.f156633a;
    }
}
