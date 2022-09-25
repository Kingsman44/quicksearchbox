package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import androidx.activity.result.C0815b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C129352ai implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C129354ak f355246a;

    public /* synthetic */ C129352ai(C129354ak akVar) {
        this.f355246a = akVar;
    }

    public final void onActivityResult(Object obj) {
        C129354ak akVar = this.f355246a;
        if (((Boolean) obj).booleanValue()) {
            C59104x b = C129354ak.f355248a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GrantPermission");
            ((C59052c) ((C59052c) b).mo56372aa(38292)).mo56386p("Permission granted");
            akVar.f355250c.mo107933i();
        } else if (akVar.f355249b.shouldShowRequestPermissionRationale(akVar.mo108982a())) {
            C59104x b2 = C129354ak.f355248a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GrantPermission");
            ((C59052c) ((C59052c) b2).mo56372aa(38291)).mo56386p("Permission temporarily denied");
            Snackbar p = Snackbar.m79660p(akVar.f355249b.requireView().findViewById(R.id.assistant_permission_container), R.string.assistant_permission_denied_error, 0);
            p.mo48353t(R.string.assistant_permission_grant_button, new C129353aj(akVar));
            p.mo48343h();
        } else {
            C59104x b3 = C129354ak.f355248a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "GrantPermission");
            ((C59052c) ((C59052c) b3).mo56372aa(38290)).mo56386p("Permission permanently denied, moving to keyboard");
            C47393f.m84236g(new C130303a(BuildConfig.FLAVOR), akVar.f355249b);
        }
    }
}
