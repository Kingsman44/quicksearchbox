package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.d */
/* compiled from: PG */
final class C26177d extends C26135ad {

    /* renamed from: a */
    public C25327c f71108a;

    /* renamed from: b */
    public C58833ax f71109b;

    /* renamed from: c */
    public Locale f71110c;

    /* renamed from: d */
    public String f71111d;

    /* renamed from: e */
    public C58833ax f71112e;

    /* renamed from: f */
    public String f71113f;

    /* renamed from: g */
    private boolean f71114g;

    /* renamed from: h */
    private boolean f71115h;

    /* renamed from: i */
    private boolean f71116i;

    /* renamed from: j */
    private boolean f71117j;

    /* renamed from: k */
    private C58833ax f71118k;

    /* renamed from: l */
    private byte f71119l;

    public C26177d() {
        C58836b bVar = C58836b.f156633a;
        this.f71109b = bVar;
        this.f71112e = bVar;
        this.f71118k = bVar;
    }

    public C26177d(C26136ae aeVar) {
        C58836b bVar = C58836b.f156633a;
        this.f71109b = bVar;
        this.f71112e = bVar;
        this.f71118k = bVar;
        C26178e eVar = (C26178e) aeVar;
        this.f71114g = eVar.f71120a;
        this.f71115h = eVar.f71121b;
        this.f71108a = eVar.f71122c;
        this.f71109b = eVar.f71123d;
        this.f71116i = eVar.f71124e;
        this.f71110c = eVar.f71125f;
        this.f71117j = eVar.f71126g;
        this.f71111d = eVar.f71127h;
        this.f71112e = eVar.f71128i;
        this.f71118k = eVar.f71129j;
        this.f71113f = eVar.f71130k;
        this.f71119l = 15;
    }

    /* renamed from: a */
    public final C26136ae mo31355a() {
        C25327c cVar;
        Locale locale;
        String str;
        String str2;
        if (this.f71119l == 15 && (cVar = this.f71108a) != null && (locale = this.f71110c) != null && (str = this.f71111d) != null && (str2 = this.f71113f) != null) {
            return new C26178e(this.f71114g, this.f71115h, cVar, this.f71109b, this.f71116i, locale, this.f71117j, str, this.f71112e, this.f71118k, str2);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f71119l & 1) == 0) {
            sb.append(" isSelected");
        }
        if ((this.f71119l & 2) == 0) {
            sb.append(" isEnabled");
        }
        if (this.f71108a == null) {
            sb.append(" downloadState");
        }
        if ((this.f71119l & 4) == 0) {
            sb.append(" shouldShowTooltip");
        }
        if (this.f71110c == null) {
            sb.append(" locale");
        }
        if ((this.f71119l & 8) == 0) {
            sb.append(" isRecent");
        }
        if (this.f71111d == null) {
            sb.append(" displayName");
        }
        if (this.f71113f == null) {
            sb.append(" endonym");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo31356b(C26132aa aaVar) {
        this.f71118k = C58833ax.m90834k(aaVar);
    }

    /* renamed from: c */
    public final void mo31357c(boolean z) {
        this.f71115h = z;
        this.f71119l = (byte) (this.f71119l | 2);
    }

    /* renamed from: d */
    public final void mo31358d(boolean z) {
        this.f71117j = z;
        this.f71119l = (byte) (this.f71119l | 8);
    }

    /* renamed from: e */
    public final void mo31359e(boolean z) {
        this.f71114g = z;
        this.f71119l = (byte) (this.f71119l | 1);
    }

    /* renamed from: f */
    public final void mo31360f(boolean z) {
        this.f71116i = z;
        this.f71119l = (byte) (this.f71119l | 4);
    }
}
