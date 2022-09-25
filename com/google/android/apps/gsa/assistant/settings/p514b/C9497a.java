package com.google.android.apps.gsa.assistant.settings.p514b;

import android.content.Context;
import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.assistant.settings.shared.C73738an;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118651e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.b.a */
/* compiled from: PG */
public final class C9497a implements C88992g {

    /* renamed from: a */
    private final C68214a f32960a;

    /* renamed from: b */
    private final Context f32961b;

    /* renamed from: c */
    private final C73738an f32962c;

    public C9497a(C68214a aVar, Context context, C73738an anVar) {
        this.f32960a = aVar;
        this.f32961b = context;
        this.f32962c = anVar;
    }

    /* renamed from: a */
    public final C58495hd mo17755a() {
        return C58729pv.f156485a;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo17756b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ List mo17757c() {
        return C58485gu.m89845m();
    }

    /* renamed from: d */
    public final List mo17758d(C118651e eVar) {
        if (((bm) this.f32960a.mo27525b()).q()) {
            List<PreferenceActivity.Header> a = eVar.mo103835a(R.xml.assistant_preference_header);
            bm bmVar = (bm) this.f32960a.mo27525b();
            boolean z = bmVar.q() && !bmVar.t();
            for (PreferenceActivity.Header header : a) {
                if (header.id == 2131428889 && z) {
                    header.summary = this.f32961b.getString(R.string.assistant_language_not_supported, new Object[]{Locale.getDefault().getDisplayName()});
                }
            }
            return a;
        }
        this.f32962c.mo65209a();
        return new ArrayList();
    }
}
