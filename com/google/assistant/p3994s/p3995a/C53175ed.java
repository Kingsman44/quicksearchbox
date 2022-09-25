package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ed */
/* compiled from: PG */
public final class C53175ed extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53175ed f139357f;

    /* renamed from: g */
    private static volatile C63010eb f139358g;

    /* renamed from: a */
    public int f139359a;

    /* renamed from: b */
    public String f139360b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139361c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139362d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f139363e;

    static {
        C53175ed edVar = new C53175ed();
        f139357f = edVar;
        C62942bv.registerDefaultInstance(C53175ed.class, edVar);
    }

    private C53175ed() {
        C62942bv.emptyProtobufList();
        emptyIntList();
        this.f139363e = emptyProtobufList();
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
                return newMessageInfo(f139357f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C53194ew.class});
            case 3:
                return new C53175ed();
            case 4:
                return new C53174ec();
            case 5:
                return f139357f;
            case 6:
                C63010eb ebVar = f139358g;
                if (ebVar == null) {
                    synchronized (C53175ed.class) {
                        ebVar = f139358g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139357f);
                            f139358g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
