package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.u */
/* compiled from: PG */
class C132051u implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C39141kp f360420a;

    /* renamed from: b */
    final /* synthetic */ int f360421b;

    public C132051u(C39141kp kpVar, int i) {
        this.f360420a = kpVar;
        this.f360421b = i;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132052v.f360422a.mo56226d()).mo56382g(th)).mo56372aa(39502)).mo56384n();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C43376u uVar = (C43376u) obj;
        C43369n a = C43369n.m76519a(uVar.f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (a.equals(C43369n.SUCCESS)) {
            ((C19567d) this.f360420a.f103042n.mo6453a()).mo24822a(1, (uVar.f113328a & 1) != 0 ? uVar.f113329b : BuildConfig.FLAVOR, Integer.valueOf(this.f360421b - 1));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
