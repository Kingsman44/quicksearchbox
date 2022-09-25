package com.google.android.apps.search.assistant.libraries.p8975g.p8976a;

import com.google.android.apps.search.assistant.libraries.p8975g.C119398b;
import com.google.android.apps.search.assistant.libraries.p8975g.C119402f;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45140az;
import com.google.common.p4526f.p4527a.C58970a;
import kotlinx.coroutines.C71807q;
import p5462h.C69714l;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.assistant.libraries.g.a.e */
/* compiled from: PG */
public final class C119390e implements C45140az {

    /* renamed from: a */
    final /* synthetic */ int f332867a;

    /* renamed from: b */
    final /* synthetic */ C119392g f332868b;

    /* renamed from: c */
    final /* synthetic */ C71807q f332869c;

    /* renamed from: d */
    final /* synthetic */ C119402f f332870d;

    public C119390e(int i, C119392g gVar, C71807q qVar, C119402f fVar) {
        this.f332867a = i;
        this.f332868b = gVar;
        this.f332869c = qVar;
        this.f332870d = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo33446a(Object obj) {
        C45137aw awVar = (C45137aw) obj;
        if (awVar.mo48946b() == this.f332867a) {
            if (awVar.mo48973m()) {
                this.f332868b.f332875a.mo104319b(this);
            }
            C71807q qVar = this.f332869c;
            C119402f fVar = this.f332870d;
            int c = awVar.mo48947c();
            if (c != 2) {
                if (c == 5) {
                    qVar.mo61338mb(C69788q.f186170a);
                } else if (c == 6) {
                    if (fVar != null) {
                        fVar.mo104325a();
                    }
                    int a = awVar.mo48945a();
                    qVar.mo61338mb(C69714l.m101133a(new C119398b("FailedErrorCode:" + a, (Exception) null)));
                } else if (c == 7) {
                    qVar.mo61338mb(C69714l.m101133a(new C119398b("CANCELED", (Exception) null)));
                    if (fVar != null) {
                        fVar.mo104325a();
                    }
                }
            } else if (fVar != null && fVar.f332891a != null) {
                ((C58970a) ((C58970a) C124354f.f343253a.mo56224b()).mo56372aa(36181)).mo56386p("Whole home module install is being downloaded.");
            }
        }
    }
}
