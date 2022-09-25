package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abx */
/* compiled from: PG */
public final class abx extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final abx f128816g;

    /* renamed from: i */
    private static volatile C63010eb f128817i;

    /* renamed from: a */
    public int f128818a;

    /* renamed from: b */
    public C62971cq f128819b;

    /* renamed from: c */
    public C62971cq f128820c;

    /* renamed from: d */
    public String f128821d;

    /* renamed from: e */
    public C50504zn f128822e;

    /* renamed from: f */
    public String f128823f;

    /* renamed from: h */
    private byte f128824h = 2;

    static {
        abx abx = new abx();
        f128816g = abx;
        C62942bv.registerDefaultInstance(abx.class, abx);
    }

    private abx() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f128819b = emptyProtobufList();
        this.f128820c = emptyProtobufList();
        this.f128821d = BuildConfig.FLAVOR;
        this.f128823f = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128824h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128824h = b;
                return null;
            case 2:
                return newMessageInfo(f128816g, "\u0001\u0005\u0000\u0001\t\r\u0005\u0000\u0002\u0001\t\u001b\nЛ\u000bဈ\u0001\fဉ\u0002\rဈ\u0003", new Object[]{"a", "b", aax.class, C45240c.f118157a, aap.class, "d", "e", C10662f.f35572a});
            case 3:
                return new abx();
            case 4:
                return new abw();
            case 5:
                return f128816g;
            case 6:
                C63010eb ebVar = f128817i;
                if (ebVar == null) {
                    synchronized (abx.class) {
                        ebVar = f128817i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128816g);
                            f128817i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
