package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10273a;

import android.content.Context;
import android.net.Uri;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135507d;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.googlehelp.C144289e;
import com.google.android.gms.googlehelp.C144291g;
import com.google.android.gms.googlehelp.C144293i;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.C144297ac;
import com.google.android.gms.googlehelp.internal.common.C144327v;
import com.google.android.gms.googlehelp.p10809a.C144281a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import java.lang.ref.WeakReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.a.a */
/* compiled from: PG */
public final class C135614a implements C43541a {

    /* renamed from: a */
    private final Context f369409a;

    /* renamed from: b */
    private final String f369410b;

    /* renamed from: c */
    private final String f369411c;

    /* renamed from: d */
    private final Fragment f369412d;

    /* renamed from: e */
    private final C43377v f369413e;

    public C135614a(Context context, String str, String str2, Fragment fragment, C144281a aVar, C43377v vVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(aVar, "googleHelpLauncherFactory");
        this.f369409a = context;
        this.f369410b = str;
        this.f369411c = str2;
        this.f369412d = fragment;
        this.f369413e = vVar;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.googleapp_browser_actionbutton_ampinfo;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 141066;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo46596c() {
        String string = this.f369409a.getResources().getString(R.string.googleapp_browser_actionbutton_ampinfo);
        C69664n.m101060f(string, "context.resources.getStr…ser_actionbutton_ampinfo)");
        return string;
    }

    /* renamed from: d */
    public final void mo46597d() {
        InProductHelp inProductHelp = new InProductHelp(new GoogleHelp(this.f369410b), (String) null, (String) null, 0, (String) null, 0);
        inProductHelp.f390779c = this.f369411c;
        C0167am activity = this.f369412d.getActivity();
        C69664n.m101059e(activity, "null cannot be cast to non-null type android.app.Activity");
        C144291g gVar = new C144291g(activity);
        if (!TextUtils.isEmpty(inProductHelp.f390779c)) {
            int a = gVar.mo119818a();
            if (a == 0) {
                C144297ac a2 = C144293i.m234537a(((C144289e) gVar.f390816b).f390812a);
                C143919bh.m233958a(a2.f390832b);
                C143851w wVar = a2.f389929D;
                C144327v vVar = new C144327v(wVar, inProductHelp, new WeakReference(a2.f390832b));
                wVar.mo119159d(vVar);
                C143918bg.m233956b(vVar);
            } else {
                gVar.mo119819b(a, inProductHelp.f390777a);
            }
            C47393f.m84236g(new C135507d(), this.f369412d);
            return;
        }
        throw new IllegalArgumentException("The content URL must be non-empty.");
    }

    /* renamed from: e */
    public final boolean mo46598e() {
        return C133456e.m216616c(Uri.parse(this.f369413e.mo46468a().f113329b)).isPresent();
    }
}
