package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bg */
/* compiled from: PG */
public final class C57590bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57590bg f153857c;

    /* renamed from: e */
    private static volatile C63010eb f153858e;

    /* renamed from: a */
    public C8242v f153859a;

    /* renamed from: b */
    public C8213ab f153860b;

    /* renamed from: d */
    private byte f153861d = 2;

    static {
        C57590bg bgVar = new C57590bg();
        f153857c = bgVar;
        C62942bv.registerDefaultInstance(C57590bg.class, bgVar);
    }

    private C57590bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153861d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153861d = b;
                return null;
            case 2:
                return newMessageInfo(f153857c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C57590bg();
            case 4:
                return new C57589bf();
            case 5:
                return f153857c;
            case 6:
                C63010eb ebVar = f153858e;
                if (ebVar == null) {
                    synchronized (C57590bg.class) {
                        ebVar = f153858e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153857c);
                            f153858e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
