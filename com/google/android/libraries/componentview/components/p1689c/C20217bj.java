package com.google.android.libraries.componentview.components.p1689c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.p4522b.C58495hd;
import com.google.p4271bq.C56429h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.bj */
/* compiled from: PG */
final class C20217bj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ long f56773a;

    /* renamed from: b */
    final /* synthetic */ C20218bk f56774b;

    public C20217bj(C20218bk bkVar, long j) {
        this.f56774b = bkVar;
        this.f56773a = j;
    }

    public final void onAnimationEnd(Animator animator) {
        C20218bk bkVar = this.f56774b;
        long j = this.f56773a;
        C20219bl blVar = new C20219bl(true, new ArrayList());
        bkVar.f56779e = false;
        boolean z = !bkVar.f56778d;
        for (C20220bm c : bkVar.mo25293a()) {
            C20219bl c2 = c.mo25297c(z);
            blVar.f56782a &= c2.f56782a;
            blVar.f56783b.addAll(c2.f56783b);
        }
        if (blVar.f56782a) {
            bkVar.f56778d = true ^ bkVar.f56778d;
            List list = blVar.f56783b;
            C20601ca caVar = bkVar.f56775a;
            C56429h hVar = bkVar.f56776b;
            String str = null;
            String str2 = hVar != null ? hVar.f150556h : null;
            String a = C20585bl.m38624a(list);
            C56429h hVar2 = bkVar.f56776b;
            C20601ca caVar2 = bkVar.f56775a;
            if (hVar2 == null && list.isEmpty()) {
                C20614e eVar = new C20614e();
                eVar.mo25535e(C19742a.EMPTY_GRAFT);
                eVar.f57822b = "logInfo is null or grafts is empty, eventId returned null!";
                C20520h.m38498c("LoggerHelper", eVar.mo25531a(), caVar2, new Object[0]);
            } else if (hVar2 != null) {
                str = hVar2.f150557i;
            } else {
                C56429h hVar3 = ((C20585bl) list.get(0)).f57786a;
                if (hVar3 != null) {
                    str = hVar3.f150557i;
                }
            }
            caVar.mo25489d(str2, a, str, bkVar.mo25299e(z));
        }
        if (bkVar.f56781g != null && bkVar.f56778d) {
            C20610cj cjVar = bkVar.f56777c;
            String valueOf = String.valueOf(bkVar.mo25296b() - bkVar.f56780f);
            String str3 = bkVar.f56781g;
            str3.getClass();
            cjVar.mo25491a("CardHeightChanged", C58495hd.m89902p("height_diff", valueOf, "CardId", str3, "animation_duration", String.valueOf(j)));
        }
    }
}
