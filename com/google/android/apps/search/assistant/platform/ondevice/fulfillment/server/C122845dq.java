package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122386ae;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122395an;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122397ap;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.assistant.portable.C19052aa;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dq */
/* compiled from: PG */
public final /* synthetic */ class C122845dq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340247a;

    /* renamed from: b */
    public final /* synthetic */ C122859d f340248b;

    /* renamed from: c */
    public final /* synthetic */ C122852dx f340249c;

    /* renamed from: d */
    public final /* synthetic */ C122419bk f340250d;

    /* renamed from: e */
    public final /* synthetic */ int f340251e;

    /* renamed from: f */
    public final /* synthetic */ C122811k f340252f;

    public /* synthetic */ C122845dq(C122870ea eaVar, C122859d dVar, C122852dx dxVar, C122419bk bkVar, int i, C122811k kVar) {
        this.f340247a = eaVar;
        this.f340248b = dVar;
        this.f340249c = dxVar;
        this.f340250d = bkVar;
        this.f340251e = i;
        this.f340252f = kVar;
    }

    public final Object apply(Object obj) {
        String str;
        C122870ea eaVar = this.f340247a;
        C122859d dVar = this.f340248b;
        C122852dx dxVar = this.f340249c;
        C122419bk bkVar = this.f340250d;
        int i = this.f340251e;
        C122811k kVar = this.f340252f;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            ((C59052c) dVar.mo105767f(C59071e.f157037b).mo56372aa(34856)).mo56386p("Failed to fulfill due to cancellation.");
            if (eaVar.f340316q.equals(C122854dz.FINISHED)) {
                ((C59052c) dVar.mo105767f(C59071e.f157037b).mo56372aa(34859)).mo56386p("Ignoring fulfillment results because already finalized.");
                return null;
            } else if (dxVar.f340278f) {
                eaVar.f340310k.mo41698m(eaVar.f340311l, "CANCELLED", bkVar.f339404k);
                ((C59052c) dVar.mo105764c().mo56372aa(34858)).mo56386p("Returning cancelled response");
                C17597g gVar = eaVar.f340301b;
                C122395an anVar = (C122395an) C122397ap.f339328d.createBuilder();
                anVar.copyOnWrite();
                ((C122397ap) anVar.instance).f339332c = i;
                C122386ae aeVar = C122386ae.f339300a;
                anVar.copyOnWrite();
                C122397ap apVar = (C122397ap) anVar.instance;
                aeVar.getClass();
                apVar.f339331b = aeVar;
                apVar.f339330a = 5;
                gVar.mo20123c((C122397ap) anVar.build());
                return null;
            } else {
                eaVar.f340310k.mo41698m(eaVar.f340311l, "UNEXPECTED_CANCEL", bkVar.f339404k);
                ((C59052c) ((C59052c) dVar.mo105765d().mo56382g(th)).mo56372aa(34857)).mo56386p("Unexpected cancellation");
                eaVar.f340301b.mo20123c(C122870ea.m202192d(i, eaVar.f340309j.mo105845a(new C122872ec("RequestHandler", "Fulfillment was cancelled for unknown reason"), "fulfillment"), C122448cm.f339454i));
                return null;
            }
        } else {
            ((C59052c) ((C59052c) dVar.mo105765d().mo56382g(th)).mo56372aa(34854)).mo56386p("Failed to fulfill due to exception.");
            if (eaVar.f340316q.equals(C122854dz.FINISHED)) {
                return null;
            }
            C39141kp kpVar = eaVar.f340310k;
            String str2 = eaVar.f340311l;
            if (th instanceof C122872ec) {
                C122872ec ecVar = (C122872ec) th;
                str = ecVar.f340335a + "_" + ecVar.f340336b;
            } else if (th instanceof C18218av) {
                str = C122870ea.m202193g((C18218av) th);
            } else if (th instanceof C19052aa) {
                Throwable cause = th.getCause();
                str = cause instanceof C18218av ? C122870ea.m202193g((C18218av) cause) : "InitException";
            } else {
                str = th.getClass().getName();
            }
            kpVar.mo41698m(str2, str, bkVar.f339404k);
            eaVar.f340301b.mo20123c(C122870ea.m202192d(i, eaVar.f340309j.mo105845a(th, "fulfillment"), eaVar.mo105771i(0, dxVar, kVar)));
            return null;
        }
    }
}
