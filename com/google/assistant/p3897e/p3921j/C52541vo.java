package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vo */
/* compiled from: PG */
public final class C52541vo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52541vo f137908f;

    /* renamed from: g */
    private static volatile C63010eb f137909g;

    /* renamed from: a */
    public int f137910a;

    /* renamed from: b */
    public String f137911b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52537vk f137912c;

    /* renamed from: d */
    public C52535vi f137913d;

    /* renamed from: e */
    public int f137914e;

    static {
        C52541vo voVar = new C52541vo();
        f137908f = voVar;
        C62942bv.registerDefaultInstance(C52541vo.class, voVar);
    }

    private C52541vo() {
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
                return newMessageInfo(f137908f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C52539vm.f137907a});
            case 3:
                return new C52541vo();
            case 4:
                return new C52538vl();
            case 5:
                return f137908f;
            case 6:
                C63010eb ebVar = f137909g;
                if (ebVar == null) {
                    synchronized (C52541vo.class) {
                        ebVar = f137909g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137908f);
                            f137909g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
