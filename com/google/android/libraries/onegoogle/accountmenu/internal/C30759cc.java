package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.cc */
/* compiled from: PG */
public final class C30759cc extends C30712aj {

    /* renamed from: e */
    public int f83020e = -1;

    /* renamed from: f */
    public boolean f83021f;

    /* renamed from: g */
    public View f83022g;

    /* renamed from: h */
    private boolean f83023h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Dialog mo36407a() {
        C30779w wVar = new C30779w(getContext());
        wVar.mo36448j(getActivity(), this.f83020e, this.f83022g);
        return wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C30718ap mo36408b(Context context) {
        C19559g.m37304c();
        C30305n nVar = this.f82921b;
        if (nVar != null) {
            this.f83023h = nVar.mo35860k().mo36182o().mo56113h();
        }
        if (this.f83023h) {
            context = new ContextThemeWrapper(context, 2132149666);
        }
        C30753bx bxVar = new C30753bx(context);
        this.f82920a.mo36610c(new C30758cb(this, bxVar));
        return bxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo36410d(C58485gu guVar) {
        C30914an.m57706a(new C30755bz(this, guVar));
    }

    /* renamed from: f */
    public final void mo36458f(List list) {
        C19559g.m37304c();
        if (list.isEmpty()) {
            dismiss();
        } else {
            ((C30746bq) getDialog()).mo36448j(getActivity(), this.f83020e, this.f83022g);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f83021f = getResources().getBoolean(R.bool.is_large_screen);
        this.f83020e = getArguments().getInt("$OneGoogle$AnchorId", -1);
        if (bundle != null) {
            this.f83023h = bundle.getBoolean("$OneGoogle$EnlargedDiscs", false);
        }
    }

    public final void onResume() {
        super.onResume();
        this.f82920a.mo36610c(new C30754by(this));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("$OneGoogle$EnlargedDiscs", this.f83023h);
    }
}
