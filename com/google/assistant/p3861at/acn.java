package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acn */
/* compiled from: PG */
public final class acn extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final acn f128854h;

    /* renamed from: i */
    private static volatile C63010eb f128855i;

    /* renamed from: a */
    public int f128856a;

    /* renamed from: b */
    public int f128857b;

    /* renamed from: c */
    public String f128858c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f128859d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f128860e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public ack f128861f;

    /* renamed from: g */
    public abj f128862g;

    static {
        acn acn = new acn();
        f128854h = acn;
        C62942bv.registerDefaultInstance(acn.class, acn);
    }

    private acn() {
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
                return newMessageInfo(f128854h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", acl.f128853a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new acn();
            case 4:
                return new aci();
            case 5:
                return f128854h;
            case 6:
                C63010eb ebVar = f128855i;
                if (ebVar == null) {
                    synchronized (acn.class) {
                        ebVar = f128855i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128854h);
                            f128855i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
