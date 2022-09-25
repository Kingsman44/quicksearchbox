package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.support.p031v4.app.Fragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.protobuf.C62944bx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.e */
/* compiled from: PG */
public final class C135985e implements C139878n {

    /* renamed from: a */
    private final C62944bx f370358a;

    /* renamed from: b */
    private final Fragment f370359b;

    /* renamed from: c */
    private final PreferenceCategory f370360c;

    public C135985e(C62944bx bxVar, Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f370358a = bxVar;
        this.f370359b = fragment;
        PreferenceCategory preferenceCategory = new PreferenceCategory(fragment.requireContext());
        preferenceCategory.f12751w = false;
        preferenceCategory.mo8346M(bxVar.f169982a);
        preferenceCategory.mo8342I(false);
        this.f370360c = preferenceCategory;
    }

    /* renamed from: a */
    public final /* synthetic */ Preference mo112667a() {
        return this.f370360c;
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        C69664n.m101061g(iVar, "ve");
    }
}
