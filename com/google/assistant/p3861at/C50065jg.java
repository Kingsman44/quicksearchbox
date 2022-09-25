package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jg */
/* compiled from: PG */
public final class C50065jg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50065jg f130162f;

    /* renamed from: g */
    private static volatile C63010eb f130163g;

    /* renamed from: a */
    public int f130164a;

    /* renamed from: b */
    public C50056iy f130165b;

    /* renamed from: c */
    public C50059ja f130166c;

    /* renamed from: d */
    public C50062jd f130167d;

    /* renamed from: e */
    public C50064jf f130168e;

    static {
        C50065jg jgVar = new C50065jg();
        f130162f = jgVar;
        C62942bv.registerDefaultInstance(C50065jg.class, jgVar);
    }

    private C50065jg() {
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
                return newMessageInfo(f130162f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50065jg();
            case 4:
                return new C50060jb();
            case 5:
                return f130162f;
            case 6:
                C63010eb ebVar = f130163g;
                if (ebVar == null) {
                    synchronized (C50065jg.class) {
                        ebVar = f130163g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130162f);
                            f130163g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
