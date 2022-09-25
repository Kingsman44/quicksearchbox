package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7148ui.C90703o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cq */
/* compiled from: PG */
final class C96140cq extends C90703o {

    /* renamed from: c */
    public final C58485gu f269150c;

    public C96140cq(FragmentManager fragmentManager, C58485gu guVar) {
        super(fragmentManager);
        this.f269150c = guVar;
    }

    /* renamed from: o */
    public static C96142cs m159450o(String str, String str2, String str3, String str4, String str5, Intent intent, String str6, Integer num) {
        C96142cs csVar = new C96142cs();
        Bundle bundle = new Bundle();
        bundle.putString("educational_title", str);
        bundle.putString("educational_message", str2);
        bundle.putString("educational_url", str3);
        bundle.putString("educational_url_description", str4);
        bundle.putString("educational_extra_message", str5);
        bundle.putParcelable("educational_view_extra_action", intent);
        bundle.putString("educational_view_extra_action_description", str6);
        if (num != null) {
            bundle.putInt("educational_view_extra_action_logging_event", num.intValue());
        }
        csVar.setArguments(bundle);
        return csVar;
    }

    /* renamed from: b */
    public final Fragment mo85033b(int i) {
        return (Fragment) this.f269150c.get(i);
    }

    /* renamed from: k */
    public final int mo9175k() {
        return ((C58724pq) this.f269150c).f156474d;
    }
}
