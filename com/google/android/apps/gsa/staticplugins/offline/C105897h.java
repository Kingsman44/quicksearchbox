package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.C105884a;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.C105891c;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.C105892d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.h */
/* compiled from: PG */
public final /* synthetic */ class C105897h implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ Context f295547a;

    /* renamed from: b */
    public final /* synthetic */ Locale f295548b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f295549c;

    /* renamed from: d */
    public final /* synthetic */ C86124t f295550d;

    /* renamed from: e */
    public final /* synthetic */ C91123v f295551e;

    public /* synthetic */ C105897h(Context context, Locale locale, C91123v vVar, C58833ax axVar, C86124t tVar) {
        this.f295547a = context;
        this.f295548b = locale;
        this.f295551e = vVar;
        this.f295549c = axVar;
        this.f295550d = tVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Context context = this.f295547a;
        Locale locale = this.f295548b;
        try {
            OfflineActionBuilder.f295367b = new C105884a(context, new C105892d(context, locale), locale, this.f295551e, this.f295549c, this.f295550d);
        } catch (C105891c e) {
            ((C59052c) ((C59052c) ((C59052c) OfflineActionBuilder.f295366a.mo56225c()).mo56382g(e)).mo56372aa(22478)).mo56389s("OfflineStringFactory init error:\n%s", e.getMessage());
        }
        return C118826c.f331422a;
    }
}
