package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.android.gms.usonia.p10881d.C146203g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.m */
/* compiled from: PG */
public final class C124328m implements C146203g {

    /* renamed from: a */
    private static final C59071e f343204a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.m");

    /* renamed from: b */
    private final C124271b f343205b;

    public C124328m(C124271b bVar) {
        this.f343205b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C146202f mo106373a(PeerAddress peerAddress) {
        ((C59052c) ((C59052c) f343204a.mo56224b()).mo56372aa(36177)).mo56389s("Create TimerTrait subscriber for %s", peerAddress.mo122618a());
        return new C124329n(this.f343205b);
    }

    /* renamed from: b */
    public final String mo106374b() {
        return "assistant_client.connect.TimerTrait";
    }
}
