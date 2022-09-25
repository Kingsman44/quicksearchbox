package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bc */
/* compiled from: PG */
public final class C82806bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82806bc f225635c;

    /* renamed from: d */
    private static volatile C63010eb f225636d;

    /* renamed from: a */
    public String f225637a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62995dn f225638b = C62995dn.f170057a;

    static {
        C82806bc bcVar = new C82806bc();
        f225635c = bcVar;
        C62942bv.registerDefaultInstance(C82806bc.class, bcVar);
    }

    private C82806bc() {
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
                return newMessageInfo(f225635c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"a", "b", C82805bb.f225634a});
            case 3:
                return new C82806bc();
            case 4:
                return new C82804ba();
            case 5:
                return f225635c;
            case 6:
                C63010eb ebVar = f225636d;
                if (ebVar == null) {
                    synchronized (C82806bc.class) {
                        ebVar = f225636d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225635c);
                            f225636d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
