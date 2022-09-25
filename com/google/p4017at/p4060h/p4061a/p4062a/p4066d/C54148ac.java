package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.ac */
/* compiled from: PG */
public final class C54148ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54148ac f142095e;

    /* renamed from: h */
    private static volatile C63010eb f142096h;

    /* renamed from: a */
    public String f142097a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f142098b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f142099c = emptyProtobufList();

    /* renamed from: d */
    public boolean f142100d;

    /* renamed from: f */
    private int f142101f;

    /* renamed from: g */
    private byte f142102g = 2;

    static {
        C54148ac acVar = new C54148ac();
        f142095e = acVar;
        C62942bv.registerDefaultInstance(C54148ac.class, acVar);
    }

    private C54148ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142102g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142102g = b;
                return null;
            case 2:
                return newMessageInfo(f142095e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, C54156h.class, "d"});
            case 3:
                return new C54148ac();
            case 4:
                return new C54147ab();
            case 5:
                return f142095e;
            case 6:
                C63010eb ebVar = f142096h;
                if (ebVar == null) {
                    synchronized (C54148ac.class) {
                        ebVar = f142096h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142095e);
                            f142096h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
