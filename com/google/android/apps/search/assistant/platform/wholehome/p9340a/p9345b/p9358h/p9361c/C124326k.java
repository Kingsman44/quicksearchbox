package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.android.gms.usonia.p10881d.C146203g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.k */
/* compiled from: PG */
public final class C124326k implements C146203g {

    /* renamed from: a */
    private static final C59071e f343200a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.k");

    /* renamed from: b */
    private final C124271b f343201b;

    public C124326k(C124271b bVar) {
        this.f343201b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C146202f mo106373a(PeerAddress peerAddress) {
        ((C59052c) ((C59052c) f343200a.mo56224b()).mo56372aa(36174)).mo56389s("Create MediaTrait subscriber for %s", peerAddress.mo122618a());
        return new C124327l(this.f343201b);
    }

    /* renamed from: b */
    public final String mo106374b() {
        return "assistant_client.connect.MediaTrait";
    }
}
