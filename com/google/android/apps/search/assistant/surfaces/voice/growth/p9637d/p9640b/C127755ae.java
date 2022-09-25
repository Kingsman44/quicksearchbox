package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127740a;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127741b;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127742c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127745f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127748i;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127749j;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127750k;
import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53561au;
import com.google.assistant.p4008y.p4009a.C53585br;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C127755ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C53593bz f351670a;

    /* renamed from: b */
    public final /* synthetic */ Locale f351671b;

    public /* synthetic */ C127755ae(C53593bz bzVar, Locale locale) {
        this.f351670a = bzVar;
        this.f351671b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53561au auVar;
        String str;
        C53593bz bzVar = this.f351670a;
        Locale locale = this.f351671b;
        C53552al alVar = (C53552al) obj;
        C58495hd hdVar = C127760aj.f351677a;
        if (alVar.f140542b == 2) {
            auVar = (C53561au) alVar.f140543c;
        } else {
            auVar = C53561au.f140569h;
        }
        if ((auVar.f140571a & 4) != 0) {
            str = auVar.f140576g;
        } else {
            str = locale.toLanguageTag();
        }
        C127742c cVar = (C127742c) C127743d.f351634g.createBuilder();
        String str2 = auVar.f140572b;
        cVar.copyOnWrite();
        str2.getClass();
        ((C127743d) cVar.instance).f351636a = str2;
        C127749j jVar = (C127749j) C127750k.f351661d.createBuilder();
        String str3 = bzVar.f140661b;
        jVar.copyOnWrite();
        str3.getClass();
        ((C127750k) jVar.instance).f351663a = str3;
        C127750k kVar = (C127750k) jVar.build();
        cVar.copyOnWrite();
        kVar.getClass();
        ((C127743d) cVar.instance).f351637b = kVar;
        cVar.copyOnWrite();
        str.getClass();
        ((C127743d) cVar.instance).f351639d = str;
        C127740a aVar = (C127740a) C127741b.f351630c.createBuilder();
        C53585br brVar = bzVar.f140668i;
        if (brVar == null) {
            brVar = C53585br.f140639d;
        }
        boolean z = brVar.f140642b;
        aVar.copyOnWrite();
        ((C127741b) aVar.instance).f351632a = z;
        C53585br brVar2 = bzVar.f140668i;
        if (brVar2 == null) {
            brVar2 = C53585br.f140639d;
        }
        String str4 = brVar2.f140643c;
        aVar.copyOnWrite();
        str4.getClass();
        ((C127741b) aVar.instance).f351633b = str4;
        C127741b bVar = (C127741b) aVar.build();
        cVar.copyOnWrite();
        bVar.getClass();
        ((C127743d) cVar.instance).f351638c = bVar;
        C127745f fVar = (C127745f) C127748i.f351656e.createBuilder();
        if ((auVar.f140571a & 2) != 0) {
            String str5 = auVar.f140574e;
            fVar.copyOnWrite();
            str5.getClass();
            ((C127748i) fVar.instance).f351658a = str5;
        }
        C62963cj cjVar = new C62963cj(auVar.f140573c, C53561au.f140568d);
        if (!cjVar.isEmpty()) {
            Stream stream = Collection.EL.stream(cjVar);
            C58495hd hdVar2 = C127760aj.f351677a;
            Objects.requireNonNull(hdVar2);
            fVar.copyOnWrite();
            C127748i iVar = (C127748i) fVar.instance;
            iVar.mo108211b();
            for (C127747h number : (C58528ij) stream.map(new C127753ac(hdVar2)).collect(C58370cn.f155947b)) {
                iVar.f351660c.mo58916g(number.getNumber());
            }
        }
        if (!auVar.f140575f.isEmpty()) {
            C62971cq cqVar = auVar.f140575f;
            fVar.copyOnWrite();
            C127748i iVar2 = (C127748i) fVar.instance;
            iVar2.mo108210a();
            C62947c.addAll((Iterable) cqVar, (List) iVar2.f351659b);
        }
        C127748i iVar3 = (C127748i) fVar.build();
        cVar.copyOnWrite();
        iVar3.getClass();
        ((C127743d) cVar.instance).f351641f = iVar3;
        return (C127743d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
