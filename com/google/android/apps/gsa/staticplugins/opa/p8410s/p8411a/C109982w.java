package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21284c;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1708c.C20768d;
import com.google.android.libraries.elements.p1729h.C21215m;
import com.google.protos.youtube.elements.C66166ck;
import dagger.C68214a;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.w */
/* compiled from: PG */
public final class C109982w implements C20768d {

    /* renamed from: a */
    private final Context f306445a;

    /* renamed from: b */
    private final C68214a f306446b;

    /* renamed from: c */
    private PopupWindow f306447c;

    public C109982w(Context context, C68214a aVar) {
        this.f306445a = context;
        this.f306446b = aVar;
    }

    /* renamed from: a */
    public final void mo25832a() {
        PopupWindow popupWindow = this.f306447c;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f306447c = null;
        }
    }

    /* renamed from: b */
    public final void mo25833b(C66166ck ckVar, View view) {
        View view2 = view;
        mo25832a();
        C6411u uVar = new C6411u(this.f306445a, (String) null, (C21215m) null, (C6381hf) null);
        LithoView lithoView = new LithoView(uVar);
        C21318y B = C21319z.m40292B();
        ((C21284c) B).f59603a = lithoView;
        C6407q b = ((C21249as) this.f306446b.mo27525b()).mo26712b(uVar, B.mo26839p(), ckVar.toByteArray(), (C21239ai) null, new C69802a());
        ComponentTree componentTree = lithoView.f17938n;
        if (componentTree == null) {
            lithoView.mo12729B(ComponentTree.m15673b(lithoView.f17940p, b).mo12841a());
        } else if (b != null) {
            componentTree.mo12726v(b, -1, -1, false, (C6276fs) null, 0, (String) null, (C6381hf) null, false, false);
        } else {
            throw new IllegalArgumentException("Root component can't be null");
        }
        PopupWindow popupWindow = new PopupWindow(lithoView, -2, -2, true);
        this.f306447c = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        float applyDimension = TypedValue.applyDimension(1, 3.0f, this.f306445a.getResources().getDisplayMetrics());
        PopupWindow popupWindow2 = this.f306447c;
        popupWindow2.getClass();
        popupWindow2.setElevation(applyDimension);
        PopupWindow popupWindow3 = this.f306447c;
        popupWindow3.getClass();
        int width = view.getWidth() - lithoView.getMeasuredWidth();
        Rect rect = new Rect();
        view2.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = rect.bottom;
        int i2 = iArr[1];
        int measuredHeight = lithoView.getMeasuredHeight();
        int i3 = -view.getHeight();
        if (i - i2 >= measuredHeight) {
            measuredHeight = 0;
        }
        popupWindow3.showAsDropDown(view2, width, i3 - measuredHeight);
    }
}
