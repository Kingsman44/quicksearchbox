package com.google.protos.p4850an.p4855d.p4858c;

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
import com.google.protos.p4850an.C63389bg;
import com.google.protos.p4850an.C63624h;

/* renamed from: com.google.protos.an.d.c.ah */
/* compiled from: PG */
public final class C63500ah extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C63500ah f171754d;

    /* renamed from: h */
    private static volatile C63010eb f171755h;

    /* renamed from: a */
    public String f171756a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f171757b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C63624h f171758c;

    /* renamed from: e */
    private int f171759e;

    /* renamed from: f */
    private C63389bg f171760f;

    /* renamed from: g */
    private byte f171761g = 2;

    static {
        C63500ah ahVar = new C63500ah();
        f171754d = ahVar;
        C62942bv.registerDefaultInstance(C63500ah.class, ahVar);
    }

    private C63500ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171761g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171761g = b;
                return null;
            case 2:
                return newMessageInfo(f171754d, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0006\u001a\nဉ\t", new Object[]{"e", C10662f.f35572a, "a", "b", C45240c.f118157a});
            case 3:
                return new C63500ah();
            case 4:
                return new C63499ag();
            case 5:
                return f171754d;
            case 6:
                C63010eb ebVar = f171755h;
                if (ebVar == null) {
                    synchronized (C63500ah.class) {
                        ebVar = f171755h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171754d);
                            f171755h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
