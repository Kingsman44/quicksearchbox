package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3897e.p3921j.acy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.rw */
/* compiled from: PG */
public final class C88173rw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88173rw f238356b;

    /* renamed from: c */
    public static final C62940bt f238357c;

    /* renamed from: d */
    private static volatile C63010eb f238358d;

    /* renamed from: a */
    public C62971cq f238359a = emptyProtobufList();

    static {
        C88173rw rwVar = new C88173rw();
        f238356b = rwVar;
        C62942bv.registerDefaultInstance(C88173rw.class, rwVar);
        f238357c = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, rwVar, rwVar, (C62958ce) null, 192471665, C63066gd.MESSAGE, C88173rw.class);
    }

    private C88173rw() {
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
                return newMessageInfo(f238356b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", acy.class});
            case 3:
                return new C88173rw();
            case 4:
                return new C88172rv();
            case 5:
                return f238356b;
            case 6:
                C63010eb ebVar = f238358d;
                if (ebVar == null) {
                    synchronized (C88173rw.class) {
                        ebVar = f238358d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238356b);
                            f238358d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
