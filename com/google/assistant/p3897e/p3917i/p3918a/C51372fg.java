package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5277z.p5278a.p5279a.p5280a.C67971d;
import com.google.p5277z.p5282c.C67998ah;
import com.google.p5277z.p5282c.C68014d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63642z;
import com.google.protos.p4883as.p4885b.C63783d;

/* renamed from: com.google.assistant.e.i.a.fg */
/* compiled from: PG */
public final class C51372fg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51372fg f133792g;

    /* renamed from: j */
    private static volatile C63010eb f133793j;

    /* renamed from: a */
    public int f133794a;

    /* renamed from: b */
    public long f133795b;

    /* renamed from: c */
    public C67971d f133796c;

    /* renamed from: d */
    public C62971cq f133797d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f133798e = emptyProtobufList();

    /* renamed from: f */
    public C63783d f133799f;

    /* renamed from: h */
    private C67998ah f133800h;

    /* renamed from: i */
    private byte f133801i = 2;

    static {
        C51372fg fgVar = new C51372fg();
        f133792g = fgVar;
        C62942bv.registerDefaultInstance(C51372fg.class, fgVar);
    }

    private C51372fg() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53604a() {
        C62971cq cqVar = this.f133797d;
        if (!cqVar.mo58948c()) {
            this.f133797d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53605b() {
        C62971cq cqVar = this.f133798e;
        if (!cqVar.mo58948c()) {
            this.f133798e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133801i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133801i = b;
                return null;
            case 2:
                return newMessageInfo(f133792g, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0002\u0003\u0002ဂ\u0002\u0003ဉ\u0003\u0004ᐉ\u0004\u0005Л\bЛ\nဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, C19618h.f54585a, "d", C68014d.class, "e", C63642z.class, C10662f.f35572a});
            case 3:
                return new C51372fg();
            case 4:
                return new C51371ff();
            case 5:
                return f133792g;
            case 6:
                C63010eb ebVar = f133793j;
                if (ebVar == null) {
                    synchronized (C51372fg.class) {
                        ebVar = f133793j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133792g);
                            f133793j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
