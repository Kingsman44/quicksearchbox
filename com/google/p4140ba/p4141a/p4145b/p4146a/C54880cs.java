package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cs */
/* compiled from: PG */
public final class C54880cs extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54880cs f144173f;

    /* renamed from: g */
    private static volatile C63010eb f144174g;

    /* renamed from: a */
    public int f144175a;

    /* renamed from: b */
    public C54870ci f144176b;

    /* renamed from: c */
    public C54870ci f144177c;

    /* renamed from: d */
    public C54870ci f144178d;

    /* renamed from: e */
    public C54870ci f144179e;

    static {
        C54880cs csVar = new C54880cs();
        f144173f = csVar;
        C62942bv.registerDefaultInstance(C54880cs.class, csVar);
    }

    private C54880cs() {
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
                return newMessageInfo(f144173f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54880cs();
            case 4:
                return new C54879cr();
            case 5:
                return f144173f;
            case 6:
                C63010eb ebVar = f144174g;
                if (ebVar == null) {
                    synchronized (C54880cs.class) {
                        ebVar = f144174g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144173f);
                            f144174g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
