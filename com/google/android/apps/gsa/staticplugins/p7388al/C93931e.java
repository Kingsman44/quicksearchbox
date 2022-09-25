package com.google.android.apps.gsa.staticplugins.p7388al;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.b;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83916c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83921h;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83922i;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.p7006ax.C89328g;
import com.google.android.apps.gsa.shared.p7045k.C89794ab;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.e */
/* compiled from: PG */
public final /* synthetic */ class C93931e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C93943q f262305a;

    public /* synthetic */ C93931e(C93943q qVar) {
        this.f262305a = qVar;
    }

    public final void onClick(View view) {
        String str;
        C93943q qVar = this.f262305a;
        qVar.f262352x = true;
        C83922i iVar = (C83922i) C83923j.f228570d.createBuilder();
        ArrayList arrayList = new ArrayList();
        for (C83992d dVar : qVar.f262348t.mo77447a()) {
            l lVar = ((C93942p) dVar).f262324a;
            arrayList.add(lVar);
            C83916c cVar = (C83916c) C83917d.f228552j.createBuilder();
            String b = lVar.b();
            cVar.copyOnWrite();
            C83917d dVar2 = (C83917d) cVar.instance;
            b.getClass();
            dVar2.f228554a |= 1;
            dVar2.f228555b = b;
            String d = lVar.d();
            cVar.copyOnWrite();
            C83917d dVar3 = (C83917d) cVar.instance;
            d.getClass();
            dVar3.f228554a |= 8;
            dVar3.f228558e = d;
            if (lVar.f != 3) {
                C89824t tVar = lVar.a;
                if (tVar != null) {
                    str = tVar.mo83664b().f243149b;
                } else {
                    C89328g gVar = lVar.b;
                    gVar.getClass();
                    str = gVar.mo83265c();
                }
                cVar.copyOnWrite();
                C83917d dVar4 = (C83917d) cVar.instance;
                str.getClass();
                dVar4.f228554a = 2 | dVar4.f228554a;
                dVar4.f228556c = str;
            }
            C49875cf a = lVar.a();
            if (a != null) {
                int i = a.f129621v;
                cVar.copyOnWrite();
                C83917d dVar5 = (C83917d) cVar.instance;
                dVar5.f228554a |= 256;
                dVar5.f228562i = i;
            }
            if (lVar.f == 1) {
                C89824t tVar2 = lVar.a;
                tVar2.getClass();
                String hostAddress = tVar2.mo83663a().mo83652g().getHostAddress();
                cVar.copyOnWrite();
                C83917d dVar6 = (C83917d) cVar.instance;
                hostAddress.getClass();
                dVar6.f228554a |= 4;
                dVar6.f228557d = hostAddress;
                boolean j = tVar2.mo83663a().mo83656j();
                cVar.copyOnWrite();
                C83917d dVar7 = (C83917d) cVar.instance;
                dVar7.f228554a |= 128;
                dVar7.f228561h = j;
                C89794ab c = tVar2.mo83665c();
                if (c != null) {
                    boolean z = c.f243044i;
                    cVar.copyOnWrite();
                    C83917d dVar8 = (C83917d) cVar.instance;
                    dVar8.f228554a |= 32;
                    dVar8.f228559f = z;
                    JSONObject jSONObject = c.f243043h;
                    boolean z2 = false;
                    if (jSONObject != null) {
                        z2 = jSONObject.optBoolean(qVar.f262333e.mo79758x(C90082eg.f249897aM), false);
                    }
                    cVar.copyOnWrite();
                    C83917d dVar9 = (C83917d) cVar.instance;
                    dVar9.f228554a |= 64;
                    dVar9.f228560g = z2;
                }
            }
            iVar.mo77330a((C83917d) cVar.build());
        }
        if (!b.i(arrayList, qVar.f262339k.mo83863Z(), qVar.f262333e.mo79752r(C90014bt.f247482hw))) {
            String string = qVar.getString(R.string.assistant_speaker_id_enrollment_select_same_device_locale_toast);
            View view2 = qVar.getView();
            if (view2 != null) {
                Snackbar.m79661q((Context) null, view2, string, -1).mo48343h();
            } else {
                ((C59052c) ((C59052c) C93943q.f262327b.mo56226d()).mo56372aa(19353)).mo56386p("showSnackbar: getView() is null");
            }
        } else {
            qVar.f262354z = (C83923j) iVar.build();
            int a2 = C83921h.m133675a(qVar.f262353y.f228567c);
            if (a2 != 0 && a2 == 2) {
                qVar.f262337i.f257559d = C58528ij.m90006F(arrayList);
                String c2 = b.c(arrayList, qVar.f262339k.mo83863Z(), qVar.f262333e.mo79752r(C90014bt.f247482hw));
                qVar.f262337i.mo87030k(c2);
                qVar.f262338j.f262363a = c2;
            }
            qVar.mo77318iT().mo77312a();
        }
    }
}
