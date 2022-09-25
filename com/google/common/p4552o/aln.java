package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.common.o.aln */
/* compiled from: PG */
public final class aln extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aln f159082f;

    /* renamed from: g */
    public static final C62940bt f159083g;

    /* renamed from: h */
    private static volatile C63010eb f159084h;

    /* renamed from: a */
    public int f159085a;

    /* renamed from: b */
    public int f159086b;

    /* renamed from: c */
    public int f159087c;

    /* renamed from: d */
    public String f159088d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f159089e = C62942bv.emptyProtobufList();

    static {
        aln aln = new aln();
        f159082f = aln;
        C62942bv.registerDefaultInstance(aln.class, aln);
        f159083g = C62942bv.newSingularGeneratedExtension(aqs.f159780k, aln, aln, (C62958ce) null, 516, C63066gd.MESSAGE, aln.class);
    }

    private aln() {
    }

    /* renamed from: a */
    public final void mo57022a() {
        C62971cq cqVar = this.f159089e;
        if (!cqVar.mo58948c()) {
            this.f159089e = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f159082f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0005\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aln();
            case 4:
                return new alm();
            case 5:
                return f159082f;
            case 6:
                C63010eb ebVar = f159084h;
                if (ebVar == null) {
                    synchronized (aln.class) {
                        ebVar = f159084h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159082f);
                            f159084h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
