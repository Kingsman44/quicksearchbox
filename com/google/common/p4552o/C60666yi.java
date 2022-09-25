package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yi */
/* compiled from: PG */
public final class C60666yi extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60666yi f164570j;

    /* renamed from: l */
    private static volatile C63010eb f164571l;

    /* renamed from: a */
    public int f164572a;

    /* renamed from: b */
    public long f164573b;

    /* renamed from: c */
    public long f164574c;

    /* renamed from: d */
    public long f164575d;

    /* renamed from: e */
    public long f164576e;

    /* renamed from: f */
    public int f164577f;

    /* renamed from: g */
    public int f164578g;

    /* renamed from: h */
    public C60220t f164579h;

    /* renamed from: i */
    public long f164580i;

    /* renamed from: k */
    private byte f164581k = 2;

    static {
        C60666yi yiVar = new C60666yi();
        f164570j = yiVar;
        C62942bv.registerDefaultInstance(C60666yi.class, yiVar);
    }

    private C60666yi() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f164581k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f164581k = b;
                return null;
            case 2:
                return newMessageInfo(f164570j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ᐉ\u0006\bဃ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C60664yg.f164568a, C30325g.f82003a, C60665yh.f164569a, C19618h.f54585a, "i"});
            case 3:
                return new C60666yi();
            case 4:
                return new C60663yf();
            case 5:
                return f164570j;
            case 6:
                C63010eb ebVar = f164571l;
                if (ebVar == null) {
                    synchronized (C60666yi.class) {
                        ebVar = f164571l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164570j);
                            f164571l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
