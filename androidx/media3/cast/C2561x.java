package androidx.media3.cast;

import androidx.media3.common.p136b.C2632t;
import androidx.media3.common.p136b.C2633u;
import com.google.android.gms.cast.framework.media.C143493az;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;

/* renamed from: androidx.media3.cast.x */
/* compiled from: PG */
final class C2561x implements C143712ae {

    /* renamed from: a */
    final /* synthetic */ C2534aa f7043a;

    public C2561x(C2534aa aaVar) {
        this.f7043a = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6030a(C143711ad adVar) {
        int i = ((C143493az) adVar).mo117629a().f389621g;
        if (!(i == 0 || i == 2103)) {
            C2633u.m7048c("CastPlayer", "Seek failed. Error code " + i + ": " + C2538ae.m6740a(i));
        }
        C2534aa aaVar = this.f7043a;
        int i2 = aaVar.f6986h - 1;
        aaVar.f6986h = i2;
        if (i2 == 0) {
            aaVar.f6984f = aaVar.f6987i;
            aaVar.f6987i = -1;
            aaVar.f6988j = -9223372036854775807L;
            C2632t tVar = aaVar.f6980b;
            tVar.mo6204c(-1, C2560w.f7042a);
            tVar.mo6203b();
        }
    }
}
