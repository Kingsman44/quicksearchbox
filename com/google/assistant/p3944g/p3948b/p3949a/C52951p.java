package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.p */
/* compiled from: PG */
public final class C52951p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f138833e = new C52947l();

    /* renamed from: f */
    public static final C52951p f138834f;

    /* renamed from: g */
    private static volatile C63010eb f138835g;

    /* renamed from: a */
    public int f138836a;

    /* renamed from: b */
    public C52949n f138837b;

    /* renamed from: c */
    public C52941f f138838c;

    /* renamed from: d */
    public C62961ch f138839d = emptyIntList();

    static {
        C52951p pVar = new C52951p();
        f138834f = pVar;
        C62942bv.registerDefaultInstance(C52951p.class, pVar);
    }

    private C52951p() {
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
                return newMessageInfo(f138834f, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C52943h.m86757b()});
            case 3:
                return new C52951p();
            case 4:
                return new C52950o();
            case 5:
                return f138834f;
            case 6:
                C63010eb ebVar = f138835g;
                if (ebVar == null) {
                    synchronized (C52951p.class) {
                        ebVar = f138835g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138834f);
                            f138835g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
