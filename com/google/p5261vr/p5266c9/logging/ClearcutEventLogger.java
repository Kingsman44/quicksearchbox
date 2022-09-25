package com.google.p5261vr.p5266c9.logging;

import android.content.Context;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p5261vr.p5266c9.p5267a.C67940b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.vr.c9.logging.ClearcutEventLogger */
/* compiled from: PG */
final class ClearcutEventLogger {

    /* renamed from: a */
    private final C143658k f184151a;

    /* renamed from: b */
    private final C143623ad f184152b;

    public ClearcutEventLogger(Context context, C143658k kVar) {
        this.f184151a = kVar;
        this.f184152b = C24006d.m44596b(context, new C67949a());
    }

    private void logToC9(int i, byte[] bArr) {
        if (this.f184151a != null) {
            try {
                mo60063a((C67940b) C62942bv.parseFrom((C62942bv) C67940b.f184134c, C63088z.m96139A(bArr), C62921ba.m95368a()), Integer.valueOf(i));
            } catch (IOException unused) {
                C143657j jVar = new C143657j(this.f184151a, bArr);
                C58149a aVar = jVar.f389461c;
                aVar.copyOnWrite();
                C58150b bVar = (C58150b) aVar.instance;
                C58150b bVar2 = C58150b.f155459k;
                bVar.f155461a |= 16;
                bVar.f155464d = i;
                jVar.mo118992a();
            }
            mo60064b(TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    public final void mo60063a(C67940b bVar, Integer num) {
        C143657j e = this.f184151a.mo119000e(bVar, this.f184152b);
        if (num != null) {
            int intValue = num.intValue();
            C58149a aVar = e.f389461c;
            aVar.copyOnWrite();
            C58150b bVar2 = (C58150b) aVar.instance;
            C58150b bVar3 = C58150b.f155459k;
            bVar2.f155461a |= 16;
            bVar2.f155464d = intValue;
        }
        e.mo118992a();
    }

    /* renamed from: b */
    public final boolean mo60064b(TimeUnit timeUnit) {
        C143658k kVar = this.f184151a;
        if (kVar == null) {
            return false;
        }
        return kVar.f389481h.mo118976b(1, timeUnit);
    }

    private ClearcutEventLogger(Context context, String str) {
        this(context, C67950b.m98217a(context, str));
    }
}
