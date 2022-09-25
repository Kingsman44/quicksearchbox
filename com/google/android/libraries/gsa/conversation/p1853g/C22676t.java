package com.google.android.libraries.gsa.conversation.p1853g;

import androidx.p060c.C0984n;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.g.t */
/* compiled from: PG */
final class C22676t implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22669m f62455a;

    /* renamed from: b */
    final /* synthetic */ C22677u f62456b;

    public C22676t(C22677u uVar, C22669m mVar) {
        this.f62456b = uVar;
        this.f62455a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C22677u uVar;
        int i = 0;
        while (true) {
            uVar = this.f62456b;
            C0984n nVar = uVar.f62462f;
            if (i >= nVar.f3122d) {
                break;
            }
            ((C60870cx) nVar.mo3708h(i)).cancel(false);
            i++;
        }
        C22669m mVar = this.f62455a;
        for (C51181l lVar : uVar.f62458b.f133230c) {
            C51180k a = C51180k.m86072a(lVar.f133224b);
            if (a == null) {
                a = C51180k.NO_OP;
            }
            if (a == C51180k.START_BBS) {
                for (Integer num : lVar.f133225c) {
                    if (uVar.f62460d.containsKey(num)) {
                        for (Integer num2 : ((C51175f) uVar.f62460d.get(num)).f133211e) {
                            if (uVar.f62461e.containsKey(num2) && !uVar.f62463g.contains(num2)) {
                                C52083ep epVar = (C52083ep) uVar.f62461e.get(num2);
                                C58833ax a2 = C22677u.m42208a(epVar);
                                if (a2.mo56113h() && ((C51809dy) a2.mo56107c()).f135939e) {
                                    uVar.mo27783c(epVar, mVar);
                                }
                            }
                        }
                    }
                }
            }
        }
        ((C59052c) ((C59052c) ((C59052c) C22677u.f62457a.mo56225c()).mo56382g(th)).mo56372aa(48321)).mo56386p("Execution plan failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C22667k kVar = (C22667k) obj;
    }
}
