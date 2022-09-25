package com.google.speech.p5208h.p5210b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4730a.p4734b.C62767d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.h.b.b */
/* compiled from: PG */
public final class C66572b extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C66572b f181083d;

    /* renamed from: e */
    public static final C62940bt f181084e;

    /* renamed from: g */
    private static volatile C63010eb f181085g;

    /* renamed from: a */
    public int f181086a;

    /* renamed from: b */
    public String f181087b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f181088c = emptyProtobufList();

    /* renamed from: f */
    private byte f181089f = 2;

    static {
        C66572b bVar = new C66572b();
        f181083d = bVar;
        C62942bv.registerDefaultInstance(C66572b.class, bVar);
        f181084e = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, bVar, bVar, (C62958ce) null, 183003334, C63066gd.MESSAGE, C66572b.class);
    }

    private C66572b() {
    }

    /* renamed from: a */
    public final void mo59681a() {
        C62971cq cqVar = this.f181088c;
        if (!cqVar.mo58948c()) {
            this.f181088c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181089f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181089f = b;
                return null;
            case 2:
                return newMessageInfo(f181083d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0004Л", new Object[]{"a", "b", C45240c.f118157a, C62767d.class});
            case 3:
                return new C66572b();
            case 4:
                return new C66571a();
            case 5:
                return f181083d;
            case 6:
                C63010eb ebVar = f181085g;
                if (ebVar == null) {
                    synchronized (C66572b.class) {
                        ebVar = f181085g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181083d);
                            f181085g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
