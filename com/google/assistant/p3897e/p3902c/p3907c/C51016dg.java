package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52089ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.dg */
/* compiled from: PG */
public final class C51016dg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51016dg f132827g;

    /* renamed from: i */
    private static volatile C63010eb f132828i;

    /* renamed from: a */
    public int f132829a;

    /* renamed from: b */
    public String f132830b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132831c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C52089ev f132832d;

    /* renamed from: e */
    public C51805du f132833e;

    /* renamed from: f */
    public C51012dc f132834f;

    /* renamed from: h */
    private byte f132835h = 2;

    static {
        C51016dg dgVar = new C51016dg();
        f132827g = dgVar;
        C62942bv.registerDefaultInstance(C51016dg.class, dgVar);
    }

    private C51016dg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132835h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132835h = b;
                return null;
            case 2:
                return newMessageInfo(f132827g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0005ဉ\u0002\u0006ᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new C51016dg();
            case 4:
                return new C51015df();
            case 5:
                return f132827g;
            case 6:
                C63010eb ebVar = f132828i;
                if (ebVar == null) {
                    synchronized (C51016dg.class) {
                        ebVar = f132828i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132827g);
                            f132828i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
