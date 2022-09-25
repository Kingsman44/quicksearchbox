package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.apps.gsa.nga.engine.annotators.r;
import com.google.android.apps.gsa.nga.engine.annotators.s;
import com.google.android.apps.gsa.nga.engine.annotators.t;
import com.google.android.apps.gsa.nga.engine.annotators.u;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122960l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122965q;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123065m;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123067o;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import java.util.Locale;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class AppAnnotatorFactory {

    /* renamed from: a */
    public static final C59071e f339923a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.AppAnnotatorFactory");

    /* renamed from: b */
    public final C122960l f339924b;

    /* renamed from: c */
    public final C42813k f339925c;

    /* renamed from: d */
    public final C123067o f339926d;

    /* renamed from: e */
    public final C122463r f339927e;

    /* renamed from: f */
    public final C60887da f339928f;

    /* renamed from: g */
    public final C122679i f339929g;

    /* renamed from: h */
    public final C122964p f339930h;

    /* renamed from: i */
    private final String f339931i;

    public AppAnnotatorFactory(C122960l lVar, C42813k kVar, C123067o oVar, String str, C122679i iVar, C122463r rVar, C122965q qVar, C60887da daVar) {
        this.f339924b = lVar;
        this.f339925c = kVar;
        this.f339926d = oVar;
        this.f339931i = str;
        this.f339929g = iVar;
        this.f339927e = rVar;
        this.f339930h = new C122964p(qVar);
        this.f339928f = daVar;
    }

    public static native byte[] nativeUpdateAppAnnotator(byte[] bArr);

    private static native void nativeUpdateImportantUrls(byte[] bArr);

    public static native byte[] nativeUpdateInstalledApps(byte[] bArr);

    /* renamed from: a */
    public final void mo105719a() {
        Optional optional;
        C58485gu a = this.f339926d.mo105855a();
        a.size();
        Locale forLanguageTag = Locale.forLanguageTag(this.f339931i);
        r createBuilder = u.b.createBuilder();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C123065m mVar = (C123065m) a.get(i);
            s createBuilder2 = t.d.createBuilder();
            String lowerCase = mVar.mo105846a().toLowerCase(forLanguageTag);
            createBuilder2.copyOnWrite();
            t tVar = createBuilder2.instance;
            lowerCase.getClass();
            tVar.a |= 1;
            tVar.b = lowerCase;
            String b = mVar.mo105847b();
            createBuilder2.copyOnWrite();
            t tVar2 = createBuilder2.instance;
            b.getClass();
            tVar2.a |= 2;
            tVar2.c = b;
            createBuilder.a(createBuilder2);
            String[] split = C122693w.f339956a.split(mVar.mo105846a());
            if (split.length <= 1) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(new C58827ar(" ").mo56097d(Arrays.asList(split)));
            }
            if (optional.isPresent()) {
                s createBuilder3 = t.d.createBuilder();
                String lowerCase2 = ((String) optional.get()).toLowerCase(forLanguageTag);
                createBuilder3.copyOnWrite();
                t tVar3 = createBuilder3.instance;
                lowerCase2.getClass();
                tVar3.a |= 1;
                tVar3.b = lowerCase2;
                String b2 = mVar.mo105847b();
                createBuilder3.copyOnWrite();
                t tVar4 = createBuilder3.instance;
                b2.getClass();
                tVar4.a |= 2;
                tVar4.c = b2;
                createBuilder.a(createBuilder3);
            }
        }
        nativeUpdateInstalledApps(createBuilder.build().toByteArray());
    }

    /* renamed from: b */
    public final C60870cx mo105720b(C122959k kVar) {
        C60870cx a = kVar.mo105792a();
        C122680j jVar = new C122680j(this);
        return C60922j.m93045h(a, C47810es.m84966f(jVar), this.f339928f);
    }
}
