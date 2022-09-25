package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* compiled from: PG */
public class UdcPuntCardActivity extends C108847bd {

    /* renamed from: a */
    public C86054o f302573a;

    /* renamed from: b */
    public String f302574b;

    /* renamed from: c */
    public C86124t f302575c;

    /* renamed from: d */
    public C91123v f302576d;

    public final void onCreate(Bundle bundle) {
        Intent intent;
        C74504a.m120462a(f.ap);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("seq_arg_surface", 3);
        int intExtra2 = getIntent().getIntExtra("flow_id", 0);
        if (intExtra == 3) {
            C83879am o = C83880an.m133553o();
            C83940g gVar = (C83940g) o;
            gVar.f228605a = "opa_android:udc_punt_card";
            String F = this.f302573a.mo79659F();
            F.getClass();
            gVar.f228607c = new C83938e(1, F, (String) null);
            C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
            C9439b bVar = C9439b.OPA_ANDROID_UDC_PUNT_CARD;
            vVar.copyOnWrite();
            C59567w wVar = (C59567w) vVar.instance;
            wVar.f158062c = bVar.f32835aq;
            wVar.f158060a |= 2;
            o.mo77222b((C59567w) vVar.build());
            intent = o.mo77221a().mo77240n();
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("seq_arg_surface", intExtra);
            bundle2.putInt("flow_id", intExtra2);
            C83879am o2 = C83880an.m133553o();
            String str = this.f302574b;
            if (str != null) {
                C83940g gVar2 = (C83940g) o2;
                gVar2.f228611g = str;
                gVar2.f228605a = "exit_signed_out";
                gVar2.f228607c = new C83938e(0, (String) null, (String) null);
                gVar2.f228606b = bundle2;
                C59566v vVar2 = (C59566v) C59567w.f158058g.createBuilder();
                C9439b bVar2 = C9439b.OPA_EXIT_SIGNED_OUT;
                vVar2.copyOnWrite();
                C59567w wVar2 = (C59567w) vVar2.instance;
                wVar2.f158062c = bVar2.f32835aq;
                wVar2.f158060a |= 2;
                o2.mo77222b((C59567w) vVar2.build());
                if (intExtra == 2 && this.f302576d.mo85390b() && this.f302575c.mo79746e(C90086ek.f250511i)) {
                    o2.mo77226f(6);
                }
                intent = o2.mo77221a().mo77240n();
            } else {
                throw new NullPointerException("Null gsaPackageName");
            }
        }
        startActivity(intent);
        finish();
    }
}
