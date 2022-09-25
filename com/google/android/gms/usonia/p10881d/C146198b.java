package com.google.android.gms.usonia.p10881d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.usonia.d.b */
/* compiled from: PG */
public final class C146198b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C146198b f395011c;

    /* renamed from: d */
    private static volatile C63010eb f395012d;

    /* renamed from: a */
    public String f395013a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f395014b = BuildConfig.FLAVOR;

    static {
        C146198b bVar = new C146198b();
        f395011c = bVar;
        C62942bv.registerDefaultInstance(C146198b.class, bVar);
    }

    private C146198b() {
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
                return newMessageInfo(f395011c, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002Ȉ\u0004Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C146198b();
            case 4:
                return new C146172a();
            case 5:
                return f395011c;
            case 6:
                C63010eb ebVar = f395012d;
                if (ebVar == null) {
                    synchronized (C146198b.class) {
                        ebVar = f395012d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395011c);
                            f395012d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
