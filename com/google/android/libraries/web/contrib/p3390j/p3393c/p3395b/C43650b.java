package com.google.android.libraries.web.contrib.p3390j.p3393c.p3395b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.contrib.p3390j.p3391a.C43637e;
import com.google.android.libraries.web.contrib.p3390j.p3391a.C43639g;
import com.google.android.libraries.web.contrib.p3390j.p3391a.C43640h;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43654b;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43659g;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.apps.tiktok.dataservice.C46704av;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.contrib.j.c.b.b */
/* compiled from: PG */
public final class C43650b implements C43654b {

    /* renamed from: a */
    public static final C59071e f113904a = C59071e.m91332i("com.google.android.libraries.web.contrib.j.c.b.b");

    /* renamed from: b */
    public final C28443m f113905b;

    /* renamed from: c */
    public final Context f113906c;

    /* renamed from: d */
    public TextView f113907d;

    /* renamed from: e */
    private final C46792di f113908e = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C43650b.f113904a.mo56226d()).mo56382g(th)).mo56372aa(54120)).mo56386p("Failed to read URL bar data.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            Drawable drawable;
            C43637e eVar = (C43637e) obj;
            C43650b bVar = C43650b.this;
            TextView textView = bVar.f113907d;
            if (textView != null) {
                int d = eVar.mo46663d();
                int i = d - 1;
                if (d != 0) {
                    if (i == 1) {
                        drawable = bVar.mo46674a(R.drawable.quantum_gm_ic_https_vd_theme_24, R.color.webx_url_secure_scheme_color);
                    } else if (i == 2) {
                        drawable = bVar.mo46674a(R.drawable.quantum_gm_ic_info_outline_vd_theme_24, 0);
                    } else if (i != 3) {
                        drawable = null;
                    } else {
                        drawable = bVar.mo46674a(R.drawable.quantum_gm_ic_warning_vd_theme_24, R.color.webx_url_dangerous_scheme_color);
                    }
                    textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView.setText(eVar.mo46662c());
                    textView.setEllipsize(eVar.mo46660a());
                    return;
                }
                throw null;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: f */
    private final C43640h f113909f;

    /* renamed from: g */
    private final C46801dp f113910g;

    /* renamed from: h */
    private final C47770dh f113911h;

    /* renamed from: i */
    private final C28310af f113912i;

    public C43650b(C28443m mVar, Fragment fragment, C43640h hVar, C46801dp dpVar, C47770dh dhVar, C28310af afVar) {
        this.f113905b = mVar;
        this.f113906c = fragment.requireContext();
        this.f113909f = hVar;
        this.f113910g = dpVar;
        this.f113911h = dhVar;
        this.f113912i = afVar;
    }

    /* renamed from: a */
    public final Drawable mo46674a(int i, int i2) {
        Drawable c = C0678gm.m2375e().mo3100c(this.f113906c, i);
        c.getClass();
        c.setBounds(0, 0, this.f113906c.getResources().getDimensionPixelSize(R.dimen.webx_url_bar_icon_size), this.f113906c.getResources().getDimensionPixelSize(R.dimen.webx_url_bar_icon_size));
        if (i2 != 0) {
            C1929b.m5225f(c.mutate(), C1878d.m5128a(this.f113906c, i2));
        }
        return c;
    }

    /* renamed from: b */
    public final View mo46671b(LayoutInflater layoutInflater, ViewGroup viewGroup, C43664l lVar, View.OnLongClickListener onLongClickListener) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.webx_url_bar, viewGroup, false);
        this.f113912i.f76997b.mo33800a(C28427h.m53115a(79654)).mo33809b(viewGroup2);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.webx_url_bar);
        this.f113907d = textView;
        textView.setTextSize(2, lVar.f113939b);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113907d.getLayoutParams();
        if (layoutParams != null) {
            C43659g a = C43659g.m77037a(lVar.f113942e);
            if (a == null) {
                a = C43659g.CENTER;
            }
            layoutParams.gravity = true != C43659g.START.equals(a) ? 17 : 8388627;
            TextView textView2 = this.f113907d;
            textView2.getClass();
            textView2.setLayoutParams(layoutParams);
        }
        C46801dp dpVar = this.f113910g;
        C43640h hVar = this.f113909f;
        dpVar.mo50708b(new C46704av(hVar.f113889c.mo46469b(), new C43639g(hVar), hVar.f113888b), C46788de.DONT_CARE, this.f113908e);
        viewGroup2.setOnLongClickListener(onLongClickListener);
        viewGroup2.setOnClickListener(new C47591co(this.f113911h, "View.onUrlBarClicked", new C43649a(this)));
        viewGroup2.setAccessibilityDelegate(new C43652c(this));
        return viewGroup2;
    }

    /* renamed from: c */
    public final boolean mo46672c() {
        return false;
    }
}
