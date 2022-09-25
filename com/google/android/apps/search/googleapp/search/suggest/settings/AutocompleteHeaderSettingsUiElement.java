package com.google.android.apps.search.googleapp.search.suggest.settings;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.PreferenceCategory;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139868d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AutocompleteHeaderSettingsUiElement implements C139868d {

    /* renamed from: a */
    private final C138349e f376386a;

    /* compiled from: PG */
    public final class AutocompleteHeaderPreferenceCategory extends PreferenceCategory {
        public AutocompleteHeaderPreferenceCategory(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo8313a(C3998ax axVar) {
            C69664n.m101061g(axVar, "viewHolder");
            super.mo8313a(axVar);
            View a = axVar.mo8435a(16908304);
            TextView textView = a instanceof TextView ? (TextView) a : null;
            if (textView != null) {
                textView.setSingleLine(false);
            }
        }
    }

    public AutocompleteHeaderSettingsUiElement(Context context, C138349e eVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(eVar, "headerInfo");
        this.f376386a = eVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return -1;
    }

    /* renamed from: b */
    public final /* synthetic */ Fragment mo112669b() {
        C138349e eVar = this.f376386a;
        C138352h hVar = new C138352h();
        C68324h.m98669f(hVar);
        C47243l.m84039a(hVar, eVar);
        return hVar;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
