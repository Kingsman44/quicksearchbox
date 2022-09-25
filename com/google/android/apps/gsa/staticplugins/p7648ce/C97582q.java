package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.q */
/* compiled from: PG */
public final /* synthetic */ class C97582q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f272601a;

    public /* synthetic */ C97582q(int i) {
        this.f272601a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f272601a;
        C58974d dVar = C97565ax.f272500a;
        C136864bd bdVar = (C136864bd) ((C136866bf) obj).toBuilder();
        bdVar.copyOnWrite();
        ((C136866bf) bdVar.instance).mo113416a().remove(Integer.valueOf(i));
        return (C136866bf) bdVar.build();
    }
}
