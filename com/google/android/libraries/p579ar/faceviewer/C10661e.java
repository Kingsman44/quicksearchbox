package com.google.android.libraries.p579ar.faceviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.faceviewer.p580a.p581a.C10565a;
import com.google.android.libraries.p579ar.faceviewer.p580a.p582b.C10570d;
import com.google.android.libraries.p579ar.faceviewer.p580a.p583c.C10577b;
import com.google.android.libraries.p579ar.faceviewer.p580a.p584d.C10578a;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10600au;
import com.google.android.libraries.p579ar.faceviewer.p580a.p586f.C10630e;
import com.google.android.libraries.p579ar.faceviewer.p580a.p586f.C10634i;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10636a;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10643h;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10646k;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10647l;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.common.android.p4521a.C58274c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.mediapipe.p4723b.C62711b;
import com.google.p363ad.p364a.C6677ai;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.e */
/* compiled from: PG */
public final class C10661e {

    /* renamed from: a */
    public static final C59071e f35560a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.e");

    /* renamed from: b */
    public final List f35561b = new ArrayList();

    /* renamed from: c */
    public ViewGroup f35562c;

    /* renamed from: d */
    public final C10570d f35563d;

    /* renamed from: e */
    public final C10578a f35564e;

    /* renamed from: f */
    public final C10600au f35565f;

    /* renamed from: g */
    public final C10630e f35566g;

    /* renamed from: h */
    public final Executor f35567h;

    /* renamed from: i */
    public final Executor f35568i;

    /* renamed from: j */
    public final Executor f35569j;

    /* renamed from: k */
    protected final C10649c f35570k;

    /* renamed from: l */
    private final C60870cx f35571l;

    public C10661e(Context context, C10636a aVar, C10647l lVar, Executor executor, Executor executor2, Executor executor3, Callable callable, C62711b bVar, C10643h hVar, C10662f fVar, String str, C10646k kVar) {
        C10634i iVar;
        Context context2 = context;
        Executor executor4 = executor;
        Executor executor5 = executor2;
        this.f35562c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.main_view, (ViewGroup) null);
        this.f35567h = executor5;
        this.f35568i = executor4;
        this.f35569j = executor3;
        this.f35571l = C60856cj.m92904m(callable, executor4);
        C10600au auVar = new C10600au(context, aVar, bVar, C10635b.f35522a, executor2, executor);
        mo18695a(auVar);
        this.f35565f = auVar;
        if (kVar == null) {
            C10634i iVar2 = new C10634i(context);
            ((ViewGroup) this.f35562c.findViewById(R.id.web_container)).addView(iVar2.f35520b);
            iVar = iVar2;
        } else {
            iVar = kVar;
        }
        C10630e eVar = new C10630e(iVar);
        mo18695a(eVar);
        this.f35566g = eVar;
        C10570d dVar = new C10570d(context, executor4, executor5, str);
        mo18695a(dVar);
        this.f35563d = dVar;
        C10647l lVar2 = lVar;
        C10578a aVar2 = new C10578a(lVar, dVar);
        mo18695a(aVar2);
        this.f35564e = aVar2;
        C10577b bVar2 = new C10577b(fVar);
        mo18695a(bVar2);
        C10565a aVar3 = new C10565a(C58274c.f155808a);
        mo18695a(aVar3);
        this.f35570k = new C10649c(this, bVar2, aVar3);
        this.f35562c.addView(auVar.f35437g.f35408b, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18695a(C10652c cVar) {
        this.f35561b.add(cVar);
    }

    /* renamed from: b */
    public final void mo18696b(C6677ai aiVar, int i) {
        C60856cj.m92911t(C60922j.m93044g(this.f35571l, new C10564a(this, aiVar, i), this.f35569j), new C10660d(), this.f35567h);
    }
}
