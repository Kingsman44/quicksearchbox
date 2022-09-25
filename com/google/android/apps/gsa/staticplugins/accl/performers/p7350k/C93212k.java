package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9881a.p9882a.C130324a;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.k */
/* compiled from: PG */
final class C93212k extends C93206e {

    /* renamed from: b */
    final /* synthetic */ C64735n f259945b;

    /* renamed from: c */
    final /* synthetic */ C2164c f259946c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93212k(C64735n nVar, C93205d dVar, C130324a aVar, C64735n nVar2, C2164c cVar) {
        super(nVar, dVar, aVar);
        this.f259945b = nVar2;
        this.f259946c = cVar;
    }

    /* renamed from: a */
    public final void mo87566a() {
        C52070ec ecVar;
        this.f259930a = true;
        ((C58970a) ((C58970a) C93213l.f259947a.mo56224b()).mo56372aa(13449)).mo56389s("Start dictation onAboutToStart, skip return result=%s", Boolean.valueOf(this.f259945b.f175476h));
        C2164c cVar = this.f259946c;
        if (this.f259945b.f175476h) {
            ecVar = C22402a.f61894b;
        } else {
            ecVar = C22402a.f61893a;
        }
        cVar.mo5437b(ecVar);
    }

    /* renamed from: b */
    public final void mo87567b() {
        super.mo87567b();
        ((C58970a) ((C58970a) C93213l.f259947a.mo56226d()).mo56372aa(13450)).mo56386p("Start dictation onFailure");
        this.f259946c.mo5437b(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
    }
}
