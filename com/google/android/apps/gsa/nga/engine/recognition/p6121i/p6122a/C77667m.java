package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.m */
/* compiled from: PG */
public final /* synthetic */ class C77667m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77671q f213934a;

    /* renamed from: b */
    public final /* synthetic */ ac f213935b;

    public /* synthetic */ C77667m(C77671q qVar, ac acVar) {
        this.f213934a = qVar;
        this.f213935b = acVar;
    }

    public final void run() {
        C77671q qVar = this.f213934a;
        ac acVar = this.f213935b;
        C77655a aVar = qVar.f213949d;
        if (aVar != null) {
            if (aVar.f213890f.f218924a.equals(acVar)) {
                qVar.mo72764g();
            } else {
                ((C58970a) ((C58970a) C77671q.f213946a.mo56226d()).mo56372aa(4369)).mo56354G("Trying to stop session with wrong UtteranceIdentifier %s, current session identifier is %s", acVar, aVar.f213890f.f218924a);
            }
        }
    }
}
