package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60200dk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e */
/* compiled from: PG */
public final /* synthetic */ class C16790e implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C16828f f49130a;

    /* renamed from: b */
    public final /* synthetic */ Optional f49131b;

    /* renamed from: c */
    public final /* synthetic */ Optional f49132c;

    public /* synthetic */ C16790e(C16828f fVar, Optional optional, Optional optional2) {
        this.f49130a = fVar;
        this.f49131b = optional;
        this.f49132c = optional2;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C16828f fVar = this.f49130a;
        Optional optional = this.f49131b;
        Optional optional2 = this.f49132c;
        ((C59052c) ((C59052c) C16828f.f49276a.mo56224b()).mo56372aa(46766)).mo56389s("dispatchKeyEvent: %s", keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            fVar.mo23050b(optional, optional2, C28442l.m53136b().mo33894a());
            fVar.f49278c.mo20956e();
            return true;
        } else if ((keyCode != 19 && keyCode != 20) || keyEvent.getSource() == 1048584 || keyEvent.getAction() != 1) {
            return false;
        } else {
            C60200dk dkVar = (C60200dk) C16828f.f49277b.get(Integer.valueOf(keyEvent.getKeyCode()));
            dkVar.getClass();
            C28440j jVar = new C28440j(25);
            jVar.mo33895b(C28442l.m53143i(dkVar));
            fVar.mo23050b(optional, optional2, jVar.mo33894a());
            fVar.f49278c.mo20956e();
            return true;
        }
    }
}
