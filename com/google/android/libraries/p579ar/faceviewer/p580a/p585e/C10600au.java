package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.faceviewer.C10635b;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10636a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10658i;
import com.google.android.libraries.p579ar.faceviewer.utils.C10673f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59394b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.p4723b.C62711b;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.au */
/* compiled from: PG */
public final class C10600au implements C10652c, C10658i, C10609j {

    /* renamed from: a */
    public static final C59071e f35431a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.e.au");

    /* renamed from: b */
    public final SettableFuture f35432b = new SettableFuture();

    /* renamed from: c */
    public final SettableFuture f35433c = new SettableFuture();

    /* renamed from: d */
    public final SettableFuture f35434d = new SettableFuture();

    /* renamed from: e */
    public final Context f35435e;

    /* renamed from: f */
    public final C62711b f35436f;

    /* renamed from: g */
    public final C10587ah f35437g;

    /* renamed from: h */
    public final C10610k f35438h;

    /* renamed from: i */
    public final Executor f35439i;

    /* renamed from: j */
    public final C10673f f35440j;

    /* renamed from: k */
    public C10653d f35441k;

    /* renamed from: l */
    public C10619t f35442l;

    public C10600au(Context context, C10636a aVar, C62711b bVar, C10635b bVar2, Executor executor, Executor executor2) {
        this.f35435e = context;
        this.f35436f = bVar;
        C10610k kVar = new C10610k(context, aVar, executor, bVar, this, C10610k.f35456a);
        this.f35438h = kVar;
        C10587ah ahVar = new C10587ah(context, bVar, kVar);
        this.f35437g = ahVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.product_banner_height);
        ahVar.f35408b.setLayoutParams(layoutParams);
        this.f35439i = new C60904dr(executor2);
        this.f35440j = new C10673f(executor);
    }

    /* renamed from: a */
    public final C60870cx mo18652a() {
        return this.f35440j.mo18712b(new C10597ar(this));
    }

    /* renamed from: b */
    public final void mo18627b() {
        C60870cx a;
        C60870cx a2;
        if (this.f35441k != null) {
            C60870cx[] cxVarArr = new C60870cx[3];
            C10619t tVar = this.f35442l;
            synchronized (tVar.f35488c) {
                Iterator it = tVar.f35489d.iterator();
                while (it.hasNext()) {
                    ((C60870cx) it.next()).cancel(true);
                }
                a = tVar.f35488c.mo18711a();
            }
            cxVarArr[0] = a;
            C10610k kVar = this.f35438h;
            synchronized (kVar.f35460e) {
                kVar.mo18659d();
                a2 = kVar.f35460e.mo18711a();
            }
            cxVarArr[1] = a2;
            cxVarArr[2] = this.f35440j.mo18711a();
            C59394b.m92296b(C60856cj.m92893b(cxVarArr).mo57336c(new C10596aq(this), ((C10650a) this.f35441k).f35547c), Level.WARNING, "Failure executing dispose().");
        }
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
        this.f35441k = dVar;
        if (this.f35442l == null) {
            C10650a aVar = (C10650a) dVar;
            this.f35442l = new C10619t(aVar.f35548d, aVar.f35546b, aVar.f35547c);
        }
        if (!this.f35432b.isDone()) {
            C10650a aVar2 = (C10650a) dVar;
            this.f35432b.mo57358p(C60922j.m93045h(aVar2.f35549e.f35544c.f35563d.f35360c, new C10591al(this), aVar2.f35546b));
        }
        if (!this.f35434d.isDone()) {
            C10650a aVar3 = (C10650a) dVar;
            this.f35434d.mo57358p(C60922j.m93044g(aVar3.f35549e.f35544c.f35563d.f35360c, new C10592am(this), aVar3.f35547c));
        }
        C10650a aVar4 = (C10650a) dVar;
        aVar4.f35549e.f35542a.mo18638g(C10654e.PROTO_DOWNLOAD_AND_INIT);
        this.f35433c.mo57358p(C60922j.m93045h(this.f35432b, new C10593an(dVar), this.f35439i));
        this.f35433c.mo4106b(new C10594ao(dVar), aVar4.f35547c);
        C10587ah ahVar = this.f35437g;
        ahVar.f35413g = dVar;
        C60856cj.m92911t(aVar4.f35549e.f35544c.f35565f.mo18652a(), new C10584ae(ahVar.f35409c), aVar4.f35547c);
    }
}
