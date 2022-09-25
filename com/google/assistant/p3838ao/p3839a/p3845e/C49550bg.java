package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bg */
/* compiled from: PG */
public final class C49550bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f127854b = new C49548be();

    /* renamed from: c */
    public static final C49550bg f127855c;

    /* renamed from: d */
    public static final C62940bt f127856d;

    /* renamed from: e */
    private static volatile C63010eb f127857e;

    /* renamed from: a */
    public C62961ch f127858a = emptyIntList();

    static {
        C49550bg bgVar = new C49550bg();
        f127855c = bgVar;
        C62942bv.registerDefaultInstance(C49550bg.class, bgVar);
        f127856d = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, bgVar, bgVar, (C62958ce) null, 288265233, C63066gd.MESSAGE, C49550bg.class);
    }

    private C49550bg() {
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
                return newMessageInfo(f127855c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C49597d.m85583b()});
            case 3:
                return new C49550bg();
            case 4:
                return new C49549bf();
            case 5:
                return f127855c;
            case 6:
                C63010eb ebVar = f127857e;
                if (ebVar == null) {
                    synchronized (C49550bg.class) {
                        ebVar = f127857e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127855c);
                            f127857e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
