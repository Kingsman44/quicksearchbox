package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.aa */
/* compiled from: PG */
public final class C25293aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25293aa f68800c;

    /* renamed from: d */
    private static volatile C63010eb f68801d;

    /* renamed from: a */
    public String f68802a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f68803b;

    static {
        C25293aa aaVar = new C25293aa();
        f68800c = aaVar;
        C62942bv.registerDefaultInstance(C25293aa.class, aaVar);
    }

    private C25293aa() {
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
                return newMessageInfo(f68800c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C25293aa();
            case 4:
                return new C25350z();
            case 5:
                return f68800c;
            case 6:
                C63010eb ebVar = f68801d;
                if (ebVar == null) {
                    synchronized (C25293aa.class) {
                        ebVar = f68801d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68800c);
                            f68801d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
