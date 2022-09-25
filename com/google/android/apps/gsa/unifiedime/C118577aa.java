package com.google.android.apps.gsa.unifiedime;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.voiceime.C118695g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.unifiedime.aa */
/* compiled from: PG */
final class C118577aa extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C118579ac f330818a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118577aa(C118579ac acVar) {
        super("ScheduledSpeechLevelUpdateTask", 2, 0);
        this.f330818a = acVar;
    }

    public final void run() {
        C118695g gVar;
        C118579ac acVar = this.f330818a;
        if (acVar.f330840u == null || (gVar = acVar.f330834o) == null || !gVar.f331095c) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        try {
            int max = Math.max(((C90758bb) acVar.f330826g.mo27525b()).f253832a.get(), 0);
            C58976aa aaVar2 = C58975e.f156826a;
            C118595m mVar = this.f330818a.f330840u;
            Parcel gA = mVar.mo17260gA();
            gA.writeInt(max);
            mVar.mo17263hf(4, gA);
            C118579ac acVar2 = this.f330818a;
            acVar2.f330838s = ((C90929bz) acVar2.f330824e.mo27525b()).mo85137b(this.f330818a.f330839t, 50);
        } catch (Exception unused) {
            C59104x d = C118579ac.f330820a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) d).mo56372aa(34021)).mo56386p("Exception updating speech level.");
        }
    }
}
