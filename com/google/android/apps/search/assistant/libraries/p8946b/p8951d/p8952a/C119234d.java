package com.google.android.apps.search.assistant.libraries.p8946b.p8951d.p8952a;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protos.p5129p.p5130a.C65710ai;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C119234d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f332515a;

    public /* synthetic */ C119234d(C58485gu guVar) {
        this.f332515a = guVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58485gu guVar = this.f332515a;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C65710ai aiVar = (C65710ai) C60856cj.m92909r((C60870cx) guVar.get(i));
            C62724b bVar = aiVar.f178528a;
            if (bVar == null) {
                bVar = C62724b.f169416g;
            }
            i++;
            if (bVar.f169419b != C62722b.OK.f169415s) {
                Locale locale = Locale.ROOT;
                Object[] objArr = new Object[2];
                C62724b bVar2 = aiVar.f178528a;
                objArr[0] = Integer.valueOf((bVar2 == null ? C62724b.f169416g : bVar2).f169419b);
                if (bVar2 == null) {
                    bVar2 = C62724b.f169416g;
                }
                objArr[1] = bVar2.f169421d;
                return C60856cj.m92899h(new GellerException(C62722b.UNKNOWN, String.format(locale, "Failed with code %d, %s", objArr)));
            }
        }
        return C60866ct.f164955a;
    }
}
