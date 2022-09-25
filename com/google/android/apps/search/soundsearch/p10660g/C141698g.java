package com.google.android.apps.search.soundsearch.p10660g;

import com.google.android.apps.search.soundsearch.p10654c.C141647b;
import com.google.android.apps.search.soundsearch.p10654c.C141649d;
import com.google.audio.p4107b.p4108a.C54590m;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67184ab;

/* renamed from: com.google.android.apps.search.soundsearch.g.g */
/* compiled from: PG */
public final /* synthetic */ class C141698g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141700i f384570a;

    /* renamed from: b */
    public final /* synthetic */ C66611ci f384571b;

    public /* synthetic */ C141698g(C141700i iVar, C66611ci ciVar) {
        this.f384570a = iVar;
        this.f384571b = ciVar;
    }

    public final void run() {
        Object obj;
        C141700i iVar = this.f384570a;
        C66611ci ciVar = this.f384571b;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a != C66610ch.DONE_SUCCESS) {
            C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
            if (a2 == null) {
                a2 = C66610ch.IN_PROGRESS;
            }
            if (a2 == C66610ch.DONE_ERROR) {
                iVar.mo20122b(new C141647b(ciVar.f181211d, ciVar.f181210c));
                return;
            }
            C62940bt r2 = C62942bv.checkIsLite(C67184ab.f182604e);
            ciVar.mo58887l(r2);
            if (ciVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C67184ab.f182604e);
                ciVar.mo58887l(r22);
                Object l = ciVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C67184ab abVar = (C67184ab) obj;
                C54591n nVar = abVar.f182607b;
                if (nVar == null) {
                    nVar = C54591n.f143323c;
                }
                if (nVar.f143325a.size() <= 0) {
                    C54591n nVar2 = abVar.f182607b;
                    if (nVar2 == null) {
                        nVar2 = C54591n.f143323c;
                    }
                    int a3 = C54590m.m87491a(nVar2.f143326b);
                    if (a3 != 0 && a3 == 2) {
                        iVar.f384574a.mo116656a();
                        iVar.f384574a.f384580d.mo116647a(new C141649d());
                        return;
                    }
                    return;
                }
                iVar.f384574a.mo116656a();
                iVar.f384574a.f384580d.mo116648b(abVar);
            }
        }
    }
}
