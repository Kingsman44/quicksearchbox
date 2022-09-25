package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96897q;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96943d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97006k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32064g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.ah */
/* compiled from: PG */
public final class C97158ah {

    /* renamed from: a */
    public static final C59071e f271467a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.ah");

    /* renamed from: b */
    public final C96897q f271468b;

    /* renamed from: c */
    public final C60870cx f271469c;

    /* renamed from: d */
    public final C22871g f271470d;

    /* renamed from: e */
    public final C96943d f271471e;

    /* renamed from: f */
    public final View f271472f;

    /* renamed from: g */
    public final C97160aj f271473g;

    /* renamed from: h */
    public final C32064g f271474h;

    /* renamed from: i */
    public final C96981d f271475i;

    /* renamed from: j */
    public final C97157ag f271476j;

    public C97158ah(Context context, C96897q qVar, C60870cx cxVar, C22871g gVar, C96943d dVar, C97160aj ajVar, C32064g gVar2, C97006k kVar) {
        this.f271468b = qVar;
        this.f271469c = cxVar;
        this.f271470d = gVar;
        this.f271471e = dVar;
        this.f271472f = LayoutInflater.from(context).inflate(R.layout.bubble_subscription_row, (ViewGroup) null);
        this.f271473g = ajVar;
        this.f271474h = gVar2;
        C96981d dVar2 = kVar.f271094b;
        this.f271475i = dVar2 == null ? C96981d.f271030c : dVar2;
        C28292j jVar = new C28292j(68500);
        C28292j jVar2 = new C28292j(68501);
        jVar2.mo33795i(5);
        C28292j jVar3 = new C28292j(68502);
        jVar3.mo33795i(5);
        this.f271476j = new C97168i(jVar, jVar2, jVar3);
    }

    /* renamed from: a */
    public final void mo90552a(CheckBox checkBox, boolean z) {
        checkBox.setChecked(z);
        checkBox.setEnabled(true);
        checkBox.setOnCheckedChangeListener(new C97182w(this));
    }
}
