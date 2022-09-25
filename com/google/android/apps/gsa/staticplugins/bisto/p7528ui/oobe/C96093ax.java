package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.opaonboarding.C83895ba;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ax */
/* compiled from: PG */
public abstract class C96093ax extends C96363kx {

    /* renamed from: b */
    public static final C59071e f269027b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ax");

    /* renamed from: Zn */
    private final Set f269028Zn = new HashSet();

    /* renamed from: c */
    public C91189au f269029c;

    /* renamed from: d */
    public boolean f269030d;

    /* renamed from: e */
    public boolean f269031e;

    /* renamed from: f */
    public Object f269032f;

    /* renamed from: g */
    public Button f269033g;

    /* renamed from: h */
    public Button f269034h;

    /* renamed from: i */
    public WebView f269035i;

    /* renamed from: j */
    public WebImageView f269036j;

    /* renamed from: k */
    private HeaderLayout f269037k;

    /* renamed from: l */
    private TextView f269038l;

    /* renamed from: g */
    public abstract void mo89941g(OpaPageLayout opaPageLayout);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo89942h(Button button, boolean z) {
        button.setEnabled(z);
        button.setBackgroundTintList(C1882h.m5138d(getContext(), true != z ? R.color.quantum_grey300 : R.color.opa_button_tint));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo89943i(CharSequence charSequence, boolean z) {
        TextView textView = this.f269038l;
        if (textView != null) {
            textView.setText(charSequence);
            this.f269038l.setVisibility(0);
            if (z) {
                this.f269038l.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            return;
        }
        C59104x c = f269027b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) c).mo56372aa(16949)).mo56386p("extraMessage is null!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo89944j(int i) {
        HeaderLayout headerLayout = this.f269037k;
        if (headerLayout != null) {
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(i, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            this.f269037k.setVisibility(0);
            return;
        }
        C59104x c = f269027b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) c).mo56372aa(16951)).mo56386p("headerLayout is null!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo89945k(CharSequence charSequence) {
        HeaderLayout headerLayout = this.f269037k;
        if (headerLayout != null) {
            C84018m.m133908c(headerLayout.f228719b, charSequence, TextView.BufferType.NORMAL, headerLayout);
            this.f269037k.setVisibility(0);
            return;
        }
        C59104x c = f269027b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) c).mo56372aa(16952)).mo56386p("headerLayout is null!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo89946l(CharSequence charSequence) {
        HeaderLayout headerLayout = this.f269037k;
        if (headerLayout != null) {
            C84018m.m133908c(headerLayout.f228718a, charSequence, TextView.BufferType.NORMAL, headerLayout);
            this.f269037k.setVisibility(0);
            return;
        }
        C59104x c = f269027b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) c).mo56372aa(16953)).mo56386p("headerLayout is null!");
    }

    /* renamed from: m */
    public final void mo89947m(View view) {
        for (View view2 : this.f269028Zn) {
            view2.setVisibility(view2 == view ? 0 : 8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo89948n(int i, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i2) {
        Activity activity = getActivity();
        if (activity == null) {
            C59104x c = f269027b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoOobe");
            ((C59052c) ((C59052c) c).mo56372aa(16955)).mo56386p("getActivity returned null; not showing dialog");
            return;
        }
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar = (C83915b) aVar.instance;
        bVar.f228543a |= 2;
        bVar.f228545c = i;
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        str.getClass();
        bVar2.f228543a |= 4;
        bVar2.f228546d = str;
        aVar.copyOnWrite();
        C83915b bVar3 = (C83915b) aVar.instance;
        bVar3.f228543a |= 32;
        bVar3.f228549g = i2;
        aVar.copyOnWrite();
        C83915b bVar4 = (C83915b) aVar.instance;
        bVar4.f228543a |= 128;
        bVar4.f228551i = R.string.bisto_skip;
        C83895ba.m133621a(activity, (C83915b) aVar.build(), onClickListener, onClickListener2).mo77277a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        opaPageLayout.f228726a.mo77362c(2);
        opaPageLayout.mo77370b(R.layout.bisto_oobe_scroll_view);
        Button a = opaPageLayout.f228726a.mo77360a();
        this.f269033g = a;
        a.setAllCaps(false);
        Button b = opaPageLayout.f228726a.mo77361b();
        this.f269034h = b;
        b.setAllCaps(false);
        this.f269037k = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        this.f269038l = (TextView) opaPageLayout.findViewById(R.id.bisto_oobe_extra_message);
        this.f269036j = (WebImageView) opaPageLayout.findViewById(R.id.bisto_oobe_illustration);
        this.f269035i = (WebView) opaPageLayout.findViewById(R.id.bisto_oobe_webview);
        WebImageView webImageView = this.f269036j;
        if (webImageView != null) {
            this.f269028Zn.add(webImageView);
        }
        WebView webView = this.f269035i;
        if (webView != null) {
            this.f269028Zn.add(webView);
        }
        mo89941g(opaPageLayout);
        return opaPageLayout;
    }
}
