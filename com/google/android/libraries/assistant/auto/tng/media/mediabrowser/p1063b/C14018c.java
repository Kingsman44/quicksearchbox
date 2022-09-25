package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.c */
/* compiled from: PG */
public final /* synthetic */ class C14018c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Throwable f42624a;

    /* renamed from: b */
    public final /* synthetic */ long f42625b;

    public /* synthetic */ C14018c(Throwable th, long j) {
        this.f42624a = th;
        this.f42625b = j;
    }

    public final Object apply(Object obj) {
        C62722b bVar;
        Throwable th = this.f42624a;
        long j = this.f42625b;
        C15488n nVar = (C15488n) obj;
        if (th == null) {
            bVar = C62722b.OK;
        } else if (th instanceof CancellationException) {
            bVar = C62722b.CANCELLED;
        } else if (th instanceof TimeoutException) {
            bVar = C62722b.DEADLINE_EXCEEDED;
        } else {
            bVar = C62722b.UNKNOWN;
        }
        C37252a c = C37179a.f97661ec.mo40805c(bVar);
        Optional of = Optional.m71637of(Long.valueOf(j));
        if (of.isPresent()) {
            String b = C39191a.m68623b(((Long) of.get()).longValue());
            C37253b bVar2 = (C37253b) c;
            bVar2.mo40794r(b);
            bVar2.mo40795s("assistant_request_tag", b);
        }
        nVar.mo19974a(c);
        return 0;
    }
}
