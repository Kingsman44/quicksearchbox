package com.google.android.apps.search.transcription.p10670f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66964g;

@Deprecated
/* renamed from: com.google.android.apps.search.transcription.f.m */
/* compiled from: PG */
public final class C141919m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C141919m f385098b;

    /* renamed from: c */
    public static final C62965cl f385099c = new C62965cl(C66964g.f182024j, C66964g.UNKNOWN);

    /* renamed from: d */
    private static volatile C63010eb f385100d;

    /* renamed from: a */
    public C62995dn f385101a = C62995dn.f170057a;

    static {
        C141919m mVar = new C141919m();
        f385098b = mVar;
        C62942bv.registerDefaultInstance(C141919m.class, mVar);
    }

    private C141919m() {
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
                return newMessageInfo(f385098b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001࠲", new Object[]{"a", C141918l.f385097a, C66964g.m97397b()});
            case 3:
                return new C141919m();
            case 4:
                return new C141917k();
            case 5:
                return f385098b;
            case 6:
                C63010eb ebVar = f385100d;
                if (ebVar == null) {
                    synchronized (C141919m.class) {
                        ebVar = f385100d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385098b);
                            f385100d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
