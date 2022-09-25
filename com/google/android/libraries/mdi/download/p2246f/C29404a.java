package com.google.android.libraries.mdi.download.p2246f;

import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.mdi.download.f.a */
/* compiled from: PG */
public final class C29404a {

    /* renamed from: a */
    private final C143658k f79723a;

    public C29404a(Context context) {
        this.f79723a = C143658k.m233373b(context, "ICING").mo118952a();
    }

    /* renamed from: a */
    public final void mo34707a(MessageLite messageLite, int i) {
        C143657j d = this.f79723a.mo118999d(messageLite);
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = i;
        d.mo118992a();
    }
}
