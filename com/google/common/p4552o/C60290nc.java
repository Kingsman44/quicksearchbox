package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.nc */
/* compiled from: PG */
public final class C60290nc extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60290nc f163102j;

    /* renamed from: k */
    private static volatile C63010eb f163103k;

    /* renamed from: a */
    public int f163104a;

    /* renamed from: b */
    public int f163105b;

    /* renamed from: c */
    public int f163106c;

    /* renamed from: d */
    public boolean f163107d;

    /* renamed from: e */
    public int f163108e;

    /* renamed from: f */
    public boolean f163109f;

    /* renamed from: g */
    public int f163110g;

    /* renamed from: h */
    public C62971cq f163111h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public int f163112i;

    static {
        C60290nc ncVar = new C60290nc();
        f163102j = ncVar;
        C62942bv.registerDefaultInstance(C60290nc.class, ncVar);
    }

    private C60290nc() {
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
                return newMessageInfo(f163102j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007\u001a\bဌ\u0006", new Object[]{"a", "b", C60289nb.f163101a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C60288na.f163100a});
            case 3:
                return new C60290nc();
            case 4:
                return new C60285mz();
            case 5:
                return f163102j;
            case 6:
                C63010eb ebVar = f163103k;
                if (ebVar == null) {
                    synchronized (C60290nc.class) {
                        ebVar = f163103k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163102j);
                            f163103k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
