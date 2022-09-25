package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.assistant.p3994s.p3995a.C53064aa;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.assistant.p3994s.p3995a.C53073aj;
import com.google.assistant.p3994s.p3995a.C53074ak;
import com.google.assistant.p3994s.p3995a.C53077an;
import com.google.assistant.p3994s.p3995a.C53082as;
import com.google.assistant.p3994s.p3995a.C53198f;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p5027o.C64966a;
import com.google.protos.p4985f.p5027o.C64969d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.o */
/* compiled from: PG */
public final /* synthetic */ class C114937o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114942t f318894a;

    public /* synthetic */ C114937o(C114942t tVar) {
        this.f318894a = tVar;
    }

    public final void onClick(View view) {
        C53198f fVar;
        C53064aa aaVar;
        C114942t tVar = this.f318894a;
        if (tVar.mo101732o()) {
            C114756j jVar = tVar.f318903d;
            if (jVar != null) {
                C53073aj ajVar = (C53073aj) C53074ak.f139084d.createBuilder();
                if (tVar.mo101733p()) {
                    C53070ag agVar = tVar.f318907h;
                    agVar.getClass();
                    if (agVar.f139076b == 2) {
                        aaVar = (C53064aa) agVar.f139077c;
                    } else {
                        aaVar = C53064aa.f139063d;
                    }
                    C64969d dVar = aaVar.f139066b;
                    if (dVar == null) {
                        dVar = C64969d.f175948d;
                    }
                    ajVar.copyOnWrite();
                    C53074ak akVar = (C53074ak) ajVar.instance;
                    dVar.getClass();
                    akVar.f139087b = dVar;
                    akVar.f139086a |= 1;
                } else {
                    C64966a aVar = (C64966a) C64969d.f175948d.createBuilder();
                    EditText editText = tVar.f318904e;
                    editText.getClass();
                    String obj = editText.getText().toString();
                    aVar.copyOnWrite();
                    C64969d dVar2 = (C64969d) aVar.instance;
                    obj.getClass();
                    dVar2.f175950a |= 2;
                    dVar2.f175951b = obj;
                    C64969d dVar3 = (C64969d) aVar.build();
                    ajVar.copyOnWrite();
                    C53074ak akVar2 = (C53074ak) ajVar.instance;
                    dVar3.getClass();
                    akVar2.f139087b = dVar3;
                    akVar2.f139086a |= 1;
                }
                EditText editText2 = tVar.f318905f;
                editText2.getClass();
                String obj2 = editText2.getText().toString();
                C58485gu lD = C58485gu.m89842j(tVar.f318901b.f318881b).mo55401lD();
                int size = lD.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) lD.get(i);
                    if (!str.isEmpty()) {
                        ajVar.mo53959a(str);
                    }
                }
                if (!obj2.isEmpty()) {
                    ajVar.mo53959a(obj2);
                }
                C53077an anVar = (C53077an) C53082as.f139099f.createBuilder();
                anVar.copyOnWrite();
                C53082as asVar = (C53082as) anVar.instance;
                C53074ak akVar3 = (C53074ak) ajVar.build();
                akVar3.getClass();
                asVar.f139103c = akVar3;
                asVar.f139102b = 2;
                C53070ag agVar2 = tVar.f318907h;
                agVar2.getClass();
                if ((agVar2.f139075a & 16) != 0) {
                    String str2 = agVar2.f139078d;
                    anVar.copyOnWrite();
                    C53082as asVar2 = (C53082as) anVar.instance;
                    str2.getClass();
                    asVar2.f139101a |= 32;
                    asVar2.f139104d = str2;
                }
                C53070ag agVar3 = tVar.f318907h;
                agVar3.getClass();
                if ((agVar3.f139075a & 32) != 0) {
                    String str3 = agVar3.f139079e;
                    anVar.copyOnWrite();
                    C53082as asVar3 = (C53082as) anVar.instance;
                    str3.getClass();
                    asVar3.f139101a |= 64;
                    asVar3.f139105e = str3;
                }
                C53082as asVar4 = (C53082as) anVar.build();
                C53070ag agVar4 = tVar.f318907h;
                agVar4.getClass();
                if ((agVar4.f139075a & 64) != 0) {
                    fVar = agVar4.f139080f;
                    if (fVar == null) {
                        fVar = C53198f.f139423d;
                    }
                } else {
                    fVar = null;
                }
                ((C114860dc) jVar).mo101659d(C114919ar.m190497b(asVar4, fVar), (C114750d) null);
            }
            tVar.f318908i = true;
            tVar.f318900a.dismiss();
        }
    }
}
