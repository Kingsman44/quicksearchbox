package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aoa */
/* compiled from: PG */
public final class aoa extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aoa f135475f;

    /* renamed from: g */
    private static volatile C63010eb f135476g;

    /* renamed from: a */
    public int f135477a;

    /* renamed from: b */
    public aom f135478b;

    /* renamed from: c */
    public int f135479c;

    /* renamed from: d */
    public int f135480d;

    /* renamed from: e */
    public String f135481e = BuildConfig.FLAVOR;

    static {
        aoa aoa = new aoa();
        f135475f = aoa;
        C62942bv.registerDefaultInstance(aoa.class, aoa);
    }

    private aoa() {
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
                Object[] objArr = new Object[7];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = anx.f135469a;
                objArr[5] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                objArr[6] = "e";
                return newMessageInfo(f135475f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", objArr);
            case 3:
                return new aoa();
            case 4:
                return new anz();
            case 5:
                return f135475f;
            case 6:
                C63010eb ebVar = f135476g;
                if (ebVar == null) {
                    synchronized (aoa.class) {
                        ebVar = f135476g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135475f);
                            f135476g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
