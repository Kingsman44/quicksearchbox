package com.google.android.apps.gsa.staticplugins.p7388al;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7286a.C92356a;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.r */
/* compiled from: PG */
public final /* synthetic */ class C93944r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C93945s f262355a;

    /* renamed from: b */
    public final /* synthetic */ l f262356b;

    /* renamed from: c */
    public final /* synthetic */ String f262357c;

    /* renamed from: d */
    public final /* synthetic */ C92391o f262358d;

    public /* synthetic */ C93944r(C93945s sVar, l lVar, String str, C92391o oVar) {
        this.f262355a = sVar;
        this.f262356b = lVar;
        this.f262357c = str;
        this.f262358d = oVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C93945s sVar = this.f262355a;
        l lVar = this.f262356b;
        String str = this.f262357c;
        C92391o oVar = this.f262358d;
        C92356a aVar = sVar.f262360b;
        C92361a aVar2 = C92361a.CAN_ENROLL_CHECK;
        sVar.f262361c.e();
        boolean a = aVar.mo87003a(lVar, aVar2, str, oVar, false);
        C58976aa aaVar = C58975e.f156826a;
        lVar.d();
        C90877ak.m148472f(lVar.d);
        return Boolean.valueOf(a);
    }
}
