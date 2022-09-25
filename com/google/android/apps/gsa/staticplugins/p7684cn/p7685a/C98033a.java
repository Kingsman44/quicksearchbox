package com.google.android.apps.gsa.staticplugins.p7684cn.p7685a;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.search.p3047m.p3048a.C39224b;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.cn.a.a */
/* compiled from: PG */
final class C98033a implements C86109e {

    /* renamed from: a */
    final /* synthetic */ Context f273762a;

    /* renamed from: b */
    final /* synthetic */ C68214a f273763b;

    /* renamed from: c */
    final /* synthetic */ C90851k f273764c;

    public C98033a(Context context, C90851k kVar, C68214a aVar) {
        this.f273762a = context;
        this.f273764c = kVar;
        this.f273763b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo70818a(C86124t tVar, C86117m mVar) {
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C39224b.m68653a(this.f273762a, this.f273764c.mo85210c("Permissions"), C58485gu.m89842j((Collection) this.f273763b.mo27525b()));
        }
    }
}
