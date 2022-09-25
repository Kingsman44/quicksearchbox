package com.google.android.apps.gsa.assistant.settings.features.p540ae.p542b;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.C9907at;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.C9917ba;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.C9922bf;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.assistant.p3861at.C50268qu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.b.a */
/* compiled from: PG */
public final class C9915a {

    /* renamed from: a */
    private static final C59071e f34012a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ae.b.a");

    /* renamed from: a */
    public static C72856b m24681a(Context context, C86124t tVar, Bundle bundle) {
        Fragment fragment;
        if (bundle.containsKey("subsection")) {
            try {
                byte[] byteArray = bundle.getByteArray("subsection");
                if (byteArray != null) {
                    c d = C72856b.m107584d();
                    d.d = 2;
                    C62921ba a = C62921ba.m95368a();
                    C9917ba baVar = new C9917ba();
                    C68324h.m98669f(baVar);
                    C47243l.m84039a(baVar, (C50268qu) C62942bv.parseFrom((C62942bv) C50268qu.f130720e, byteArray, a));
                    d.b = Optional.m71637of(baVar);
                    return d.a();
                }
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f34012a.mo56226d()).mo56382g(e)).mo56372aa(967)).mo56386p("Main Page subsection parsing failed.");
            }
        }
        c d2 = C72856b.m107584d();
        c cVar = d2;
        cVar.d = 2;
        d2.g(context.getString(R.string.assistant_settings_main_screen_title_v2));
        d2.h(1);
        if (tVar.mo79746e(C90059dk.f249098bH)) {
            fragment = new C9922bf();
            C68324h.m98669f(fragment);
        } else {
            fragment = C9907at.m24667a();
        }
        cVar.b = Optional.m71637of(fragment);
        d2.c(C89849ae.OPA_SETTINGS_PAGE_MAIN);
        return d2.a();
    }
}
