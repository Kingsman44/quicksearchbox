package com.google.android.apps.gsa.staticplugins.opa.p8410s;

import android.app.Activity;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8414d.C109997a;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40064b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40462f;
import com.google.common.base.C58833ax;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.d */
/* compiled from: PG */
public final class C109996d {
    /* renamed from: a */
    public static C40064b m183203a(Activity activity, C21232ab abVar, C58833ax axVar, C58833ax axVar2) {
        Object obj;
        boolean booleanValue = ((Boolean) axVar.mo56109e(false)).booleanValue();
        if (booleanValue) {
            obj = C109986b.f306450a;
        } else {
            obj = C109993c.f306457a;
        }
        return new C40462f(activity, abVar, C58833ax.m90834k(new C109997a(activity, ((Boolean) axVar2.mo56109e(false)).booleanValue(), booleanValue)), C58833ax.m90834k(obj));
    }

    /* renamed from: b */
    public static Executor m183204b(C90851k kVar) {
        return kVar.mo85210c("AssistantElementsLightweightExecutor");
    }
}
