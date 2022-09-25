package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3929l.p3930a.C52692ay;
import com.google.assistant.p3897e.p3929l.p3930a.C52695ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62963cj;
import com.google.speech.p5208h.p5209a.C66543n;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cr */
/* compiled from: PG */
public final /* synthetic */ class C94239cr implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263341a;

    /* renamed from: b */
    public final /* synthetic */ C83923j f263342b;

    /* renamed from: c */
    public final /* synthetic */ Account f263343c;

    public /* synthetic */ C94239cr(C94256dh dhVar, C83923j jVar, Account account) {
        this.f263341a = dhVar;
        this.f263342b = jVar;
        this.f263343c = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94256dh dhVar = this.f263341a;
        C83923j jVar = this.f263342b;
        Account account = this.f263343c;
        C66543n nVar = (C66543n) obj;
        C94326m mVar = (C94326m) C94327n.f263598g.createBuilder();
        mVar.copyOnWrite();
        C94327n nVar2 = (C94327n) mVar.instance;
        nVar2.f263600a |= 1;
        boolean z = false;
        nVar2.f263602d = false;
        int a = C52695ba.m86691a(nVar.f180979a);
        if (a != 0 && a == 2) {
            z = true;
        }
        mVar.copyOnWrite();
        C94327n nVar3 = (C94327n) mVar.instance;
        nVar3.f263600a = 1 | nVar3.f263600a;
        nVar3.f263602d = z;
        C62963cj<C52692ay> cjVar = new C62963cj(nVar.f180980b, C66543n.f180976c);
        if (!cjVar.isEmpty()) {
            for (C52692ay ayVar : cjVar) {
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14306)).mo56387q("Error code returned: %d", ayVar.f138334n);
            }
            mVar.mo88461a(cjVar);
        }
        C94327n nVar4 = (C94327n) mVar.build();
        if (!nVar4.f263602d) {
            return C60856cj.m92900i(nVar4);
        }
        return dhVar.f263392g.mo28210j(dhVar.mo88408b(account, jVar), "return enrollment status", new C94247cz(nVar4));
    }
}
