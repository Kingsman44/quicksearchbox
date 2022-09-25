package com.google.p4152bb.p4153a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.be */
/* compiled from: PG */
public final class C54974be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54974be f144632f;

    /* renamed from: g */
    public static final C62940bt f144633g;

    /* renamed from: i */
    private static volatile C63010eb f144634i;

    /* renamed from: a */
    public C54997ca f144635a;

    /* renamed from: b */
    public C54997ca f144636b;

    /* renamed from: c */
    public C62971cq f144637c = emptyProtobufList();

    /* renamed from: d */
    public boolean f144638d;

    /* renamed from: e */
    public boolean f144639e;

    /* renamed from: h */
    private int f144640h;

    static {
        C54974be beVar = new C54974be();
        f144632f = beVar;
        C62942bv.registerDefaultInstance(C54974be.class, beVar);
        f144633g = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, beVar, beVar, (C62958ce) null, 28333047, C63066gd.MESSAGE, C54974be.class);
    }

    private C54974be() {
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
                return newMessageInfo(f144632f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, C54973bd.class, "d", "e"});
            case 3:
                return new C54974be();
            case 4:
                return new C54961as();
            case 5:
                return f144632f;
            case 6:
                C63010eb ebVar = f144634i;
                if (ebVar == null) {
                    synchronized (C54974be.class) {
                        ebVar = f144634i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144632f);
                            f144634i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
