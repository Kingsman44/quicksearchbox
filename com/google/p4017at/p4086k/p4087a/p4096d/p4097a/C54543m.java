package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.m */
/* compiled from: PG */
public final class C54543m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54543m f143196c;

    /* renamed from: d */
    private static volatile C63010eb f143197d;

    /* renamed from: a */
    public String f143198a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f143199b = emptyProtobufList();

    static {
        C54543m mVar = new C54543m();
        f143196c = mVar;
        C62942bv.registerDefaultInstance(C54543m.class, mVar);
    }

    private C54543m() {
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
                return newMessageInfo(f143196c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", C54545o.class});
            case 3:
                return new C54543m();
            case 4:
                return new C54542l();
            case 5:
                return f143196c;
            case 6:
                C63010eb ebVar = f143197d;
                if (ebVar == null) {
                    synchronized (C54543m.class) {
                        ebVar = f143197d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143196c);
                            f143197d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
