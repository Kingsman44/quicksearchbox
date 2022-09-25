package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bn */
/* compiled from: PG */
public final class C7560bn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7560bn f26149g;

    /* renamed from: h */
    private static volatile C63010eb f26150h;

    /* renamed from: a */
    public int f26151a;

    /* renamed from: b */
    public C62971cq f26152b = emptyProtobufList();

    /* renamed from: c */
    public int f26153c;

    /* renamed from: d */
    public C7559bm f26154d;

    /* renamed from: e */
    public String f26155e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f26156f;

    static {
        C7560bn bnVar = new C7560bn();
        f26149g = bnVar;
        C62942bv.registerDefaultInstance(C7560bn.class, bnVar);
    }

    private C7560bn() {
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
                return newMessageInfo(f26149g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C7557bk.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C7560bn();
            case 4:
                return new C7553bg();
            case 5:
                return f26149g;
            case 6:
                C63010eb ebVar = f26150h;
                if (ebVar == null) {
                    synchronized (C7560bn.class) {
                        ebVar = f26150h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26149g);
                            f26150h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
