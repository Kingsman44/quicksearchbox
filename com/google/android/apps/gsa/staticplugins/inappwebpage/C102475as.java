package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.as */
/* compiled from: PG */
public final class C102475as {

    /* renamed from: a */
    public static final C59071e f285989a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.inappwebpage.as");

    /* renamed from: b */
    public final C85923cq f285990b;

    /* renamed from: c */
    public final C87278x f285991c;

    /* renamed from: d */
    public final C86124t f285992d;

    /* renamed from: e */
    public final C102456a f285993e;

    /* renamed from: f */
    final String f285994f;

    /* renamed from: g */
    public final AtomicBoolean f285995g = new AtomicBoolean(false);

    /* renamed from: h */
    public C102473aq f285996h;

    /* renamed from: i */
    public final C102474ar f285997i = new C102474ar(this);

    /* renamed from: j */
    public final Request f285998j;

    /* renamed from: k */
    public final Set f285999k;

    /* renamed from: l */
    public final Set f286000l;

    /* renamed from: m */
    public final Set f286001m;

    /* renamed from: n */
    public volatile boolean f286002n;

    /* renamed from: o */
    public volatile String f286003o;

    public C102475as(C85923cq cqVar, C85929cw cwVar, C87278x xVar, Request request, C102456a aVar, C86124t tVar) {
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        this.f285999k = synchronizedSet;
        this.f286000l = Collections.synchronizedSet(new LinkedHashSet());
        this.f286001m = Collections.synchronizedSet(new HashSet());
        this.f286002n = false;
        this.f286003o = null;
        cqVar.getClass();
        this.f285990b = cqVar;
        cwVar.getClass();
        xVar.getClass();
        this.f285991c = xVar;
        this.f285992d = tVar;
        aVar.getClass();
        this.f285993e = aVar;
        this.f285994f = aVar.f285933a.f236337b.f236331a.toString();
        this.f285998j = request;
        synchronizedSet.addAll(request.f236601b);
    }

    /* renamed from: a */
    public final void mo93293a(Object obj) {
        C102473aq aqVar = this.f285996h;
        if (aqVar != null) {
            C102497w wVar = (C102497w) ((C102462af) aqVar).f285944a;
            wVar.f286075b.f285961n.mo93268a(new C84563w("[%d] %s", Integer.valueOf(wVar.f286074a), obj));
        }
    }
}
