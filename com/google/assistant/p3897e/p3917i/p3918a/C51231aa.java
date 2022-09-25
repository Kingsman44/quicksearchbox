package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.aa */
/* compiled from: PG */
public final class C51231aa extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51231aa f133382f;

    /* renamed from: g */
    private static volatile C63010eb f133383g;

    /* renamed from: a */
    public int f133384a;

    /* renamed from: b */
    public C51098gh f133385b;

    /* renamed from: c */
    public String f133386c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f133387d = emptyProtobufList();

    /* renamed from: e */
    public C52829f f133388e;

    static {
        C51231aa aaVar = new C51231aa();
        f133382f = aaVar;
        C62942bv.registerDefaultInstance(C51231aa.class, aaVar);
    }

    private C51231aa() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53556a() {
        C62971cq cqVar = this.f133387d;
        if (!cqVar.mo58948c()) {
            this.f133387d = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f133382f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004\u001b\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C52230ka.class, "e"});
            case 3:
                return new C51231aa();
            case 4:
                return new C51636z();
            case 5:
                return f133382f;
            case 6:
                C63010eb ebVar = f133383g;
                if (ebVar == null) {
                    synchronized (C51231aa.class) {
                        ebVar = f133383g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133382f);
                            f133383g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
