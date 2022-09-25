package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.o */
/* compiled from: PG */
public final class C62687o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62687o f169244f;

    /* renamed from: g */
    private static volatile C63010eb f169245g;

    /* renamed from: a */
    public int f169246a;

    /* renamed from: b */
    public int f169247b = 1;

    /* renamed from: c */
    public String f169248c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169249d;

    /* renamed from: e */
    public C62687o f169250e;

    static {
        C62687o oVar = new C62687o();
        f169244f = oVar;
        C62942bv.registerDefaultInstance(C62687o.class, oVar);
    }

    private C62687o() {
        emptyProtobufList();
        this.f169249d = BuildConfig.FLAVOR;
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f169244f, "\u0001\u0004\u0000\u0001\u0001#\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0006ဌ\u0000\u0010ဈ\u0012#ဉ\u001e", new Object[]{"a", C45240c.f118157a, "b", C62689q.f169254a, "d", "e"});
            case 3:
                return new C62687o();
            case 4:
                return new C62686n();
            case 5:
                return f169244f;
            case 6:
                C63010eb ebVar = f169245g;
                if (ebVar == null) {
                    synchronized (C62687o.class) {
                        ebVar = f169245g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169244f);
                            f169245g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
