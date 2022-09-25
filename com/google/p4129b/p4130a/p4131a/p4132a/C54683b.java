package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.b */
/* compiled from: PG */
public final class C54683b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54683b f143537c;

    /* renamed from: d */
    private static volatile C63010eb f143538d;

    /* renamed from: a */
    public String f143539a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f143540b = C62942bv.emptyProtobufList();

    static {
        C54683b bVar = new C54683b();
        f143537c = bVar;
        C62942bv.registerDefaultInstance(C54683b.class, bVar);
    }

    private C54683b() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f143537c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C54683b();
            case 4:
                return new C54650a();
            case 5:
                return f143537c;
            case 6:
                C63010eb ebVar = f143538d;
                if (ebVar == null) {
                    synchronized (C54683b.class) {
                        ebVar = f143538d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143537c);
                            f143538d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
