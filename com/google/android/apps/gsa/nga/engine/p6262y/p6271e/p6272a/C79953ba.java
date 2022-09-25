package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ba */
/* compiled from: PG */
public final class C79953ba extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79953ba f219269f;

    /* renamed from: g */
    private static volatile C63010eb f219270g;

    /* renamed from: a */
    public int f219271a;

    /* renamed from: b */
    public C79950ay f219272b;

    /* renamed from: c */
    public C79950ay f219273c;

    /* renamed from: d */
    public C79950ay f219274d;

    /* renamed from: e */
    public C79950ay f219275e;

    static {
        C79953ba baVar = new C79953ba();
        f219269f = baVar;
        C62942bv.registerDefaultInstance(C79953ba.class, baVar);
    }

    private C79953ba() {
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
                return newMessageInfo(f219269f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C79953ba();
            case 4:
                return new C79951az();
            case 5:
                return f219269f;
            case 6:
                C63010eb ebVar = f219270g;
                if (ebVar == null) {
                    synchronized (C79953ba.class) {
                        ebVar = f219270g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219269f);
                            f219270g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
