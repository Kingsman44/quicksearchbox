package com.google.protos.p4950bb.p4952b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8217af;
import com.google.p381aj.p382a.p383a.p384a.C8219ah;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bb.b.b */
/* compiled from: PG */
public final class C64392b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64392b f174640a;

    /* renamed from: g */
    private static volatile C63010eb f174641g;

    /* renamed from: b */
    private int f174642b;

    /* renamed from: c */
    private C8242v f174643c;

    /* renamed from: d */
    private C8219ah f174644d;

    /* renamed from: e */
    private C8217af f174645e;

    /* renamed from: f */
    private byte f174646f = 2;

    static {
        C64392b bVar = new C64392b();
        f174640a = bVar;
        C62942bv.registerDefaultInstance(C64392b.class, bVar);
    }

    private C64392b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174646f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174646f = b;
                return null;
            case 2:
                return newMessageInfo(f174640a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64392b();
            case 4:
                return new C64391a();
            case 5:
                return f174640a;
            case 6:
                C63010eb ebVar = f174641g;
                if (ebVar == null) {
                    synchronized (C64392b.class) {
                        ebVar = f174641g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174640a);
                            f174641g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
