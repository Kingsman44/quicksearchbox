package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.jc */
/* compiled from: PG */
public final class C7765jc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7765jc f27196e;

    /* renamed from: g */
    private static volatile C63010eb f27197g;

    /* renamed from: a */
    public int f27198a;

    /* renamed from: b */
    public int f27199b;

    /* renamed from: c */
    public String f27200c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f27201d = emptyProtobufList();

    /* renamed from: f */
    private byte f27202f = 2;

    static {
        C7765jc jcVar = new C7765jc();
        f27196e = jcVar;
        C62942bv.registerDefaultInstance(C7765jc.class, jcVar);
    }

    private C7765jc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27202f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27202f = b;
                return null;
            case 2:
                return newMessageInfo(f27196e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"a", "b", C7681g.m22803b(), C45240c.f118157a, "d", C8178yk.class});
            case 3:
                return new C7765jc();
            case 4:
                return new C7764jb();
            case 5:
                return f27196e;
            case 6:
                C63010eb ebVar = f27197g;
                if (ebVar == null) {
                    synchronized (C7765jc.class) {
                        ebVar = f27197g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27196e);
                            f27197g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
