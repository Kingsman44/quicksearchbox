package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52701bg;
import com.google.assistant.p3897e.p3929l.p3930a.C52703bi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.adf */
/* compiled from: PG */
public final class adf extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final adf f129030h;

    /* renamed from: i */
    private static volatile C63010eb f129031i;

    /* renamed from: a */
    public int f129032a;

    /* renamed from: b */
    public String f129033b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f129034c;

    /* renamed from: d */
    public int f129035d;

    /* renamed from: e */
    public int f129036e;

    /* renamed from: f */
    public C50027hw f129037f;

    /* renamed from: g */
    public int f129038g;

    static {
        adf adf = new adf();
        f129030h = adf;
        C62942bv.registerDefaultInstance(adf.class, adf);
    }

    private adf() {
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
                Object[] objArr = new Object[11];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = C52703bi.f138353a;
                objArr[7] = cfVar;
                objArr[5] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                objArr[6] = "e";
                objArr[8] = C10662f.f35572a;
                objArr[9] = C30325g.f82003a;
                objArr[10] = C52701bg.f138352a;
                return newMessageInfo(f129030h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", objArr);
            case 3:
                return new adf();
            case 4:
                return new ade();
            case 5:
                return f129030h;
            case 6:
                C63010eb ebVar = f129031i;
                if (ebVar == null) {
                    synchronized (adf.class) {
                        ebVar = f129031i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129030h);
                            f129031i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
