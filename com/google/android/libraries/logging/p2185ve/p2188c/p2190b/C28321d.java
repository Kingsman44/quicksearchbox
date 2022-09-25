package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import com.google.android.libraries.logging.p2182b.C28277h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.c.b.d */
/* compiled from: PG */
public final /* synthetic */ class C28321d implements C28277h {

    /* renamed from: a */
    public final /* synthetic */ C28326i f77005a;

    public /* synthetic */ C28321d(C28326i iVar) {
        this.f77005a = iVar;
    }

    /* renamed from: a */
    public final List mo33775a() {
        C28326i iVar = this.f77005a;
        iVar.f77012c.mo33846b();
        C28330m mVar = iVar.f77012c;
        boolean z = mVar.f77030d;
        if (iVar.f77015f >= 0) {
            return mVar.mo33845a();
        }
        if (iVar.f77017h != null) {
            return null;
        }
        iVar.f77017h = iVar.f77011b.mo33807a(new C28322e(iVar));
        C19559g.m37302a().postDelayed(iVar.f77017h, (long) (-iVar.f77015f));
        return null;
    }
}
