package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.b.a.a.a.r */
/* compiled from: PG */
public final class C50655r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50655r f131760f;

    /* renamed from: g */
    private static volatile C63010eb f131761g;

    /* renamed from: a */
    public int f131762a;

    /* renamed from: b */
    public int f131763b;

    /* renamed from: c */
    public C50651n f131764c;

    /* renamed from: d */
    public C50638an f131765d;

    /* renamed from: e */
    public int f131766e;

    static {
        C50655r rVar = new C50655r();
        f131760f = rVar;
        C62942bv.registerDefaultInstance(C50655r.class, rVar);
    }

    private C50655r() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f131760f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ဌ\u0002\u0006ဉ\u0004\bဉ\u0005\tဌ\u0006", new Object[]{"a", "b", C52431rm.m86629c(), C45240c.f118157a, "d", "e", C50653p.f131759a});
            case 3:
                return new C50655r();
            case 4:
                return new C50652o();
            case 5:
                return f131760f;
            case 6:
                C63010eb ebVar = f131761g;
                if (ebVar == null) {
                    synchronized (C50655r.class) {
                        ebVar = f131761g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131760f);
                            f131761g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
