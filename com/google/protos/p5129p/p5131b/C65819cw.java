package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.cw */
/* compiled from: PG */
public final class C65819cw extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C65819cw f178926i;

    /* renamed from: k */
    private static volatile C63010eb f178927k;

    /* renamed from: a */
    public int f178928a;

    /* renamed from: b */
    public int f178929b;

    /* renamed from: c */
    public String f178930c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f178931d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f178932e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f178933f = emptyProtobufList();

    /* renamed from: g */
    public long f178934g;

    /* renamed from: h */
    public String f178935h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f178936j = 2;

    static {
        C65819cw cwVar = new C65819cw();
        f178926i = cwVar;
        C62942bv.registerDefaultInstance(C65819cw.class, cwVar);
    }

    private C65819cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178936j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178936j = b;
                return null;
            case 2:
                return newMessageInfo(f178926i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005Л\u0006Л\u0007ဂ\u0003\bဈ\u0004", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, "d", "e", C65768az.class, C10662f.f35572a, C65768az.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C65819cw();
            case 4:
                return new C65818cv();
            case 5:
                return f178926i;
            case 6:
                C63010eb ebVar = f178927k;
                if (ebVar == null) {
                    synchronized (C65819cw.class) {
                        ebVar = f178927k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178926i);
                            f178927k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
