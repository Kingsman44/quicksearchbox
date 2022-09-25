package com.google.android.apps.gsa.staticplugins.bubble.mvc;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97076c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97102q;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97103r;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97136ah;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97224j;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7607c.C97193a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97208c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BackButtonFrameLayout;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b */
/* compiled from: PG */
public final class C97049b {

    /* renamed from: a */
    public static final C59071e f271176a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.b");

    /* renamed from: b */
    public final C68214a f271177b;

    /* renamed from: c */
    public final C68214a f271178c;

    /* renamed from: d */
    public final C68214a f271179d;

    /* renamed from: e */
    public final Context f271180e;

    /* renamed from: f */
    public final int f271181f;

    /* renamed from: g */
    public final C21370a f271182g;

    /* renamed from: h */
    public C97045a f271183h = C97045a.DESTROYED;

    /* renamed from: i */
    public long f271184i;

    public C97049b(C68214a aVar, C68214a aVar2, C68214a aVar3, Context context, int i, C21370a aVar4) {
        this.f271177b = aVar;
        this.f271178c = aVar2;
        this.f271179d = aVar3;
        this.f271180e = context;
        this.f271181f = i;
        this.f271182g = aVar4;
    }

    /* renamed from: a */
    public final void mo90407a() {
        if (this.f271183h != C97045a.CREATED) {
            ((C59052c) ((C59052c) f271176a.mo56226d()).mo56372aa(18334)).mo56389s("destroy() called on bubble with state [%s]", this.f271183h);
            int i = C90755l.f253831a;
        }
        C97076c cVar = (C97076c) this.f271177b.mo27525b();
        C97102q qVar = cVar.f271260d;
        C97040c cVar2 = cVar.f271259c;
        C97103r rVar = qVar.f271306c;
        rVar.f271311a.remove(cVar2);
        qVar.mo90468a(rVar.mo90470a());
        cVar.f271257a.mo90430c();
        C97136ah ahVar = (C97136ah) this.f271179d.mo27525b();
        ahVar.f271426x = true;
        C97224j jVar = ahVar.f271414l;
        if (jVar != null) {
            jVar.f271618a.mo90544b();
        }
        C97112h hVar = ahVar.f271415m;
        if (hVar != null) {
            hVar.f271346o = 2;
            hVar.f271336e.f271382a.remove(hVar);
        }
        C97208c cVar3 = ahVar.f271418p;
        if (cVar3 != null) {
            cVar3.mo90539d();
        }
        BubbleView bubbleView = ahVar.f271420r;
        if (bubbleView != null) {
            ahVar.f271405c.removeView(bubbleView);
        }
        View view = ahVar.f271421s;
        if (view != null) {
            ahVar.f271405c.removeView(view);
        }
        BackButtonFrameLayout backButtonFrameLayout = ahVar.f271419q;
        if (backButtonFrameLayout != null) {
            ahVar.f271405c.removeView(backButtonFrameLayout);
        }
        C97193a aVar = ahVar.f271425w;
        if (aVar != null) {
            aVar.mo90579a();
        }
        this.f271183h = C97045a.DESTROYED;
    }
}
