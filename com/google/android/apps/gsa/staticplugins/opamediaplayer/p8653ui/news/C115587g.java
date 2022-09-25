package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115615ac;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115641q;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115650z;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.g */
/* compiled from: PG */
public final class C115587g extends C115650z implements C28289g {

    /* renamed from: a */
    public C28293k f320661a;

    public C115587g(Context context, C115641q qVar) {
        super(context, qVar);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f320661a;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i >= 0 && i < this.f320828b.f136914b.size()) {
            C52174hz hzVar = (C52174hz) this.f320828b.f136914b.get(i);
            C115615ac acVar = (C115615ac) ghVar;
            C115466j jVar = this.f320829c;
            if (((long) i) != jVar.f320307b) {
                jVar = C115466j.f320304q;
            }
            acVar.mo102132b(i, hzVar, jVar, this.f320661a);
        }
    }
}
