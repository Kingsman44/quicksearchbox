package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.View;
import com.google.android.apps.search.googleapp.p10139b.C133489e;
import com.google.android.apps.search.googleapp.search.suggest.C138016ah;
import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.n */
/* compiled from: PG */
public final /* synthetic */ class C138661n implements C133489e {

    /* renamed from: a */
    public final /* synthetic */ C138662o f377151a;

    /* renamed from: b */
    public final /* synthetic */ C138030av f377152b;

    /* renamed from: c */
    public final /* synthetic */ View f377153c;

    public /* synthetic */ C138661n(C138662o oVar, C138030av avVar, View view) {
        this.f377151a = oVar;
        this.f377152b = avVar;
        this.f377153c = view;
    }

    /* renamed from: a */
    public final boolean mo111191a(View view) {
        C138662o oVar = this.f377151a;
        C138030av avVar = this.f377152b;
        View view2 = this.f377153c;
        String string = oVar.f377154a.getString(R.string.googleapp_access_google_now_message);
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(string, "message");
        C138016ah ahVar = (C138016ah) C138019ak.f375490i.createBuilder();
        ahVar.copyOnWrite();
        C138019ak akVar = (C138019ak) ahVar.instance;
        avVar.getClass();
        akVar.f375493b = avVar;
        akVar.f375492a |= 1;
        ahVar.copyOnWrite();
        C138019ak akVar2 = (C138019ak) ahVar.instance;
        akVar2.f375494c = 3;
        akVar2.f375492a |= 2;
        ahVar.copyOnWrite();
        C138019ak akVar3 = (C138019ak) ahVar.instance;
        akVar3.f375492a |= 32;
        akVar3.f375498g = R.string.googleapp_discover_promo_dialog_title;
        ahVar.copyOnWrite();
        C138019ak akVar4 = (C138019ak) ahVar.instance;
        string.getClass();
        akVar4.f375492a |= 4;
        akVar4.f375495d = string;
        C62942bv build = ahVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…ssage)\n          .build()");
        C47393f.m84237h(new C138590o((C138019ak) build), view2);
        return true;
    }
}
