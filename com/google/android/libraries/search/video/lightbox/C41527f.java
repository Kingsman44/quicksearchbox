package com.google.android.libraries.search.video.lightbox;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.video.p3196f.C41511e;
import com.google.android.libraries.search.video.p3196f.C41519m;
import com.google.android.libraries.search.video.p3196f.C41520n;
import com.google.android.libraries.search.video.players.C41548a;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.android.libraries.search.video.players.C41593x;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.search.video.lightbox.f */
/* compiled from: PG */
public final class C41527f extends C41528g implements C45987ay {

    /* renamed from: a */
    public final VideoLightboxActivity f108540a;

    /* renamed from: b */
    public C28439i f108541b;

    /* renamed from: c */
    final C41526e f108542c;

    /* renamed from: e */
    private final C28306ab f108543e;

    public C41527f(VideoLightboxActivity videoLightboxActivity, C45989b bVar, C28306ab abVar) {
        this.f108540a = videoLightboxActivity;
        this.f108543e = abVar;
        this.f108542c = new C41526e(videoLightboxActivity);
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C41592w wVar;
        C41511e eVar;
        TextView textView;
        LinearLayout linearLayout;
        Intent intent = this.f108540a.getIntent();
        try {
            AccountId accountId = awVar.f120815a.f120816a;
            C41532k kVar = new C41532k();
            C68324h.m98669f(kVar);
            C47247a.m84047b(kVar, accountId);
            C47243l.m84039a(kVar, (C65584b) ProtoParsers.m95519b(intent, "lightbox_fragment_args_proto", C65584b.f178257d, C62921ba.m95368a()));
            C0154a aVar = new C0154a(this.f108540a.f727a.f739a.f744e);
            aVar.mo689v(16908290, kVar, "VideoLightboxFragment");
            aVar.mo509f();
            C41539r f = kVar.mo17754z();
            f.f108569m = this.f108542c;
            if (f.f108565i == null) {
                C57177h hVar = f.f108559c;
                if ((hVar.f152647a & 512) != 0) {
                    C41548a aVar2 = f.f108558b;
                    ViewGroup viewGroup = f.f108570n.f108510h;
                    viewGroup.getClass();
                    C57194y yVar = hVar.f152648b;
                    if (yVar == null) {
                        yVar = C57194y.f152692i;
                    }
                    C57143b bVar = f.f108559c.f152656j;
                    if (bVar == null) {
                        bVar = C57143b.f152527m;
                    }
                    wVar = aVar2.mo44076b(viewGroup, yVar, bVar);
                } else {
                    C41593x xVar = f.f108557a;
                    ViewGroup viewGroup2 = f.f108570n.f108510h;
                    viewGroup2.getClass();
                    C57194y yVar2 = hVar.f152648b;
                    if (yVar2 == null) {
                        yVar2 = C57194y.f152692i;
                    }
                    wVar = xVar.mo44078d(viewGroup2, yVar2);
                }
                f.f108565i = wVar;
                C41520n nVar = f.f108570n;
                C57177h hVar2 = f.f108559c;
                C41592w wVar2 = f.f108565i;
                TextView textView2 = nVar.f108513k;
                if (textView2 != null) {
                    textView2.setText(hVar2.f152653g);
                }
                TextView textView3 = nVar.f108514l;
                if (textView3 != null) {
                    String str = hVar2.f152649c;
                    if (!hVar2.f152651e.isEmpty()) {
                        if (!str.isEmpty()) {
                            str = str + " " + C41520n.f108504b + " ";
                        }
                        str = String.valueOf(str).concat(String.valueOf(hVar2.f152651e));
                    }
                    if (!hVar2.f152652f.isEmpty()) {
                        if (!str.isEmpty()) {
                            str = str + " " + C41520n.f108504b + " ";
                        }
                        str = String.valueOf(str).concat(String.valueOf(hVar2.f152652f));
                    }
                    textView3.setText(str);
                    if (!hVar2.f152650d.isEmpty()) {
                        C6007z zVar = (C6007z) nVar.f108506d.mo51286a().mo11864b().mo12445g(Uri.parse(hVar2.f152650d)).mo11955H();
                        zVar.mo12455s(new C41519m(nVar), (C5592i) null, zVar, C5622i.f16959a);
                    }
                }
                if (!((hVar2.f152647a & 128) == 0 || hVar2.f152654h.isEmpty() || (textView = nVar.f108517o) == null)) {
                    textView.setText(hVar2.f152654h);
                    Context context = nVar.f108505c.getContext();
                    context.getClass();
                    if (context.getResources().getConfiguration().orientation == 1 && (linearLayout = nVar.f108516n) != null) {
                        linearLayout.setVisibility(0);
                    }
                }
                nVar.f108512j = wVar2;
                C41592w wVar3 = nVar.f108512j;
                if (wVar3 != null) {
                    wVar3.mo44085h(nVar);
                    nVar.f108512j.mo44086i();
                    nVar.mo44046b(1);
                }
                if (!((hVar2.f152647a & 512) == 0 || (eVar = nVar.f108509g) == null)) {
                    C57143b bVar2 = hVar2.f152656j;
                    if (bVar2 == null) {
                        bVar2 = C57143b.f152527m;
                    }
                    eVar.mo44035a(bVar2, wVar2);
                }
                C41592w wVar4 = f.f108565i;
                wVar4.getClass();
                wVar4.mo44084g(f.f108567k);
                C41592w wVar5 = f.f108565i;
                wVar5.getClass();
                wVar5.mo44095r(new C41533l(f));
            }
            C41592w wVar6 = f.f108565i;
            wVar6.getClass();
            wVar6.mo44087j();
        } catch (C62974ct e) {
            throw new IllegalArgumentException("VideoLightboxActivity launched with malformed LightBoxVideo data", e);
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f108541b = null;
        this.f108540a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f108543e.f76990a.mo33805a(C28427h.m53115a(132134));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(132214));
        C28306ab abVar = this.f108543e;
        VideoLightboxActivity videoLightboxActivity = this.f108540a;
        int i = C28485y.f77298f;
        this.f108541b = abVar.mo33801b(videoLightboxActivity.mo1322k().mo1177e(16908290), a);
    }
}
