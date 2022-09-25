package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cs */
/* compiled from: PG */
public final class C125118cs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125118cs f345176c;

    /* renamed from: d */
    private static volatile C63010eb f345177d;

    /* renamed from: a */
    public String f345178a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f345179b = emptyProtobufList();

    static {
        C125118cs csVar = new C125118cs();
        f345176c = csVar;
        C62942bv.registerDefaultInstance(C125118cs.class, csVar);
    }

    private C125118cs() {
    }

    /* renamed from: a */
    public final void mo106806a() {
        C62971cq cqVar = this.f345179b;
        if (!cqVar.mo58948c()) {
            this.f345179b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f345176c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C125122cw.class});
            case 3:
                return new C125118cs();
            case 4:
                return new C125117cr();
            case 5:
                return f345176c;
            case 6:
                C63010eb ebVar = f345177d;
                if (ebVar == null) {
                    synchronized (C125118cs.class) {
                        ebVar = f345177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345176c);
                            f345177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
