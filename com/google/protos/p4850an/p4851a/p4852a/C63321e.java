package com.google.protos.p4850an.p4851a.p4852a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.e */
/* compiled from: PG */
public final class C63321e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63321e f171136a;

    /* renamed from: g */
    private static volatile C63010eb f171137g;

    /* renamed from: b */
    private int f171138b;

    /* renamed from: c */
    private C51379fn f171139c;

    /* renamed from: d */
    private C51715bm f171140d;

    /* renamed from: e */
    private C51261bd f171141e;

    /* renamed from: f */
    private byte f171142f = 2;

    static {
        C63321e eVar = new C63321e();
        f171136a = eVar;
        C62942bv.registerDefaultInstance(C63321e.class, eVar);
    }

    private C63321e() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171142f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171142f = b;
                return null;
            case 2:
                return newMessageInfo(f171136a, "\u0001\u0003\u0000\u0001\r\u0012\u0003\u0000\u0000\u0002\rᐉ\u0003\u000eᐉ\u0004\u0012ဉ\b", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63321e();
            case 4:
                return new C63320d();
            case 5:
                return f171136a;
            case 6:
                C63010eb ebVar = f171137g;
                if (ebVar == null) {
                    synchronized (C63321e.class) {
                        ebVar = f171137g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171136a);
                            f171137g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
