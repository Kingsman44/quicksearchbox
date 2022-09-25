package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C100440g implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C100458y f280785a;

    public /* synthetic */ C100440g(C100458y yVar) {
        this.f280785a = yVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C100458y yVar = this.f280785a;
        if (i != -1) {
            ((C59052c) ((C59052c) C100458y.f280808a.mo56225c()).mo56372aa(33420)).mo56387q("Could not recover from opt-in.  Result: %d", i);
            yVar.f280821l.mo80935a();
            return false;
        } else if (!yVar.f280817h.mo79197l(C85662bm.WEB_HISTORY)) {
            ((C59052c) ((C59052c) C100458y.f280808a.mo56226d()).mo56372aa(33419)).mo56387q("Could not recover from opt-in.  Opt-in result: %d", intent.getIntExtra("opt_in_result", -1));
            yVar.f280821l.mo80935a();
            return false;
        } else {
            yVar.mo91925i();
            return true;
        }
    }
}
