package com.google.apps.tiktok.p3663j.p3668b;

import androidx.p060c.C0977g;
import com.google.apps.tiktok.p3663j.p3670c.C47339b;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.apps.tiktok.p3663j.p3670c.C47345h;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.apps.tiktok.j.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C47293aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47298af f122947a;

    public /* synthetic */ C47293aa(C47298af afVar) {
        this.f122947a = afVar;
    }

    public final Object apply(Object obj) {
        C47298af afVar = this.f122947a;
        Long l = (Long) obj;
        C0977g gVar = new C0977g();
        C47341d dVar = C47341d.f123048f;
        try {
            for (C47339b bVar : afVar.mo51180a().f123052c) {
                long j = bVar.f123046d;
                C47345h hVar = bVar.f123044b;
                if (hVar == null) {
                    hVar = C47345h.f123059d;
                }
                C47304al alVar = new C47304al(hVar);
                if (j <= 0) {
                    j = l.longValue();
                }
                gVar.put(alVar, Long.valueOf(j));
            }
        } catch (IOException e) {
            afVar.mo51185f(e);
        }
        return gVar;
    }
}
