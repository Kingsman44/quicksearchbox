package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mv */
/* compiled from: PG */
public final class C50161mv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50161mv f130401c;

    /* renamed from: d */
    private static volatile C63010eb f130402d;

    /* renamed from: a */
    public int f130403a;

    /* renamed from: b */
    public String f130404b = BuildConfig.FLAVOR;

    static {
        C50161mv mvVar = new C50161mv();
        f130401c = mvVar;
        C62942bv.registerDefaultInstance(C50161mv.class, mvVar);
    }

    private C50161mv() {
        emptyProtobufList();
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
                return newMessageInfo(f130401c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C50161mv();
            case 4:
                return new C50160mu();
            case 5:
                return f130401c;
            case 6:
                C63010eb ebVar = f130402d;
                if (ebVar == null) {
                    synchronized (C50161mv.class) {
                        ebVar = f130402d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130401c);
                            f130402d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
