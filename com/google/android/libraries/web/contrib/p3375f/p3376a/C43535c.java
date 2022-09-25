package com.google.android.libraries.web.contrib.p3375f.p3376a;

import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0632eu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* renamed from: com.google.android.libraries.web.contrib.f.a.c */
/* compiled from: PG */
public final class C43535c implements C43387a {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f113684a;

    /* renamed from: b */
    final /* synthetic */ C43536d f113685b;

    public C43535c(C43536d dVar, ViewGroup viewGroup) {
        this.f113685b = dVar;
        this.f113684a = viewGroup;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.webx_overflow_menu_content_description;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_more_vert_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.webx_overflow_menu_action_button;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 80191;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        C0632eu euVar = new C0632eu(this.f113684a.getContext(), view, 0);
        C0477q qVar = euVar.f2394a;
        C28452b bVar = new C28452b(iVar);
        C28452b bVar2 = new C28452b(bVar.mo33909c(90165).mo33899a(euVar));
        C58801sm G = ((C58485gu) this.f113685b.f113688c).listIterator(0);
        while (G.hasNext()) {
            C43541a aVar = (C43541a) G.next();
            if (aVar.mo46598e()) {
                qVar.mo1650c(0, aVar.mo46594a(), 0, aVar.mo46596c());
                if (aVar.mo46595b() != 0) {
                    bVar2.mo33909c(aVar.mo46595b()).mo33899a(Integer.valueOf(aVar.mo46594a()));
                }
            }
        }
        euVar.f2396c = new C43533a(this, bVar2);
        euVar.f2397d = new C43534b(bVar);
        euVar.f2395b.mo1539f();
    }
}
