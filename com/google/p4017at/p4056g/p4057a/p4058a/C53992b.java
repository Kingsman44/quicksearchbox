package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4799ag.p4800a.p4801a.C63160b;

/* renamed from: com.google.at.g.a.a.b */
/* compiled from: PG */
public final class C53992b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53992b f141653e;

    /* renamed from: g */
    private static volatile C63010eb f141654g;

    /* renamed from: a */
    public int f141655a = 0;

    /* renamed from: b */
    public Object f141656b;

    /* renamed from: c */
    public int f141657c;

    /* renamed from: d */
    public String f141658d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f141659f = 2;

    static {
        C53992b bVar = new C53992b();
        f141653e = bVar;
        C62942bv.registerDefaultInstance(C53992b.class, bVar);
    }

    private C53992b() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141659f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141659f = b;
                return null;
            case 2:
                return newMessageInfo(f141653e, "\u0000\u0004\u0001\u0000\u0001\b\u0004\u0000\u0000\u0001\u0001\f\u0002Ȉ\u0003Ȼ\u0000\bм\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C63160b.class});
            case 3:
                return new C53992b();
            case 4:
                return new C53951a();
            case 5:
                return f141653e;
            case 6:
                C63010eb ebVar = f141654g;
                if (ebVar == null) {
                    synchronized (C53992b.class) {
                        ebVar = f141654g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141653e);
                            f141654g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
