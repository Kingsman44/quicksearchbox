package com.google.android.apps.gsa.sidekick.main.actions;

import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7963ql;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.k */
/* compiled from: PG */
public class C91252k extends C91253l {

    /* renamed from: b */
    private final C91306ak f254687b;

    public C91252k(C91376f fVar, C91306ak akVar, C7718hj hjVar, C7708h hVar, C21370a aVar) {
        super(fVar, hjVar, hVar, aVar);
        this.f254687b = akVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C7963ql qlVar) {
        super.onPostExecute(qlVar);
        if (qlVar != null) {
            this.f254687b.mo85594g();
        }
    }
}
