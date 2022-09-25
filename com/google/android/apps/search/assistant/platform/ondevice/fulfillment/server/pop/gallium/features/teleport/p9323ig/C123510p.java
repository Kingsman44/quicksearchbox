package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import android.net.Uri;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.p */
/* compiled from: PG */
public final class C123510p {

    /* renamed from: a */
    public static final C58495hd f341312a;

    /* renamed from: b */
    public static final C58528ij f341313b = C58528ij.m90011K(C49190b.GOOGLE_IMAGE_SEARCH, C49190b.GOOGLE_WEB_SEARCH);

    /* renamed from: c */
    public final C123294ab f341314c;

    /* renamed from: d */
    public final C123392ds f341315d;

    /* renamed from: e */
    public final Executor f341316e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.google.android.youtube", m202840d(C49190b.YOUTUBE, "com.google.android.youtube"));
        gzVar.mo55429h("com.google.android.apps.photos", m202840d(C49190b.GOOGLE_PHOTOS, "com.google.android.apps.photos"));
        gzVar.mo55429h("com.google.android.apps.maps", m202840d(C49190b.GOOGLE_MAPS, "com.google.android.apps.maps"));
        gzVar.mo55429h("com.android.vending", m202840d(C49190b.GOOGLE_PLAY_STORE, "com.android.vending"));
        f341312a = gzVar.mo55427f(false);
    }

    public C123510p(C123294ab abVar, C123392ds dsVar, Executor executor) {
        this.f341314c = abVar;
        this.f341315d = dsVar;
        this.f341316e = executor;
    }

    /* renamed from: d */
    private static C49192d m202840d(C49190b bVar, String str) {
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder();
        cVar.copyOnWrite();
        C49192d dVar = (C49192d) cVar.instance;
        dVar.f127202b = bVar.f127198r;
        dVar.f127201a |= 1;
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        dVar2.f127201a |= 2;
        dVar2.f127203c = str;
        return (C49192d) cVar.build();
    }

    /* renamed from: a */
    public final boolean mo106027a(String str, int i) {
        if (!((C58528ij) Stream.CC.m71936of((T[]) new Stream[]{Stream.CC.m71935of("com.android.chrome"), Collection.EL.stream(f341312a.keySet()), Collection.EL.stream(((C123309aq) ((C123299ag) this.f341314c).f341036a).f341050a)}).flatMap(Function.CC.identity()).collect(C58370cn.f155947b)).contains(str)) {
            return false;
        }
        Optional a = this.f341314c.mo105913a(str);
        if (a.isEmpty()) {
            return false;
        }
        C49192d dVar = (C49192d) a.get();
        if (mo106029c(str, Optional.empty(), i) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo106028b(Optional optional, int i) {
        if (optional.isEmpty()) {
            return false;
        }
        Uri uri = (Uri) optional.get();
        if (Collection.EL.stream(((C123309aq) ((C123299ag) this.f341314c).f341036a).f341051b).noneMatch(new C123508n(this, uri))) {
            return false;
        }
        Optional b = this.f341314c.mo105914b(uri);
        if (b.isEmpty()) {
            return false;
        }
        C49192d dVar = (C49192d) b.get();
        if (mo106029c("com.android.chrome", optional, i) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo106029c(String str, Optional optional, int i) {
        Optional optional2;
        boolean equals = str.equals("com.android.chrome");
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        if (!equals || !optional.isPresent()) {
            return ((Float) C123299ag.m202651c(((C123299ag) this.f341314c).f341037b.mo106023c(str), i).orElse(valueOf)).floatValue();
        }
        C123294ab abVar = this.f341314c;
        String host = ((Uri) optional.get()).getHost();
        if (host == null) {
            optional2 = Optional.empty();
        } else {
            C123299ag agVar = (C123299ag) abVar;
            optional2 = C123299ag.m202651c(agVar.f341037b.mo106024d(host, agVar.f341038c), i);
        }
        return ((Float) optional2.orElse(valueOf)).floatValue();
    }
}
