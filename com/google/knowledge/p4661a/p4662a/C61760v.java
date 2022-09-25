package com.google.knowledge.p4661a.p4662a;

import com.google.knowledge.p4661a.p4662a.p4663a.C61737b;
import com.google.p4444cb.p4445a.C57930b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.knowledge.a.a.v */
/* compiled from: PG */
public final class C61760v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61760v f166828b;

    /* renamed from: c */
    public static final C62940bt f166829c;

    /* renamed from: g */
    private static volatile C63010eb f166830g;

    /* renamed from: a */
    public C62971cq f166831a = emptyProtobufList();

    /* renamed from: d */
    private int f166832d;

    /* renamed from: e */
    private C57930b f166833e;

    /* renamed from: f */
    private byte f166834f = 2;

    static {
        C61760v vVar = new C61760v();
        f166828b = vVar;
        C62942bv.registerDefaultInstance(C61760v.class, vVar);
        f166829c = C62942bv.newSingularGeneratedExtension(C61752n.f166808f, vVar, vVar, (C62958ce) null, 14, C63066gd.MESSAGE, C61760v.class);
    }

    private C61760v() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166834f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166834f = b;
                return null;
            case 2:
                return newMessageInfo(f166828b, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0002\u0001Л\u0005ᐉ\u0001", new Object[]{"d", "a", C61737b.class, "e"});
            case 3:
                return new C61760v();
            case 4:
                return new C61759u();
            case 5:
                return f166828b;
            case 6:
                C63010eb ebVar = f166830g;
                if (ebVar == null) {
                    synchronized (C61760v.class) {
                        ebVar = f166830g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166828b);
                            f166830g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
