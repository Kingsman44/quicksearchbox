package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.adp */
/* compiled from: PG */
public final class adp extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final adp f129058h;

    /* renamed from: j */
    private static volatile C63010eb f129059j;

    /* renamed from: a */
    public String f129060a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f129061b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f129062c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f129063d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f129064e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129065f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f129066g = emptyProtobufList();

    /* renamed from: i */
    private int f129067i;

    static {
        adp adp = new adp();
        f129058h = adp;
        C62942bv.registerDefaultInstance(adp.class, adp);
    }

    private adp() {
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
                return newMessageInfo(f129058h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004\u001a\u0005ဈ\u0002\u0006ဈ\u0003\u0007\u001b", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, ado.class});
            case 3:
                return new adp();
            case 4:
                return new adm();
            case 5:
                return f129058h;
            case 6:
                C63010eb ebVar = f129059j;
                if (ebVar == null) {
                    synchronized (adp.class) {
                        ebVar = f129059j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129058h);
                            f129059j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
