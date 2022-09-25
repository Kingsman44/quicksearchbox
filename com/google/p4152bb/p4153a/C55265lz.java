package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.lz */
/* compiled from: PG */
public final class C55265lz extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C55265lz f145555l;

    /* renamed from: m */
    public static final C62940bt f145556m;

    /* renamed from: o */
    private static volatile C63010eb f145557o;

    /* renamed from: a */
    public int f145558a;

    /* renamed from: b */
    public C62971cq f145559b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145560c = emptyProtobufList();

    /* renamed from: d */
    public C55373pz f145561d;

    /* renamed from: e */
    public C55305nl f145562e;

    /* renamed from: f */
    public C55213ka f145563f;

    /* renamed from: g */
    public C55202jq f145564g;

    /* renamed from: h */
    public int f145565h;

    /* renamed from: i */
    public C55171im f145566i;

    /* renamed from: j */
    public C62971cq f145567j = emptyProtobufList();

    /* renamed from: k */
    public C55242lc f145568k;

    /* renamed from: n */
    private byte f145569n = 2;

    static {
        C55265lz lzVar = new C55265lz();
        f145555l = lzVar;
        C62942bv.registerDefaultInstance(C55265lz.class, lzVar);
        f145556m = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, lzVar, lzVar, (C62958ce) null, 56515007, C63066gd.MESSAGE, C55265lz.class);
    }

    private C55265lz() {
    }

    /* renamed from: a */
    public final void mo54226a() {
        C62971cq cqVar = this.f145559b;
        if (!cqVar.mo58948c()) {
            this.f145559b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54227b() {
        C62971cq cqVar = this.f145560c;
        if (!cqVar.mo58948c()) {
            this.f145560c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145569n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145569n = b;
                return null;
            case 2:
                return newMessageInfo(f145555l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0003\b\u0001Л\u0002Л\u0003ᐉ\u0003\u0004င\u0004\u0005ᐉ\u0005\u0006Л\tᐉ\u0002\nဉ\u0006\u000bᐉ\u0000\fᐉ\u0001", new Object[]{"a", "b", C55213ka.class, C45240c.f118157a, C55305nl.class, C30325g.f82003a, C19618h.f54585a, "i", "j", C55282mp.class, C10662f.f35572a, C19621k.f54601a, "d", "e"});
            case 3:
                return new C55265lz();
            case 4:
                return new C55264ly();
            case 5:
                return f145555l;
            case 6:
                C63010eb ebVar = f145557o;
                if (ebVar == null) {
                    synchronized (C55265lz.class) {
                        ebVar = f145557o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145555l);
                            f145557o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
