package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60200dk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f */
/* compiled from: PG */
public final class C16828f {

    /* renamed from: a */
    public static final C59071e f49276a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.f");

    /* renamed from: b */
    public static final C58495hd f49277b = C58495hd.m89903q(21, C60200dk.LEFT, 20, C60200dk.DOWN, 22, C60200dk.RIGHT, 19, C60200dk.UP);

    /* renamed from: c */
    public final C16782d f49278c;

    public C16828f(C16782d dVar) {
        this.f49278c = dVar;
    }

    /* renamed from: a */
    public final void mo23049a(View view, View.OnClickListener onClickListener, Optional optional, Optional optional2) {
        ((C59052c) ((C59052c) f49276a.mo56224b()).mo56372aa(46764)).mo56386p("#addInteractionListener");
        view.setOnClickListener(onClickListener);
        view.setOnKeyListener(new C16790e(this, optional, optional2));
    }

    /* renamed from: b */
    public final void mo23050b(Optional optional, Optional optional2, C28442l lVar) {
        if (!optional.isEmpty() && !optional2.isEmpty() && ((C28439i) optional2.get()).mo33891h() == 1) {
            ((C16777c) optional.get()).mo22958b().mo33853c(lVar, (C28439i) optional2.get());
        }
    }
}
