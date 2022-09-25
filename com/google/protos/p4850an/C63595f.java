package com.google.protos.p4850an;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f */
/* compiled from: PG */
public final class C63595f extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C63595f f172013d;

    /* renamed from: i */
    private static volatile C63010eb f172014i;

    /* renamed from: a */
    public int f172015a;

    /* renamed from: b */
    public C62971cq f172016b = emptyProtobufList();

    /* renamed from: c */
    public String f172017c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C62724b f172018e;

    /* renamed from: f */
    private C63387be f172019f;

    /* renamed from: g */
    private C63356b f172020g;

    /* renamed from: h */
    private byte f172021h = 2;

    static {
        C63595f fVar = new C63595f();
        f172013d = fVar;
        C62942bv.registerDefaultInstance(C63595f.class, fVar);
    }

    private C63595f() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172021h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172021h = b;
                return null;
            case 2:
                return newMessageInfo(f172013d, "\u0001\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0001\u0004\u0001Л\nဈ\u0000\u000bᐉ\u0006\rᐉ\b\u000fᐉ\u0004", new Object[]{"a", "b", C63586e.class, C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, "e"});
            case 3:
                return new C63595f();
            case 4:
                return new C63398c();
            case 5:
                return f172013d;
            case 6:
                C63010eb ebVar = f172014i;
                if (ebVar == null) {
                    synchronized (C63595f.class) {
                        ebVar = f172014i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172013d);
                            f172014i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
