package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.q */
/* compiled from: PG */
public final class C54547q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54547q f143205d;

    /* renamed from: e */
    private static volatile C63010eb f143206e;

    /* renamed from: a */
    public C62971cq f143207a = emptyProtobufList();

    /* renamed from: b */
    public boolean f143208b;

    /* renamed from: c */
    public String f143209c = BuildConfig.FLAVOR;

    static {
        C54547q qVar = new C54547q();
        f143205d = qVar;
        C62942bv.registerDefaultInstance(C54547q.class, qVar);
    }

    private C54547q() {
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
                return newMessageInfo(f143205d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003Ȉ", new Object[]{"a", C54543m.class, "b", C45240c.f118157a});
            case 3:
                return new C54547q();
            case 4:
                return new C54546p();
            case 5:
                return f143205d;
            case 6:
                C63010eb ebVar = f143206e;
                if (ebVar == null) {
                    synchronized (C54547q.class) {
                        ebVar = f143206e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143205d);
                            f143206e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
