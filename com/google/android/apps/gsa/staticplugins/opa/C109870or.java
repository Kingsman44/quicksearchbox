package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.or */
/* compiled from: PG */
final class C109870or extends C91090a implements C91079f {

    /* renamed from: e */
    final C91075b f306130e = new C91075b(this.f254379a, this);

    /* renamed from: f */
    final /* synthetic */ ZeroStateActivity f306131f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109870or(ZeroStateActivity zeroStateActivity) {
        super(zeroStateActivity, zeroStateActivity, 1000);
        this.f306131f = zeroStateActivity;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        if (this.f306131f.f295701s.mo101661f(intent)) {
            this.f306131f.f295701s.mo101659d(intent, (C114750d) null);
        } else {
            C87565h v = this.f306131f.mo95174v();
            if (intent.hasExtra("snapshot_origin_context")) {
                String stringExtra = intent.getStringExtra("snapshot_origin_context");
                if ("OnMyWayHomeSetupSnapshotOriginContext".equals(stringExtra)) {
                    v.f236556b = e.Z;
                } else if ("OnMyWayHomeEditSnapshotOriginContext".equals(stringExtra)) {
                    v.f236556b = e.Y;
                }
            }
            if (intent.hasExtra("com.google.opa.QUERY")) {
                if (this.f306131f.f295696n.mo79746e(C90014bt.f247606kN)) {
                    v.f236566l = intent;
                } else {
                    String stringExtra2 = intent.getStringExtra("com.google.opa.QUERY");
                    stringExtra2.getClass();
                    v.f236568n = stringExtra2;
                }
                this.f306131f.f295677B.mo101555c(C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_NEW_QUERY);
            } else if (intent.hasExtra("interactive_element")) {
                try {
                    String stringExtra3 = intent.getStringExtra("interactive_element");
                    C59326i iVar = C59326i.f157517e;
                    stringExtra3.getClass();
                    C51016dg dgVar = (C51016dg) C62942bv.parseFrom((C62942bv) C51016dg.f132827g, iVar.mo56836k(stringExtra3), C62921ba.m95368a());
                    if ("none".equals(intent.getStringExtra("navigation"))) {
                        C51805du duVar = dgVar.f132833e;
                        if (duVar == null) {
                            duVar = C51805du.f135924e;
                        }
                        byte[] byteArray = duVar.toByteArray();
                        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
                        C63088z A = C63088z.m96139A(byteArray);
                        oxVar.copyOnWrite();
                        C88094oy oyVar = (C88094oy) oxVar.instance;
                        oyVar.f238176a |= 1;
                        oyVar.f238177b = A;
                        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
                        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
                        this.f306131f.f295698p.mo28212l("onGenericClientEvent", new C109869oq(this, jVar.mo82013a()));
                    } else {
                        if (this.f306131f.f295696n.mo79746e(C90014bt.f247605kM)) {
                            v.f236566l = intent;
                        } else {
                            C51805du duVar2 = dgVar.f132833e;
                            if (duVar2 == null) {
                                duVar2 = C51805du.f135924e;
                            }
                            v.f236517U = duVar2.toByteArray();
                        }
                        this.f306131f.f295677B.mo101558f(intent);
                    }
                } catch (C62974ct unused) {
                    C59104x d = ZeroStateActivity.f295675j.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
                    ((C59052c) ((C59052c) d).mo56372aa(23024)).mo56386p("Invalid interactive element.");
                }
            } else {
                if (intent.getBooleanExtra("opa_exit_signed_out_mode_and_relaunch", false)) {
                    v.f236566l = intent;
                }
                String F = ((C86054o) this.f306131f.f295681F.mo27525b()).mo79659F();
                if (!TextUtils.isEmpty(F)) {
                    C144354b.m234631a(this.f306131f.f295693k, intent, C21601a.m40714a(F).f59976a);
                }
                if (intent.getBooleanExtra("ZeroStateStartActivityForResult", false)) {
                    return super.mo65090b(intent, new C109868op(this, intent));
                }
                return super.mo65089a(intent);
            }
            ZeroStateActivity zeroStateActivity = this.f306131f;
            zeroStateActivity.f295705w.mo81689c(zeroStateActivity.f295693k, v.mo81685a(), 335544320);
            this.f306131f.f295684I = true;
        }
        return true;
    }

    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        this.f306130e.mo81047ju(strArr, i, eVar);
    }
}
