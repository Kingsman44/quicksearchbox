package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.gp */
/* compiled from: PG */
public final class C65236gp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65236gp f176526c;

    /* renamed from: d */
    private static volatile C63010eb f176527d;

    /* renamed from: a */
    public int f176528a;

    /* renamed from: b */
    public String f176529b = BuildConfig.FLAVOR;

    static {
        C65236gp gpVar = new C65236gp();
        f176526c = gpVar;
        C62942bv.registerDefaultInstance(C65236gp.class, gpVar);
    }

    private C65236gp() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f176526c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65236gp();
            case 4:
                return new C65235go();
            case 5:
                return f176526c;
            case 6:
                C63010eb ebVar = f176527d;
                if (ebVar == null) {
                    synchronized (C65236gp.class) {
                        ebVar = f176527d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176526c);
                            f176527d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
