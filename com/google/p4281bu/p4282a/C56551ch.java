package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ch */
/* compiled from: PG */
public final class C56551ch extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56551ch f151006g;

    /* renamed from: h */
    private static volatile C63010eb f151007h;

    /* renamed from: a */
    public int f151008a;

    /* renamed from: b */
    public int f151009b;

    /* renamed from: c */
    public C62961ch f151010c = emptyIntList();

    /* renamed from: d */
    public String f151011d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151012e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f151013f = emptyProtobufList();

    static {
        C56551ch chVar = new C56551ch();
        f151006g = chVar;
        C62942bv.registerDefaultInstance(C56551ch.class, chVar);
    }

    private C56551ch() {
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
                return newMessageInfo(f151006g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C56548ce.class});
            case 3:
                return new C56551ch();
            case 4:
                return new C56549cf();
            case 5:
                return f151006g;
            case 6:
                C63010eb ebVar = f151007h;
                if (ebVar == null) {
                    synchronized (C56551ch.class) {
                        ebVar = f151007h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151006g);
                            f151007h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
