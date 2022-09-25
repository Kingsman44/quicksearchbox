package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.b.b.j */
/* compiled from: PG */
public final class C57711j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57711j f154180c;

    /* renamed from: e */
    private static volatile C63010eb f154181e;

    /* renamed from: a */
    public int f154182a;

    /* renamed from: b */
    public String f154183b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f154184d;

    static {
        C57711j jVar = new C57711j();
        f154180c = jVar;
        C62942bv.registerDefaultInstance(C57711j.class, jVar);
    }

    private C57711j() {
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
                return newMessageInfo(f154180c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C57716o.m88525b(), "b"});
            case 3:
                return new C57711j();
            case 4:
                return new C57710i();
            case 5:
                return f154180c;
            case 6:
                C63010eb ebVar = f154181e;
                if (ebVar == null) {
                    synchronized (C57711j.class) {
                        ebVar = f154181e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154180c);
                            f154181e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
