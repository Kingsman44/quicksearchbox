package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139391a;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53912g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.b */
/* compiled from: PG */
public final /* synthetic */ class C139398b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C139398b f379045a = new C139398b();

    private /* synthetic */ C139398b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53912g gVar = (C53912g) obj;
        C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
        String str = gVar.f141467a;
        aVar.copyOnWrite();
        C56610b bVar = (C56610b) aVar.instance;
        str.getClass();
        bVar.f151142a |= 1;
        bVar.f151143b = str;
        String str2 = gVar.f141468b;
        if (str2.isEmpty()) {
            Optional a = C133456e.m216614a(Uri.parse(gVar.f141467a));
            str2 = a.isPresent() ? ((Uri) a.get()).toString() : BuildConfig.FLAVOR;
        }
        aVar.copyOnWrite();
        C56610b bVar2 = (C56610b) aVar.instance;
        str2.getClass();
        bVar2.f151142a |= 2;
        bVar2.f151144c = str2;
        if (!gVar.f141469c.isEmpty()) {
            String str3 = gVar.f141469c;
            aVar.copyOnWrite();
            C56610b bVar3 = (C56610b) aVar.instance;
            str3.getClass();
            bVar3.f151142a |= 4;
            bVar3.f151145d = str3;
        }
        C139391a aVar2 = (C139391a) C139392b.f379029j.createBuilder();
        aVar2.copyOnWrite();
        C139392b bVar4 = (C139392b) aVar2.instance;
        C56610b bVar5 = (C56610b) aVar.build();
        bVar5.getClass();
        bVar4.f379032b = bVar5;
        bVar4.f379031a |= 1;
        C63204j jVar = gVar.f141470d;
        if (jVar != null) {
            aVar2.copyOnWrite();
            C139392b bVar6 = (C139392b) aVar2.instance;
            bVar6.f379034d = jVar;
            bVar6.f379031a |= 4;
        }
        return (C139392b) aVar2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
