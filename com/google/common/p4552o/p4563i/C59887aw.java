package com.google.common.p4552o.p4563i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;

/* renamed from: com.google.common.o.i.aw */
/* compiled from: PG */
public final class C59887aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59887aw f161829g;

    /* renamed from: h */
    private static volatile C63010eb f161830h;

    /* renamed from: a */
    public int f161831a;

    /* renamed from: b */
    public int f161832b;

    /* renamed from: c */
    public int f161833c;

    /* renamed from: d */
    public long f161834d;

    /* renamed from: e */
    public long f161835e;

    /* renamed from: f */
    public C63240m f161836f;

    static {
        C59887aw awVar = new C59887aw();
        f161829g = awVar;
        C62942bv.registerDefaultInstance(C59887aw.class, awVar);
    }

    private C59887aw() {
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
                return newMessageInfo(f161829g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဌ\u0002\u0006ဉ\u0005", new Object[]{"a", "b", C62331d.m94768b(), "d", "e", C45240c.f118157a, C62250a.f168059a, C10662f.f35572a});
            case 3:
                return new C59887aw();
            case 4:
                return new C59886av();
            case 5:
                return f161829g;
            case 6:
                C63010eb ebVar = f161830h;
                if (ebVar == null) {
                    synchronized (C59887aw.class) {
                        ebVar = f161830h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161829g);
                            f161830h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
