package com.google.android.libraries.search.video.lightbox;

import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.video.p3191a.C41448g;
import com.google.android.libraries.search.video.p3191a.C41450i;
import com.google.android.libraries.search.video.p3191a.C41451j;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.android.libraries.search.video.p3194d.C41497h;
import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.android.libraries.search.video.p3194d.C41501l;
import com.google.android.libraries.search.video.p3196f.C41512f;
import com.google.android.libraries.search.video.p3196f.C41520n;
import com.google.android.libraries.search.video.p3196f.C41521o;
import com.google.android.libraries.search.video.players.C41548a;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.android.libraries.search.video.players.C41593x;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57127ak;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b;
import dagger.p5294a.C68221g;
import java.util.UUID;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.lightbox.r */
/* compiled from: PG */
public final class C41539r {

    /* renamed from: a */
    public final C41593x f108557a;

    /* renamed from: b */
    public final C41548a f108558b;

    /* renamed from: c */
    public final C57177h f108559c;

    /* renamed from: d */
    public final C41532k f108560d;

    /* renamed from: e */
    public final C28306ab f108561e;

    /* renamed from: f */
    public final C28443m f108562f;

    /* renamed from: g */
    public final C65584b f108563g;

    /* renamed from: h */
    public final C47770dh f108564h;

    /* renamed from: i */
    C41592w f108565i;

    /* renamed from: j */
    public int f108566j;

    /* renamed from: k */
    public final C41500k f108567k;

    /* renamed from: l */
    final C41451j f108568l;

    /* renamed from: m */
    public C41526e f108569m;

    /* renamed from: n */
    final C41520n f108570n;

    public C41539r(C41532k kVar, C41448g gVar, C65584b bVar, C41593x xVar, C41548a aVar, C41521o oVar, C41501l lVar, C41454m mVar, C28306ab abVar, C28443m mVar2, C41451j jVar, C47770dh dhVar) {
        this.f108557a = xVar;
        this.f108558b = aVar;
        Fragment fragment = (Fragment) ((C68221g) oVar.f108520a).f184583a;
        fragment.getClass();
        C41454m mVar3 = (C41454m) oVar.f108521b.mo17428b();
        mVar3.getClass();
        C47449e eVar = (C47449e) oVar.f108522c.mo17428b();
        eVar.getClass();
        C41512f fVar = (C41512f) oVar.f108523d.mo17428b();
        fVar.getClass();
        this.f108570n = new C41520n(fragment, mVar3, eVar, fVar);
        this.f108560d = kVar;
        C57177h hVar = bVar.f178260b;
        hVar = hVar == null ? C57177h.f152644k : hVar;
        this.f108559c = hVar;
        this.f108561e = abVar;
        this.f108562f = mVar2;
        this.f108563g = bVar;
        this.f108568l = jVar;
        this.f108564h = dhVar;
        C41450i iVar = (C41450i) jVar.f108262a.get(UUID.fromString(bVar.f178261c));
        if (iVar != null) {
            gVar.mo43980a(iVar);
        } else {
            gVar.mo43980a(C41450i.f108261a);
        }
        if (iVar == null || !iVar.mo43966b().isPresent()) {
            C57127ak akVar = (C57127ak) C57128al.f152495c.createBuilder();
            C57194y yVar = hVar.f152648b;
            yVar = yVar == null ? C57194y.f152692i : yVar;
            akVar.copyOnWrite();
            C57128al alVar = (C57128al) akVar.instance;
            yVar.getClass();
            alVar.f152498b = yVar;
            alVar.f152497a = 1;
            this.f108567k = lVar.mo44025a((C57128al) akVar.build(), C41536o.f108554a);
            return;
        }
        C57127ak akVar2 = (C57127ak) C57128al.f152495c.createBuilder();
        C57194y yVar2 = hVar.f152648b;
        yVar2 = yVar2 == null ? C57194y.f152692i : yVar2;
        akVar2.copyOnWrite();
        C57128al alVar2 = (C57128al) akVar2.instance;
        yVar2.getClass();
        alVar2.f152498b = yVar2;
        alVar2.f152497a = 1;
        this.f108567k = lVar.mo44025a((C57128al) akVar2.build(), new C41535n(this, mVar, iVar));
    }

    /* renamed from: e */
    private final void m72615e(boolean z) {
        int i = true != z ? 0 : 8;
        C41520n nVar = this.f108570n;
        ImageView imageView = nVar.f108515m;
        TextView textView = nVar.f108513k;
        TextView textView2 = nVar.f108514l;
        LinearLayout linearLayout = nVar.f108516n;
        TextView textView3 = nVar.f108517o;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        if (textView != null) {
            textView.setVisibility(i);
        }
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
        if (linearLayout != null && textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
            linearLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo44059a() {
        m72615e(true);
        ViewGroup viewGroup = this.f108570n.f108511i;
        viewGroup.getClass();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo44060b() {
        float f;
        m72615e(false);
        ViewGroup viewGroup = this.f108570n.f108511i;
        float f2 = this.f108560d.getContext().getResources().getDisplayMetrics().density;
        int i = this.f108560d.getContext().getResources().getDisplayMetrics().heightPixels;
        float f3 = (float) this.f108560d.getContext().getResources().getDisplayMetrics().widthPixels;
        C57194y yVar = this.f108559c.f152648b;
        if (yVar == null) {
            yVar = C57194y.f152692i;
        }
        if (yVar.f152697d > 0.0f) {
            C57194y yVar2 = this.f108559c.f152648b;
            if (yVar2 == null) {
                yVar2 = C57194y.f152692i;
            }
            f = yVar2.f152697d;
        } else {
            f = 1.7777778f;
        }
        viewGroup.getClass();
        viewGroup.getLayoutParams().height = Math.min((int) (((float) i) - (f2 * 250.0f)), (int) (f3 / f));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo44061c(boolean z) {
        C41526e eVar = this.f108569m;
        if (eVar != null) {
            int i = eVar.f108539a.getResources().getConfiguration().orientation;
            if (z) {
                if (i != 2) {
                    eVar.f108539a.setRequestedOrientation(0);
                    eVar.f108539a.getWindow().getDecorView().setSystemUiVisibility(5894);
                }
            } else if (i != 1) {
                eVar.f108539a.setRequestedOrientation(10);
                eVar.f108539a.getWindow().getDecorView().setSystemUiVisibility(1);
            }
        }
    }

    /* renamed from: d */
    public final void mo44062d(int i) {
        C41500k kVar = this.f108567k;
        if (kVar != null) {
            C41592w wVar = this.f108565i;
            C41497h hVar = kVar.f108426a;
            if (wVar != null) {
                hVar.mo44021c(i, wVar.mo44083f());
            } else {
                hVar.mo44021c(i, Optional.empty());
            }
        }
    }
}
