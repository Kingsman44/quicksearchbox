package com.google.knowledge.p4661a.p4662a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.x */
/* compiled from: PG */
public final class C61762x extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C61762x f166835e;

    /* renamed from: h */
    private static volatile C63010eb f166836h;

    /* renamed from: a */
    public int f166837a;

    /* renamed from: b */
    public C62971cq f166838b = emptyProtobufList();

    /* renamed from: c */
    public C8213ab f166839c;

    /* renamed from: d */
    public String f166840d;

    /* renamed from: f */
    private C8242v f166841f;

    /* renamed from: g */
    private byte f166842g = 2;

    static {
        C61762x xVar = new C61762x();
        f166835e = xVar;
        C62942bv.registerDefaultInstance(C61762x.class, xVar);
    }

    private C61762x() {
        emptyProtobufList();
        emptyProtobufList();
        this.f166840d = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166842g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166842g = b;
                return null;
            case 2:
                return newMessageInfo(f166835e, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0002\u0002\u001b\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ဈ\u0007", new Object[]{"a", "b", C61764z.class, C45240c.f118157a, C10662f.f35572a, "d"});
            case 3:
                return new C61762x();
            case 4:
                return new C61761w();
            case 5:
                return f166835e;
            case 6:
                C63010eb ebVar = f166836h;
                if (ebVar == null) {
                    synchronized (C61762x.class) {
                        ebVar = f166836h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166835e);
                            f166836h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
