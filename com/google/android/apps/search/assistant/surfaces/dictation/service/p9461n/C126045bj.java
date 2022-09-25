package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.e;
import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125043i;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126287a;
import com.google.protobuf.C63070h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bj */
/* compiled from: PG */
public final /* synthetic */ class C126045bj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C126054bs f347400a;

    public /* synthetic */ C126045bj(C126054bs bsVar) {
        this.f347400a = bsVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C126054bs bsVar = this.f347400a;
        C126032h hVar = (C126032h) obj;
        if (hVar.mo107230f() == 4) {
            C125040f a = hVar.mo107224a();
            String str2 = a.f344979a;
            if (a.f344980b.isEmpty()) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " ".concat(String.valueOf(bsVar.mo107274h(a.f344980b)));
            }
            String concat = String.valueOf(str2).concat(str);
            e createBuilder = f.g.createBuilder();
            createBuilder.copyOnWrite();
            createBuilder.instance.a = concat;
            if (a.f344981c) {
                concat = a.f344980b;
            }
            createBuilder.copyOnWrite();
            concat.getClass();
            createBuilder.instance.c = concat;
            int j = a.f344980b.isEmpty() ? 6 : bsVar.mo107275j();
            createBuilder.copyOnWrite();
            createBuilder.instance.e = j - 2;
            C125043i iVar = (C125043i) C125045k.f345012c.createBuilder();
            C125044j jVar = C125044j.EMOJI_SUGGESTION;
            iVar.copyOnWrite();
            ((C125045k) iVar.instance).f345014a = jVar.getNumber();
            iVar.copyOnWrite();
            a.getClass();
            ((C125045k) iVar.instance).f345015b = a;
            C63070h b = C126287a.m206488b("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestionChipData", iVar.build());
            createBuilder.copyOnWrite();
            b.getClass();
            createBuilder.instance.d = b;
            return createBuilder.build();
        }
        C125044j b2 = hVar.mo107225b();
        String e = hVar.mo107228e();
        String d = hVar.mo107227d();
        e createBuilder2 = f.g.createBuilder();
        String h = bsVar.mo107274h(e);
        createBuilder2.copyOnWrite();
        h.getClass();
        createBuilder2.instance.a = h;
        createBuilder2.copyOnWrite();
        d.getClass();
        createBuilder2.instance.c = d;
        int j2 = bsVar.mo107275j();
        createBuilder2.copyOnWrite();
        createBuilder2.instance.e = j2 - 2;
        C125043i iVar2 = (C125043i) C125045k.f345012c.createBuilder();
        iVar2.copyOnWrite();
        ((C125045k) iVar2.instance).f345014a = b2.getNumber();
        C63070h b3 = C126287a.m206488b("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestionChipData", iVar2.build());
        createBuilder2.copyOnWrite();
        b3.getClass();
        createBuilder2.instance.d = b3;
        return createBuilder2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
