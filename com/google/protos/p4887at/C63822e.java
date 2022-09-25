package com.google.protos.p4887at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.e */
/* compiled from: PG */
public final class C63822e extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63822e f172603a;

    /* renamed from: h */
    private static volatile C63010eb f172604h;

    /* renamed from: b */
    private int f172605b;

    /* renamed from: c */
    private C63822e f172606c;

    /* renamed from: d */
    private C63822e f172607d;

    /* renamed from: e */
    private C62995dn f172608e = C62995dn.f170057a;

    /* renamed from: f */
    private C63822e f172609f;

    /* renamed from: g */
    private byte f172610g = 2;

    static {
        C63822e eVar = new C63822e();
        f172603a = eVar;
        C62942bv.registerDefaultInstance(C63822e.class, eVar);
    }

    private C63822e() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172610g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172610g = b;
                return null;
            case 2:
                return newMessageInfo(f172603a, "\u0001\u0004\u0000\u0001\u0001\u0018\u0004\u0001\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\r\u0016ᐉ\u0001\u00182", new Object[]{"b", C45240c.f118157a, C10662f.f35572a, "d", "e", C63821d.f172602a});
            case 3:
                return new C63822e();
            case 4:
                return new C63818c();
            case 5:
                return f172603a;
            case 6:
                C63010eb ebVar = f172604h;
                if (ebVar == null) {
                    synchronized (C63822e.class) {
                        ebVar = f172604h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172603a);
                            f172604h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
