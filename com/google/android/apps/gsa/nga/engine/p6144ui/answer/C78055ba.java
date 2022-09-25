package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ba */
/* compiled from: PG */
public final /* synthetic */ class C78055ba implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78056bb f215011a;

    /* renamed from: b */
    public final /* synthetic */ bl f215012b;

    public /* synthetic */ C78055ba(C78056bb bbVar, bl blVar) {
        this.f215011a = bbVar;
        this.f215012b = blVar;
    }

    public final void run() {
        C78056bb bbVar = this.f215011a;
        bl blVar = this.f215012b;
        MicHandler micHandler = bbVar.f215013a;
        int d = (int) micHandler.f214929g.mo85399d(C90126fx.f251573lP);
        char c = d != 1 ? d != 2 ? (char) 1 : 3 : 2;
        if (c == 2) {
            micHandler.f214926d.mo28225e(7, true);
            if (blVar.equals(bl.c)) {
                micHandler.f214933k.mo124460b(1.0f, MicHandler.f214924b);
            } else {
                micHandler.f214933k.mo124460b(0.0f, MicHandler.f214923a);
            }
        } else if (c == 3) {
            C147785k kVar = micHandler.f214933k;
            kVar.mo124464f();
            kVar.mo124461c(1.0f);
            if (blVar.equals(bl.c)) {
                micHandler.f214926d.mo28225e(7, false);
            } else {
                micHandler.f214926d.mo28225e(1, false);
            }
        } else {
            C147785k kVar2 = micHandler.f214933k;
            kVar2.mo124464f();
            kVar2.mo124461c(0.0f);
        }
    }
}
