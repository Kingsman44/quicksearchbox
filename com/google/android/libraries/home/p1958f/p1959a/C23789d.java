package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50181no;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.d */
/* compiled from: PG */
public final class C23789d extends C23790e {

    /* renamed from: a */
    private final DialogInterface.OnClickListener f65182a = new C23788c(this);

    /* renamed from: a */
    public final C50181no mo29143a() {
        Bundle requireArguments = requireArguments();
        C69664n.m101060f(requireArguments, "requireArguments()");
        return C23787b.m44306a(requireArguments);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        C0391l lVar = new C0391l(requireActivity());
        lVar.setTitle(getString(R.string.unlink_provider_dialog_title, mo29143a().f130447b));
        if (mo29143a().f130453h == 0) {
            str = getString(R.string.unlink_provider_dialog_body_no_devices);
        } else {
            str = getResources().getQuantityString(R.plurals.unlink_provider_dialog_body_has_devices, mo29143a().f130453h, new Object[]{Integer.valueOf(mo29143a().f130453h)});
        }
        lVar.f1347a.f1326g = str;
        lVar.setPositiveButton(R.string.unlink_provider_dialog_button_unlink, this.f65182a);
        lVar.setNegativeButton(17039360, this.f65182a);
        C0392m create = lVar.create();
        C69664n.m101060f(create, "Builder(requireActivity(…Listener)\n      .create()");
        return create;
    }
}
