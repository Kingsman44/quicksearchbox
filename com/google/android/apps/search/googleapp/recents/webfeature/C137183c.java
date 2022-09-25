package com.google.android.apps.search.googleapp.recents.webfeature;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.C133124i;
import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.p10535w.C139856b;
import com.google.android.apps.search.googleapp.recents.C137177k;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3354a.C43317a;
import com.google.android.libraries.web.p3353c.p3354a.C43321e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.recents.webfeature.c */
/* compiled from: PG */
public final class C137183c implements C43321e, C43317a {

    /* renamed from: e */
    private static final C59071e f373286e = C59071e.m91332i("com.google.android.apps.search.googleapp.recents.webfeature.c");

    /* renamed from: a */
    public final C137177k f373287a;

    /* renamed from: b */
    public final boolean f373288b;

    /* renamed from: c */
    public final C136832c f373289c;

    /* renamed from: d */
    public Fragment f373290d;

    /* renamed from: f */
    private final C133110a f373291f;

    /* renamed from: g */
    private final C133103au f373292g;

    /* renamed from: h */
    private final AtomicReference f373293h;

    /* renamed from: i */
    private final C46175b f373294i;

    /* renamed from: j */
    private final AccountId f373295j;

    /* renamed from: k */
    private final C60887da f373296k;

    public C137183c(C137177k kVar, boolean z, C133110a aVar, C133103au auVar, AtomicReference atomicReference, C136832c cVar, C46175b bVar, AccountId accountId, C60887da daVar) {
        this.f373287a = kVar;
        this.f373288b = z;
        this.f373291f = aVar;
        this.f373292g = auVar;
        this.f373293h = atomicReference;
        this.f373289c = cVar;
        this.f373294i = bVar;
        this.f373295j = accountId;
        this.f373296k = daVar;
    }

    /* renamed from: c */
    private final void m222982c(String str, Bitmap bitmap) {
        String str2 = (String) this.f373293h.get();
        if (str2 != null) {
            C133103au auVar = this.f373292g;
            C133124i iVar = (C133124i) C133125j.f362919l.createBuilder();
            iVar.copyOnWrite();
            C133125j jVar = (C133125j) iVar.instance;
            jVar.f362921a |= 4;
            jVar.f362924d = str;
            iVar.copyOnWrite();
            C133125j jVar2 = (C133125j) iVar.instance;
            jVar2.f362921a |= 1;
            jVar2.f362922b = str;
            iVar.copyOnWrite();
            C133125j jVar3 = (C133125j) iVar.instance;
            jVar3.f362921a |= 8;
            jVar3.f362925e = str2;
            C46459k.m82829b(auVar.mo110976e(iVar, bitmap, false), "saveSrpTab failed", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo46415a(C43376u uVar) {
        Bitmap bitmap;
        if ((uVar.f113328a & 4) != 0) {
            ((C59052c) ((C59052c) f373286e.mo56224b()).mo56372aa(40940)).mo56386p("#onPageLoadEnd - WebState error.");
        } else if (this.f373291f.mo110979b()) {
            String b = this.f373289c.mo113396b(Uri.parse(uVar.f113329b));
            if (b != null) {
                Fragment fragment = this.f373290d;
                if (fragment == null) {
                    bitmap = null;
                } else {
                    bitmap = C139856b.m227400a(fragment);
                }
                m222982c(b, bitmap);
            }
        } else {
            C60870cx c = this.f373294i.mo50246c(this.f373295j);
            C137182b bVar = new C137182b(this, uVar);
            C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(bVar), this.f373296k), "#onPageLoadEnd - Failed to save SRP", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo46420b(C43376u uVar) {
        if (!this.f373291f.mo110979b()) {
            return;
        }
        if ((uVar.f113328a & 4) == 0) {
            String b = this.f373289c.mo113396b(Uri.parse(uVar.f113329b));
            if (b != null) {
                m222982c(b, (Bitmap) null);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f373286e.mo56224b()).mo56372aa(40941)).mo56386p("#onPageLoadStart - WebState error.");
    }
}
