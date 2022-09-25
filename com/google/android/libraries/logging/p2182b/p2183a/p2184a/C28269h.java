package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import android.util.Log;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.base.C58819aj;
import com.google.common.base.C58839bc;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.logging.b.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C28269h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28270i f76934a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f76935b;

    /* renamed from: c */
    public final /* synthetic */ C58839bc f76936c;

    /* renamed from: d */
    public final /* synthetic */ String f76937d;

    /* renamed from: e */
    public final /* synthetic */ C143623ad f76938e;

    public /* synthetic */ C28269h(C28270i iVar, MessageLite messageLite, C58839bc bcVar, String str, C143623ad adVar) {
        this.f76934a = iVar;
        this.f76935b = messageLite;
        this.f76936c = bcVar;
        this.f76937d = str;
        this.f76938e = adVar;
    }

    public final C60870cx apply(Object obj) {
        C28270i iVar = this.f76934a;
        MessageLite messageLite = this.f76935b;
        C58839bc bcVar = this.f76936c;
        String str = this.f76937d;
        C143623ad adVar = this.f76938e;
        C28259b bVar = (C28259b) obj;
        C143658k b = iVar.mo33772b(bVar);
        if (b == null) {
            return C60866ct.f164955a;
        }
        C143657j d = b.mo118999d(messageLite);
        C58893dc.m90997b(bcVar.mo5941a(d));
        d.f389471m = str;
        d.f389472n = adVar;
        int i = bVar.f76911b - 1;
        if (i == 0) {
            d.mo118996e(bVar.f76910a);
        } else if (i == 1) {
            d.mo118996e((String) null);
        } else if (i != 2) {
            throw new IllegalArgumentException("Dropped logs must not be logged.");
        }
        C60870cx a = C43205e.m76191a(d.mo118992a());
        if (Log.isLoggable("Logging.Clearcut", 3)) {
            Log.d("Logging.Clearcut", d.toString());
        }
        return C60922j.m93044g(a, new C58819aj((Object) null), C60826bg.f164896a);
    }
}
