package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nb */
/* compiled from: PG */
public final class C52312nb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52312nb f137312c;

    /* renamed from: d */
    private static volatile C63010eb f137313d;

    /* renamed from: a */
    public C62971cq f137314a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public String f137315b = BuildConfig.FLAVOR;

    static {
        C52312nb nbVar = new C52312nb();
        f137312c = nbVar;
        C62942bv.registerDefaultInstance(C52312nb.class, nbVar);
    }

    private C52312nb() {
    }

    /* renamed from: a */
    public final void mo53830a() {
        C62971cq cqVar = this.f137314a;
        if (!cqVar.mo58948c()) {
            this.f137314a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f137312c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C52312nb();
            case 4:
                return new C52311na();
            case 5:
                return f137312c;
            case 6:
                C63010eb ebVar = f137313d;
                if (ebVar == null) {
                    synchronized (C52312nb.class) {
                        ebVar = f137313d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137312c);
                            f137313d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
