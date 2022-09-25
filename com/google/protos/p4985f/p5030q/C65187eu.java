package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;

/* renamed from: com.google.protos.f.q.eu */
/* compiled from: PG */
public final class C65187eu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65187eu f176405e;

    /* renamed from: g */
    private static volatile C63010eb f176406g;

    /* renamed from: a */
    public String f176407a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f176408b = emptyProtobufList();

    /* renamed from: c */
    public boolean f176409c;

    /* renamed from: d */
    public boolean f176410d;

    /* renamed from: f */
    private byte f176411f = 2;

    static {
        C65187eu euVar = new C65187eu();
        f176405e = euVar;
        C62942bv.registerDefaultInstance(C65187eu.class, euVar);
    }

    private C65187eu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176411f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176411f = b;
                return null;
            case 2:
                return newMessageInfo(f176405e, "\u0000\u0004\u0000\u0000\u0001\u0010\u0004\u0000\u0001\u0001\u0001Ȉ\u0002Л\u0003\u0007\u0010\u0007", new Object[]{"a", "b", C63318b.class, C45240c.f118157a, "d"});
            case 3:
                return new C65187eu();
            case 4:
                return new C65186et();
            case 5:
                return f176405e;
            case 6:
                C63010eb ebVar = f176406g;
                if (ebVar == null) {
                    synchronized (C65187eu.class) {
                        ebVar = f176406g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176405e);
                            f176406g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
