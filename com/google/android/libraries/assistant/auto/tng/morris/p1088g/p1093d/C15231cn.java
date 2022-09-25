package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SizeF;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14363gl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14364gm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15325a;
import com.google.assistant.p3931f.p3942e.C52920a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cn */
/* compiled from: PG */
public final class C15231cn {

    /* renamed from: a */
    public static final C59071e f45698a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.d.cn");

    /* renamed from: b */
    public View f45699b;

    /* renamed from: c */
    public View f45700c;

    /* renamed from: d */
    public View f45701d;

    /* renamed from: e */
    public C14592oy f45702e;

    /* renamed from: f */
    public ViewGroup f45703f;

    /* renamed from: g */
    public C15229cl f45704g;

    /* renamed from: h */
    public C60872cz f45705h;

    /* renamed from: i */
    public int f45706i;

    /* renamed from: j */
    public boolean f45707j;

    /* renamed from: k */
    public Bundle f45708k = Bundle.EMPTY;

    /* renamed from: l */
    public final C14986h f45709l;

    /* renamed from: m */
    public final Context f45710m;

    /* renamed from: n */
    public final C86124t f45711n;

    /* renamed from: o */
    public final C14132bf f45712o;

    /* renamed from: p */
    public final AppWidgetManager f45713p;

    /* renamed from: q */
    public final C60888db f45714q;

    /* renamed from: r */
    public final int f45715r;

    /* renamed from: s */
    private final C52920a f45716s = new C15225ch(this);

    public C15231cn(Context context, C14986h hVar, C86124t tVar, C14132bf bfVar, C60888db dbVar) {
        this.f45709l = hVar;
        this.f45710m = context;
        this.f45711n = tVar;
        this.f45712o = bfVar;
        this.f45713p = AppWidgetManager.getInstance(context);
        this.f45714q = dbVar;
        Resources resources = context.getResources();
        double d = (double) resources.getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        this.f45715r = (((int) (d * 0.9d)) - resources.getDimensionPixelSize(R.dimen.morris_energy_bar_height)) - resources.getDimensionPixelSize(R.dimen.immersive_card_content_minimum_margin_top);
    }

    /* renamed from: a */
    public final Bundle mo22107a(C15325a aVar, AppWidgetProviderInfo appWidgetProviderInfo) {
        float f;
        Bundle bundle = new Bundle();
        SizeF c = aVar.mo22191c(appWidgetProviderInfo);
        Rect rect = aVar.f45994a;
        int i = rect.left + rect.right;
        int max = (int) Math.max(0.0f, c.getHeight() - ((float) (rect.top + rect.bottom)));
        if ((appWidgetProviderInfo.resizeMode | 1) == 0) {
            f = Math.max(0.0f, c.getWidth() - ((float) i));
        } else {
            f = Math.max(0.0f, aVar.f45995b - ((float) i));
        }
        int i2 = (int) f;
        bundle.putString("DeviceType", "Morris");
        bundle.putInt("appWidgetMinWidth", i2);
        bundle.putInt("appWidgetMaxWidth", i2);
        bundle.putInt("appWidgetMinHeight", max);
        bundle.putInt("appWidgetMaxHeight", max);
        C52920a aVar2 = this.f45716s;
        aVar2.asBinder();
        bundle.putBinder("appActionsWidgetExtensionSender", aVar2);
        return bundle;
    }

    /* renamed from: b */
    public final void mo22108b(ContextThemeWrapper contextThemeWrapper, boolean z) {
        mo22111e();
        Animation loadAnimation = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_shelf_animate_out);
        loadAnimation.setAnimationListener(new C15227cj(this, z));
        View view = this.f45699b;
        if (view != null) {
            view.startAnimation(loadAnimation);
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_scrim_animate_out);
        loadAnimation2.setAnimationListener(new C15228ck(this));
        View view2 = this.f45700c;
        if (view2 != null) {
            view2.startAnimation(loadAnimation2);
        }
        View view3 = this.f45701d;
        if (view3 != null) {
            view3.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_fab_animate_out));
        }
    }

    /* renamed from: c */
    public final void mo22109c() {
        C60872cz czVar = this.f45705h;
        if (czVar != null) {
            czVar.cancel(true);
            this.f45705h = null;
        }
    }

    /* renamed from: d */
    public final void mo22110d(String str, String str2) {
        View view = this.f45699b;
        view.getClass();
        ((TextView) view.findViewById(R.id.immersive_title)).setText(str2);
        View view2 = this.f45699b;
        view2.getClass();
        view2.findViewById(R.id.immersive_title).setVisibility(0);
        C14986h hVar = this.f45709l;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14362gk gkVar = (C14362gk) C14365gn.f43466q.createBuilder();
        gkVar.copyOnWrite();
        ((C14365gn) gkVar.instance).f43468a = 29;
        C14363gl glVar = (C14363gl) C14364gm.f43462c.createBuilder();
        glVar.copyOnWrite();
        str2.getClass();
        ((C14364gm) glVar.instance).f43464a = str2;
        glVar.copyOnWrite();
        str.getClass();
        ((C14364gm) glVar.instance).f43465b = str;
        gkVar.copyOnWrite();
        C14364gm gmVar = (C14364gm) glVar.build();
        gmVar.getClass();
        ((C14365gn) gkVar.instance).f43481n = gmVar;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14365gn gnVar = (C14365gn) gkVar.build();
        gnVar.getClass();
        lfVar.f43801d = gnVar;
        lfVar.f43800c = 3;
        hVar.mo21875g((C14492lf) gtVar.build());
    }

    /* renamed from: e */
    public final void mo22111e() {
        ViewGroup viewGroup = this.f45703f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewGroup viewGroup2 = this.f45703f;
            viewGroup2.getClass();
            viewGroup2.setVisibility(8);
        }
        if (this.f45704g != null && this.f45707j) {
            this.f45708k.clear();
            C15229cl clVar = this.f45704g;
            clVar.getClass();
            clVar.deleteAppWidgetId(this.f45706i);
        }
    }
}
