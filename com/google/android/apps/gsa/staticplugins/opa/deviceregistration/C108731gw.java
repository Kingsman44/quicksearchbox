package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.InetAddress;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gw */
/* compiled from: PG */
public final class C108731gw extends C83907bm {

    /* renamed from: b */
    public C83893b f302372b;

    /* renamed from: c */
    public C108556ar f302373c;

    /* renamed from: d */
    public C108635dh f302374d;

    /* renamed from: e */
    public C91090a f302375e;

    /* renamed from: f */
    public C22871g f302376f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C58976aa aaVar = C58975e.f156826a;
        C108741i iVar = this.f302373c.f302004l;
        iVar.getClass();
        boolean z = false;
        if (iVar.mo97114r() && iVar.mo97112p() != null) {
            z = true;
        }
        C58838bb.m90883r(z);
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52492a = "speaker_id_enrollment";
        c.mo24025g("oobe");
        if (this.f302372b.mo77278a().mo56113h()) {
            cVar.f52494c = ((Account) this.f302372b.mo77278a().mo56107c()).name;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("assistant_settings_device_info_device_id_extra", iVar.mo97109m());
        C49875cf b = iVar.mo97099b();
        if (b != null) {
            bundle2.putInt("assistant_settings_device_info_device_type", b.f129621v);
        }
        bundle2.putString("assistant_settings_device_info_device_certificate", iVar.mo97102e());
        InetAddress p = iVar.mo97112p();
        p.getClass();
        bundle2.putString("assistant_settings_device_info_ip_addr_extra", p.getHostAddress());
        bundle2.putString("assistant_settings_device_info_name_extra", iVar.mo97105h());
        String str = this.f302374d.f302170a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bundle2);
        c.mo24022d(arrayList);
        Intent a = c.mo24020b().mo24031a();
        if (str == null) {
            str = C90772bp.m148311s();
        }
        a.putExtra("assistant_settings_locale", str);
        this.f302375e.mo65090b(a, new C108729gu(this));
        return null;
    }
}
