package com.google.android.apps.gsa.opa.p6435c;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22412b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3745ab.C48273ca;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.opa.c.m */
/* compiled from: PG */
public final class C83601m implements C22412b {

    /* renamed from: a */
    public static final C59071e f227916a = C59071e.m91332i("com.google.android.apps.gsa.opa.c.m");

    /* renamed from: b */
    public final Context f227917b;

    /* renamed from: c */
    public final C22871g f227918c;

    /* renamed from: d */
    public final C68214a f227919d;

    /* renamed from: e */
    public final C21370a f227920e;

    /* renamed from: f */
    public final Object f227921f = new Object();

    /* renamed from: g */
    public C83600l f227922g;

    public C83601m(Context context, C22871g gVar, C22871g gVar2, C68214a aVar, C21370a aVar2) {
        this.f227917b = context;
        this.f227918c = gVar;
        this.f227919d = aVar;
        this.f227920e = aVar2;
        gVar2.mo28212l("create callStateHandler", new C83591c(this));
    }

    /* renamed from: a */
    public final void mo27601a(C22411a aVar) {
        synchronized (this.f227921f) {
            aVar.mo27600a(7, (C48273ca) null);
            C83600l lVar = this.f227922g;
            if (lVar != null) {
                lVar.mo76955b();
            }
        }
    }

    /* renamed from: b */
    public final void mo27602b(C22411a aVar) {
        synchronized (this.f227921f) {
            aVar.mo27600a(6, (C48273ca) null);
        }
    }

    /* renamed from: c */
    public final void mo27603c(String str, C22411a aVar) {
        synchronized (this.f227921f) {
            aVar.mo27600a(1, (C48273ca) null);
            if (this.f227917b.checkSelfPermission("android.permission.CALL_PHONE") == -1) {
                aVar.mo27600a(8, (C48273ca) null);
                return;
            }
            C83600l lVar = this.f227922g;
            if (lVar == null) {
                ((C59052c) ((C59052c) f227916a.mo56225c()).mo56372aa(6784)).mo56386p("callStateHandler was not successfully initiated, do not activate tracking.");
                return;
            }
            synchronized (lVar.f227909d) {
                lVar.f227913h = -1;
                lVar.f227907b = str;
                lVar.f227912g = aVar;
                TelephonyManager telephonyManager = lVar.f227908c;
                if (telephonyManager != null) {
                    telephonyManager.listen(lVar.f227906a, 32);
                }
                C83601m mVar = lVar.f227915j;
                lVar.f227910e = mVar.f227918c.mo28204d("call connect timeout future", ((C86124t) mVar.f227919d.mo27525b()).mo79743a(C90014bt.f247708mJ), new C83593e(lVar, aVar));
                lVar.f227915j.f227918c.mo28211k(lVar.f227910e, "call connect timeout future callback", new C83597i());
            }
        }
    }
}
