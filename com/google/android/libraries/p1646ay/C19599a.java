package com.google.android.libraries.p1646ay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: com.google.android.libraries.ay.a */
/* compiled from: PG */
public abstract class C19599a extends Activity {

    /* renamed from: a */
    private String f54536a;

    /* renamed from: b */
    public C19600b f54537b;

    /* renamed from: c */
    private Resources.Theme f54538c;

    /* renamed from: c */
    public static Bundle m37355c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getBundle("BUNDLE_KEY_INNER_BUNDLE");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C19600b mo24852a(String str);

    /* renamed from: b */
    public final Intent mo24853b() {
        Intent intent = super.getIntent();
        if (intent == null) {
            return null;
        }
        return C19601c.m37395b(intent);
    }

    /* renamed from: d */
    public final View mo24854d(int i) {
        return super.findViewById(i);
    }

    /* renamed from: e */
    public final void mo24855e() {
        super.finish();
    }

    /* renamed from: f */
    public final void mo24856f(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final void finish() {
        super.finish();
    }

    /* renamed from: g */
    public final void mo24858g() {
        super.onBackPressed();
    }

    public final Intent getIntent() {
        Intent intent = super.getIntent();
        C19600b bVar = this.f54537b;
        if (bVar == null) {
            return intent;
        }
        Intent b = bVar.f54539k.mo24853b();
        if (intent == null || b == null) {
            return null;
        }
        return C19601c.m37396c(intent, b);
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f54538c;
        return theme == null ? super.getTheme() : theme;
    }

    /* renamed from: h */
    public final void mo24861h(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: i */
    public final void mo24862i() {
        super.onDestroy();
    }

    /* renamed from: j */
    public final void mo24863j() {
        super.onPause();
    }

    /* renamed from: k */
    public final void mo24864k() {
        super.onResume();
    }

    /* renamed from: l */
    public final void mo24865l(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: m */
    public final void mo24866m() {
        super.onStart();
    }

    /* renamed from: n */
    public final void mo24867n() {
        super.onStop();
    }

    /* renamed from: o */
    public final void mo24868o(boolean z) {
        super.onTopResumedActivityChanged(z);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f54537b.mo24898e(i, i2, intent);
    }

    public final void onBackPressed() {
        this.f54537b.mo24899f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Intent intent = super.getIntent();
        if (C19601c.m37398e(intent)) {
            String d = C19601c.m37397d(intent);
            this.f54536a = d;
            C19600b a = mo24852a(d);
            if (a != null) {
                this.f54537b = a;
                if (a.f54539k == null) {
                    a.f54539k = this;
                    this.f54538c = super.getTheme();
                    if (bundle != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bundle = m37355c(bundle);
                    }
                    a.mo24895b(bundle);
                    return;
                }
                throw new IllegalStateException("Host activity already attached! Are you re-using a DynamicActivity instance? You must create a new one every time.");
            }
            super.onCreate(bundle);
            super.finish();
            return;
        }
        throw new IllegalArgumentException("DynamicActivity got bad intent: ".concat(String.valueOf(String.valueOf(intent))));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.f54537b.mo24909q(menu);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f54537b.mo24902iO(i, keyEvent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54537b.mo24910r(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f54537b.mo24904in();
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(m37355c(bundle));
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        return this.f54537b.mo24911s(menu);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54537b.mo24896c(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        Bundle c = m37355c(bundle);
        if (c != null) {
            super.onRestoreInstanceState(c);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        this.f54537b.mo24905j();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f54537b.mo24903ih(bundle2);
        bundle.putBundle("BUNDLE_KEY_INNER_BUNDLE", bundle2);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        this.f54537b.mo24897d();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f54537b.mo24906k();
    }

    public final void onTopResumedActivityChanged(boolean z) {
        this.f54537b.mo24907l(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f54537b.mo24908m(z);
    }

    /* renamed from: p */
    public final void mo24888p() {
        super.onUserLeaveHint();
    }

    /* renamed from: q */
    public final void mo24889q(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: r */
    public final boolean mo24890r(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: s */
    public final boolean mo24891s(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setIntent(Intent intent) {
        Intent b = intent != null ? intent : mo24853b();
        super.setIntent(b != null ? C19601c.m37396c(b, C19601c.m37395b(intent)) : null);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        if (this.f54538c != null) {
            getBaseContext().setTheme(i);
        }
    }

    /* renamed from: t */
    public final boolean mo24894t(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C19600b bVar = this.f54537b;
        if (bVar != null) {
            bVar.mo24900g();
        } else {
            super.onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        C19600b bVar = this.f54537b;
        if (bVar != null) {
            bVar.mo24901iN();
        } else {
            super.onUserLeaveHint();
        }
    }
}
