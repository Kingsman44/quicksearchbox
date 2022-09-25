package com.google.android.libraries.lens.view.textoverlay;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.android.libraries.lens.view.p2069am.C25334j;
import com.google.android.libraries.lens.view.p2069am.C25335k;
import com.google.android.libraries.lens.view.p2069am.C25336l;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.x */
/* compiled from: PG */
public final class C28091x {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76446a;

    public C28091x(C28093z zVar) {
        this.f76446a = zVar;
    }

    /* renamed from: a */
    public final void mo33548a() {
        C28093z zVar = this.f76446a;
        if (!zVar.f76461n) {
            C24178s sVar = zVar.f76456i;
            sVar.getClass();
            C58485gu guVar = sVar.f66070c;
            if (guVar.isEmpty()) {
                this.f76446a.f76450c.mo33537d();
                return;
            }
            int size = guVar.size();
            int i = Integer.MAX_VALUE;
            int i2 = LinearLayoutManager.INVALID_OFFSET;
            for (int i3 = 0; i3 < size; i3++) {
                int d = ((C24146d) guVar.get(i3)).mo29551d();
                i = Math.min(i, d);
                i2 = Math.max(i2, d);
            }
            C25336l lVar = (C25336l) ((C58833ax) this.f76446a.f76450c.f76420h.mo3842a()).mo56111f();
            if (lVar == null || lVar.f68959a != i || lVar.f68960b != i2) {
                C28079l lVar2 = this.f76446a.f76450c;
                C25334j jVar = (C25334j) C25336l.f68957d.createBuilder();
                jVar.copyOnWrite();
                ((C25336l) jVar.instance).f68959a = i;
                jVar.copyOnWrite();
                ((C25336l) jVar.instance).f68960b = i2;
                C25335k kVar = C25335k.USER;
                jVar.copyOnWrite();
                ((C25336l) jVar.instance).f68961c = kVar.getNumber();
                lVar2.mo33538e((C25336l) jVar.build());
            }
        }
    }
}
