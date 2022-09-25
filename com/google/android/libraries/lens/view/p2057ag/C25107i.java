package com.google.android.libraries.lens.view.p2057ag;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gleam.C26510co;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.p2069am.C25339o;
import com.google.android.libraries.lens.view.p2069am.C25342r;
import com.google.android.material.snackbar.Snackbar;
import com.google.lens.p4707j.C62476cz;
import com.google.lens.p4707j.C62478da;
import com.google.lens.p4707j.C62499dv;
import com.google.lens.p4707j.C62500dw;
import com.google.lens.p4707j.C62591y;
import com.google.lens.p4707j.C62592z;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56250bd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.ag.i */
/* compiled from: PG */
public final /* synthetic */ class C25107i implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C25112n f68390a;

    public /* synthetic */ C25107i(C25112n nVar) {
        this.f68390a = nVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C25112n nVar = this.f68390a;
        Editable text = nVar.f68403j.getText();
        String obj = text != null ? text.toString() : BuildConfig.FLAVOR;
        if (!obj.isEmpty()) {
            C25113o oVar = nVar.f68396c;
            String str = nVar.f68394a.f68367a;
            C27384dt dtVar = (C27384dt) oVar;
            C25105g gVar = dtVar.f74956az;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (!str.equals(obj)) {
                C62591y yVar = (C62591y) C62592z.f168985c.createBuilder();
                C62476cz czVar = (C62476cz) C62478da.f168682b.createBuilder();
                C62499dv dvVar = (C62499dv) C62500dw.f168731d.createBuilder();
                dvVar.copyOnWrite();
                C62500dw dwVar = (C62500dw) dvVar.instance;
                dwVar.f168734b = 2;
                dwVar.f168733a |= 1;
                dvVar.copyOnWrite();
                C62500dw dwVar2 = (C62500dw) dvVar.instance;
                obj.getClass();
                dwVar2.f168733a |= 2;
                dwVar2.f168735c = obj;
                czVar.copyOnWrite();
                C62478da daVar = (C62478da) czVar.instance;
                C62500dw dwVar3 = (C62500dw) dvVar.build();
                dwVar3.getClass();
                C62971cq cqVar = daVar.f168684a;
                if (!cqVar.mo58948c()) {
                    daVar.f168684a = C62942bv.mutableCopy(cqVar);
                }
                daVar.f168684a.add(dwVar3);
                yVar.copyOnWrite();
                C62592z zVar = (C62592z) yVar.instance;
                C62478da daVar2 = (C62478da) czVar.build();
                daVar2.getClass();
                zVar.f168988b = daVar2;
                zVar.f168987a |= 1;
                C62592z zVar2 = (C62592z) yVar.build();
                C25339o oVar2 = (C25339o) C25342r.f68970o.createBuilder();
                oVar2.copyOnWrite();
                C25342r rVar = (C25342r) oVar2.instance;
                rVar.f68972a |= 1;
                rVar.f68973b = "lens-query-request";
                C56250bd bdVar = (C56250bd) C56251be.f149845d.createBuilder();
                bdVar.copyOnWrite();
                C56251be beVar = (C56251be) bdVar.instance;
                zVar2.getClass();
                beVar.f149848b = zVar2;
                beVar.f149847a |= 2;
                oVar2.copyOnWrite();
                C25342r rVar2 = (C25342r) oVar2.instance;
                C56251be beVar2 = (C56251be) bdVar.build();
                beVar2.getClass();
                rVar2.f68978g = beVar2;
                rVar2.f68972a |= 32;
                dtVar.mo32918D((C25342r) oVar2.build());
                C26510co coVar = dtVar.f74919aO;
                if (coVar != null) {
                    coVar.mo17754z().f72338e.mo31804x();
                }
            }
        } else {
            Snackbar.m79660p(textView, R.string.lens_empty_latex_snackbar, 0).mo48343h();
        }
        return true;
    }
}
