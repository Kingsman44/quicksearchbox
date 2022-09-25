package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.assistant.p3994s.p3995a.C53075al;
import com.google.assistant.p3994s.p3995a.C53076am;
import com.google.assistant.p3994s.p3995a.C53077an;
import com.google.assistant.p3994s.p3995a.C53082as;
import com.google.assistant.p3994s.p3995a.C53198f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.v */
/* compiled from: PG */
public final /* synthetic */ class C114944v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114946x f318925a;

    /* renamed from: b */
    public final /* synthetic */ EditText f318926b;

    public /* synthetic */ C114944v(C114946x xVar, EditText editText) {
        this.f318925a = xVar;
        this.f318926b = editText;
    }

    public final void onClick(View view) {
        C53198f fVar;
        C114946x xVar = this.f318925a;
        EditText editText = this.f318926b;
        if (!editText.getText().toString().isEmpty()) {
            C114756j jVar = xVar.f318930c;
            if (jVar != null) {
                String obj = editText.getText().toString();
                C53077an anVar = (C53077an) C53082as.f139099f.createBuilder();
                C53075al alVar = (C53075al) C53076am.f139090c.createBuilder();
                alVar.copyOnWrite();
                C53076am amVar = (C53076am) alVar.instance;
                obj.getClass();
                amVar.f139092a |= 1;
                amVar.f139093b = obj;
                anVar.copyOnWrite();
                C53082as asVar = (C53082as) anVar.instance;
                C53076am amVar2 = (C53076am) alVar.build();
                amVar2.getClass();
                asVar.f139103c = amVar2;
                asVar.f139102b = 1;
                C53070ag agVar = xVar.f318931d;
                agVar.getClass();
                if ((agVar.f139075a & 16) != 0) {
                    String str = agVar.f139078d;
                    anVar.copyOnWrite();
                    C53082as asVar2 = (C53082as) anVar.instance;
                    str.getClass();
                    asVar2.f139101a |= 32;
                    asVar2.f139104d = str;
                }
                C53070ag agVar2 = xVar.f318931d;
                agVar2.getClass();
                if ((agVar2.f139075a & 32) != 0) {
                    String str2 = agVar2.f139079e;
                    anVar.copyOnWrite();
                    C53082as asVar3 = (C53082as) anVar.instance;
                    str2.getClass();
                    asVar3.f139101a |= 64;
                    asVar3.f139105e = str2;
                }
                C53082as asVar4 = (C53082as) anVar.build();
                C53070ag agVar3 = xVar.f318931d;
                agVar3.getClass();
                if ((agVar3.f139075a & 64) != 0) {
                    fVar = agVar3.f139080f;
                    if (fVar == null) {
                        fVar = C53198f.f139423d;
                    }
                } else {
                    fVar = null;
                }
                ((C114860dc) jVar).mo101659d(C114919ar.m190497b(asVar4, fVar), (C114750d) null);
            }
            xVar.f318932e = true;
            xVar.f318928a.dismiss();
        }
    }
}
