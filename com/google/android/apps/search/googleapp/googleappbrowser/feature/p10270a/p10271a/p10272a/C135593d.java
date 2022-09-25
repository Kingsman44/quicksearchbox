package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.p033v7.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.RenderableGleam;
import com.google.android.libraries.lens.sdk.intent.C24943e;
import com.google.android.libraries.lens.sdk.intent.C24945g;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62471cu;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.d */
/* compiled from: PG */
public final class C135593d {

    /* renamed from: c */
    private static final C59071e f369335c = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.d");

    /* renamed from: a */
    public final C28443m f369336a;

    /* renamed from: b */
    public final boolean f369337b;

    /* renamed from: d */
    private final ImageView f369338d;

    /* renamed from: e */
    private final RelativeLayout f369339e;

    /* renamed from: f */
    private final C28306ab f369340f;

    /* renamed from: g */
    private final C47770dh f369341g;

    public C135593d(ImageView imageView, RelativeLayout relativeLayout, C28306ab abVar, C28443m mVar, C47770dh dhVar, boolean z) {
        this.f369338d = imageView;
        this.f369339e = relativeLayout;
        this.f369340f = abVar;
        this.f369336a = mVar;
        this.f369341g = dhVar;
        this.f369337b = z;
    }

    /* renamed from: a */
    public static RectF m219836a(RenderableGleam renderableGleam) {
        C62445bv bvVar = renderableGleam.f67924b.f68847h;
        if (bvVar == null) {
            bvVar = C62445bv.f168618e;
        }
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        float f = brVar.f168611b;
        float f2 = brVar.f168613d;
        float f3 = f - (f2 / 2.0f);
        float f4 = brVar.f168612c;
        float f5 = brVar.f168614e;
        float f6 = f4 - (f5 / 2.0f);
        return new RectF(f3, f6, f2 + f3, f5 + f6);
    }

    /* renamed from: c */
    public static void m219837c(Bitmap bitmap, RectF rectF, Context context, RectF[] rectFArr, boolean z) {
        C24943e eVar = new C24943e();
        eVar.f68071a.putByteArray("lens_init_params", C62471cu.f168676c.toByteArray());
        eVar.mo30178n(SystemClock.elapsedRealtimeNanos());
        eVar.f68071a.putLong("start_streaming_time_nanos", 0);
        eVar.mo30179o();
        eVar.mo30173i(C62433bj.UNKNOWN.f168594ao);
        eVar.f68071a.putInt("theme", 0);
        eVar.f68071a.putLong("handover_session_id", 0);
        eVar.mo30174j(false);
        eVar.mo30179o();
        eVar.mo30176l(new LensImage(bitmap));
        eVar.mo30173i(C62433bj.LENS_IN_GOOGLE_APP_BROWSER_CONTEXT_MENU_ITEM.f168594ao);
        eVar.mo30177m(rectF);
        if (z) {
            eVar.mo30172h(rectFArr);
        }
        try {
            C24945g.m46175b(context, eVar);
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f369335c.mo56225c()).mo56382g(e)).mo56372aa(40596)).mo56386p("Unable to open OneLens due to fatal error.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo112401b(Bitmap bitmap, C24877l lVar) {
        if (lVar.mo30092a()) {
            int width = this.f369338d.getWidth();
            int height = this.f369338d.getHeight();
            RenderableGleam[] b = lVar.mo30093b();
            b.getClass();
            RenderableGleam[] renderableGleamArr = b;
            RectF[] rectFArr = (RectF[]) DesugarArrays.stream((T[]) renderableGleamArr).map(C135590a.f369329a).toArray(C135591b.f369330a);
            int i = 0;
            for (int length = renderableGleamArr.length; i < length; length = length) {
                RenderableGleam renderableGleam = renderableGleamArr[i];
                C62445bv bvVar = renderableGleam.f67924b.f68847h;
                if (bvVar == null) {
                    bvVar = C62445bv.f168618e;
                }
                C62441br brVar = bvVar.f168621b;
                if (brVar == null) {
                    brVar = C62441br.f168608h;
                }
                float f = brVar.f168611b;
                float f2 = brVar.f168613d;
                float f3 = brVar.f168612c;
                float f4 = brVar.f168614e;
                RectF a = m219836a(renderableGleam);
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.f369339e.getContext());
                Drawable drawable = this.f369339e.getResources().getDrawable(R.drawable.googleapp_browser_contextmenu_gleamcircle);
                appCompatImageView.setImageDrawable(drawable);
                appCompatImageView.setBackgroundDrawable(drawable);
                appCompatImageView.setElevation((float) this.f369339e.getResources().getDimensionPixelSize(R.dimen.gm3_sys_elevation_level3));
                C28306ab abVar = this.f369340f;
                RenderableGleam[] renderableGleamArr2 = renderableGleamArr;
                abVar.mo33801b(appCompatImageView, abVar.f76990a.mo33805a(C28427h.m53115a(152622)));
                appCompatImageView.setOnClickListener(new C47591co(this.f369341g, "Gleam Clicked", new C135592c(this, bitmap, a, rectFArr)));
                double intrinsicHeight = (double) appCompatImageView.getDrawable().getIntrinsicHeight();
                Double.isNaN(intrinsicHeight);
                double d = intrinsicHeight / 2.0d;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(appCompatImageView.getDrawable().getIntrinsicWidth(), appCompatImageView.getDrawable().getIntrinsicHeight());
                layoutParams.addRule(5, R.id.googleapp_browser_contextmenu_imagepreview);
                layoutParams.addRule(6, R.id.googleapp_browser_contextmenu_imagepreview);
                double d2 = (double) (((f3 - (f4 / 2.0f)) + (brVar.f168614e / 2.0f)) * ((float) height));
                Double.isNaN(d2);
                layoutParams.topMargin = (int) (d2 - d);
                double d3 = (double) (((f - (f2 / 2.0f)) + (brVar.f168613d / 2.0f)) * ((float) width));
                Double.isNaN(d3);
                layoutParams.leftMargin = (int) (d3 - d);
                this.f369339e.addView(appCompatImageView, layoutParams);
                i++;
                renderableGleamArr = renderableGleamArr2;
                rectFArr = rectFArr;
            }
        }
    }
}
