package com.google.android.apps.search.googleapp.stampviewer.webview.p10511h;

import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.p10497i.C139425d;
import com.google.android.apps.search.googleapp.stampviewer.p10497i.p10498a.C139420b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.p4242bp.p4253e.p4254a.C56197q;
import com.google.p4242bp.p4253e.p4254a.C56198r;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.h.c */
/* compiled from: PG */
final class C139621c implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C139622d f379536a;

    public C139621c(C139622d dVar) {
        this.f379536a = dVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.stamp_viewer_actionbutton_share;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_share_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.googleapp_stamp_viewer_actionbutton_share;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 105789;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        C139622d dVar = this.f379536a;
        if (dVar.f379542f) {
            if (dVar.f379546j && !dVar.f379547k) {
                dVar.f379545i.mo19974a(C37182a.f98042fI);
                dVar.f379547k = true;
            }
            C139622d dVar2 = this.f379536a;
            C139420b bVar = dVar2.f379539c;
            C139392b bVar2 = dVar2.f379544h;
            C56197q qVar = (C56197q) C56198r.f149726e.createBuilder();
            C56610b bVar3 = bVar2.f379032b;
            if (bVar3 == null) {
                bVar3 = C56610b.f151140k;
            }
            String str = bVar3.f151143b;
            qVar.copyOnWrite();
            C56198r rVar = (C56198r) qVar.instance;
            str.getClass();
            rVar.f149728a |= 1;
            rVar.f149729b = str;
            if ((bVar3.f151142a & 256) != 0) {
                C56192l lVar = bVar3.f151149h;
                if (lVar == null) {
                    lVar = C56192l.f149716c;
                }
                qVar.copyOnWrite();
                C56198r rVar2 = (C56198r) qVar.instance;
                lVar.getClass();
                rVar2.f149730c = lVar;
                rVar2.f149728a |= 2;
            }
            C56622n nVar = bVar3.f151150i;
            if (nVar == null) {
                nVar = C56622n.f151177e;
            }
            if ((1 & nVar.f151179a) != 0) {
                C56622n nVar2 = bVar3.f151150i;
                if (nVar2 == null) {
                    nVar2 = C56622n.f151177e;
                }
                C56182b bVar4 = nVar2.f151180b;
                if (bVar4 == null) {
                    bVar4 = C56182b.f149689f;
                }
                C56182b a = C139425d.m226559a(bVar4);
                qVar.copyOnWrite();
                C56198r rVar3 = (C56198r) qVar.instance;
                a.getClass();
                rVar3.f149731d = a;
                rVar3.f149728a |= 4;
            }
            C60870cx q = C60856cj.m92908q(bVar.mo114956a((C56198r) qVar.build()), dVar2.f379543g.toMillis(), TimeUnit.MILLISECONDS, dVar2.f379541e);
            C46439e eVar = dVar2.f379540d;
            C46438d dVar3 = new C46438d(q);
            C56610b bVar5 = dVar2.f379544h.f379032b;
            if (bVar5 == null) {
                bVar5 = C56610b.f151140k;
            }
            eVar.mo50445g(dVar3, new C46436b(bVar5.f151143b), dVar2.mo115104a());
            return;
        }
        C56610b bVar6 = dVar.f379544h.f379032b;
        if (bVar6 == null) {
            bVar6 = C56610b.f151140k;
        }
        dVar.mo115106c(bVar6.f151143b);
    }
}
