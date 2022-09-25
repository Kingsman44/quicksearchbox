package com.google.android.libraries.search.silk.web.share;

import com.google.android.libraries.silk.event.C41894b;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56837b;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.search.silk.web.share.i */
/* compiled from: PG */
public final /* synthetic */ class C40913i implements C41894b {

    /* renamed from: a */
    public final /* synthetic */ C43968o f107162a;

    public /* synthetic */ C40913i(C43968o oVar) {
        this.f107162a = oVar;
    }

    /* renamed from: a */
    public final void mo42922a(MessageLite messageLite) {
        C43968o oVar = this.f107162a;
        int i = SilkShareMessageHandler.f107150g;
        oVar.mo46960a(C41743a.m73203d((C56837b) messageLite, "ShareButtonTap").toString());
    }
}
