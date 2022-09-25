package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14456jx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14457jy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.q */
/* compiled from: PG */
public final /* synthetic */ class C15097q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15106z f45315a;

    public /* synthetic */ C15097q(C15106z zVar) {
        this.f45315a = zVar;
    }

    public final void onClick(View view) {
        C15106z zVar = this.f45315a;
        LinearLayout linearLayout = (LinearLayout) view;
        C58976aa aaVar = C58975e.f156826a;
        if (linearLayout.getChildCount() == 0 || zVar.f45328e == null) {
            C59104x c = C15106z.f45323a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DialerFullRend");
            ((C59052c) ((C59052c) c).mo56372aa(45947)).mo56386p("#dialPadKeyOnClick: empty dialpad key wrapper");
        } else if (zVar.f45331h.isPresent()) {
            int asInt = zVar.f45331h.getAsInt();
            String obj = ((TextView) linearLayout.getChildAt(0)).getText().toString();
            if (C58837ba.m90859h(obj)) {
                C59104x c2 = C15106z.f45323a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.DialerFullRend");
                ((C59052c) ((C59052c) c2).mo56372aa(45950)).mo56386p("Empty key tap triggered.");
                return;
            }
            C14986h hVar = zVar.f45325b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
            C14456jx jxVar = (C14456jx) C14457jy.f43725c.createBuilder();
            jxVar.copyOnWrite();
            ((C14457jy) jxVar.instance).f43727a = asInt;
            jxVar.copyOnWrite();
            obj.getClass();
            ((C14457jy) jxVar.instance).f43728b = obj;
            iyVar.copyOnWrite();
            C14477kr krVar = (C14477kr) iyVar.instance;
            C14457jy jyVar = (C14457jy) jxVar.build();
            jyVar.getClass();
            krVar.f43759b = jyVar;
            krVar.f43758a = 10;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14477kr krVar2 = (C14477kr) iyVar.build();
            krVar2.getClass();
            lfVar.f43801d = krVar2;
            lfVar.f43800c = 4;
            hVar.mo21875g((C14492lf) gtVar.build());
            zVar.f45330g = String.valueOf(zVar.f45330g).concat(String.valueOf(obj));
            zVar.f45328e.setText(zVar.f45330g);
        } else {
            zVar.mo21964c(String.valueOf(zVar.f45330g).concat(String.valueOf(String.valueOf(((TextView) linearLayout.getChildAt(0)).getText()))));
        }
    }
}
