package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8246a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83759b;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83761d;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.shared.C106819a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.a.c */
/* compiled from: PG */
public final class C106737c implements C106740b {

    /* renamed from: a */
    private final Optional f297459a;

    public C106737c(C83564a aVar, C92125t tVar, Context context, C83761d dVar) {
        Optional optional;
        ApplicationInfo applicationInfo;
        Drawable drawable;
        Context context2 = context;
        aVar.mo76901b(this);
        C106819a aVar2 = new C106819a(context2);
        C28295m.m52919e(aVar2, new C28292j(104345));
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.aa_icon_layout, aVar2, false);
        ((TextView) aVar2.mo95680b().findViewById(R.id.aa_generic_tile_title)).setText(context2.getString(R.string.aa_app_suggestions_tile_title));
        aVar2.mo95680b().setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) aVar2.findViewById(R.id.aa_generic_card_content_container);
        viewGroup.getClass();
        viewGroup.removeAllViews();
        int a = aVar2.mo95679a();
        viewGroup.setPaddingRelative(a, 0, a, 0);
        viewGroup.addView(linearLayout);
        C58480gp e = C58485gu.m89837e();
        int i = 4;
        for (C83759b bVar : dVar.f228304a) {
            String str = bVar.f228299a;
            try {
                drawable = context.getPackageManager().getApplicationIcon(str);
                applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                drawable = null;
                applicationInfo = null;
            }
            if (drawable == null || applicationInfo == null) {
                C92125t tVar2 = tVar;
            } else {
                View inflate = LayoutInflater.from(context).inflate(R.layout.aa_app_icon_layout, linearLayout, false);
                inflate.getClass();
                TextView textView = (TextView) inflate.findViewById(R.id.aa_app_suggestions_app_name);
                textView.setText(context.getPackageManager().getApplicationLabel(applicationInfo));
                C28292j jVar = new C28292j(104346);
                jVar.mo33795i(5);
                C28295m.m52919e(textView, jVar);
                int round = Math.round(context.getResources().getDimension(R.dimen.aa_app_suggestions_icon_size));
                drawable.setBounds(new Rect(0, 0, round, round));
                textView.setCompoundDrawablesRelative((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    textView.setOnClickListener(new C106735a(context2, launchIntentForPackage, tVar, textView));
                } else {
                    C92125t tVar3 = tVar;
                }
                e.mo55395g(inflate);
                i--;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i == 4) {
            optional = Optional.empty();
        } else {
            while (i > 0) {
                e.mo55395g(LayoutInflater.from(context).inflate(R.layout.aa_app_icon_space, linearLayout, false));
                i--;
            }
            Stream stream = Collection.EL.stream(e.mo55394f());
            Objects.requireNonNull(linearLayout);
            stream.forEach(new C106736b(linearLayout));
            optional = Optional.m71637of(aVar2);
        }
        this.f297459a = optional;
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.FULL);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        return C60856cj.m92900i(this.f297459a);
    }
}
