package com.google.speech.recognizer.p5233a;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.recognizer.a.ak */
/* compiled from: PG */
public final class C67442ak extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C67442ak f183276i;

    /* renamed from: k */
    private static volatile C63010eb f183277k;

    /* renamed from: a */
    public int f183278a;

    /* renamed from: b */
    public long f183279b;

    /* renamed from: c */
    public long f183280c;

    /* renamed from: d */
    public C62971cq f183281d = emptyProtobufList();

    /* renamed from: e */
    public C67441aj f183282e;

    /* renamed from: f */
    public boolean f183283f;

    /* renamed from: g */
    public C67470r f183284g;

    /* renamed from: h */
    public C62971cq f183285h;

    /* renamed from: j */
    private byte f183286j = 2;

    static {
        C67442ak akVar = new C67442ak();
        f183276i = akVar;
        C62942bv.registerDefaultInstance(C67442ak.class, akVar);
    }

    private C67442ak() {
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        C62942bv.emptyProtobufList();
        this.f183285h = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59870a() {
        C62971cq cqVar = this.f183281d;
        if (!cqVar.mo58948c()) {
            this.f183281d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183286j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183286j = b;
                return null;
            case 2:
                return newMessageInfo(f183276i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0002\u0003\u0001ဂ\u0001\u0002ဂ\u0002\u0003Л\u0005ᐉ\u0003\tဇ\b\nဉ\t\u000bЛ", new Object[]{"a", "b", C45240c.f118157a, "d", C67468p.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C67449ar.class});
            case 3:
                return new C67442ak();
            case 4:
                return new C67439ah();
            case 5:
                return f183276i;
            case 6:
                C63010eb ebVar = f183277k;
                if (ebVar == null) {
                    synchronized (C67442ak.class) {
                        ebVar = f183277k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183276i);
                            f183277k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
