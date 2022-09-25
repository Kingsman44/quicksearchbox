package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.android.gms.usonia.p10881d.C146203g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.c */
/* compiled from: PG */
public final class C124318c implements C146203g {

    /* renamed from: a */
    private static final C59071e f343184a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.c");

    /* renamed from: b */
    private final C124271b f343185b;

    public C124318c(C124271b bVar) {
        this.f343185b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C146202f mo106373a(PeerAddress peerAddress) {
        ((C59052c) ((C59052c) f343184a.mo56224b()).mo56372aa(36162)).mo56389s("Create CallState trait subscriber for %s", peerAddress.mo122618a());
        return new C124319d(this.f343185b);
    }

    /* renamed from: b */
    public final String mo106374b() {
        return "assistant_client.connect.CallStateTrait";
    }
}
