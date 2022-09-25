package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.j.ca */
/* compiled from: PG */
public final class C51748ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51748ca f135762d;

    /* renamed from: g */
    private static volatile C63010eb f135763g;

    /* renamed from: a */
    public int f135764a;

    /* renamed from: b */
    public String f135765b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135766c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C63037fb f135767e;

    /* renamed from: f */
    private byte f135768f = 2;

    static {
        C51748ca caVar = new C51748ca();
        f135762d = caVar;
        C62942bv.registerDefaultInstance(C51748ca.class, caVar);
    }

    private C51748ca() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135768f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135768f = b;
                return null;
            case 2:
                return newMessageInfo(f135762d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "e", C45240c.f118157a});
            case 3:
                return new C51748ca();
            case 4:
                return new C51728bz();
            case 5:
                return f135762d;
            case 6:
                C63010eb ebVar = f135763g;
                if (ebVar == null) {
                    synchronized (C51748ca.class) {
                        ebVar = f135763g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135762d);
                            f135763g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
