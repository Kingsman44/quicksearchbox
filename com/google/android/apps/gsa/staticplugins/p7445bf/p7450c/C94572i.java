package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.view.View;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.i */
/* compiled from: PG */
public final /* synthetic */ class C94572i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94574k f264531a;

    /* renamed from: b */
    public final /* synthetic */ String f264532b;

    public /* synthetic */ C94572i(C94574k kVar, String str) {
        this.f264531a = kVar;
        this.f264532b = str;
    }

    public final void onClick(View view) {
        C94574k kVar = this.f264531a;
        String str = this.f264532b;
        C94575l lVar = kVar.f264540f;
        if (!str.equals(lVar.f264543c)) {
            String str2 = lVar.f264543c;
            lVar.f264543c = str;
            int i = 0;
            while (true) {
                C58485gu guVar = lVar.f264541a;
                if (i < ((C58724pq) guVar).f156474d) {
                    C94571h hVar = (C94571h) guVar.get(i);
                    if (hVar.f264525a.equals(lVar.f264543c)) {
                        hVar.f264529e = true;
                        lVar.notifyItemChanged(i);
                    } else if (hVar.f264525a.equals(str2)) {
                        hVar.f264529e = false;
                        lVar.notifyItemChanged(i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
