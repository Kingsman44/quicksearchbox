package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

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

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ca */
/* compiled from: PG */
public final class C34065ca extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C34065ca f90770i;

    /* renamed from: k */
    private static volatile C63010eb f90771k;

    /* renamed from: a */
    public int f90772a;

    /* renamed from: b */
    public C34100i f90773b;

    /* renamed from: c */
    public C34069ce f90774c;

    /* renamed from: d */
    public C34104m f90775d;

    /* renamed from: e */
    public C34018ah f90776e;

    /* renamed from: f */
    public C34108q f90777f;

    /* renamed from: g */
    public C34110s f90778g;

    /* renamed from: h */
    public C62971cq f90779h = emptyProtobufList();

    /* renamed from: j */
    private byte f90780j = 2;

    static {
        C34065ca caVar = new C34065ca();
        f90770i = caVar;
        C62942bv.registerDefaultInstance(C34065ca.class, caVar);
    }

    private C34065ca() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90780j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90780j = b;
                return null;
            case 2:
                return newMessageInfo(f90770i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C34023am.class});
            case 3:
                return new C34065ca();
            case 4:
                return new C34063bz();
            case 5:
                return f90770i;
            case 6:
                C63010eb ebVar = f90771k;
                if (ebVar == null) {
                    synchronized (C34065ca.class) {
                        ebVar = f90771k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90770i);
                            f90771k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
