package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.constraint.C0129a;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80848b;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80857c;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80858d;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.l */
/* compiled from: PG */
final class C81839l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Optional f223818a;

    /* renamed from: b */
    final /* synthetic */ FrameLayout f223819b;

    /* renamed from: c */
    final /* synthetic */ RectF f223820c;

    /* renamed from: d */
    final /* synthetic */ Bitmap f223821d;

    /* renamed from: e */
    final /* synthetic */ Optional f223822e;

    /* renamed from: f */
    final /* synthetic */ RectF[] f223823f;

    /* renamed from: g */
    final /* synthetic */ C81841n f223824g;

    public C81839l(C81841n nVar, Optional optional, FrameLayout frameLayout, RectF rectF, Bitmap bitmap, Optional optional2, RectF[] rectFArr) {
        this.f223824g = nVar;
        this.f223818a = optional;
        this.f223819b = frameLayout;
        this.f223820c = rectF;
        this.f223821d = bitmap;
        this.f223822e = optional2;
        this.f223823f = rectFArr;
    }

    public final void onClick(View view) {
        ((C81993bc) this.f223824g.f223835f.get()).mo75430a(view);
        C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
        C80848b bVar = C80848b.f221783a;
        akVar.copyOnWrite();
        C80833al alVar = (C80833al) akVar.instance;
        bVar.getClass();
        alVar.f221759b = bVar;
        alVar.f221758a = 8;
        ((C81564g) this.f223824g.f223834e.get()).mo73553b((C80833al) akVar.build());
        if (this.f223818a.isPresent()) {
            C81841n nVar = this.f223824g;
            FrameLayout frameLayout = this.f223819b;
            RectF rectF = this.f223820c;
            Bitmap bitmap = this.f223821d;
            RectF[] rectFArr = this.f223823f;
            nVar.f223833d.setVisibility(0);
            nVar.f223833d = frameLayout;
            nVar.f223833d.setVisibility(8);
            ConstraintLayout constraintLayout = (ConstraintLayout) nVar.f223832c.mo27525b();
            nVar.removeView(constraintLayout);
            int dimensionPixelOffset = nVar.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_ambient_visual_search_gleam_tap_preview_width);
            int dimensionPixelOffset2 = nVar.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_ambient_visual_search_gleam_tap_preview_height);
            C0129a aVar = new C0129a(-2, -2);
            aVar.leftMargin = Math.min(Math.max((int) ((rectF.centerX() * ((float) nVar.getWidth())) - (((float) dimensionPixelOffset) / 2.0f)), 0), nVar.getWidth() - dimensionPixelOffset);
            int max = Math.max((int) ((rectF.centerY() * ((float) nVar.getHeight())) - (((float) dimensionPixelOffset2) / 2.0f)), 0);
            int height = nVar.getHeight();
            aVar.topMargin = Math.min(max, ((height + height) / 3) - dimensionPixelOffset2);
            constraintLayout.setLayoutParams(aVar);
            ((ImageView) constraintLayout.findViewById(R.id.nga_ambient_visual_search_gleam_tap_preview_thumbnail)).setImageBitmap((Bitmap) this.f223822e.get());
            constraintLayout.setOnClickListener(new C81840m(nVar, rectF, bitmap, rectFArr));
            nVar.addView(constraintLayout, aVar);
            ((C81993bc) nVar.f223835f.get()).mo75435f(constraintLayout, 158851, false);
            ((C81993bc) nVar.f223835f.get()).mo75431b(constraintLayout.getRootView());
            nVar.invalidate();
            C80832ak akVar2 = (C80832ak) C80833al.f221756c.createBuilder();
            C80857c cVar = (C80857c) C80858d.f221801b.createBuilder();
            cVar.copyOnWrite();
            ((C80858d) cVar.instance).f221803a = true;
            C80858d dVar = (C80858d) cVar.build();
            akVar2.copyOnWrite();
            C80833al alVar2 = (C80833al) akVar2.instance;
            dVar.getClass();
            alVar2.f221759b = dVar;
            alVar2.f221758a = 7;
            ((C81564g) this.f223824g.f223834e.get()).mo73553b((C80833al) akVar2.build());
            return;
        }
        this.f223824g.mo75368c(this.f223820c, this.f223821d, this.f223823f);
    }
}
