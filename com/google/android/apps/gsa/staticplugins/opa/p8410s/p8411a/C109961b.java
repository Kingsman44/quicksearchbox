package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c.C114610d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21284c;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1708c.C20698a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.protos.youtube.elements.C66166ck;
import dagger.C68214a;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.b */
/* compiled from: PG */
public final class C109961b implements C20698a {

    /* renamed from: a */
    private final Context f306406a;

    /* renamed from: b */
    private final Activity f306407b;

    /* renamed from: c */
    private final C68214a f306408c;

    /* renamed from: d */
    private C69802a f306409d;

    /* renamed from: e */
    private C44565p f306410e;

    /* renamed from: f */
    private LithoView f306411f;

    public C109961b(Context context, Activity activity, C68214a aVar) {
        this.f306406a = context;
        this.f306407b = activity;
        this.f306408c = aVar;
    }

    /* renamed from: a */
    public final void mo25793a() {
        C44565p pVar = this.f306410e;
        if (pVar != null) {
            pVar.dismiss();
            this.f306410e = null;
        }
        LithoView lithoView = this.f306411f;
        if (lithoView != null) {
            lithoView.mo12753y();
            this.f306411f.mo12731D();
            this.f306411f.mo12729B((ComponentTree) null);
            this.f306411f = null;
        }
        C69802a aVar = this.f306409d;
        if (aVar != null) {
            aVar.dispose();
            this.f306409d = null;
        }
    }

    /* renamed from: b */
    public final void mo25794b(C66166ck ckVar, int i, C21311r rVar) {
        C58833ax k = C58833ax.m90834k(rVar.mo26735e());
        mo25793a();
        this.f306409d = new C69802a();
        LithoView lithoView = new LithoView(this.f306406a);
        this.f306411f = lithoView;
        C6411u uVar = lithoView.f17940p;
        Object obj = ((C58847bk) k).f156646a;
        C21239ai a = obj instanceof C114610d ? C114610d.m189979a(((C114610d) obj).f317910a) : null;
        C21318y B = C21319z.m40292B();
        ((C21284c) B).f59603a = lithoView;
        B.mo26841r(false);
        C6095af b = ComponentTree.m15673b(uVar, ((C21249as) this.f306408c.mo27525b()).mo26712b(uVar, B.mo26839p(), ckVar.toByteArray(), a, this.f306409d));
        b.f17998d = false;
        lithoView.mo12729B(b.mo12841a());
        C44565p pVar = new C44565p(this.f306407b, R.style.OpaElementsBottomSheetDialog);
        this.f306410e = pVar;
        pVar.setContentView((View) lithoView);
        int i2 = i - 1;
        if (i2 == 2) {
            Window window = pVar.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
        } else if (i2 == 4) {
            pVar.setOnShowListener(new C109958a(BottomSheetBehavior.m78767C((View) lithoView.getParent())));
        }
        pVar.show();
    }
}
