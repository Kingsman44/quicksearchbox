package com.google.android.apps.gsa.velvet.p8863ui.settings.p8864a;

import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.preferences.InterestsFragment;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118651e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.a.d */
/* compiled from: PG */
public final class C118628d implements C88992g {

    /* renamed from: a */
    private final C84474e f330957a;

    public C118628d(C84474e eVar) {
        this.f330957a = eVar;
    }

    /* renamed from: a */
    public final C58495hd mo17755a() {
        return C58495hd.m89900n(Integer.valueOf(R.xml.interests_settings), InterestsFragment.class.getName());
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
        List<PreferenceActivity.Header> a = eVar.mo103835a(R.xml.interests_preference_header);
        for (PreferenceActivity.Header header : a) {
            if (header.id == 2131432557) {
                if (this.f330957a.mo78135x()) {
                    header.titleRes = R.string.channels_and_interests;
                }
                header.intent = InterestLauncherHelper.m150800a(new InterestLauncherHelper.Options());
            }
        }
        return a;
    }
}
