package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.p3644h.C47103a;
import com.google.speech.p5208h.C66591bq;
import com.google.speech.p5208h.C66592br;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C37152b implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C37160j f96742a;

    /* renamed from: b */
    public final /* synthetic */ Function f96743b;

    /* renamed from: c */
    public final /* synthetic */ C47103a f96744c;

    /* renamed from: d */
    public final /* synthetic */ Optional f96745d;

    /* renamed from: e */
    public final /* synthetic */ C66607ce f96746e;

    public /* synthetic */ C37152b(C37160j jVar, Function function, C47103a aVar, Optional optional, C66607ce ceVar) {
        this.f96742a = jVar;
        this.f96743b = function;
        this.f96744c = aVar;
        this.f96745d = optional;
        this.f96746e = ceVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C37160j jVar = this.f96742a;
        Function function = this.f96743b;
        C47103a aVar = this.f96744c;
        Optional optional = this.f96745d;
        C66607ce ceVar = this.f96746e;
        C70862aj b = jVar.f96759a.mo59701b(new C37159i(function, cVar));
        C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
        C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
        String str = jVar.f96760b;
        bqVar.copyOnWrite();
        C66592br brVar = (C66592br) bqVar.instance;
        brVar.f181142a |= 4;
        brVar.f181144c = str;
        bqVar.copyOnWrite();
        C66592br brVar2 = (C66592br) bqVar.instance;
        brVar2.f181142a |= 2;
        brVar2.f181143b = true;
        String str2 = aVar.f122701a;
        bqVar.copyOnWrite();
        C66592br brVar3 = (C66592br) bqVar.instance;
        str2.getClass();
        brVar3.f181142a |= 8;
        brVar3.f181145d = str2;
        clVar.copyOnWrite();
        C66615cm cmVar = (C66615cm) clVar.instance;
        C66592br brVar4 = (C66592br) bqVar.build();
        brVar4.getClass();
        cmVar.mo59691a();
        cmVar.f181224b.add(brVar4);
        Objects.requireNonNull(clVar);
        optional.ifPresent(new C37156f(clVar));
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar.copyOnWrite();
        C66607ce ceVar2 = (C66607ce) cdVar.instance;
        ceVar2.f181193a |= 1;
        ceVar2.f181194b = "assistant-settings";
        cdVar.mo58885m(C66615cm.f181221k, (C66615cm) clVar.build());
        b.mo20123c((C66607ce) cdVar.build());
        b.mo20123c(ceVar);
        C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar2.copyOnWrite();
        C66607ce ceVar3 = (C66607ce) cdVar2.instance;
        ceVar3.f181193a |= 8;
        ceVar3.f181197e = true;
        b.mo20123c((C66607ce) cdVar2.build());
        b.mo20121a();
        return "s3Bidi single result";
    }
}
