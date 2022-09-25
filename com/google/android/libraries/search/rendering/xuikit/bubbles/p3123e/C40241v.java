package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40130b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40132d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40152x;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40153y;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40223f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40251e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.v */
/* compiled from: PG */
public final /* synthetic */ class C40241v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40165ak f105707a;

    /* renamed from: b */
    public final /* synthetic */ float f105708b;

    /* renamed from: c */
    public final /* synthetic */ float f105709c;

    public /* synthetic */ C40241v(C40165ak akVar, float f, float f2) {
        this.f105707a = akVar;
        this.f105708b = f;
        this.f105709c = f2;
    }

    public final void run() {
        C40248b bVar;
        float f;
        C40165ak akVar = this.f105707a;
        float f2 = this.f105708b;
        float f3 = this.f105709c;
        if (akVar.f105511r == null || akVar.f105512s == null) {
            ((C59052c) ((C59052c) C40165ak.f105489a.mo56225c()).mo56372aa(53240)).mo56386p("onDragEnd: called without onCreate()");
            return;
        }
        C40223f a = akVar.f105515v.mo42292a(akVar.f105517x);
        akVar.mo42277h();
        if (akVar.mo42283n()) {
            if (a == C40223f.NONE) {
                C40137i iVar = akVar.f105512s;
                ((C59052c) ((C59052c) C40137i.f105420a.mo56224b()).mo56372aa(53261)).mo56390t("snapToScreenEdgeWithVelocity(%f, %f)", f2, f3);
                if (Math.hypot((double) f2, (double) f3) < 1500.0d) {
                    bVar = iVar.mo42243d(iVar.f105431l.mo42220a());
                    iVar.mo42246g(bVar);
                } else {
                    float b = f2 > 0.0f ? iVar.f105431l.f105403b.f397999e + (((float) iVar.mo42241b()) / 2.0f) : iVar.f105431l.f105403b.f397998d - (((float) iVar.mo42241b()) / 2.0f);
                    C40247a aVar = new C40247a(b, iVar.f105431l.mo42220a().mo42348b() + (((b - iVar.f105431l.mo42220a().mo42347a()) / f2) * f3));
                    if (f3 > 0.0f) {
                        f = iVar.f105431l.f105404c.f397999e + (((float) iVar.mo42240a()) / 2.0f);
                    } else {
                        f = iVar.f105431l.f105404c.f397998d - (((float) iVar.mo42240a()) / 2.0f);
                    }
                    C40248b d = iVar.mo42243d(C40251e.m69866c(C58485gu.m89847o(aVar, new C40247a(iVar.f105431l.mo42220a().mo42347a() + (((f - iVar.f105431l.mo42220a().mo42348b()) / f3) * f2), f)), iVar.f105431l.mo42220a()));
                    C40130b bVar2 = iVar.f105431l;
                    C40247a aVar2 = new C40247a(f2, f3);
                    C147454r rVar = C40137i.f105422c;
                    C40247a aVar3 = (C40247a) d;
                    bVar2.f105403b.mo124183i(aVar2.f105717a).mo124173c(rVar).mo124174a(aVar3.f105717a);
                    bVar2.f105404c.mo124183i(aVar2.f105718b).mo124173c(rVar).mo124174a(aVar3.f105718b);
                    bVar = d;
                }
                C40137i iVar2 = akVar.f105512s;
                iVar2.f105424e.mo42256c(iVar2, iVar2.mo42242c(bVar));
                iVar2.f105424e.mo42257d(iVar2);
                return;
            }
            C40137i iVar3 = akVar.f105512s;
            iVar3.f105424e.mo42257d(iVar3);
            if (a == C40223f.DROP) {
                C28443m mVar = akVar.f105505l;
                C28442l a2 = C28442l.m53138d().mo33894a();
                C28439i iVar4 = akVar.f105517x.f105747b;
                iVar4.getClass();
                mVar.mo33853c(a2, iVar4);
            }
            C40153y yVar = akVar.f105492C;
            ((C40132d) yVar).f105409a.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).withEndAction(C47810es.m84977q(new C40152x(yVar, a))).start();
        }
    }
}
