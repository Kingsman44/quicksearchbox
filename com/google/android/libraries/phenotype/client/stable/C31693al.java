package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p343ac.p352c.p353a.C6655a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.stable.al */
/* compiled from: PG */
public final class C31693al extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C31693al f85219g;

    /* renamed from: i */
    private static volatile C63010eb f85220i;

    /* renamed from: a */
    public String f85221a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f85222b;

    /* renamed from: c */
    public int f85223c;

    /* renamed from: d */
    public boolean f85224d;

    /* renamed from: e */
    public boolean f85225e;

    /* renamed from: f */
    public boolean f85226f;

    /* renamed from: h */
    private int f85227h;

    static {
        C31693al alVar = new C31693al();
        f85219g = alVar;
        C62942bv.registerDefaultInstance(C31693al.class, alVar);
    }

    private C31693al() {
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
                return newMessageInfo(f85219g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, C6655a.f19895a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C31693al();
            case 4:
                return new C31692ak();
            case 5:
                return f85219g;
            case 6:
                C63010eb ebVar = f85220i;
                if (ebVar == null) {
                    synchronized (C31693al.class) {
                        ebVar = f85220i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85219g);
                            f85220i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
