package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.common.base.C58817ah;
import java.util.Arrays;
import p5462h.C69681h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.k */
/* compiled from: PG */
final class C120627k implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C122099h f335530a;

    public C120627k(C122099h hVar) {
        this.f335530a = hVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C69664n.m101061g((IllegalArgumentException) obj, "it");
        C122106o oVar = this.f335530a.f338747b;
        if (oVar == null) {
            oVar = C122106o.f338758c;
        }
        if (oVar.f338760a == 1) {
            Object[] objArr = new Object[1];
            C122106o oVar2 = this.f335530a.f338747b;
            if (oVar2 == null) {
                oVar2 = C122106o.f338758c;
            }
            objArr[0] = oVar2.f338760a == 1 ? (String) oVar2.f338761b : BuildConfig.FLAVOR;
            String format = String.format("Unsupported ContextKey with conversationParam: %s", Arrays.copyOf(objArr, 1));
            C69664n.m101060f(format, "format(this, *args)");
            throw new C69681h(format);
        }
        Object[] objArr2 = new Object[1];
        C122106o oVar3 = this.f335530a.f338747b;
        if (oVar3 == null) {
            oVar3 = C122106o.f338758c;
        }
        objArr2[0] = Integer.valueOf(oVar3.f338760a == 2 ? ((Integer) oVar3.f338761b).intValue() : 0);
        String format2 = String.format("Unsupported ContextKey with genericContext: %s", Arrays.copyOf(objArr2, 1));
        C69664n.m101060f(format2, "format(this, *args)");
        throw new C69681h(format2);
    }
}
