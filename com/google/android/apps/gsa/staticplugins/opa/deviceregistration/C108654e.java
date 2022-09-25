package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location.AddressEditFragment;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location.C108758e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Serializable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.e */
/* compiled from: PG */
public final class C108654e extends C83907bm implements C108758e {

    /* renamed from: b */
    public static final C59071e f302200b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.e");

    /* renamed from: c */
    public C90929bz f302201c;

    /* renamed from: d */
    public C74637ae f302202d;

    /* renamed from: e */
    public C108556ar f302203e;

    /* renamed from: f */
    public C108617cq f302204f;

    /* renamed from: g */
    public Button f302205g;

    /* renamed from: h */
    AddressEditFragment f302206h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97046e() {
        this.f302205g.setVisibility(0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.address, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44613));
        Button a = legacyOpaStandardPage.f228725d.mo77360a();
        this.f302205g = a;
        a.setOnClickListener(new C89943l(new C108529a(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108565b(this)));
        AddressEditFragment addressEditFragment = (AddressEditFragment) getChildFragmentManager().findFragmentByTag("AddressEditFragment");
        this.f302206h = addressEditFragment;
        if (addressEditFragment != null) {
            addressEditFragment.f302451p = this;
        } else {
            AddressEditFragment.AddressEditConfiguration addressEditConfiguration = new AddressEditFragment.AddressEditConfiguration();
            AddressEditFragment addressEditFragment2 = new AddressEditFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("configuration", addressEditConfiguration);
            bundle2.putString("addressLine1", (String) null);
            bundle2.putString("addressLine2", (String) null);
            bundle2.putString("fullText", (String) null);
            bundle2.putSerializable("latitude", (Serializable) null);
            bundle2.putSerializable("longitude", (Serializable) null);
            addressEditFragment2.setArguments(bundle2);
            this.f302206h = addressEditFragment2;
            addressEditFragment2.f302451p = this;
            getChildFragmentManager().beginTransaction().replace(R.id.opa_error_content_container, this.f302206h, "AddressEditFragment").commit();
        }
        C74637ae aeVar = this.f302202d;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_ASSISTANT_DEVICE_REGISTRATION);
        ((C38570a) d).f101954b = 3;
        this.f302201c.mo85147l(aeVar.mo71020c(d.mo41492a()), new C108627d(this));
        return legacyOpaStandardPage;
    }
}
