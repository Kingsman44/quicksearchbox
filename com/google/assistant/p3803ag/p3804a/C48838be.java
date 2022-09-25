package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.be */
/* compiled from: PG */
public final class C48838be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48838be f126379c;

    /* renamed from: d */
    public static final C62940bt f126380d;

    /* renamed from: g */
    private static volatile C63010eb f126381g;

    /* renamed from: a */
    public C48855bv f126382a;

    /* renamed from: b */
    public C62971cq f126383b = emptyProtobufList();

    /* renamed from: e */
    private int f126384e;

    /* renamed from: f */
    private byte f126385f = 2;

    static {
        C48838be beVar = new C48838be();
        f126379c = beVar;
        C62942bv.registerDefaultInstance(C48838be.class, beVar);
        f126380d = C62942bv.newSingularGeneratedExtension(C48862e.f126439a, beVar, beVar, (C62958ce) null, 100, C63066gd.MESSAGE, C48838be.class);
    }

    private C48838be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126385f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126385f = b;
                return null;
            case 2:
                return newMessageInfo(f126379c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"e", "a", "b", C48865h.class});
            case 3:
                return new C48838be();
            case 4:
                return new C48837bd();
            case 5:
                return f126379c;
            case 6:
                C63010eb ebVar = f126381g;
                if (ebVar == null) {
                    synchronized (C48838be.class) {
                        ebVar = f126381g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126379c);
                            f126381g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
