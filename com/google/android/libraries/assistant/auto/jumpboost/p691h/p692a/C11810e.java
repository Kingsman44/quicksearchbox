package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12968d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13052n;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.MediaRecFragment;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.p892a.C13172a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.e */
/* compiled from: PG */
class C11810e implements C46440f {

    /* renamed from: a */
    final /* synthetic */ C11812g f37975a;

    public C11810e(C11812g gVar) {
        this.f37975a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        C59104x c = C11812g.f37977a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AsProjectedFP");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(43480)).mo56386p("Failed to handle media rec session end");
        this.f37975a.f37982f.mo20154g(C13054p.IDLE);
        this.f37975a.mo20165b();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        C13052n nVar = (C13052n) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C13052n.f40515d, this.f37975a.f37985i);
        C58976aa aaVar = C58975e.f156826a;
        C13054p a = C13054p.m29247a(nVar.f40518b);
        if (a == null) {
            a = C13054p.IDLE;
        }
        a.name();
        this.f37975a.f37982f.mo20154g(C13054p.IDLE);
        C13054p a2 = C13054p.m29247a(nVar.f40518b);
        if (a2 == null) {
            a2 = C13054p.IDLE;
        }
        if (a2 != C13054p.STOPPED) {
            Fragment fragment = this.f37975a.f37983g.getChildFragmentManager().f650q;
            if (fragment == null) {
                C59104x d = C11812g.f37977a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                ((C59052c) ((C59052c) d).mo56372aa(43482)).mo56386p("No navHost is attached to the root fragment");
                this.f37975a.mo20165b();
                return;
            }
            C47393f.m84236g(new C13172a(false), fragment);
        } else if ((nVar.f40517a & 2) != 0) {
            this.f37975a.f37982f.mo20155h(C60866ct.f164955a);
            C11812g gVar = this.f37975a;
            C12986d dVar = nVar.f40519c;
            if (dVar == null) {
                dVar = C12986d.f40365e;
            }
            C58833ax a3 = gVar.mo20164a();
            if (a3.mo56113h()) {
                C12968d.m29210b((Intent) a3.mo56107c(), dVar);
                Fragment fragment2 = gVar.f37983g.getChildFragmentManager().f650q;
                if (fragment2 == null) {
                    C59104x d2 = C11812g.f37977a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                    ((C59052c) ((C59052c) d2).mo56372aa(43498)).mo56386p("No navHost is attached to the root fragment");
                    return;
                }
                int i = dVar.f40368b;
                if (i == 10) {
                    List i2 = fragment2.getChildFragmentManager().f634a.mo677i();
                    if (i2.isEmpty()) {
                        C59104x d3 = C11812g.f37977a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                        ((C59052c) ((C59052c) d3).mo56372aa(43497)).mo56386p("No child fragments under the nav host");
                        gVar.mo20165b();
                    } else if (!gVar.mo20166c(fragment2)) {
                        C59104x d4 = C11812g.f37977a.mo56226d();
                        d4.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                        ((C59052c) ((C59052c) d4).mo56372aa(43496)).mo56386p("Cannot restart media rec session from a non-media-rec-fragment.");
                        gVar.mo20165b();
                    } else {
                        gVar.f37982f.mo20154g(C13054p.ONGOING);
                        Fragment fragment3 = (Fragment) i2.get(0);
                        if (fragment3 instanceof MediaRecFragment) {
                            ((MediaRecFragment) fragment3).mo17754z().f40670A.mo20927a(4);
                            return;
                        }
                        throw new IllegalArgumentException("The fragment is not supported MediaRecFragment.");
                    }
                } else if (i == 1) {
                    gVar.f37980d.mo50482c(fragment2).mo50506b(R.id.aap_voice_plate_screen);
                    gVar.f37982f.mo20152e(true);
                } else {
                    C59104x d5 = C11812g.f37977a.mo56226d();
                    d5.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                    ((C59052c) ((C59052c) d5).mo56372aa(43493)).mo56386p("Failed to handle an unsupported queued request");
                    gVar.mo20165b();
                }
            }
        } else {
            this.f37975a.mo20165b();
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18068i(Object obj) {
    }
}
