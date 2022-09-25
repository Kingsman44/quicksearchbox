package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7707gz;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* compiled from: PG */
public abstract class LoggingRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91908f();

    /* renamed from: x */
    public static C91909g m150673x() {
        C91903a aVar = new C91903a();
        aVar.mo86545i(false);
        aVar.mo86546j(false);
        aVar.mo86549m(false);
        aVar.mo86544h(true);
        aVar.mo86541e(-2147483647);
        aVar.mo86539c(-2147483647);
        aVar.mo86540d(-2147483647);
        aVar.mo86542f(-2147483647);
        aVar.mo86553q(-2147483647);
        aVar.mo86550n(-2147483647);
        aVar.mo86551o(-2147483647);
        aVar.mo86552p(-2147483647);
        return aVar;
    }

    @Deprecated
    /* renamed from: y */
    public static LoggingRequest m150674y(C7718hj hjVar, C7681g gVar, C7526an anVar, C8142xb xbVar) {
        C91909g x = m150673x();
        C91903a aVar = (C91903a) x;
        aVar.f256281a = C91978bb.m150937c(hjVar, gVar, new C7681g[0]);
        aVar.f256285e = hjVar;
        aVar.f256286f = anVar;
        aVar.f256288h = xbVar;
        return x.mo86537a();
    }

    /* renamed from: a */
    public abstract int mo86490a();

    /* renamed from: b */
    public abstract int mo86491b();

    /* renamed from: c */
    public abstract int mo86492c();

    /* renamed from: d */
    public abstract int mo86493d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract int mo86494e();

    /* renamed from: f */
    public abstract int mo86496f();

    /* renamed from: g */
    public abstract int mo86497g();

    /* renamed from: h */
    public abstract int mo86498h();

    /* renamed from: i */
    public abstract C91909g mo86500i();

    /* renamed from: j */
    public abstract StreamRenderData mo86501j();

    /* renamed from: k */
    public abstract C7708h mo86502k();

    /* renamed from: l */
    public abstract C7526an mo86503l();

    /* renamed from: m */
    public abstract C7718hj mo86504m();

    /* renamed from: n */
    public abstract C7918ou mo86505n();

    /* renamed from: o */
    public abstract C8142xb mo86506o();

    /* renamed from: p */
    public abstract Optional mo86507p();

    /* renamed from: q */
    public abstract Integer mo86508q();

    /* renamed from: r */
    public abstract Long mo86509r();

    /* renamed from: s */
    public abstract Long mo86510s();

    /* renamed from: t */
    public abstract boolean mo86511t();

    /* renamed from: u */
    public abstract boolean mo86513u();

    /* renamed from: v */
    public abstract boolean mo86514v();

    /* renamed from: w */
    public abstract boolean mo86515w();

    public final void writeToParcel(Parcel parcel, int i) {
        Integer num;
        ProtoLiteParcelable.m147140k(mo86502k(), parcel);
        ProtoLiteParcelable.m147140k(mo86504m(), parcel);
        ProtoLiteParcelable.m147140k(mo86503l(), parcel);
        ProtoLiteParcelable.m147140k(mo86505n(), parcel);
        parcel.writeParcelable(mo86501j(), i);
        C8142xb o = mo86506o();
        if (o == null) {
            num = null;
        } else {
            num = Integer.valueOf(o.f28649u);
        }
        C23338c.m43771c(num, parcel);
        C23338c.m43771c((Integer) mo86507p().orElse(null), parcel);
        parcel.writeByte(mo86513u() ? (byte) 1 : 0);
        parcel.writeByte(mo86511t() ? (byte) 1 : 0);
        parcel.writeByte(mo86515w() ? (byte) 1 : 0);
        parcel.writeInt(mo86492c());
        parcel.writeInt(mo86490a());
        parcel.writeInt(mo86491b());
        parcel.writeInt(mo86493d());
        parcel.writeInt(mo86498h());
        parcel.writeInt(mo86494e());
        parcel.writeInt(mo86496f());
        parcel.writeInt(mo86497g());
    }

    /* renamed from: z */
    public final C7752iq mo86532z(long j) {
        C7707gz gzVar;
        C7708h k = mo86502k();
        k.getClass();
        Long s = mo86510s();
        if (s == null) {
            s = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j));
        }
        Long r = mo86509r();
        if (r == null) {
            r = 0L;
        }
        Integer q = mo86508q();
        if (q == null) {
            q = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds((long) TimeZone.getDefault().getOffset(j)));
        }
        C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
        long longValue = s.longValue();
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        iqVar.f27131a |= 16;
        iqVar.f27140j = longValue;
        long longValue2 = r.longValue();
        ipVar.copyOnWrite();
        C7752iq iqVar2 = (C7752iq) ipVar.instance;
        iqVar2.f27131a |= 64;
        iqVar2.f27142l = longValue2;
        int intValue = q.intValue();
        ipVar.copyOnWrite();
        C7752iq iqVar3 = (C7752iq) ipVar.instance;
        iqVar3.f27131a |= 32;
        iqVar3.f27141k = intValue;
        ipVar.copyOnWrite();
        C7752iq iqVar4 = (C7752iq) ipVar.instance;
        iqVar4.f27133c = k;
        iqVar4.f27132b = 1;
        C7718hj m = mo86504m();
        if (m != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar5 = (C7752iq) ipVar.instance;
            iqVar5.f27135e = m;
            iqVar5.f27134d = 2;
        }
        StreamRenderData j2 = mo86501j();
        if (j2 != null) {
            C7752iq iqVar6 = (C7752iq) ipVar.instance;
            if (iqVar6.f27134d == 2) {
                C7711hc hcVar = (C7711hc) ((C7718hj) iqVar6.f27135e).toBuilder();
                C7718hj hjVar = (C7718hj) hcVar.instance;
                if ((hjVar.f26955a & 64) != 0) {
                    C7709ha haVar = hjVar.f26972m;
                    if (haVar == null) {
                        haVar = C7709ha.f26910f;
                    }
                    gzVar = (C7707gz) haVar.toBuilder();
                } else {
                    gzVar = (C7707gz) C7709ha.f26910f.createBuilder();
                }
                Integer g = j2.mo86523g();
                if (g != null) {
                    int intValue2 = g.intValue();
                    gzVar.copyOnWrite();
                    C7709ha haVar2 = (C7709ha) gzVar.instance;
                    haVar2.f26912a |= 4;
                    haVar2.f26914c = intValue2;
                }
                Integer k2 = j2.mo86528k();
                if (k2 != null) {
                    int intValue3 = k2.intValue();
                    gzVar.copyOnWrite();
                    C7709ha haVar3 = (C7709ha) gzVar.instance;
                    haVar3.f26912a |= 8;
                    haVar3.f26915d = intValue3;
                }
                hcVar.copyOnWrite();
                C7718hj hjVar2 = (C7718hj) hcVar.instance;
                C7709ha haVar4 = (C7709ha) gzVar.build();
                haVar4.getClass();
                hjVar2.f26972m = haVar4;
                hjVar2.f26955a |= 64;
                C7718hj hjVar3 = (C7718hj) hcVar.build();
                ipVar.copyOnWrite();
                C7752iq iqVar7 = (C7752iq) ipVar.instance;
                hjVar3.getClass();
                iqVar7.f27135e = hjVar3;
                iqVar7.f27134d = 2;
                Integer i = j2.mo86526i();
                C7718hj f = j2.mo86522f();
                C7709ha d = j2.mo86519d();
                if (!(i == null && d == null && f == null)) {
                    C7707gz gzVar2 = (C7707gz) C7709ha.f26910f.createBuilder();
                    if (d != null) {
                        gzVar2.mergeFrom(d);
                    } else if (!(f == null || (f.f26955a & 64) == 0)) {
                        C7709ha haVar5 = f.f26972m;
                        if (haVar5 == null) {
                            haVar5 = C7709ha.f26910f;
                        }
                        gzVar2.mergeFrom(haVar5);
                    }
                    if (i != null) {
                        int intValue4 = i.intValue();
                        gzVar2.copyOnWrite();
                        C7709ha haVar6 = (C7709ha) gzVar2.instance;
                        haVar6.f26912a |= 4;
                        haVar6.f26914c = intValue4;
                    }
                    C7709ha haVar7 = (C7709ha) gzVar2.build();
                    ipVar.copyOnWrite();
                    C7752iq iqVar8 = (C7752iq) ipVar.instance;
                    haVar7.getClass();
                    iqVar8.f27139i = haVar7;
                    iqVar8.f27138h = 36;
                }
                Integer h = j2.mo86524h();
                C7718hj e = j2.mo86520e();
                C7709ha c = j2.mo86518c();
                if (!(h == null && c == null && e == null)) {
                    C7707gz gzVar3 = (C7707gz) C7709ha.f26910f.createBuilder();
                    if (c != null) {
                        gzVar3.mergeFrom(c);
                    } else if (!(e == null || (e.f26955a & 64) == 0)) {
                        C7709ha haVar8 = e.f26972m;
                        if (haVar8 == null) {
                            haVar8 = C7709ha.f26910f;
                        }
                        gzVar3.mergeFrom(haVar8);
                    }
                    if (h != null) {
                        int intValue5 = h.intValue();
                        gzVar3.copyOnWrite();
                        C7709ha haVar9 = (C7709ha) gzVar3.instance;
                        haVar9.f26912a |= 4;
                        haVar9.f26914c = intValue5;
                    }
                    C7709ha haVar10 = (C7709ha) gzVar3.build();
                    ipVar.copyOnWrite();
                    C7752iq iqVar9 = (C7752iq) ipVar.instance;
                    haVar10.getClass();
                    iqVar9.f27137g = haVar10;
                    iqVar9.f27136f = 35;
                }
            }
            Integer j3 = j2.mo86527j();
            if (j3 != null) {
                int intValue6 = j3.intValue();
                ipVar.copyOnWrite();
                C7752iq iqVar10 = (C7752iq) ipVar.instance;
                iqVar10.f27131a |= C89885b.NOW_VALUE;
                iqVar10.f27155y = intValue6;
            }
            ipVar = (C7751ip) ((C7752iq) ipVar.build()).toBuilder();
        }
        C8142xb o = mo86506o();
        if (o != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar11 = (C7752iq) ipVar.instance;
            iqVar11.f27127B = o.f28649u;
            iqVar11.f27131a |= 1073741824;
        }
        C7918ou n = mo86505n();
        if (n != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar12 = (C7752iq) ipVar.instance;
            iqVar12.f27153w = n;
            iqVar12.f27131a |= 524288;
        }
        Optional p = mo86507p();
        if (p.isPresent()) {
            int intValue7 = ((Integer) p.get()).intValue();
            ipVar.copyOnWrite();
            C7752iq iqVar13 = (C7752iq) ipVar.instance;
            C62961ch chVar = iqVar13.f27129D;
            if (!chVar.mo58948c()) {
                iqVar13.f27129D = C62942bv.mutableCopy(chVar);
            }
            iqVar13.f27129D.mo58916g(intValue7);
        }
        boolean t = mo86511t();
        ipVar.copyOnWrite();
        C7752iq iqVar14 = (C7752iq) ipVar.instance;
        iqVar14.f27131a |= 256;
        iqVar14.f27143m = t;
        if (mo86492c() != -2147483647) {
            int c2 = mo86492c();
            ipVar.copyOnWrite();
            C7752iq iqVar15 = (C7752iq) ipVar.instance;
            iqVar15.f27131a |= 4096;
            iqVar15.f27147q = c2;
        }
        if (mo86490a() != -2147483647) {
            int a = mo86490a();
            ipVar.copyOnWrite();
            C7752iq iqVar16 = (C7752iq) ipVar.instance;
            iqVar16.f27131a |= 512;
            iqVar16.f27144n = a;
        }
        if (mo86491b() != -2147483647) {
            int b = mo86491b();
            ipVar.copyOnWrite();
            C7752iq iqVar17 = (C7752iq) ipVar.instance;
            iqVar17.f27131a |= 16384;
            iqVar17.f27149s = b;
        }
        if (mo86493d() != -2147483647) {
            int d2 = mo86493d();
            ipVar.copyOnWrite();
            C7752iq iqVar18 = (C7752iq) ipVar.instance;
            iqVar18.f27131a |= 8192;
            iqVar18.f27148r = d2;
        }
        if (mo86498h() != -2147483647) {
            int h2 = mo86498h();
            ipVar.copyOnWrite();
            C7752iq iqVar19 = (C7752iq) ipVar.instance;
            iqVar19.f27131a |= 1024;
            iqVar19.f27145o = h2;
        }
        if (mo86494e() != -2147483647) {
            int e2 = mo86494e();
            ipVar.copyOnWrite();
            C7752iq iqVar20 = (C7752iq) ipVar.instance;
            iqVar20.f27131a |= 2048;
            iqVar20.f27146p = e2;
        }
        if (mo86496f() != -2147483647) {
            int f2 = mo86496f();
            ipVar.copyOnWrite();
            C7752iq iqVar21 = (C7752iq) ipVar.instance;
            iqVar21.f27131a |= 32768;
            iqVar21.f27150t = f2;
        }
        if (mo86497g() != -2147483647) {
            int g2 = mo86497g();
            ipVar.copyOnWrite();
            C7752iq iqVar22 = (C7752iq) ipVar.instance;
            iqVar22.f27131a |= 65536;
            iqVar22.f27151u = g2;
        }
        return (C7752iq) ipVar.build();
    }
}
