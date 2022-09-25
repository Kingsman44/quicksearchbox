package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.dd */
/* compiled from: PG */
public final class C55027dd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55027dd f144767b;

    /* renamed from: c */
    public static final C62940bt f144768c;

    /* renamed from: d */
    private static volatile C63010eb f144769d;

    /* renamed from: a */
    public C62971cq f144770a = C62942bv.emptyProtobufList();

    static {
        C55027dd ddVar = new C55027dd();
        f144767b = ddVar;
        C62942bv.registerDefaultInstance(C55027dd.class, ddVar);
        f144768c = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, ddVar, ddVar, (C62958ce) null, 74908916, C63066gd.MESSAGE, C55027dd.class);
    }

    private C55027dd() {
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
                return newMessageInfo(f144767b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C55027dd();
            case 4:
                return new C55026dc();
            case 5:
                return f144767b;
            case 6:
                C63010eb ebVar = f144769d;
                if (ebVar == null) {
                    synchronized (C55027dd.class) {
                        ebVar = f144769d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144767b);
                            f144769d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
