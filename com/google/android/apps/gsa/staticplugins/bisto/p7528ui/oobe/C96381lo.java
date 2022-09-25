package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.p197u.C4199aj;
import androidx.p197u.C4230o;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96506z;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142351cc;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lo */
/* compiled from: PG */
public final class C96381lo extends C96363kx {

    /* renamed from: q */
    public static final /* synthetic */ int f269637q = 0;

    /* renamed from: b */
    public C96325jm f269638b;

    /* renamed from: c */
    public C68214a f269639c;

    /* renamed from: d */
    public C84535at f269640d;

    /* renamed from: e */
    public C89656k f269641e;

    /* renamed from: f */
    public C96094ay f269642f;

    /* renamed from: g */
    public C22871g f269643g;

    /* renamed from: h */
    public C22871g f269644h;

    /* renamed from: i */
    public boolean f269645i;

    /* renamed from: j */
    public C96089at f269646j;

    /* renamed from: k */
    public boolean f269647k;

    /* renamed from: l */
    public OpaPageLayout f269648l;

    /* renamed from: m */
    public ProgressBar f269649m;

    /* renamed from: n */
    public WebView f269650n;

    /* renamed from: o */
    public int f269651o;

    /* renamed from: p */
    protected C60870cx f269652p;

    /* renamed from: r */
    private C96153dc f269653r;

    /* renamed from: s */
    private FooterLayout f269654s;

    /* renamed from: g */
    protected static String m159719g(String str, List list, String str2) {
        return Uri.parse(str).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).appendQueryParameter("sub", str2).appendQueryParameter("hq", new JSONArray(list).toString()).build().toString();
    }

    /* renamed from: k */
    private final C124548d m159720k() {
        String str = this.f269642f.f269039a;
        if (str == null) {
            return null;
        }
        return ((C89492cd) this.f269639c.mo27525b()).mo83401b(str);
    }

    /* renamed from: l */
    private final C124719q m159721l() {
        String str = this.f269642f.f269039a;
        if (str == null) {
            return C124719q.UNKNOWN_DEVICE_CATEGORY;
        }
        C124548d b = ((C89492cd) this.f269639c.mo27525b()).mo83401b(str);
        if (b != null) {
            return b.mo106513k();
        }
        return C124719q.UNKNOWN_DEVICE_CATEGORY;
    }

    /* renamed from: m */
    private final boolean m159722m() {
        return m159721l().equals(C124719q.GACS_DEVICE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "TOS_Loading";
    }

    /* renamed from: h */
    public final void mo90099h(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup != null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tos_welcome_offline_content, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tos_welcome_offline_hero_query);
            if (textView != null) {
                textView.setText(i);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.tos_welcome_offline_hero_image);
                if (imageView != null) {
                    imageView.setImageResource(i2);
                    inflate.setId(View.generateViewId());
                    viewGroup.addView(inflate);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo90100i() {
        ViewGroup viewGroup = (ViewGroup) this.f269648l.findViewById(R.id.tos_welcome_offline_container_inner);
        int i = this.f269651o + 1;
        this.f269651o = i;
        if (i == viewGroup.getChildCount()) {
            this.f269651o = 0;
        }
        View childAt = viewGroup.getChildAt(this.f269651o);
        C4230o oVar = new C4230o(1);
        oVar.f13592b = 500;
        oVar.f13595e.add(childAt);
        C4199aj.m12054b(viewGroup, oVar);
        childAt.setVisibility(0);
        this.f269644h.mo28213m("offline-sequence-advance", 3500, new C96372lf(this));
    }

    /* renamed from: j */
    public final boolean mo90101j() {
        return m159721l().equals(C124719q.HEADPHONES);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58485gu guVar;
        this.f269648l = new OpaPageLayout(layoutInflater.getContext());
        String str = null;
        this.f269653r = new C96153dc((LegacyOpaStandardPage) null, (C68214a) null, 0);
        this.f269648l.mo77370b(true != m159722m() ? R.layout.tos_welcome : R.layout.tos_welcome_gacs);
        this.f269654s = this.f269648l.f228726a;
        C124548d k = m159720k();
        if (k != null) {
            str = k.mo106481V();
        }
        if (C124521b.m203982e(str)) {
            this.f269654s.mo77362c(1);
        } else {
            this.f269654s.mo77362c(2);
            this.f269654s.mo77363d(this.f269647k);
            Button b = this.f269654s.mo77361b();
            C124548d k2 = m159720k();
            if (k2 != null) {
                b.setOnClickListener(new C96375li(this, k2));
            } else {
                b.setOnClickListener(new C96376lj(this));
            }
            b.setText(m159722m() ? this.f269645i ? R.string.bisto_skip : R.string.tos_decline_setup_later : R.string.bisto_no_thanks_button);
        }
        Button a = this.f269654s.mo77360a();
        a.setOnClickListener(new C89943l(new C96377lk(this)));
        a.setText(true != m159722m() ? R.string.tos_accept_next : R.string.tos_accept_activate);
        this.f269649m = (ProgressBar) this.f269648l.findViewById(R.id.bisto_oobe_progress_bar);
        WebView webView = (WebView) this.f269648l.findViewById(R.id.bisto_oobe_webview);
        this.f269650n = webView;
        C96498r.m159874a(webView);
        C96097ba baVar = this.f269638b.f269538a;
        C142340bs bsVar = baVar.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142351cc ccVar = bsVar.f386198u;
        if (ccVar == null) {
            ccVar = C142351cc.f386238i;
        }
        C142328bg bgVar = ccVar.f386242c;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        String str2 = (String) C96506z.m159889a(bgVar, C96498r.m159875b(baVar.f269046a)).mo56109e("https://www.gstatic.com/bisto/oobe/tos_welcome/index.html");
        C142340bs bsVar2 = baVar.f269047b.f386119e;
        if (bsVar2 == null) {
            bsVar2 = C142340bs.f386174C;
        }
        C142351cc ccVar2 = bsVar2.f386198u;
        if (ccVar2 == null) {
            ccVar2 = C142351cc.f386238i;
        }
        C142355cg cgVar = ccVar2.f386243d;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        String e = C124525f.m203989e(cgVar);
        C142355cg cgVar2 = ccVar2.f386244e;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        String e2 = C124525f.m203989e(cgVar2);
        C142355cg cgVar3 = ccVar2.f386245f;
        if (cgVar3 == null) {
            cgVar3 = C142355cg.f386263b;
        }
        String e3 = C124525f.m203989e(cgVar3);
        if (C58837ba.m90859h(e) || C58837ba.m90859h(e2) || C58837ba.m90859h(e3)) {
            guVar = C58485gu.m89848p(baVar.f269046a.getString(R.string.tos_warm_hero_1), baVar.f269046a.getString(R.string.tos_warm_hero_2), baVar.f269046a.getString(R.string.tos_warm_hero_3));
        } else {
            guVar = C58485gu.m89848p(e, e2, e3);
        }
        String g = m159719g(str2, guVar, baVar.mo89958i());
        if (m159722m()) {
            HeaderLayout headerLayout = (HeaderLayout) this.f269648l.findViewById(R.id.opa_header);
            C142340bs bsVar3 = baVar.f269047b.f386119e;
            if (bsVar3 == null) {
                bsVar3 = C142340bs.f386174C;
            }
            C142351cc ccVar3 = bsVar3.f386198u;
            if (ccVar3 == null) {
                ccVar3 = C142351cc.f386238i;
            }
            C142355cg cgVar4 = ccVar3.f386246g;
            if (cgVar4 == null) {
                cgVar4 = C142355cg.f386263b;
            }
            String e4 = C124525f.m203989e(cgVar4);
            if (C58837ba.m90859h(e4)) {
                e4 = baVar.f269046a.getResources().getString(R.string.tos_title);
            }
            C84018m.m133908c(headerLayout.f228718a, Html.fromHtml(e4), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, Html.fromHtml(baVar.mo89958i()), TextView.BufferType.NORMAL, headerLayout);
            g = Uri.parse(g).buildUpon().appendQueryParameter("hide_header", BuildConfig.FLAVOR).build().toString();
        }
        this.f269649m.setVisibility(0);
        this.f269650n.setVisibility(4);
        C60870cx e5 = C90877ak.m148471e(this.f269653r.mo89991a(this.f269650n, g, C58836b.f156633a), 8000, TimeUnit.MILLISECONDS, this.f269643g);
        this.f269652p = e5;
        C90875ai.m148465b(new C96373lg(this), e5, this.f269644h, "Load complete").mo85223a(new C96374lh(this));
        this.f269650n.setBackgroundColor(0);
        return this.f269648l;
    }

    public final void onDestroy() {
        super.onDestroy();
        C60870cx cxVar = this.f269652p;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }
}
