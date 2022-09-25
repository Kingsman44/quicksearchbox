package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9441d;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.w */
/* compiled from: PG */
public final class C59567w extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59567w f158058g;

    /* renamed from: h */
    private static volatile C63010eb f158059h;

    /* renamed from: a */
    public int f158060a;

    /* renamed from: b */
    public long f158061b;

    /* renamed from: c */
    public int f158062c;

    /* renamed from: d */
    public int f158063d;

    /* renamed from: e */
    public int f158064e;

    /* renamed from: f */
    public String f158065f = BuildConfig.FLAVOR;

    static {
        C59567w wVar = new C59567w();
        f158058g = wVar;
        C62942bv.registerDefaultInstance(C59567w.class, wVar);
    }

    private C59567w() {
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
                return newMessageInfo(f158058g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဌ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, C9439b.m23956b(), "d", C9441d.f32837a, "e", e.b(), C10662f.f35572a});
            case 3:
                return new C59567w();
            case 4:
                return new C59566v();
            case 5:
                return f158058g;
            case 6:
                C63010eb ebVar = f158059h;
                if (ebVar == null) {
                    synchronized (C59567w.class) {
                        ebVar = f158059h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158058g);
                            f158059h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
