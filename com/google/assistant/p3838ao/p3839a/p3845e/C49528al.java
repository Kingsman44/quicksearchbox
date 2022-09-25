package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.al */
/* compiled from: PG */
public final class C49528al extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49528al f127791g;

    /* renamed from: i */
    private static volatile C63010eb f127792i;

    /* renamed from: a */
    public int f127793a;

    /* renamed from: b */
    public int f127794b;

    /* renamed from: c */
    public C62971cq f127795c = emptyProtobufList();

    /* renamed from: d */
    public C49598da f127796d;

    /* renamed from: e */
    public String f127797e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f127798f = 1;

    /* renamed from: h */
    private byte f127799h = 2;

    static {
        C49528al alVar = new C49528al();
        f127791g = alVar;
        C62942bv.registerDefaultInstance(C49528al.class, alVar);
    }

    private C49528al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127799h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127799h = b;
                return null;
            case 2:
                return newMessageInfo(f127791g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C49617h.m85586b(), C45240c.f118157a, C49630u.class, "d", "e", C10662f.f35572a, C49586cp.f127958a});
            case 3:
                return new C49528al();
            case 4:
                return new C49527ak();
            case 5:
                return f127791g;
            case 6:
                C63010eb ebVar = f127792i;
                if (ebVar == null) {
                    synchronized (C49528al.class) {
                        ebVar = f127792i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127791g);
                            f127792i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
