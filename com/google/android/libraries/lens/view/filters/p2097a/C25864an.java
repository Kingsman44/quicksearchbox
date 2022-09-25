package com.google.android.libraries.lens.view.filters.p2097a;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.filters.a.an */
/* compiled from: PG */
public final class C25864an {

    /* renamed from: a */
    public View f70257a;

    /* renamed from: b */
    public RecyclerView f70258b;

    /* renamed from: c */
    public LayoutInflater f70259c;

    /* renamed from: d */
    public Button f70260d;

    /* renamed from: e */
    public Button f70261e;

    /* renamed from: f */
    public boolean f70262f;

    /* renamed from: g */
    public EditText f70263g;

    /* renamed from: h */
    public final Context f70264h;

    /* renamed from: i */
    public final boolean f70265i;

    /* renamed from: j */
    public final C25851aa f70266j;

    /* renamed from: k */
    public final C31863s f70267k;

    /* renamed from: l */
    public final C25504aj f70268l;

    /* renamed from: m */
    public final C28310af f70269m;

    /* renamed from: n */
    public final C28443m f70270n;

    /* renamed from: o */
    public final C25684e f70271o;

    /* renamed from: p */
    public final C28306ab f70272p;

    /* renamed from: q */
    public final C47770dh f70273q;

    /* renamed from: r */
    public C25887t f70274r;

    /* renamed from: s */
    public C25888u f70275s;

    public C25864an(String str, Context context, C25851aa aaVar, C31863s sVar, C25504aj ajVar, C28310af afVar, C28443m mVar, C25684e eVar, C28306ab abVar, C47770dh dhVar) {
        this.f70265i = "shouldShowRationaleView".equals(str);
        this.f70264h = context;
        this.f70266j = aaVar;
        this.f70267k = sVar;
        this.f70268l = ajVar;
        this.f70269m = afVar;
        this.f70270n = mVar;
        this.f70271o = eVar;
        this.f70272p = abVar;
        this.f70273q = dhVar;
    }

    /* renamed from: a */
    public final void mo31028a() {
        this.f70266j.dismissAllowingStateLoss();
        this.f70266j.getParentFragmentManager().mo467ah();
    }

    /* renamed from: b */
    public final void mo31029b() {
        this.f70258b.setVisibility(0);
        this.f70257a.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo31030c() {
        this.f70275s.f70324a.f70347k = false;
        this.f70262f = true;
        mo31029b();
    }

    /* renamed from: d */
    public final void mo31031d() {
        this.f70258b.setVisibility(8);
        this.f70257a.setVisibility(0);
    }
}
