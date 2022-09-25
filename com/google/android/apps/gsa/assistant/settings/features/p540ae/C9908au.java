package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50286rl;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.au */
/* compiled from: PG */
public final /* synthetic */ class C9908au implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C50264qq f33995a;

    public /* synthetic */ C9908au(C50264qq qqVar) {
        this.f33995a = qqVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C50286rl rlVar;
        C50264qq qqVar = this.f33995a;
        C50286rl b = ((C73748d) obj).mo65220b();
        C50266qs qsVar = qqVar.f130715e;
        if (qsVar == null) {
            qsVar = C50266qs.f130716c;
        }
        if (qsVar.f130718a == 1) {
            rlVar = C50286rl.m85798a(((Integer) qsVar.f130719b).intValue());
            if (rlVar == null) {
                rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
            }
        } else {
            rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
        }
        if (b == rlVar) {
            return true;
        }
        return false;
    }
}
