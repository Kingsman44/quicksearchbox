package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50181no;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.al */
/* compiled from: PG */
public final class C23786al extends C23794i {
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        C69664n.m101060f(requireArguments, "requireArguments()");
        C50181no a = C23787b.m44306a(requireArguments);
        C0391l lVar = new C0391l(requireActivity());
        lVar.setTitle(getString(R.string.zero_devices_synced_dialog_title, a.f130447b));
        lVar.f1347a.f1326g = getString(R.string.zero_devices_synced_dialog_body, a.f130447b);
        lVar.setPositiveButton(17039370, new C23785ak(a, this));
        C0392m create = lVar.create();
        C69664n.m101060f(create, "override fun onCreateDia…    }\n      .create()\n  }");
        return create;
    }
}
