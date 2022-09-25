package com.google.protos.p4850an.p4855d.p4864i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3824am.C49243b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.i.b */
/* compiled from: PG */
public final class C63579b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63579b f171967a;

    /* renamed from: h */
    private static volatile C63010eb f171968h;

    /* renamed from: b */
    private int f171969b;

    /* renamed from: c */
    private C63037fb f171970c;

    /* renamed from: d */
    private C63389bg f171971d;

    /* renamed from: e */
    private C63389bg f171972e;

    /* renamed from: f */
    private C49243b f171973f;

    /* renamed from: g */
    private byte f171974g = 2;

    static {
        C63579b bVar = new C63579b();
        f171967a = bVar;
        C62942bv.registerDefaultInstance(C63579b.class, bVar);
    }

    private C63579b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171974g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171974g = b;
                return null;
            case 2:
                return newMessageInfo(f171967a, "\u0001\u0004\u0000\u0001\u0005\u0019\u0004\u0000\u0000\u0003\u0005ᐉ\u000e\u0006ᐉ\u000f\fᐉ\u0012\u0019ဉ\u0006", new Object[]{"b", "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C63579b();
            case 4:
                return new C63578a();
            case 5:
                return f171967a;
            case 6:
                C63010eb ebVar = f171968h;
                if (ebVar == null) {
                    synchronized (C63579b.class) {
                        ebVar = f171968h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171967a);
                            f171968h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
