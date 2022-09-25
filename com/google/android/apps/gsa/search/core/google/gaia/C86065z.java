package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.speech.helper.p7281b.C92305a;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.z */
/* compiled from: PG */
public final /* synthetic */ class C86065z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f232648a;

    public /* synthetic */ C86065z(C58485gu guVar) {
        this.f232648a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f232648a;
        List list = (List) obj;
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (!TextUtils.isEmpty(str)) {
                C92305a aVar = (C92305a) C92308d.f257402e.createBuilder();
                String str2 = ((Account) guVar.get(i)).name;
                aVar.copyOnWrite();
                C92308d dVar = (C92308d) aVar.instance;
                str2.getClass();
                dVar.f257404a |= 1;
                dVar.f257405b = str2;
                aVar.copyOnWrite();
                C92308d dVar2 = (C92308d) aVar.instance;
                str.getClass();
                dVar2.f257404a |= 2;
                dVar2.f257406c = str;
                ihVar.mo55373c((C92308d) aVar.build());
            }
        }
        return ihVar.mo55486f();
    }
}
