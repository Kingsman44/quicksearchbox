package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.geller.portable.database.C21957e;
import com.google.android.libraries.mdi.download.C28745bw;
import com.google.android.libraries.mdi.download.C29655hz;
import com.google.android.libraries.mdi.download.p2248h.p2250b.p2252b.C29547a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.mdi.download.h.b.az */
/* compiled from: PG */
public final class C29545az implements C21957e {

    /* renamed from: a */
    public final C58881cr f80078a;

    /* renamed from: b */
    private final C58881cr f80079b;

    /* renamed from: c */
    private final C58881cr f80080c;

    public C29545az(C29544ay ayVar) {
        this.f80079b = ayVar.f80075a;
        this.f80080c = ayVar.f80076b;
        this.f80078a = ayVar.f80077c;
    }

    /* renamed from: a */
    public final long mo27281a(C58833ax axVar, String str, C65071r rVar) {
        if (!((Boolean) this.f80080c.mo6453a()).booleanValue()) {
            return 0;
        }
        if ((rVar.f176210a & 1) != 0) {
            String str2 = rVar.f176213d;
            C28745bw bwVar = (C28745bw) C29547a.f80083a.getOrDefault(str2, C28745bw.GDD_UNKNOWN);
            C58838bb.m90887v(!bwVar.equals(C28745bw.GDD_UNKNOWN), "GellerGddStorage does not support deletion for corpus: %s", str2);
            try {
                C29543ax axVar2 = new C29543ax(this, str, bwVar);
                return (long) ((C29655hz) C60922j.m93045h((C60870cx) this.f80079b.mo6453a(), C47810es.m84966f(axVar2), C60826bg.f164896a).get(3000, TimeUnit.MILLISECONDS)).mo34800a();
            } catch (ExecutionException | TimeoutException e) {
                throw new IllegalStateException("Unable to remove account file groups", e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Unable to remove account file groups", e2.getCause());
            }
        } else {
            throw new IllegalStateException("DataType is a required field in GellerDeleteParams.");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C65063j mo27282b(C58833ax axVar, Set set) {
        return C65063j.f176192d;
    }

    /* renamed from: c */
    public final byte[][] mo27283c(C58833ax axVar, C65031ap apVar) {
        return new byte[0][];
    }

    /* renamed from: d */
    public final String[] mo27284d(C58833ax axVar, String str) {
        return new String[0];
    }

    /* renamed from: e */
    public final long mo27285e(C58833ax axVar, String str, C65019ad adVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        return 0;
    }

    /* renamed from: f */
    public final boolean mo27286f(C58833ax axVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        return true;
    }
}
