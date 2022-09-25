package androidx.media3.exoplayer.p140d;

import android.content.Context;
import androidx.media3.common.C2591ar;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.p145h.p146a.C3006a;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.d.g */
/* compiled from: PG */
public final class C2905g implements C3006a {

    /* renamed from: a */
    public final C2906h f8251a;

    /* renamed from: b */
    public final Context f8252b;

    /* renamed from: c */
    public final C2904f f8253c = new C2904f(this);

    /* renamed from: d */
    public final HashMap f8254d = new HashMap();

    /* renamed from: e */
    public final HashMap f8255e = new HashMap();

    /* renamed from: f */
    public boolean f8256f;

    /* renamed from: g */
    public C2646bh f8257g;

    /* renamed from: h */
    public List f8258h = C58485gu.m89845m();

    /* renamed from: i */
    public C2646bh f8259i;

    /* renamed from: j */
    private final C2649bk f8260j = new C2649bk();

    /* renamed from: k */
    private final C2650bl f8261k = new C2650bl();

    /* renamed from: l */
    private C2903e f8262l;

    static {
        C2591ar.m6797b("media3.exoplayer.ima");
    }

    public C2905g(Context context, C2906h hVar) {
        this.f8252b = context.getApplicationContext();
        this.f8251a = hVar;
    }

    /* renamed from: a */
    public final void mo6740a() {
        C2903e eVar;
        C2646bh bhVar = this.f8259i;
        if (bhVar != null) {
            C2651bm u = bhVar.mo6014u();
            if (!u.mo6304o()) {
                int d = bhVar.mo5997d();
                C2649bk bkVar = this.f8260j;
                C2650bl blVar = this.f8261k;
                C2848br brVar = (C2848br) bhVar;
                brVar.mo6600aQ();
                int i = brVar.f7999k;
                brVar.mo6600aQ();
                int i2 = u.mo6298i(d, bkVar, blVar, i, brVar.f8000l);
                if (i2 != -1) {
                    u.mo6023d(i2, this.f8260j, false);
                    Object obj = this.f8260j.f7334g.f7414b;
                    if (obj != null && (eVar = (C2903e) this.f8254d.get(obj)) != null && eVar != this.f8262l) {
                        C2650bl blVar2 = this.f8261k;
                        C2649bk bkVar2 = this.f8260j;
                        eVar.mo6733N(C2612ak.m6918A(((Long) u.mo6301l(blVar2, bkVar2, bkVar2.f7330c, -9223372036854775807L).second).longValue()), C2612ak.m6918A(this.f8260j.f7331d));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r8.f8255e.containsValue(r1) == false) goto L_0x0007;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6741b() {
        /*
            r8 = this;
            androidx.media3.exoplayer.d.e r0 = r8.f8262l
            androidx.media3.common.bh r1 = r8.f8259i
            r2 = 0
            if (r1 != 0) goto L_0x0009
        L_0x0007:
            r1 = r2
            goto L_0x0039
        L_0x0009:
            androidx.media3.common.bm r3 = r1.mo6014u()
            boolean r4 = r3.mo6304o()
            if (r4 == 0) goto L_0x0014
            goto L_0x0007
        L_0x0014:
            int r1 = r1.mo5997d()
            androidx.media3.common.bk r4 = r8.f8260j
            r5 = 0
            androidx.media3.common.bk r1 = r3.mo6023d(r1, r4, r5)
            androidx.media3.common.c r1 = r1.f7334g
            java.lang.Object r1 = r1.f7414b
            if (r1 != 0) goto L_0x0026
            goto L_0x0007
        L_0x0026:
            java.util.HashMap r3 = r8.f8254d
            java.lang.Object r1 = r3.get(r1)
            androidx.media3.exoplayer.d.e r1 = (androidx.media3.exoplayer.p140d.C2903e) r1
            if (r1 == 0) goto L_0x0007
            java.util.HashMap r3 = r8.f8255e
            boolean r3 = r3.containsValue(r1)
            if (r3 != 0) goto L_0x0039
            goto L_0x0007
        L_0x0039:
            boolean r3 = androidx.media3.common.p136b.C2612ak.m6951aa(r0, r1)
            if (r3 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x0089
            androidx.media3.common.bh r3 = r0.f8233j
            r3.getClass()
            androidx.media3.common.c r4 = androidx.media3.common.C2659c.f7412a
            androidx.media3.common.c r5 = r0.f8241r
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0072
            boolean r4 = r0.f8242s
            if (r4 == 0) goto L_0x0072
            com.google.ads.interactivemedia.v3.api.AdsManager r4 = r0.f8237n
            if (r4 == 0) goto L_0x005b
            r4.pause()
        L_0x005b:
            androidx.media3.common.c r4 = r0.f8241r
            boolean r5 = r0.f8246w
            if (r5 == 0) goto L_0x006a
            long r5 = r3.mo6004k()
            long r5 = androidx.media3.common.p136b.C2612ak.m6998w(r5)
            goto L_0x006c
        L_0x006a:
            r5 = 0
        L_0x006c:
            androidx.media3.common.c r4 = r4.mo6325f(r5)
            r0.f8241r = r4
        L_0x0072:
            int r4 = r0.mo6728H()
            r0.f8236m = r4
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r4 = r0.mo6729J()
            r0.f8235l = r4
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r4 = r0.mo6730K()
            r0.f8234k = r4
            r3.mo6019z(r0)
            r0.f8233j = r2
        L_0x0089:
            r8.f8262l = r1
            if (r1 == 0) goto L_0x00e0
            androidx.media3.common.bh r0 = r8.f8259i
            r0.getClass()
            r1.f8233j = r0
            r0.mo6016w(r1)
            boolean r2 = r0.mo5987O()
            androidx.media3.common.bm r3 = r0.mo6014u()
            r4 = 1
            r1.mo6222C(r3, r4)
            com.google.ads.interactivemedia.v3.api.AdsManager r3 = r1.f8237n
            androidx.media3.common.c r4 = androidx.media3.common.C2659c.f7412a
            androidx.media3.common.c r5 = r1.f8241r
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00e0
            if (r3 == 0) goto L_0x00e0
            boolean r4 = r1.f8242s
            if (r4 == 0) goto L_0x00e0
            androidx.media3.common.bm r4 = r1.f8239p
            androidx.media3.common.bk r5 = r1.f8225b
            long r4 = androidx.media3.exoplayer.p140d.C2903e.m8095I(r0, r4, r5)
            androidx.media3.common.c r0 = r1.f8241r
            long r4 = androidx.media3.common.p136b.C2612ak.m6998w(r4)
            long r6 = r1.f8240q
            long r6 = androidx.media3.common.p136b.C2612ak.m6998w(r6)
            int r0 = r0.mo6320b(r4, r6)
            r4 = -1
            if (r0 == r4) goto L_0x00db
            androidx.media3.exoplayer.d.c r1 = r1.f8245v
            if (r1 == 0) goto L_0x00db
            int r1 = r1.f8210a
            if (r1 == r0) goto L_0x00db
            r3.discardAdBreak()
        L_0x00db:
            if (r2 == 0) goto L_0x00e0
            r3.resume()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p140d.C2905g.mo6741b():void");
    }
}
