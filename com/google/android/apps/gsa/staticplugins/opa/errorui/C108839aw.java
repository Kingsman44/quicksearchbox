package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.C143876h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.aw */
/* compiled from: PG */
public final class C108839aw extends C83907bm {

    /* renamed from: b */
    public C68214a f302636b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C58976aa aaVar = C58975e.f156826a;
        if (i == 13) {
            mo77318iT().mo77312a();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.error_gmscore_unavailable, (ViewGroup) null);
        int a = ((C84413ad) this.f302636b.mo27525b()).mo77964a();
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    i = R.string.opa_gmscore_unavailable_button_no_recovery;
                    if (a == 9) {
                        i2 = R.string.opa_gmscore_unavailable_message_invalid;
                    } else if (a != 18) {
                        if (a != 19) {
                            i2 = R.string.opa_gmscore_unavailable_message_unknown;
                        } else {
                            i2 = R.string.opa_gmscore_unavailable_message_permissions;
                            i = R.string.opa_gmscore_unavailable_button_permissions;
                        }
                    }
                } else {
                    i2 = R.string.opa_gmscore_unavailable_message_disabled;
                    i = R.string.opa_gmscore_unavailable_button_disabled;
                }
            }
            i2 = R.string.opa_gmscore_unavailable_message_update;
            i = R.string.opa_gmscore_unavailable_button_update;
        } else {
            i2 = R.string.opa_gmscore_unavailable_message_missing;
            i = R.string.opa_gmscore_unavailable_button_missing;
        }
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.opa_gmscore_unavailable_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout2.f228719b, C84018m.m133906a(i2, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
        FooterLayout footerLayout = legacyOpaStandardPage.f228725d;
        C84018m.m133907b(footerLayout.mo77360a(), i, footerLayout);
        C84413ad adVar = (C84413ad) this.f302636b.mo27525b();
        int i3 = C143699aa.f389596a;
        Intent k = C143876h.f389991d.mo119363k((Context) null, a, (String) null);
        if (k != null) {
            legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108837au(this, k)));
        } else {
            legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108838av(this)));
        }
        return legacyOpaStandardPage;
    }
}
