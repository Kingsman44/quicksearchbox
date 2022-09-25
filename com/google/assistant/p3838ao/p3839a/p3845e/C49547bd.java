package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bd */
/* compiled from: PG */
public final class C49547bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49547bd f127848b;

    /* renamed from: c */
    public static final C62940bt f127849c;

    /* renamed from: f */
    private static volatile C63010eb f127850f;

    /* renamed from: a */
    public int f127851a;

    /* renamed from: d */
    private int f127852d;

    /* renamed from: e */
    private byte f127853e = 2;

    static {
        C49547bd bdVar = new C49547bd();
        f127848b = bdVar;
        C62942bv.registerDefaultInstance(C49547bd.class, bdVar);
        f127849c = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, bdVar, bdVar, (C62958ce) null, 301800269, C63066gd.MESSAGE, C49547bd.class);
    }

    private C49547bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127853e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127853e = b;
                return null;
            case 2:
                return newMessageInfo(f127848b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"d", "a", C49543b.m85579b()});
            case 3:
                return new C49547bd();
            case 4:
                return new C49546bc();
            case 5:
                return f127848b;
            case 6:
                C63010eb ebVar = f127850f;
                if (ebVar == null) {
                    synchronized (C49547bd.class) {
                        ebVar = f127850f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127848b);
                            f127850f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
