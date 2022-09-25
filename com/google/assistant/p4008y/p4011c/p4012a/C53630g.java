package com.google.assistant.p4008y.p4011c.p4012a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4008y.p4013d.p4014a.C53635d;
import com.google.assistant.p4008y.p4013d.p4014a.C53641j;
import com.google.assistant.p4008y.p4013d.p4014a.C53647p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.c.a.g */
/* compiled from: PG */
public final class C53630g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53630g f140758f;

    /* renamed from: g */
    private static volatile C63010eb f140759g;

    /* renamed from: a */
    public int f140760a;

    /* renamed from: b */
    public C53641j f140761b;

    /* renamed from: c */
    public C53647p f140762c;

    /* renamed from: d */
    public long f140763d;

    /* renamed from: e */
    public C53635d f140764e;

    static {
        C53630g gVar = new C53630g();
        f140758f = gVar;
        C62942bv.registerDefaultInstance(C53630g.class, gVar);
    }

    private C53630g() {
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
                return newMessageInfo(f140758f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53630g();
            case 4:
                return new C53629f();
            case 5:
                return f140758f;
            case 6:
                C63010eb ebVar = f140759g;
                if (ebVar == null) {
                    synchronized (C53630g.class) {
                        ebVar = f140759g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140758f);
                            f140759g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
