package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1850d.C22553c;
import com.google.android.libraries.gsa.conversation.p1850d.C22559i;
import com.google.android.libraries.gsa.conversation.p1853g.C22641ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52089ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62972cr;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.o */
/* compiled from: PG */
final class C22610o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f62281a;

    /* renamed from: b */
    final /* synthetic */ long f62282b;

    /* renamed from: c */
    final /* synthetic */ C52081en f62283c;

    /* renamed from: d */
    final /* synthetic */ C22612q f62284d;

    /* renamed from: e */
    final /* synthetic */ C22641ba f62285e;

    public C22610o(C22612q qVar, int i, long j, C52081en enVar, C22641ba baVar) {
        this.f62284d = qVar;
        this.f62281a = i;
        this.f62282b = j;
        this.f62283c = enVar;
        this.f62285e = baVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C22612q qVar = this.f62284d;
        if (qVar.mo27729j(this.f62281a)) {
            qVar.mo27731l(this.f62283c, this.f62285e, qVar.mo27732m(2, this.f62282b));
        } else {
            qVar.mo27728i(qVar.mo27723d(this.f62282b));
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        C58833ax axVar2 = (C58833ax) obj;
        C22612q qVar = this.f62284d;
        if (!qVar.mo27729j(this.f62281a)) {
            qVar.mo27728i(qVar.mo27723d(this.f62282b));
        } else if (axVar2.mo56113h()) {
            ((C59052c) ((C59052c) C22612q.f62291a.mo56225c()).mo56372aa(48403)).mo56389s("%s", axVar2.mo56107c());
            C22612q qVar2 = this.f62284d;
            qVar2.mo27731l(this.f62283c, this.f62285e, qVar2.mo27732m(2, this.f62282b));
        } else {
            C22612q qVar3 = this.f62284d;
            C58833ax b = C22612q.m42119b(this.f62283c);
            if (!b.mo56113h()) {
                axVar = C58836b.f156633a;
            } else {
                String str = (String) b.mo56107c();
                axVar = qVar3.f62293c.containsKey(str) ? C58833ax.m90834k((C52089ev) qVar3.f62293c.get(str)) : C58836b.f156633a;
            }
            if (!axVar.mo56113h()) {
                C22612q qVar4 = this.f62284d;
                qVar4.mo27731l(this.f62283c, this.f62285e, qVar4.mo27732m(5, this.f62282b));
                return;
            }
            C22612q qVar5 = this.f62284d;
            int i = this.f62281a;
            C52081en enVar = this.f62283c;
            C22559i iVar = qVar5.f62294d;
            C52081en enVar2 = this.f62283c;
            StringBuilder sb = new StringBuilder(((C52089ev) axVar.mo56107c()).f136709b.mo59170I(C62972cr.f170009a));
            sb.append("\njwnMain('");
            byte[] byteArray = enVar2.toByteArray();
            sb.append(C59326i.f157517e.mo56826f().mo56837l(byteArray, byteArray.length));
            sb.append("')");
            String sb2 = sb.toString();
            C58976aa aaVar = C58975e.f156826a;
            long b2 = iVar.f62186g.mo26870b();
            SettableFuture settableFuture = new SettableFuture();
            iVar.mo27649b(settableFuture, C22559i.f62182c, "Evaluation didn't finish in time");
            iVar.f62184e.post(new C22553c(iVar, settableFuture, sb2, b2));
            C60856cj.m92911t(settableFuture, C47810es.m84974n(new C22611p(qVar5, i, this.f62282b, enVar, this.f62285e)), qVar5.f62292b);
        }
    }
}
