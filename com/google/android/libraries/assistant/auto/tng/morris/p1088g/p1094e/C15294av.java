package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14617pw;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.av */
/* compiled from: PG */
public final class C15294av {

    /* renamed from: a */
    public static final C59071e f45913a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.e.av");

    /* renamed from: b */
    public static final Duration f45914b = Duration.ofMinutes(1);

    /* renamed from: c */
    public C14617pw f45915c;

    /* renamed from: d */
    public ViewGroup f45916d;

    /* renamed from: e */
    public TextView f45917e;

    /* renamed from: f */
    public TextView f45918f;

    /* renamed from: g */
    public ImageView f45919g;

    /* renamed from: h */
    public ImageView f45920h;

    /* renamed from: i */
    public View f45921i;

    /* renamed from: j */
    public View f45922j;

    /* renamed from: k */
    public C60870cx f45923k = null;

    /* renamed from: l */
    public boolean f45924l = false;

    /* renamed from: m */
    public final List f45925m;

    /* renamed from: n */
    public final C14986h f45926n;

    /* renamed from: o */
    public final C21370a f45927o;

    /* renamed from: p */
    public final C15352z f45928p;

    /* renamed from: q */
    public final C60888db f45929q;

    /* renamed from: r */
    public final C37215b f45930r;

    /* renamed from: s */
    public final C14132bf f45931s;

    public C15294av(C14986h hVar, C21370a aVar, C15352z zVar, C60888db dbVar, C37215b bVar, C14132bf bfVar) {
        ArrayList arrayList = new ArrayList();
        this.f45925m = arrayList;
        this.f45926n = hVar;
        this.f45927o = aVar;
        this.f45928p = zVar;
        this.f45929q = dbVar;
        this.f45930r = bVar;
        this.f45931s = bfVar;
        Collection.EL.forEach(arrayList, C15291as.f45910a);
        arrayList.clear();
    }

    /* renamed from: b */
    public static void m31880b(ViewGroup viewGroup, View view, ContextThemeWrapper contextThemeWrapper) {
        Fade fade = new Fade();
        fade.setDuration((long) contextThemeWrapper.getResources().getInteger(R.integer.motion_fast02));
        fade.setInterpolator(new LinearInterpolator());
        TransitionManager.endTransitions(viewGroup);
        TransitionManager.go(new Scene(viewGroup, view), fade);
    }

    /* renamed from: a */
    public final void mo22173a() {
        C60870cx cxVar = this.f45923k;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f45923k = null;
        }
    }

    /* renamed from: c */
    public final boolean mo22174c(C14501lo loVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        C14617pw pwVar = this.f45915c;
        if (pwVar != null) {
            C14501lo a = C14501lo.m30628a(pwVar.f44185a);
            if (a == null) {
                a = C14501lo.UNRECOGNIZED;
            }
            if (a == loVar) {
                return false;
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(true != (loVar == C14501lo.DESTINATION_SUGGESTION_EXPANDED || loVar == C14501lo.DESTINATION_SUGGESTION_EXPANDED_LOADING) ? R.layout.navigation_suggestion_tile_compact : R.layout.navigation_suggestion_tile, viewGroup, false);
        this.f45916d = viewGroup2;
        this.f45919g = (ImageView) viewGroup2.findViewById(R.id.destination_route_overview);
        this.f45920h = (ImageView) this.f45916d.findViewById(R.id.destination_search_button);
        this.f45917e = (TextView) this.f45916d.findViewById(R.id.destination_primary_display_text);
        this.f45918f = (TextView) this.f45916d.findViewById(R.id.destination_secondary_display_text);
        this.f45921i = this.f45916d.findViewById(R.id.loading_complete_group);
        this.f45922j = this.f45916d.findViewById(R.id.text_area_background);
        return true;
    }
}
