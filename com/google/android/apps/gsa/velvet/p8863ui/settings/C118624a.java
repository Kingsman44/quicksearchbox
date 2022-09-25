package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0396q;
import android.support.p033v7.app.C0401v;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.a */
/* compiled from: PG */
public class C118624a extends PreferenceActivity {

    /* renamed from: a */
    private C0401v f330956a;

    /* renamed from: a */
    public final C0401v mo103811a() {
        if (this.f330956a == null) {
            this.f330956a = C0401v.m1322b(this, (C0396q) null);
        }
        return this.f330956a;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo103811a().mo1178g(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo103811a();
    }

    public final View findViewById(int i) {
        return mo103811a().mo1177e(i);
    }

    public final MenuInflater getMenuInflater() {
        return mo103811a().mo1176d();
    }

    public final void invalidateOptionsMenu() {
        mo103811a().mo1180i();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo103811a().mo1181j(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0401v a = mo103811a();
        a.mo1179h();
        a.mo1149A();
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo103811a().mo1182k();
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C0356aq) mo103811a()).mo1162O();
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        mo103811a().mo1183l();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        mo103811a();
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        mo103811a().mo1184m();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mo103811a().mo1185n();
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo103811a().mo1193u(charSequence);
    }

    public final void setContentView(int i) {
        mo103811a().mo1188p(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((C0356aq) mo103811a()).f1183H = i;
    }

    public final void setContentView(View view) {
        mo103811a().mo1189q(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo103811a().mo1190r(view, layoutParams);
    }
}
