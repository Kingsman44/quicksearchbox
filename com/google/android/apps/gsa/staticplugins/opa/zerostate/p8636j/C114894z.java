package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0667gb;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.z */
/* compiled from: PG */
public final class C114894z extends C0602dr {

    /* renamed from: o */
    private static final C59071e f318770o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.z");

    /* renamed from: f */
    public C114892x f318771f;

    /* renamed from: n */
    public C53287ih f318772n;

    /* renamed from: p */
    private final Activity f318773p;

    /* renamed from: q */
    private final C114893y f318774q;

    /* renamed from: r */
    private final C114839ci f318775r;

    /* renamed from: s */
    private final C114742l f318776s;

    /* renamed from: t */
    private final C114735e f318777t;

    /* renamed from: u */
    private final LinearLayoutManager f318778u;

    /* renamed from: v */
    private LinearLayout f318779v;

    public C114894z(Context context, Activity activity, C114893y yVar, C114839ci ciVar, C114742l lVar, C114735e eVar, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.f318773p = activity;
        this.f318774q = yVar;
        this.f318775r = ciVar;
        this.f318776s = lVar;
        this.f318777t = eVar;
        this.f318778u = linearLayoutManager;
    }

    /* renamed from: m */
    private final void m190463m() {
        C28293k kVar;
        C114892x xVar = this.f318771f;
        if (xVar == null) {
            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29543)).mo56386p("#recordInteraction(): targetInfo is null.");
            return;
        }
        C114757k c = xVar.mo101676c();
        if (xVar.mo101678e() == 1) {
            kVar = c.mo101579c();
        } else if (xVar.mo101678e() == 2) {
            C114750d b = c.mo101578b(this.f318771f.mo101674a());
            if (b == null) {
                ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29542)).mo56386p("#recordInteraction(): Failed to get card controller.");
                return;
            }
            kVar = b.mo101465c();
        } else {
            kVar = null;
        }
        if (kVar == null) {
            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29541)).mo56386p("#recordInteraction(): veTreeNode is null.");
            return;
        }
        C28292j a = kVar.mo33745a();
        a.getClass();
        a.mo33795i(2);
        this.f318776s.mo101571f(kVar, 2);
    }

    /* renamed from: n */
    private static boolean m190464n(C114750d dVar) {
        return (dVar instanceof C114778ab) && ((C114778ab) dVar).mo101493m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo2798f() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo2799g() {
        C114892x xVar = this.f318771f;
        if (xVar == null || this.f318772n == null) {
            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29533)).mo56386p("#onStop(): targetInfo or deepLinkData is null.");
            this.f318777t.mo101560h(4, this.f318772n);
        } else if (xVar.mo101678e() == 1) {
            m190463m();
            this.f318777t.mo101560h(1, this.f318772n);
        } else if (xVar.mo101678e() == 2) {
            C114750d b = xVar.mo101676c().mo101578b(this.f318771f.mo101674a());
            if (this.f318779v == null || b == null) {
                C114893y yVar = this.f318774q;
                C53287ih ihVar = this.f318772n;
                ihVar.getClass();
                yVar.mo101688a(ihVar);
            } else if (m190464n(b)) {
                C114893y yVar2 = this.f318774q;
                C53287ih ihVar2 = this.f318772n;
                ihVar2.getClass();
                yVar2.mo101688a(ihVar2);
            } else {
                C53287ih ihVar3 = this.f318772n;
                ihVar3.getClass();
                C114839ci ciVar = this.f318775r;
                LinearLayout linearLayout = this.f318779v;
                linearLayout.getClass();
                b.mo101468f(ihVar3, ciVar.mo101652e(linearLayout));
                m190463m();
                this.f318777t.mo101560h(1, this.f318772n);
                this.f318779v = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo2800h(View view, C0670ge geVar, C0667gb gbVar) {
        super.mo2800h(view, geVar, gbVar);
        C114892x xVar = this.f318771f;
        if (xVar == null) {
            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29540)).mo56386p("#onTargetFound(): targetInfo is null.");
        } else if (xVar.mo101678e() == 2) {
            int a = xVar.mo101674a() + 1;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() != 0) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
                    if (a >= viewGroup2.getChildCount()) {
                        ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29539)).mo56386p("#onTargetFound(): target card not found.");
                        return;
                    }
                    View childAt = viewGroup2.getChildAt(a);
                    if (childAt instanceof LinearLayout) {
                        this.f318779v = (LinearLayout) childAt;
                    } else if (childAt instanceof TouchInterceptingFrameLayout) {
                        try {
                            this.f318779v = (LinearLayout) ((ViewGroup) childAt).getChildAt(0);
                        } catch (RuntimeException unused) {
                            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29538)).mo56386p("#onTargetFound(): invalid target card container.");
                            return;
                        }
                    } else {
                        ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29535)).mo56386p("#onTargetFound(): invalid target card container.");
                        return;
                    }
                    C114892x xVar2 = this.f318771f;
                    xVar2.getClass();
                    C114750d b = xVar2.mo101676c().mo101578b(xVar2.mo101674a());
                    if (b != null && b.mo101464b().getVisibility() == 8 && !m190464n(b)) {
                        b.mo101464b().setVisibility(0);
                    }
                    if (gbVar.f2442b > 0) {
                        View findViewById = this.f318773p.findViewById(R.id.valyrian_header_container);
                        int height = findViewById != null ? findViewById.getHeight() : 0;
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int i = 0; i < a; i++) {
                            arrayList.add(Integer.valueOf(viewGroup2.getChildAt(i).getHeight()));
                        }
                        int i2 = gbVar.f2441a - height;
                        for (Integer intValue : arrayList) {
                            i2 += intValue.intValue();
                        }
                        gbVar.f2444d = true;
                        gbVar.f2441a = i2;
                        return;
                    }
                    return;
                }
            }
            ((C59052c) ((C59052c) f318770o.mo56226d()).mo56372aa(29534)).mo56386p("#onTargetFound(): section container not found.");
        }
    }

    /* renamed from: j */
    public final PointF mo3049j(int i) {
        return this.f318778u.computeScrollVectorForPosition(i);
    }
}
