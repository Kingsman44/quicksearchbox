package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sq */
/* compiled from: PG */
public final class C50318sq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50318sq f130960e;

    /* renamed from: g */
    private static volatile C63010eb f130961g;

    /* renamed from: a */
    public C62971cq f130962a = emptyProtobufList();

    /* renamed from: b */
    public C62961ch f130963b = emptyIntList();

    /* renamed from: c */
    public C62971cq f130964c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f130965d;

    /* renamed from: f */
    private int f130966f;

    static {
        C50318sq sqVar = new C50318sq();
        f130960e = sqVar;
        C62942bv.registerDefaultInstance(C50318sq.class, sqVar);
    }

    private C50318sq() {
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
                return newMessageInfo(f130960e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u0016\u0003\u001a\u0004ဇ\u0000", new Object[]{C10662f.f35572a, "a", C50311sj.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C50318sq();
            case 4:
                return new C50317sp();
            case 5:
                return f130960e;
            case 6:
                C63010eb ebVar = f130961g;
                if (ebVar == null) {
                    synchronized (C50318sq.class) {
                        ebVar = f130961g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130960e);
                            f130961g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
