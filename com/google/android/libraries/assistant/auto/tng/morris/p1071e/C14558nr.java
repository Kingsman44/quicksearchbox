package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nr */
/* compiled from: PG */
public final class C14558nr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C14558nr f44013g;

    /* renamed from: i */
    private static volatile C63010eb f44014i;

    /* renamed from: a */
    public String f44015a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f44016b = emptyProtobufList();

    /* renamed from: c */
    public C54201r f44017c;

    /* renamed from: d */
    public int f44018d;

    /* renamed from: e */
    public long f44019e;

    /* renamed from: f */
    public boolean f44020f;

    /* renamed from: h */
    private byte f44021h = 2;

    static {
        C14558nr nrVar = new C14558nr();
        f44013g = nrVar;
        C62942bv.registerDefaultInstance(C14558nr.class, nrVar);
    }

    private C14558nr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44021h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44021h = b;
                return null;
            case 2:
                return newMessageInfo(f44013g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0002\u0001Ȉ\u0002Л\u0003Љ\u0004\f\u0005\u0002\u0006\u0007", new Object[]{"a", "b", C14563nw.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C14558nr();
            case 4:
                return new C14556np();
            case 5:
                return f44013g;
            case 6:
                C63010eb ebVar = f44014i;
                if (ebVar == null) {
                    synchronized (C14558nr.class) {
                        ebVar = f44014i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44013g);
                            f44014i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
