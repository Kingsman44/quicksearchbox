package com.google.android.libraries.lens.view.p2067ak;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import p3186j$.util.Collection;

@Deprecated
/* renamed from: com.google.android.libraries.lens.view.ak.ch */
/* compiled from: PG */
public final class C25256ch {
    /* renamed from: a */
    public static C58528ij m46635a(Set set, String str) {
        String str2 = "lens_photos_account_notification_last_seen_ " + str + " ";
        return (C58528ij) Collection.EL.stream(set).filter(new C25250cb(str2)).map(new C25251cc(str2)).collect(C58370cn.f155947b);
    }

    /* renamed from: b */
    public static C58528ij m46636b(Set set) {
        return (C58528ij) Collection.EL.stream(set).filter(C25252cd.f68715a).map(C25253ce.f68716a).collect(C58370cn.f155947b);
    }

    /* renamed from: c */
    public static String m46637c(String str, String str2) {
        return "lens_photos_account_notification_last_seen_ " + str + " " + str2;
    }

    /* renamed from: d */
    public static String m46638d(String str) {
        return "opa_donate_lens_data_enabled_prefix_".concat(String.valueOf(str));
    }

    /* renamed from: e */
    public static String m46639e(String str) {
        return "lens_hats_survey_shown_".concat(String.valueOf(str));
    }
}
