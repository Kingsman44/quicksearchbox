package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.p033v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.k */
/* compiled from: PG */
public final class C106760k {

    /* renamed from: a */
    public final C58974d f297528a;

    /* renamed from: b */
    public final C90021c f297529b;

    /* renamed from: c */
    public LinearLayout f297530c;

    /* renamed from: d */
    private final C68214a f297531d;

    public C106760k(C68214a aVar, C83564a aVar2, C90021c cVar) {
        this.f297531d = aVar;
        this.f297528a = aVar2.mo76900a("MediaVH");
        this.f297529b = cVar;
    }

    /* renamed from: b */
    private final void m177516b(Drawable drawable, C52560wg wgVar, AppCompatImageView appCompatImageView) {
        if (drawable == null) {
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if ((ghVar.f133011a & 1024) != 0) {
                C58974d dVar = this.f297528a;
                C91189au auVar = (C91189au) this.f297531d.mo27525b();
                C51098gh ghVar2 = wgVar.f137949e;
                if (ghVar2 == null) {
                    ghVar2 = C51098gh.f133009e;
                }
                C107043b.m177757a(dVar, auVar.mo85421i(ghVar2.f133014d, appCompatImageView), "failed to set image on appIcon.", new Object[0]);
                appCompatImageView.setVisibility(0);
                return;
            }
            ((C58970a) ((C58970a) this.f297528a.mo56226d()).mo56372aa(23291)).mo56386p("no icon image url");
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo95645a(Drawable drawable, C52560wg wgVar, int i, LayoutInflater layoutInflater, Context context) {
        C51058ev evVar;
        C51058ev evVar2;
        if (this.f297529b.mo79746e(C90017bw.f247941bC)) {
            LinearLayout linearLayout = this.f297530c;
            linearLayout.getClass();
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.aa_media_icon, linearLayout, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) relativeLayout.findViewById(R.id.media_cover);
            C52568wo woVar = wgVar.f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            m177517c(dcVar, appCompatImageView, context);
            m177516b(drawable, wgVar, (AppCompatImageView) relativeLayout.findViewById(R.id.media_logo));
            LinearLayout linearLayout2 = this.f297530c;
            linearLayout2.getClass();
            linearLayout2.addView(relativeLayout);
            return relativeLayout;
        }
        LinearLayout linearLayout3 = this.f297530c;
        linearLayout3.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.aa_media_card, linearLayout3, false);
        int i2 = i == 8 ? 2 : 1;
        C28292j jVar = new C28292j(104344);
        jVar.mo33794h(i2);
        jVar.mo33795i(5);
        C28295m.m52919e(constraintLayout, jVar);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) constraintLayout.findViewById(R.id.thumbnail);
        TextView textView = (TextView) constraintLayout.findViewById(R.id.title);
        TextView textView2 = (TextView) constraintLayout.findViewById(R.id.subtitle);
        m177516b(drawable, wgVar, (AppCompatImageView) constraintLayout.findViewById(R.id.app_icon));
        C52568wo woVar2 = wgVar.f137950f;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f138011r.size() > 0) {
            textView2.setText((String) woVar2.f138011r.get(0));
            textView2.setVisibility(0);
        } else {
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            String str = null;
            if (ghVar.f133012b == 1) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    C51098gh ghVar2 = wgVar.f137949e;
                    if (ghVar2 == null) {
                        ghVar2 = C51098gh.f133009e;
                    }
                    if (ghVar2.f133012b == 1) {
                        evVar2 = (C51058ev) ghVar2.f133013c;
                    } else {
                        evVar2 = C51058ev.f132941o;
                    }
                    str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(evVar2.f132944b, 0)).toString();
                } catch (PackageManager.NameNotFoundException unused) {
                    C58970a aVar = (C58970a) ((C58970a) this.f297528a.mo56225c()).mo56372aa(23290);
                    C51098gh ghVar3 = wgVar.f137949e;
                    if (ghVar3 == null) {
                        ghVar3 = C51098gh.f133009e;
                    }
                    if (ghVar3.f133012b == 1) {
                        evVar = (C51058ev) ghVar3.f133013c;
                    } else {
                        evVar = C51058ev.f132941o;
                    }
                    aVar.mo56389s("application info not find for package: %s", evVar.f132944b);
                }
            }
            if (str != null) {
                textView2.setText(str);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        C51012dc dcVar2 = woVar2.f138004k;
        if (dcVar2 == null) {
            dcVar2 = C51012dc.f132813k;
        }
        m177517c(dcVar2, appCompatImageView2, context);
        if ((woVar2.f137994a & 1) != 0) {
            textView.setText(woVar2.f137998e);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.f297530c;
        linearLayout4.getClass();
        linearLayout4.addView(constraintLayout);
        return constraintLayout;
    }

    /* renamed from: c */
    private final void m177517c(C51012dc dcVar, AppCompatImageView appCompatImageView, Context context) {
        int i = dcVar.f132815a;
        if ((i & 8) != 0) {
            byte[] N = dcVar.f132819e.mo59174N();
            appCompatImageView.setImageDrawable(new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(N, 0, N.length)));
        } else if ((i & 2) != 0) {
            C60856cj.m92911t(((C91189au) this.f297531d.mo27525b()).mo85421i(dcVar.f132817c, appCompatImageView), new C106759j(this, appCompatImageView, context), C60826bg.f164896a);
        } else {
            ((C58970a) ((C58970a) this.f297528a.mo56226d()).mo56372aa(23292)).mo56386p("This MediaItem has no image.");
            appCompatImageView.setBackground(context.getDrawable(R.drawable.media_placeholder));
        }
    }
}
