package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.p1246b;

import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.assistant.p3994s.p3995a.C53251gz;
import com.google.assistant.p3994s.p3995a.C53253ha;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.d */
/* compiled from: PG */
public final class C16229d extends C68247h {

    /* renamed from: a */
    private final C68283d f47812a;

    /* renamed from: c */
    private final C68283d f47813c;

    public C16229d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16229d.class), aVar);
        this.f47812a = C68236af.m98549d(dVar);
        this.f47813c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C51334dw dwVar = (C51334dw) list.get(0);
        String str = (String) list.get(1);
        C53251gz gzVar = (C53251gz) C53253ha.f139593f.createBuilder();
        gzVar.copyOnWrite();
        C53253ha haVar = (C53253ha) gzVar.instance;
        str.getClass();
        haVar.f139595a |= 1;
        haVar.f139596b = str;
        if ((dwVar.f133685a & 4) != 0) {
            C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
            String str2 = dwVar.f133692f;
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            str2.getClass();
            dwVar2.f133685a |= 4;
            dwVar2.f133692f = str2;
            C51334dw dwVar3 = (C51334dw) csVar.build();
            gzVar.copyOnWrite();
            C53253ha haVar2 = (C53253ha) gzVar.instance;
            dwVar3.getClass();
            haVar2.f139599e = dwVar3;
            haVar2.f139595a |= 32;
        }
        C52405qn qnVar = dwVar.f133694h;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        if ((qnVar.f137521a & 1) != 0) {
            C52405qn qnVar2 = dwVar.f133694h;
            if (qnVar2 == null) {
                qnVar2 = C52405qn.f137519c;
            }
            String str3 = qnVar2.f137522b;
            gzVar.copyOnWrite();
            C53253ha haVar3 = (C53253ha) gzVar.instance;
            str3.getClass();
            haVar3.f139595a |= 2;
            haVar3.f139597c = str3;
        }
        return C60856cj.m92900i((C53253ha) gzVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47812a.mo60297gq(), this.f47813c.mo60297gq());
    }
}
