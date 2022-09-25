package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.b.c.a.a.g */
/* compiled from: PG */
public final class C57743g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57743g f154269b;

    /* renamed from: c */
    public static final C62940bt f154270c;

    /* renamed from: e */
    private static volatile C63010eb f154271e;

    /* renamed from: a */
    public String f154272a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f154273d;

    static {
        C57743g gVar = new C57743g();
        f154269b = gVar;
        C62942bv.registerDefaultInstance(C57743g.class, gVar);
        f154270c = C62942bv.newSingularGeneratedExtension(C57780l.f154376c, gVar, gVar, (C62958ce) null, 5, C63066gd.MESSAGE, C57743g.class);
    }

    private C57743g() {
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
                return newMessageInfo(f154269b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "a"});
            case 3:
                return new C57743g();
            case 4:
                return new C57742f();
            case 5:
                return f154269b;
            case 6:
                C63010eb ebVar = f154271e;
                if (ebVar == null) {
                    synchronized (C57743g.class) {
                        ebVar = f154271e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154269b);
                            f154271e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
