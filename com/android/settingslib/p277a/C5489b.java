package com.android.settingslib.p277a;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.android.settingslib.a.b */
/* compiled from: PG */
public class C5489b extends C0167am {

    /* renamed from: j */
    private C5491d f16633j;

    /* renamed from: k */
    private final C5491d mo103262k() {
        if (this.f16633j == null) {
            this.f16633j = new C5491d(new C5488a(this));
        }
        return this.f16633j;
    }

    public final void onBackPressed() {
        this.f2707h.mo3340c();
        if (mo545jw().mo471b() == 0) {
            finishAfterTransition();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5491d k = mo103262k();
        View inflate = getLayoutInflater().inflate(R.layout.collapsing_toolbar_base_layout, (ViewGroup) null, false);
        if (inflate instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
        }
        k.f16634a = (CollapsingToolbarLayout) inflate.findViewById(R.id.collapsing_toolbar);
        k.f16635b = (AppBarLayout) inflate.findViewById(R.id.app_bar);
        CollapsingToolbarLayout collapsingToolbarLayout = k.f16634a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.f115699a.f116669t = 1.1f;
        }
        AppBarLayout appBarLayout = k.f16635b;
        if (appBarLayout != null) {
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            behavior.f115685b = new C5490c();
            ((C1773f) appBarLayout.getLayoutParams()).mo4974a(behavior);
        }
        k.f16637d = (FrameLayout) inflate.findViewById(R.id.content_frame);
        Log.d("CTBdelegate", "onCreateView: from NonAppCompatActivity.");
        k.f16636c = (Toolbar) inflate.findViewById(R.id.action_bar);
        C5488a aVar = k.f16638e;
        super.setActionBar(k.f16636c);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView(inflate);
    }

    public boolean onNavigateUp() {
        if (mo545jw().mo471b() > 0) {
            mo545jw().mo462ac();
        }
        if (mo545jw().mo471b() != 0) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    public final void setContentView(int i) {
        ViewGroup viewGroup;
        C5491d dVar = this.f16633j;
        if (dVar == null) {
            viewGroup = (ViewGroup) findViewById(R.id.content_frame);
        } else {
            viewGroup = dVar.f16637d;
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, viewGroup);
    }

    public final void setTitle(int i) {
        mo103262k().mo11826a(getText(i));
    }

    public final void setTitle(CharSequence charSequence) {
        mo103262k().mo11826a(charSequence);
    }

    public final void setContentView(View view) {
        ViewGroup viewGroup;
        C5491d dVar = this.f16633j;
        if (dVar == null) {
            viewGroup = (ViewGroup) findViewById(R.id.content_frame);
        } else {
            viewGroup = dVar.f16637d;
        }
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup;
        C5491d dVar = this.f16633j;
        if (dVar == null) {
            viewGroup = (ViewGroup) findViewById(R.id.content_frame);
        } else {
            viewGroup = dVar.f16637d;
        }
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
    }
}
