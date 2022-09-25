package com.google.android.apps.gsa.staticplugins.p7684cn.p7685a;

import com.google.android.apps.gsa.eventlogger.b.c;
import com.google.android.apps.gsa.shared.util.C91080q;
import com.google.android.gms.clearcut.C143632i;
import com.google.android.gms.clearcut.C143657j;
import dagger.C68214a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.cn.a.c */
/* compiled from: PG */
public final /* synthetic */ class C98035c implements C143632i {

    /* renamed from: a */
    public final /* synthetic */ C68214a f273765a;

    public /* synthetic */ C98035c(C68214a aVar) {
        this.f273765a = aVar;
    }

    /* renamed from: a */
    public final void mo37364a(C143657j jVar) {
        C68214a aVar = this.f273765a;
        Duration duration = C98036d.f273766a;
        jVar.mo118996e(((c) aVar.mo27525b()).b.a);
        String str = (String) C91080q.m148801a(((c) aVar.mo27525b()).b.b).get("NID");
        String str2 = null;
        if (str != null && str.startsWith("NID=")) {
            str2 = str.substring(4);
        }
        if (str2 != null) {
            jVar.mo118997f(str2);
        }
    }
}
