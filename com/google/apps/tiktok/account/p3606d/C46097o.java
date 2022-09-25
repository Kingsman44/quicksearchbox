package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.io.File;

/* renamed from: com.google.apps.tiktok.account.d.o */
/* compiled from: PG */
public final /* synthetic */ class C46097o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46101s f120976a;

    public /* synthetic */ C46097o(C46101s sVar) {
        this.f120976a = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46101s sVar = this.f120976a;
        C58485gu a = sVar.f120987g.mo50199a((C58528ij) null, C58733pz.f156496a);
        C58526ih ihVar = new C58526ih();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            File file = (File) a.get(i);
            try {
                ihVar.mo55373c(Integer.valueOf(Integer.parseInt(file.getName())));
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) C46101s.f120981a.mo56225c()).mo56382g(e)).mo56372aa(54715)).mo56389s("Account directory name is malformed. Directory name: %s", file.getName());
            }
        }
        return C60922j.m93045h(sVar.f120984d.mo50290j(), C47810es.m84966f(new C46095m(sVar, ihVar.mo55486f())), sVar.f120986f);
    }
}
