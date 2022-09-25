package com.google.android.apps.search.googleapp.saves.savefeature;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.d */
/* compiled from: PG */
public final class C137296d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137296d f373496c;

    /* renamed from: e */
    private static volatile C63010eb f373497e;

    /* renamed from: a */
    public C57569am f373498a;

    /* renamed from: b */
    public C57566aj f373499b;

    /* renamed from: d */
    private byte f373500d = 2;

    static {
        C137296d dVar = new C137296d();
        f373496c = dVar;
        C62942bv.registerDefaultInstance(C137296d.class, dVar);
    }

    private C137296d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373500d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373500d = b;
                return null;
            case 2:
                return newMessageInfo(f373496c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C137296d();
            case 4:
                return new C137283c();
            case 5:
                return f373496c;
            case 6:
                C63010eb ebVar = f373497e;
                if (ebVar == null) {
                    synchronized (C137296d.class) {
                        ebVar = f373497e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373496c);
                            f373497e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
