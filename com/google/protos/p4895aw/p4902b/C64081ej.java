package com.google.protos.p4895aw.p4902b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.protos.aw.b.ej */
/* compiled from: PG */
public final class C64081ej extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64081ej f173236h;

    /* renamed from: i */
    private static volatile C63010eb f173237i;

    /* renamed from: a */
    public int f173238a;

    /* renamed from: b */
    public C64098p f173239b;

    /* renamed from: c */
    public C62971cq f173240c = emptyProtobufList();

    /* renamed from: d */
    public C64057dm f173241d;

    /* renamed from: e */
    public C62971cq f173242e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C64078eg f173243f;

    /* renamed from: g */
    public C64080ei f173244g;

    static {
        C64081ej ejVar = new C64081ej();
        f173236h = ejVar;
        C62942bv.registerDefaultInstance(C64081ej.class, ejVar);
    }

    private C64081ej() {
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
                return newMessageInfo(f173236h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001a\u0005ဉ\u0002\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C64089g.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C64081ej();
            case 4:
                return new C64076ee();
            case 5:
                return f173236h;
            case 6:
                C63010eb ebVar = f173237i;
                if (ebVar == null) {
                    synchronized (C64081ej.class) {
                        ebVar = f173237i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173236h);
                            f173237i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
