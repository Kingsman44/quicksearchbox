package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3820ak.C49215n;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.gt */
/* compiled from: PG */
public final class C53245gt extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C53245gt f139564n;

    /* renamed from: o */
    public static final C62940bt f139565o;

    /* renamed from: p */
    private static volatile C63010eb f139566p;

    /* renamed from: a */
    public int f139567a;

    /* renamed from: b */
    public int f139568b;

    /* renamed from: c */
    public C62971cq f139569c = emptyProtobufList();

    /* renamed from: d */
    public C58072d f139570d;

    /* renamed from: e */
    public C53244gs f139571e;

    /* renamed from: f */
    public C63042fg f139572f;

    /* renamed from: g */
    public C53234gi f139573g;

    /* renamed from: h */
    public boolean f139574h;

    /* renamed from: i */
    public String f139575i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f139576j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C53242gq f139577k;

    /* renamed from: l */
    public C53238gm f139578l;

    /* renamed from: m */
    public C49215n f139579m;

    static {
        C53245gt gtVar = new C53245gt();
        f139564n = gtVar;
        C62942bv.registerDefaultInstance(C53245gt.class, gtVar);
        f139565o = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, gtVar, gtVar, (C62958ce) null, 104, C63066gd.MESSAGE, C53245gt.class);
    }

    private C53245gt() {
    }

    /* renamed from: a */
    public final void mo53971a() {
        C62971cq cqVar = this.f139569c;
        if (!cqVar.mo58948c()) {
            this.f139569c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f139564n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0005\u0003ဈ\u0006\u0004ဈ\u0007\u0005ဉ\b\u0006ဉ\t\u0007ဉ\u0004\bဉ\u0002\tဉ\u0003\nဌ\u0000\u000bဉ\u0001\fဉ\n", new Object[]{"a", C45240c.f118157a, C53230ge.class, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", C30325g.f82003a, "e", C10662f.f35572a, "b", C53232gg.m86790b(), "d", "m"});
            case 3:
                return new C53245gt();
            case 4:
                return new C53228gc();
            case 5:
                return f139564n;
            case 6:
                C63010eb ebVar = f139566p;
                if (ebVar == null) {
                    synchronized (C53245gt.class) {
                        ebVar = f139566p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139564n);
                            f139566p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
