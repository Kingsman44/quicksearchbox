package com.google.android.apps.gsa.tasks;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.at */
/* compiled from: PG */
public final class C118485at extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C118485at f328861h;

    /* renamed from: j */
    private static volatile C63010eb f328862j;

    /* renamed from: a */
    public int f328863a;

    /* renamed from: b */
    public int f328864b;

    /* renamed from: c */
    public int f328865c;

    /* renamed from: d */
    public C118476ak f328866d;

    /* renamed from: e */
    public int f328867e;

    /* renamed from: f */
    public long f328868f;

    /* renamed from: g */
    public long f328869g;

    /* renamed from: i */
    private byte f328870i = 2;

    static {
        C118485at atVar = new C118485at();
        f328861h = atVar;
        C62942bv.registerDefaultInstance(C118485at.class, atVar);
    }

    private C118485at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328870i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328870i = b;
                return null;
            case 2:
                return newMessageInfo(f328861h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဏ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဆ\u0003\u0005စ\u0004\u0006စ\u0005", new Object[]{"a", "b", C45240c.f118157a, C118522by.m196759c(), "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C118485at();
            case 4:
                return new C118484as();
            case 5:
                return f328861h;
            case 6:
                C63010eb ebVar = f328862j;
                if (ebVar == null) {
                    synchronized (C118485at.class) {
                        ebVar = f328862j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328861h);
                            f328862j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
