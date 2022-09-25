package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3993r.C53060c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ai */
/* compiled from: PG */
public final class C51239ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51239ai f133399g;

    /* renamed from: j */
    private static volatile C63010eb f133400j;

    /* renamed from: a */
    public int f133401a;

    /* renamed from: b */
    public int f133402b = 0;

    /* renamed from: c */
    public Object f133403c;

    /* renamed from: d */
    public String f133404d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f133405e;

    /* renamed from: f */
    public C62971cq f133406f = emptyProtobufList();

    /* renamed from: h */
    private C53060c f133407h;

    /* renamed from: i */
    private byte f133408i = 2;

    static {
        C51239ai aiVar = new C51239ai();
        f133399g = aiVar;
        C62942bv.registerDefaultInstance(C51239ai.class, aiVar);
    }

    private C51239ai() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133408i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133408i = b;
                return null;
            case 2:
                return newMessageInfo(f133399g, "\u0001\u0006\u0001\u0001\u0001\u0016\u0006\u0000\u0001\u0001\u0001ျ\u0000\u0005ဈ\u0001\u0007င\u0002\nᐉ\u0006\u000f\u001b\u0016ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C19618h.f54585a, C10662f.f35572a, C51238ah.class});
            case 3:
                return new C51239ai();
            case 4:
                return new C51236af();
            case 5:
                return f133399g;
            case 6:
                C63010eb ebVar = f133400j;
                if (ebVar == null) {
                    synchronized (C51239ai.class) {
                        ebVar = f133400j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133399g);
                            f133400j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
