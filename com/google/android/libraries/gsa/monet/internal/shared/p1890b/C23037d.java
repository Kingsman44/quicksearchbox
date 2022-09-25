package com.google.android.libraries.gsa.monet.internal.shared.p1890b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.b.d */
/* compiled from: PG */
public final class C23037d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C23037d f63373e;

    /* renamed from: f */
    private static volatile C63010eb f63374f;

    /* renamed from: a */
    public int f63375a;

    /* renamed from: b */
    public String f63376b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f63377c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f63378d = emptyProtobufList();

    static {
        C23037d dVar = new C23037d();
        f63373e = dVar;
        C62942bv.registerDefaultInstance(C23037d.class, dVar);
    }

    private C23037d() {
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
                return newMessageInfo(f63373e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C23035b.class});
            case 3:
                return new C23037d();
            case 4:
                return new C23036c();
            case 5:
                return f63373e;
            case 6:
                C63010eb ebVar = f63374f;
                if (ebVar == null) {
                    synchronized (C23037d.class) {
                        ebVar = f63374f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63373e);
                            f63374f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
