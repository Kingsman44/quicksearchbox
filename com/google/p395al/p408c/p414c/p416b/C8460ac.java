package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ac */
/* compiled from: PG */
public final class C8460ac extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8460ac f29379f;

    /* renamed from: g */
    private static volatile C63010eb f29380g;

    /* renamed from: a */
    public int f29381a;

    /* renamed from: b */
    public String f29382b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29383c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f29384d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f29385e;

    static {
        C8460ac acVar = new C8460ac();
        f29379f = acVar;
        C62942bv.registerDefaultInstance(C8460ac.class, acVar);
    }

    private C8460ac() {
        emptyIntList();
        this.f29385e = BuildConfig.FLAVOR;
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
                return newMessageInfo(f29379f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001a\u0006ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8460ac();
            case 4:
                return new C8459ab();
            case 5:
                return f29379f;
            case 6:
                C63010eb ebVar = f29380g;
                if (ebVar == null) {
                    synchronized (C8460ac.class) {
                        ebVar = f29380g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29379f);
                            f29380g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
