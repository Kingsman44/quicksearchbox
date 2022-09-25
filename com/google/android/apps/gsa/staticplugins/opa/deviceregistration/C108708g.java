package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.text.TextUtils;
import com.google.assistant.p3861at.C50173ng;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58839bc;
import com.google.common.base.C58879cp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.g */
/* compiled from: PG */
public final /* synthetic */ class C108708g implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ String f302326a;

    public /* synthetic */ C108708g(String str) {
        this.f302326a = str;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        String str = this.f302326a;
        C50181no noVar = ((C50173ng) obj).f130427g;
        if (noVar == null) {
            noVar = C50181no.f130444i;
        }
        String str2 = noVar.f130446a;
        return TextUtils.equals(str2, str) || TextUtils.equals(str2.endsWith("_dev") ? C58879cp.m90964f(str2) : str2, str);
    }
}
