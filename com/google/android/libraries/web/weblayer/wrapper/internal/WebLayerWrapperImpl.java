package com.google.android.libraries.web.weblayer.wrapper.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.android.p445a.C8850c;
import java.util.Collection;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72342bk;
import org.chromium.p5643b.p5644a.C72356o;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72615d;
import org.chromium.weblayer.C72618g;
import org.chromium.weblayer.C72619h;
import org.chromium.weblayer.C72621j;
import org.chromium.weblayer.C72629r;
import org.chromium.weblayer.C72630s;
import org.chromium.weblayer.C72631t;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebLayerWrapperImpl implements C44315a {

    /* renamed from: a */
    public final C71548cy f115239a;

    /* renamed from: b */
    private final Context f115240b;

    public WebLayerWrapperImpl(Context context, C43234b bVar) {
        C69664n.m101061g(context, "context");
        String str = bVar.f112984c;
        if (Build.VERSION.SDK_INT >= 30 && str.length() > 0) {
            context = context.createAttributionContext(str);
        }
        C69664n.m101060f(context, "if (VERSION.SDK_INT >= V…} else {\n      this\n    }");
        this.f115240b = context;
        this.f115239a = C71574dx.m104480b(false);
    }

    /* renamed from: a */
    public final int mo47210a() {
        Context context = this.f115240b;
        C72604bm.m107399a();
        return C72611bt.m107417e(context).f193160d;
    }

    /* renamed from: b */
    public final Intent mo47211b(String str, boolean z) {
        C69664n.m101061g(str, "profileName");
        Context context = this.f115240b;
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 100) {
            Bundle b = C72342bk.m106990b(str, z);
            b.putString("fragment_name", "accessibility");
            return C72342bk.m106989a(context, b);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final Intent mo47212c(String str, boolean z) {
        C69664n.m101061g(str, "profileName");
        Context context = this.f115240b;
        Bundle b = C72342bk.m106990b(str, z);
        b.putString("fragment_name", "category_list");
        return C72342bk.m106989a(context, b);
    }

    /* renamed from: d */
    public final Fragment mo47213d(C72619h hVar) {
        C72604bm.m107399a();
        String d = C72611bt.m107416d(hVar.f193191b);
        boolean z = true;
        if (!hVar.f193190a && !BuildConfig.FLAVOR.equals(d)) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("profile_name", d);
        String str = hVar.f193192c;
        if (str != null) {
            bundle.putString("persistence_id", str);
        }
        bundle.putBoolean("is_incognito", z);
        bundle.putBoolean("use_view_model", hVar.f193193d);
        C72618g gVar = new C72618g();
        gVar.setArguments(bundle);
        gVar.getLifecycle().mo5790b(new WebLayerWrapperImpl$createBrowserFragment$1$1(this));
        return gVar;
    }

    /* renamed from: e */
    public final Collection mo47214e() {
        return C72587aw.m107320a();
    }

    /* renamed from: f */
    public final C72615d mo47215f(Fragment fragment) {
        C69664n.m101061g(fragment, "browserFragment");
        if (!(fragment instanceof C72618g)) {
            return null;
        }
        C72604bm.m107399a();
        C72615d dVar = ((C72618g) fragment).f193187a;
        if (dVar != null) {
            return dVar;
        }
        throw new RuntimeException("Browser is available only between BrowserFragment's onCreate() and onDestroy().");
    }

    /* renamed from: g */
    public final C72631t mo47216g() {
        Context context = this.f115240b;
        C72604bm.m107399a();
        C72631t tVar = C72630s.f193203a;
        Context applicationContext = context.getApplicationContext();
        if (tVar.f193205b == null) {
            try {
                tVar.f193205b = C72611bt.m107417e(applicationContext).mo64481b().mo63788u(new C72341bj(applicationContext), new C72341bj(C72611bt.m107414b(applicationContext)));
                C72356o oVar = tVar.f193205b;
                C72629r rVar = new C72629r(tVar);
                Parcel gA = oVar.mo17260gA();
                C8850c.m23499h(gA, rVar);
                oVar.mo17262he(1, gA);
            } catch (Exception e) {
                throw new C72304a(e);
            }
        }
        return tVar;
    }

    /* renamed from: h */
    public final C72611bt mo47217h() {
        C72611bt g = C72611bt.m107419g(this.f115240b);
        if (g == null) {
            return null;
        }
        this.f115239a.mo62807f(true);
        return g;
    }

    /* renamed from: i */
    public final void mo47218i(C72621j jVar) {
        C69664n.m101061g(jVar, "callback");
        C72611bt.m107420h(this.f115240b, new C44316a(jVar, this));
    }

    /* renamed from: j */
    public final boolean mo47219j() {
        return C72611bt.m107422j(this.f115240b);
    }
}
