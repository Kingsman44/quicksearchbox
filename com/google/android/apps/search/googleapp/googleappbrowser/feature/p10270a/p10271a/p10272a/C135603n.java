package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24869d;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.contrib.p3703e.C47663g;
import com.google.common.p4526f.C59071e;
import java.util.UUID;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.n */
/* compiled from: PG */
public final class C135603n {

    /* renamed from: a */
    public static final C59071e f369366a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.n");

    /* renamed from: b */
    public final String f369367b;

    /* renamed from: c */
    public final Fragment f369368c;

    /* renamed from: d */
    public final C24898o f369369d;

    /* renamed from: e */
    public final C135594e f369370e;

    /* renamed from: f */
    public final C28306ab f369371f;

    /* renamed from: g */
    public Bitmap f369372g;

    /* renamed from: h */
    public ViewTreeObserver.OnGlobalLayoutListener f369373h;

    /* renamed from: i */
    public Optional f369374i = Optional.empty();

    /* renamed from: j */
    public C135604o f369375j;

    /* renamed from: k */
    public C135593d f369376k;

    /* renamed from: l */
    private final C47449e f369377l;

    /* renamed from: m */
    private final AccountId f369378m;

    public C135603n(C135597h hVar, String str, C47449e eVar, C24898o oVar, C135594e eVar2, C28306ab abVar, AccountId accountId) {
        this.f369367b = str;
        this.f369368c = hVar;
        this.f369377l = eVar;
        this.f369369d = oVar;
        this.f369370e = eVar2;
        this.f369371f = abVar;
        this.f369378m = accountId;
    }

    /* renamed from: a */
    public final void mo112408a(String str, View view, boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.googleapp_browser_context_menu_image_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.googleapp_browser_contextmenu_imagepreview);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.googleapp_browser_context_menu_image_container_parent);
        TextView textView = (TextView) view.findViewById(R.id.googleapp_browser_contextmenu_sizelabel);
        if (!this.f369369d.f67856b) {
            this.f369374i = Optional.m71637of(UUID.randomUUID().toString());
            this.f369369d.mo30130g();
            C24898o oVar = this.f369369d;
            C135604o oVar2 = this.f369375j;
            oVar2.getClass();
            oVar.mo30127d(oVar2);
            C24898o oVar3 = this.f369369d;
            C24881p pVar = new C24881p();
            pVar.mo30108f((String) this.f369374i.get());
            C24869d dVar = new C24869d();
            dVar.mo30071d(2);
            dVar.mo30070c(this.f369378m);
            pVar.mo30106d(dVar);
            C24873h hVar = new C24873h();
            hVar.mo30082c(true);
            pVar.mo30107e(hVar);
            oVar3.mo30128e(pVar);
        }
        C6007z g = this.f369377l.mo51286a().mo11864b().mo12445g(Uri.parse(str));
        g.mo12455s(new C47663g(new C135602m(this, imageView, nestedScrollView, textView, z, relativeLayout, str)), (C5592i) null, g, C5622i.f16959a);
    }

    /* renamed from: b */
    public final void mo112409b(ImageView imageView, RelativeLayout relativeLayout) {
        int childCount = relativeLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C135600k(this, imageView));
                return;
            } else if (relativeLayout.getChildAt(childCount).getId() != R.id.googleapp_browser_contextmenu_imagepreview) {
                relativeLayout.removeViewAt(childCount);
            }
        }
    }
}
