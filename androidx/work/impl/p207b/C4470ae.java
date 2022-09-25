package androidx.work.impl.p207b;

import androidx.work.C4375a;
import androidx.work.C4380ad;
import androidx.work.C4389am;
import androidx.work.C4394ar;
import androidx.work.C4395as;
import androidx.work.C4412h;
import androidx.work.C4632m;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69699g;

/* renamed from: androidx.work.impl.b.ae */
/* compiled from: PG */
public final class C4470ae {

    /* renamed from: a */
    public static final String f14216a = C4380ad.m12561i("WorkSpec");

    /* renamed from: b */
    public final String f14217b;

    /* renamed from: c */
    public C4394ar f14218c;

    /* renamed from: d */
    public String f14219d;

    /* renamed from: e */
    public String f14220e;

    /* renamed from: f */
    public C4632m f14221f;

    /* renamed from: g */
    public C4632m f14222g;

    /* renamed from: h */
    public long f14223h;

    /* renamed from: i */
    public long f14224i;

    /* renamed from: j */
    public long f14225j;

    /* renamed from: k */
    public C4412h f14226k;

    /* renamed from: l */
    public int f14227l;

    /* renamed from: m */
    public C4375a f14228m;

    /* renamed from: n */
    public long f14229n;

    /* renamed from: o */
    public long f14230o;

    /* renamed from: p */
    public long f14231p;

    /* renamed from: q */
    public long f14232q;

    /* renamed from: r */
    public boolean f14233r;

    /* renamed from: s */
    public C4389am f14234s;

    /* renamed from: t */
    public int f14235t;

    /* renamed from: u */
    public final int f14236u;

    public C4470ae(String str, C4394ar arVar, String str2, String str3, C4632m mVar, C4632m mVar2, long j, long j2, long j3, C4412h hVar, int i, C4375a aVar, long j4, long j5, long j6, long j7, boolean z, C4389am amVar, int i2, int i3) {
        C4632m mVar3 = mVar2;
        C4412h hVar2 = hVar;
        C4375a aVar2 = aVar;
        C4389am amVar2 = amVar;
        C69664n.m101061g(str, "id");
        C69664n.m101061g(arVar, "state");
        C69664n.m101061g(str2, "workerClassName");
        C69664n.m101061g(mVar, "input");
        C69664n.m101061g(mVar3, "output");
        C69664n.m101061g(hVar2, "constraints");
        C69664n.m101061g(aVar2, "backoffPolicy");
        C69664n.m101061g(amVar2, "outOfQuotaPolicy");
        this.f14217b = str;
        this.f14218c = arVar;
        this.f14219d = str2;
        this.f14220e = str3;
        this.f14221f = mVar;
        this.f14222g = mVar3;
        this.f14223h = j;
        this.f14224i = j2;
        this.f14225j = j3;
        this.f14226k = hVar2;
        this.f14227l = i;
        this.f14228m = aVar2;
        this.f14229n = j4;
        this.f14230o = j5;
        this.f14231p = j6;
        this.f14232q = j7;
        this.f14233r = z;
        this.f14234s = amVar2;
        this.f14235t = i2;
        this.f14236u = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4470ae(java.lang.String r31, androidx.work.C4394ar r32, java.lang.String r33, java.lang.String r34, androidx.work.C4632m r35, androidx.work.C4632m r36, long r37, long r39, long r41, androidx.work.C4412h r43, int r44, androidx.work.C4375a r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.C4389am r55, int r56, int r57, byte[] r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.ar r1 = androidx.work.C4394ar.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0022
            androidx.work.m r1 = androidx.work.C4632m.f14549a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r35
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            androidx.work.m r1 = androidx.work.C4632m.f14549a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r8 = r1
            goto L_0x0031
        L_0x002f:
            r8 = r36
        L_0x0031:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r9 = r2
            goto L_0x003b
        L_0x0039:
            r9 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r39
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r41
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            androidx.work.h r1 = androidx.work.C4412h.f14080a
            r15 = r1
            goto L_0x0055
        L_0x0053:
            r15 = r43
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005d
            r16 = 0
            goto L_0x005f
        L_0x005d:
            r16 = r44
        L_0x005f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            androidx.work.a r1 = androidx.work.C4375a.EXPONENTIAL
            r17 = r1
            goto L_0x006a
        L_0x0068:
            r17 = r45
        L_0x006a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0071
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0073
        L_0x0071:
            r18 = r46
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r48
        L_0x007c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0083
            r22 = r2
            goto L_0x0085
        L_0x0083:
            r22 = r50
        L_0x0085:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r1 = -1
            r24 = r1
            goto L_0x0092
        L_0x0090:
            r24 = r52
        L_0x0092:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0099
            r1 = 0
            goto L_0x009a
        L_0x0099:
            r1 = 1
        L_0x009a:
            r26 = r1 & r54
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            androidx.work.am r1 = androidx.work.C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r27 = r1
            goto L_0x00a8
        L_0x00a6:
            r27 = r55
        L_0x00a8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b0
            r28 = 0
            goto L_0x00b2
        L_0x00b0:
            r28 = r56
        L_0x00b2:
            r29 = 0
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4470ae.<init>(java.lang.String, androidx.work.ar, java.lang.String, java.lang.String, androidx.work.m, androidx.work.m, long, long, long, androidx.work.h, int, androidx.work.a, long, long, long, long, boolean, androidx.work.am, int, int, byte[]):void");
    }

    /* renamed from: b */
    public static final List m12717b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4469ad adVar = (C4469ad) it.next();
            C4632m mVar = !adVar.f14215g.isEmpty() ? (C4632m) adVar.f14215g.get(0) : C4632m.f14549a;
            UUID fromString = UUID.fromString(adVar.f14209a);
            C4394ar arVar = adVar.f14210b;
            C4632m mVar2 = adVar.f14211c;
            List list2 = adVar.f14214f;
            int i = adVar.f14212d;
            int i2 = adVar.f14213e;
            arrayList.add(new C4395as(fromString, arVar, mVar2, list2, mVar, i));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static /* synthetic */ C4470ae m12718g(C4470ae aeVar, String str, C4394ar arVar, int i, long j, int i2, int i3) {
        long j2;
        String str2;
        C4470ae aeVar2 = aeVar;
        int i4 = i3;
        String str3 = (i4 & 1) != 0 ? aeVar2.f14217b : str;
        C4394ar arVar2 = (i4 & 2) != 0 ? aeVar2.f14218c : arVar;
        String str4 = (i4 & 4) != 0 ? aeVar2.f14219d : null;
        String str5 = (i4 & 8) != 0 ? aeVar2.f14220e : null;
        C4632m mVar = (i4 & 16) != 0 ? aeVar2.f14221f : null;
        C4632m mVar2 = (i4 & 32) != 0 ? aeVar2.f14222g : null;
        long j3 = (i4 & 64) != 0 ? aeVar2.f14223h : 0;
        long j4 = (i4 & 128) != 0 ? aeVar2.f14224i : 0;
        long j5 = (i4 & 256) != 0 ? aeVar2.f14225j : 0;
        C4412h hVar = (i4 & 512) != 0 ? aeVar2.f14226k : null;
        int i5 = (i4 & 1024) != 0 ? aeVar2.f14227l : i;
        C4375a aVar = (i4 & 2048) != 0 ? aeVar2.f14228m : null;
        if ((i4 & 4096) != 0) {
            str2 = str3;
            j2 = aeVar2.f14229n;
        } else {
            str2 = str3;
            j2 = 0;
        }
        long j6 = (i4 & 8192) != 0 ? aeVar2.f14230o : j;
        long j7 = (i4 & 16384) != 0 ? aeVar2.f14231p : 0;
        long j8 = (32768 & i4) != 0 ? aeVar2.f14232q : 0;
        boolean z = (65536 & i4) != 0 ? aeVar2.f14233r : false;
        C4389am amVar = (131072 & i4) != 0 ? aeVar2.f14234s : null;
        int i6 = (i4 & C89885b.HTTP_VALUE) != 0 ? aeVar2.f14235t : 0;
        int i7 = (i4 & 524288) != 0 ? aeVar2.f14236u : i2;
        String str6 = str2;
        C69664n.m101061g(str6, "id");
        C69664n.m101061g(arVar2, "state");
        C69664n.m101061g(str4, "workerClassName");
        C69664n.m101061g(mVar, "input");
        C69664n.m101061g(mVar2, "output");
        C69664n.m101061g(hVar, "constraints");
        C69664n.m101061g(aVar, "backoffPolicy");
        C69664n.m101061g(amVar, "outOfQuotaPolicy");
        return new C4470ae(str6, arVar2, str4, str5, mVar, mVar2, j3, j4, j5, hVar, i5, aVar, j2, j6, j7, j8, z, amVar, i6, i7);
    }

    /* renamed from: a */
    public final long mo9413a() {
        long j;
        if (mo9416e()) {
            if (this.f14228m == C4375a.LINEAR) {
                j = this.f14229n * ((long) this.f14227l);
            } else {
                j = (long) Math.scalb((float) this.f14229n, this.f14227l - 1);
            }
            long j2 = this.f14230o;
            if (j > 18000000) {
                j = 18000000;
            }
            return j2 + j;
        }
        long j3 = 0;
        if (mo9418f()) {
            int i = this.f14235t;
            long j4 = this.f14230o;
            if (i == 0) {
                j4 += this.f14223h;
            }
            long j5 = this.f14225j;
            long j6 = this.f14224i;
            if (j5 != j6) {
                if (i == 0) {
                    j3 = -j5;
                }
                j4 += j6;
            } else if (i != 0) {
                j3 = j6;
            }
            return j3 + j4;
        }
        long j7 = this.f14230o;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return this.f14223h + j7;
    }

    /* renamed from: c */
    public final void mo9414c(long j, long j2) {
        long j3 = 900000;
        if (j < 900000) {
            C4380ad.m12560h().mo9314f(f14216a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (j >= 900000) {
            j3 = j;
        }
        this.f14224i = j3;
        if (j2 < 300000) {
            C4380ad.m12560h().mo9314f(f14216a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.f14224i) {
            C4380ad h = C4380ad.m12560h();
            String str = f14216a;
            h.mo9314f(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.f14225j = C69699g.m101120b(j2, 300000, this.f14224i);
    }

    /* renamed from: d */
    public final boolean mo9415d() {
        return !C69664n.m101066l(C4412h.f14080a, this.f14226k);
    }

    /* renamed from: e */
    public final boolean mo9416e() {
        return this.f14218c == C4394ar.ENQUEUED && this.f14227l > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4470ae)) {
            return false;
        }
        C4470ae aeVar = (C4470ae) obj;
        return C69664n.m101066l(this.f14217b, aeVar.f14217b) && this.f14218c == aeVar.f14218c && C69664n.m101066l(this.f14219d, aeVar.f14219d) && C69664n.m101066l(this.f14220e, aeVar.f14220e) && C69664n.m101066l(this.f14221f, aeVar.f14221f) && C69664n.m101066l(this.f14222g, aeVar.f14222g) && this.f14223h == aeVar.f14223h && this.f14224i == aeVar.f14224i && this.f14225j == aeVar.f14225j && C69664n.m101066l(this.f14226k, aeVar.f14226k) && this.f14227l == aeVar.f14227l && this.f14228m == aeVar.f14228m && this.f14229n == aeVar.f14229n && this.f14230o == aeVar.f14230o && this.f14231p == aeVar.f14231p && this.f14232q == aeVar.f14232q && this.f14233r == aeVar.f14233r && this.f14234s == aeVar.f14234s && this.f14235t == aeVar.f14235t && this.f14236u == aeVar.f14236u;
    }

    /* renamed from: f */
    public final boolean mo9418f() {
        return this.f14224i != 0;
    }

    public final int hashCode() {
        int hashCode = ((((this.f14217b.hashCode() * 31) + this.f14218c.hashCode()) * 31) + this.f14219d.hashCode()) * 31;
        String str = this.f14220e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.f14221f.hashCode();
        int hashCode4 = this.f14222g.hashCode();
        long j = this.f14223h;
        long j2 = this.f14224i;
        long j3 = this.f14225j;
        int hashCode5 = this.f14226k.hashCode();
        int i = this.f14227l;
        int hashCode6 = this.f14228m.hashCode();
        long j4 = this.f14229n;
        long j5 = this.f14230o;
        long j6 = this.f14231p;
        long j7 = this.f14232q;
        return ((((((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + hashCode5) * 31) + i) * 31) + hashCode6) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.f14233r ? 1 : 0)) * 31) + this.f14234s.hashCode()) * 31) + this.f14235t) * 31) + this.f14236u;
    }

    public final String toString() {
        return "{WorkSpec: " + this.f14217b + '}';
    }
}
