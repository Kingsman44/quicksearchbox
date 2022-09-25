package com.google.p4500cm.p4501a.p4506b.p4507a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.b.a.b */
/* compiled from: PG */
public final class C58144b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58144b f155438c;

    /* renamed from: e */
    private static volatile C63010eb f155439e;

    /* renamed from: a */
    public String f155440a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f155441b = emptyProtobufList();

    /* renamed from: d */
    private int f155442d;

    static {
        C58144b bVar = new C58144b();
        f155438c = bVar;
        C62942bv.registerDefaultInstance(C58144b.class, bVar);
    }

    private C58144b() {
        emptyProtobufList();
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
                return newMessageInfo(f155438c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003ဈ\u0002\u0004\u001b", new Object[]{"d", "a", "b", C58146d.class});
            case 3:
                return new C58144b();
            case 4:
                return new C58143a();
            case 5:
                return f155438c;
            case 6:
                C63010eb ebVar = f155439e;
                if (ebVar == null) {
                    synchronized (C58144b.class) {
                        ebVar = f155439e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155438c);
                            f155439e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
