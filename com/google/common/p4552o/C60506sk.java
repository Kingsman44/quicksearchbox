package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.sk */
/* compiled from: PG */
public final class C60506sk extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60506sk f163796h;

    /* renamed from: i */
    private static volatile C63010eb f163797i;

    /* renamed from: a */
    public int f163798a;

    /* renamed from: b */
    public int f163799b;

    /* renamed from: c */
    public int f163800c;

    /* renamed from: d */
    public C62971cq f163801d = emptyProtobufList();

    /* renamed from: e */
    public int f163802e;

    /* renamed from: f */
    public String f163803f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f163804g;

    static {
        C60506sk skVar = new C60506sk();
        f163796h = skVar;
        C62942bv.registerDefaultInstance(C60506sk.class, skVar);
    }

    private C60506sk() {
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
                return newMessageInfo(f163796h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C60503sh.f163790a, "d", C60505sj.class, "e", C60501sf.f163788a, C10662f.f35572a, C30325g.f82003a, C60502sg.f163789a});
            case 3:
                return new C60506sk();
            case 4:
                return new C60500se();
            case 5:
                return f163796h;
            case 6:
                C63010eb ebVar = f163797i;
                if (ebVar == null) {
                    synchronized (C60506sk.class) {
                        ebVar = f163797i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163796h);
                            f163797i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
