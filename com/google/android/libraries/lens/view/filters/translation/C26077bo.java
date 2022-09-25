package com.google.android.libraries.lens.view.filters.translation;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.format.Formatter;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bo */
/* compiled from: PG */
public final class C26077bo {

    /* renamed from: a */
    public final C26059ax f70880a;

    /* renamed from: b */
    public final C25537t f70881b;

    /* renamed from: c */
    public final C26217r f70882c;

    /* renamed from: d */
    public final Context f70883d;

    /* renamed from: e */
    private final AccountId f70884e;

    /* renamed from: f */
    private final FragmentManager f70885f;

    public C26077bo(C26059ax axVar, C25537t tVar, C26217r rVar, AccountId accountId, Fragment fragment) {
        this.f70880a = axVar;
        this.f70881b = tVar;
        this.f70882c = rVar;
        this.f70884e = accountId;
        this.f70883d = fragment.requireContext();
        this.f70885f = fragment.getChildFragmentManager();
    }

    /* renamed from: a */
    public final String mo31277a(C26127j jVar) {
        long a = jVar.mo31234b().mo33431a();
        Context context = this.f70883d;
        return context.getString(R.string.lens_translate_download_confirm_download_size, new Object[]{Formatter.formatShortFileSize(context, a)});
    }

    /* renamed from: b */
    public final void mo31278b(C26063ba baVar, C26069bg bgVar, C26069bg bgVar2) {
        AccountId accountId = this.f70884e;
        C26065bc bcVar = new C26065bc();
        C68324h.m98669f(bcVar);
        C47247a.m84047b(bcVar, accountId);
        C47243l.m84039a(bcVar, baVar);
        bcVar.showNow(this.f70885f, "TRANSLATE_DIALOG");
        bcVar.mo17754z().f70869i = C58833ax.m90834k(bgVar);
        bcVar.mo17754z().f70870j = C58833ax.m90834k(bgVar2);
        bcVar.requireDialog();
    }
}
