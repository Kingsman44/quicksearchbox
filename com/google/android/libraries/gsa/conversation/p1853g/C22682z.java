package com.google.android.libraries.gsa.conversation.p1853g;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.conversation.g.z */
/* compiled from: PG */
public final /* synthetic */ class C22682z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C22682z f62470a = new C22682z();

    private /* synthetic */ C22682z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C52083ep epVar = (C52083ep) obj;
        int i = epVar.f136694d;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        String str = true != eiVar.f136670e ? BuildConfig.FLAVOR : " [NM]";
        if (epVar.f136692b == 4) {
            eiVar2 = (C52076ei) epVar.f136693c;
        } else {
            eiVar2 = C52076ei.f136664f;
        }
        C51809dy dyVar = eiVar2.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        String str2 = dyVar.f135936b;
        return i + str + ": " + str2;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
