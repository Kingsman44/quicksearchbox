package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5132q.C65876s;

/* renamed from: com.google.protos.bf.a.a.g */
/* compiled from: PG */
public final class C64602g extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C64602g f175147c;

    /* renamed from: d */
    public static final C62940bt f175148d;

    /* renamed from: g */
    private static volatile C63010eb f175149g;

    /* renamed from: a */
    public int f175150a = 0;

    /* renamed from: b */
    public Object f175151b;

    /* renamed from: e */
    private C62995dn f175152e = C62995dn.f170057a;

    /* renamed from: f */
    private byte f175153f = 2;

    static {
        C64602g gVar = new C64602g();
        f175147c = gVar;
        C62942bv.registerDefaultInstance(C64602g.class, gVar);
        f175148d = C62942bv.newSingularGeneratedExtension(C65876s.f179093b, gVar, gVar, (C62958ce) null, 130469150, C63066gd.MESSAGE, C64602g.class);
    }

    private C64602g() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175153f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175153f = b;
                return null;
            case 2:
                return newMessageInfo(f175147c, "\u0001\u0003\u0001\u0000\u0005\n\u0003\u0001\u0000\u0000\u0005ျ\u0000\b2\nွ\u0000", new Object[]{"b", "a", "e", C64599d.f175140a});
            case 3:
                return new C64602g();
            case 4:
                return new C64598c();
            case 5:
                return f175147c;
            case 6:
                C63010eb ebVar = f175149g;
                if (ebVar == null) {
                    synchronized (C64602g.class) {
                        ebVar = f175149g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175147c);
                            f175149g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
