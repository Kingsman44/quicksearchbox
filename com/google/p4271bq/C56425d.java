package com.google.p4271bq;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bq.d */
/* compiled from: PG */
public final class C56425d extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C56425d f150537g;

    /* renamed from: i */
    private static volatile C63010eb f150538i;

    /* renamed from: a */
    public int f150539a;

    /* renamed from: b */
    public String f150540b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C56425d f150541c;

    /* renamed from: d */
    public C56429h f150542d;

    /* renamed from: e */
    public C62971cq f150543e = emptyProtobufList();

    /* renamed from: f */
    public String f150544f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f150545h = 2;

    static {
        C56425d dVar = new C56425d();
        f150537g = dVar;
        C62942bv.registerDefaultInstance(C56425d.class, dVar);
    }

    private C56425d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150545h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150545h = b;
                return null;
            case 2:
                return newMessageInfo(f150537g, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0001\u0002\u0002ဈ\u0000\u0004ᐉ\u0001\u0006ᐉ\u0002\b\u001b\tဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C56423b.class, C10662f.f35572a});
            case 3:
                return new C56425d();
            case 4:
                return new C56424c();
            case 5:
                return f150537g;
            case 6:
                C63010eb ebVar = f150538i;
                if (ebVar == null) {
                    synchronized (C56425d.class) {
                        ebVar = f150538i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150537g);
                            f150538i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
