package com.google.protos.p4985f.p4988b.p4990b;

import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.i */
/* compiled from: PG */
public final class C64743i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64743i f175499e;

    /* renamed from: g */
    private static volatile C63010eb f175500g;

    /* renamed from: a */
    public int f175501a;

    /* renamed from: b */
    public C9418h f175502b;

    /* renamed from: c */
    public C52236kg f175503c;

    /* renamed from: d */
    public C64738d f175504d;

    /* renamed from: f */
    private byte f175505f = 2;

    static {
        C64743i iVar = new C64743i();
        f175499e = iVar;
        C62942bv.registerDefaultInstance(C64743i.class, iVar);
    }

    private C64743i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175505f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175505f = b;
                return null;
            case 2:
                return newMessageInfo(f175499e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64743i();
            case 4:
                return new C64742h();
            case 5:
                return f175499e;
            case 6:
                C63010eb ebVar = f175500g;
                if (ebVar == null) {
                    synchronized (C64743i.class) {
                        ebVar = f175500g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175499e);
                            f175500g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
