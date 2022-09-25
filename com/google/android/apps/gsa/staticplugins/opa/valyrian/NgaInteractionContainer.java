package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.app.Activity;
import android.support.p033v7.app.C0395p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.api.a.ba;
import com.google.android.apps.gsa.nga.api.a.bc;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.api.p5883a.C74671aw;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82194a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82195b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90090eo;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8202d.p8203a.C106318a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl.SidePanelFragmentHostImpl;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.p3505b.C44534d;

/* compiled from: PG */
public class NgaInteractionContainer implements C2376g {

    /* renamed from: a */
    public final C113931af f315461a;

    /* renamed from: b */
    public final C113931af f315462b;

    /* renamed from: c */
    public final boolean f315463c;

    /* renamed from: d */
    public boolean f315464d = true;

    /* renamed from: e */
    public boolean f315465e = false;

    /* renamed from: f */
    public final C106318a f315466f;

    /* renamed from: g */
    public final SidePanelFragmentHostImpl f315467g;

    /* renamed from: h */
    private final FrameLayout f315468h;

    /* renamed from: i */
    private final C22871g f315469i;

    /* renamed from: j */
    private final boolean f315470j;

    /* renamed from: k */
    private final C82194a f315471k;

    /* renamed from: l */
    private final C83363m f315472l = new C83363m();

    /* renamed from: m */
    private ImageView f315473m;

    /* renamed from: n */
    private View f315474n;

    public NgaInteractionContainer(FrameLayout frameLayout, C113931af afVar, C113931af afVar2, Activity activity, C82195b bVar, C86124t tVar, C106318a aVar, C22871g gVar, boolean z) {
        this.f315468h = frameLayout;
        this.f315461a = afVar;
        this.f315462b = afVar2;
        this.f315466f = aVar;
        this.f315469i = gVar;
        this.f315470j = z;
        this.f315463c = tVar.mo79746e(C90090eo.f250537b);
        this.f315471k = bVar.mo75537a(frameLayout.getContext());
        Window window = activity.getWindow();
        C0395p pVar = (C0395p) activity;
        C2384o lifecycle = pVar.getLifecycle();
        window.getClass();
        lifecycle.getClass();
        this.f315467g = new SidePanelFragmentHostImpl(window, frameLayout, lifecycle);
        pVar.getLifecycle().mo5790b(this);
    }

    /* renamed from: g */
    public final void mo100776g(bf bfVar) {
        ImageView imageView = this.f315473m;
        if (imageView != null && this.f315474n != null) {
            boolean z = true;
            boolean z2 = !this.f315465e && this.f315464d;
            int a = C74671aw.m120738a(bfVar.e);
            int i = 8;
            imageView.setVisibility((a != 0 && a == 2 && z2) ? 0 : 8);
            View view = this.f315474n;
            ba baVar = bfVar.f;
            if (baVar == null) {
                baVar = ba.e;
            }
            int a2 = C74671aw.m120738a(baVar.b);
            if (a2 != 0 && a2 == 2 && z2) {
                i = 0;
            }
            view.setVisibility(i);
            ba baVar2 = bfVar.f;
            if (baVar2 == null) {
                baVar2 = ba.e;
            }
            bc a3 = bc.a(baVar2.d);
            if (a3 == null) {
                a3 = bc.a;
            }
            C82194a.m130505d(this.f315474n, a3);
            View view2 = this.f315474n;
            ba baVar3 = bfVar.f;
            if (baVar3 == null) {
                baVar3 = ba.e;
            }
            int a4 = C74671aw.m120738a(baVar3.c);
            if (a4 == 0 || a4 != 2 || !z2) {
                z = false;
            }
            C82194a.m130506e(view2, z);
            this.f315474n.setOnClickListener(new C89943l(new C113930ae(this)));
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f315463c) {
            SidePanelFragmentHostImpl sidePanelFragmentHostImpl = this.f315467g;
            sidePanelFragmentHostImpl.f353665c.mo5790b(sidePanelFragmentHostImpl);
        } else if (mo100778i()) {
            C82194a aVar = this.f315471k;
            ImageView g = C82194a.m130508g(LayoutInflater.from(aVar.f224653a), this.f315468h);
            this.f315473m = g;
            this.f315468h.addView(g);
            ImageView imageView = this.f315473m;
            C28292j jVar = new C28292j(33439);
            jVar.mo33795i(5);
            C28295m.m52919e(imageView, jVar);
            this.f315473m.setOnClickListener(new C89943l(new C113928ac(this)));
            FrameLayout frameLayout = this.f315468h;
            View c = C82194a.m130504c(LayoutInflater.from(frameLayout.getContext()), frameLayout, bc.b);
            this.f315474n = c;
            this.f315468h.addView(c);
            if (C44534d.m78715b()) {
                C82194a.m130510i(this.f315474n, 1);
                C82194a.m130507f(this.f315473m, 1);
            } else {
                C82194a.m130510i(this.f315474n, 2);
                C82194a.m130507f(this.f315473m, 2);
            }
            View view = this.f315474n;
            C28292j jVar2 = new C28292j(111938);
            jVar2.mo33795i(5);
            C28295m.m52919e(view, jVar2);
            this.f315472l.mo76662b(this.f315466f.f296619a, new C83369s(this.f315469i, "ngaToOpaCardState", new C113929ad(this)));
            mo100776g((bf) ((C83361k) this.f315466f.f296619a).f227199b.get());
        }
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f315472l.mo76661a();
        vVar.getLifecycle().mo5791c(this);
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final void mo100777h() {
        if (!this.f315464d || this.f315465e) {
            this.f315467g.f353666d.setVisibility(8);
        } else {
            this.f315467g.f353666d.setVisibility(0);
        }
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final boolean mo100778i() {
        return !this.f315463c && this.f315470j;
    }
}
