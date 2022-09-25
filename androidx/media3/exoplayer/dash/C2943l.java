package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.dash.p141a.C2932w;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3248n;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2510n;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.dash.l */
/* compiled from: PG */
final class C2943l implements C3249o {

    /* renamed from: a */
    final /* synthetic */ DashMediaSource f8450a;

    public C2943l(DashMediaSource dashMediaSource) {
        this.f8450a = dashMediaSource;
    }

    /* renamed from: eX */
    public final /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        this.f8450a.mo6758n((C3259y) rVar);
    }

    /* renamed from: fb */
    public final /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        int i;
        long j3 = j;
        C3259y yVar = (C3259y) rVar;
        DashMediaSource dashMediaSource = this.f8450a;
        long j4 = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        dashMediaSource.f8276a.mo7007f(new C3027aj(nVar, (byte[]) null), yVar.f9793c);
        C2912c cVar = (C2912c) yVar.f9795e;
        C2912c cVar2 = dashMediaSource.f8283h;
        if (cVar2 == null) {
            i = 0;
        } else {
            i = cVar2.mo6764a();
        }
        long j5 = cVar.mo6766c(0).f8351b;
        int i2 = 0;
        while (i2 < i && dashMediaSource.f8283h.mo6766c(i2).f8351b < j5) {
            i2++;
        }
        if (cVar.f8319d) {
            if (i - i2 > cVar.mo6764a()) {
                C2633u.m7050e("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j6 = dashMediaSource.f8288m;
                if (j6 != -9223372036854775807L) {
                    long j7 = cVar.f8323h;
                    if (1000 * j7 <= j6) {
                        C2633u.m7050e("DashMediaSource", "Loaded stale dynamic manifest: " + j7 + ", " + j6);
                    }
                }
                dashMediaSource.f8287l = 0;
            }
            int i3 = dashMediaSource.f8287l;
            int i4 = i3 + 1;
            dashMediaSource.f8287l = i4;
            if (i3 < C3245k.m9467b(yVar.f9793c)) {
                dashMediaSource.mo6755k((long) Math.min((i4 - 1) * 1000, 5000));
                return;
            } else {
                dashMediaSource.f8280e = new C2934c();
                return;
            }
        }
        dashMediaSource.f8283h = cVar;
        dashMediaSource.f8284i &= dashMediaSource.f8283h.f8319d;
        dashMediaSource.f8285j = j3 - j2;
        dashMediaSource.f8286k = j3;
        synchronized (dashMediaSource.f8277b) {
            if (yVar.f9792b.f6891a == dashMediaSource.f8282g) {
                Uri uri = dashMediaSource.f8283h.f8326k;
                if (uri == null) {
                    uri = yVar.f9794d.f6846b;
                }
                dashMediaSource.f8282g = uri;
            }
        }
        if (i == 0) {
            C2912c cVar3 = dashMediaSource.f8283h;
            if (cVar3.f8319d) {
                C2932w wVar = cVar3.f8324i;
                if (wVar != null) {
                    String str = wVar.f8398a;
                    if (C2612ak.m6951aa(str, "urn:mpeg:dash:utc:direct:2014") || C2612ak.m6951aa(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            dashMediaSource.mo6749e(C2612ak.m6999x(wVar.f8399b) - dashMediaSource.f8286k);
                        } catch (C2599az e) {
                            dashMediaSource.mo6748d(e);
                        }
                    } else if (C2612ak.m6951aa(str, "urn:mpeg:dash:utc:http-iso:2014") || C2612ak.m6951aa(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        dashMediaSource.mo6754j(wVar, new C2942k());
                    } else if (C2612ak.m6951aa(str, "urn:mpeg:dash:utc:http-xsdate:2014") || C2612ak.m6951aa(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        dashMediaSource.mo6754j(wVar, new C2946o());
                    } else if (C2612ak.m6951aa(str, "urn:mpeg:dash:utc:ntp:2014") || C2612ak.m6951aa(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        dashMediaSource.mo6746b();
                    } else {
                        dashMediaSource.mo6748d(new IOException("Unsupported UTC timing scheme"));
                    }
                } else {
                    dashMediaSource.mo6746b();
                }
            } else {
                dashMediaSource.mo6751g(true);
            }
        } else {
            dashMediaSource.f8289n += i2;
            dashMediaSource.mo6751g(true);
        }
    }

    /* renamed from: fe */
    public final /* synthetic */ C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        C3250p pVar;
        C3259y yVar = (C3259y) rVar;
        DashMediaSource dashMediaSource = this.f8450a;
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        int i2 = yVar.f9793c;
        long c = C3245k.m9468c(new C3248n(iOException, i));
        if (c == -9223372036854775807L) {
            pVar = C3256v.f9787c;
        } else {
            pVar = new C3250p(0, c);
        }
        boolean z = !pVar.mo7243a();
        dashMediaSource.f8276a.mo7009h(ajVar, yVar.f9793c, iOException, z);
        if (z) {
            long j2 = yVar.f9791a;
        }
        return pVar;
    }
}
