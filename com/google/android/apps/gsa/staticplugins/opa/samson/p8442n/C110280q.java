package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.q */
/* compiled from: PG */
final class C110280q extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110283t f307310a;

    public C110280q(C110283t tVar) {
        this.f307310a = tVar;
    }

    public final void onReceive(Context context, Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CARD");
        if (byteArrayExtra != null) {
            Bitmap bitmap = (Bitmap) intent.getParcelableExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON");
            try {
                C58976aa aaVar = C58975e.f156826a;
                for (C50818do doVar : ((C50819dp) ((C50785ci) ((C50785ci) C50819dp.f132330b.createBuilder()).mergeFrom(byteArrayExtra)).build()).f132332a) {
                    if (doVar.f132305b) {
                        this.f307310a.f307317e.mo98511n((C110260a) null);
                    } else {
                        C50792cp cpVar = C50792cp.PRIORITY_UNDEFINED;
                        C50792cp a = C50792cp.m85936a(doVar.f132306c);
                        if (a == null) {
                            a = C50792cp.PRIORITY_UNDEFINED;
                        }
                        if (a.ordinal() == 1) {
                            C110265b bVar = this.f307310a.f307317e;
                            if (doVar != null) {
                                bVar.mo98511n(new C110266c(doVar, bitmap));
                            } else {
                                throw new NullPointerException("Null card");
                            }
                        }
                    }
                }
            } catch (C62974ct e) {
                C59104x c = C110283t.f307313a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SmartSpaceCtrl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25930)).mo56386p("proto error");
            }
        } else {
            C59104x c2 = C110283t.f307313a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SmartSpaceCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(25928)).mo56389s("receiving update with no proto: %s", intent.getExtras());
        }
    }
}
