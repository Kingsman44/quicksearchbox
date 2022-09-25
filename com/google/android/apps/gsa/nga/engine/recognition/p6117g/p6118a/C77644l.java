package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import com.google.speech.recognizer.p5233a.C67463k;
import java.text.SimpleDateFormat;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.l */
/* compiled from: PG */
public final /* synthetic */ class C77644l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77557aj f213863a;

    public /* synthetic */ C77644l(C77557aj ajVar) {
        this.f213863a = ajVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C77557aj ajVar = this.f213863a;
        C80563h hVar = (C80563h) obj;
        SimpleDateFormat simpleDateFormat = C77649q.f213868a;
        C80562g gVar = (C80562g) hVar.toBuilder();
        C77889u b = ajVar.mo72639b();
        C77556ai aiVar = C77556ai.PARTIAL;
        C67463k kVar = C67463k.START_OF_SPEECH;
        C77889u uVar = C77889u.ASR;
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            optional = Optional.m71637of(C80471b.SODA);
        } else if (ordinal != 7) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(C80471b.S3);
        }
        Objects.requireNonNull(gVar);
        optional.ifPresent(new C77648p(gVar));
        boolean isEmpty = ajVar.mo72660x().isEmpty();
        int ordinal2 = ajVar.mo72641d().ordinal();
        if (ordinal2 == 0) {
            int i = hVar.f221135f;
            gVar.copyOnWrite();
            C80563h hVar2 = (C80563h) gVar.instance;
            hVar2.f221130a |= 16;
            hVar2.f221135f = i + 1;
            int i2 = hVar.f221138i;
            gVar.copyOnWrite();
            C80563h hVar3 = (C80563h) gVar.instance;
            hVar3.f221130a |= 128;
            hVar3.f221138i = i2 + (isEmpty ? 1 : 0);
        } else if (ordinal2 == 1) {
            int i3 = hVar.f221136g;
            gVar.copyOnWrite();
            C80563h hVar4 = (C80563h) gVar.instance;
            hVar4.f221130a |= 32;
            hVar4.f221136g = i3 + 1;
            int i4 = hVar.f221139j;
            gVar.copyOnWrite();
            C80563h hVar5 = (C80563h) gVar.instance;
            hVar5.f221130a |= 256;
            hVar5.f221139j = i4 + isEmpty;
        } else if (ordinal2 == 2) {
            int i5 = hVar.f221137h;
            gVar.copyOnWrite();
            C80563h hVar6 = (C80563h) gVar.instance;
            hVar6.f221130a |= 64;
            hVar6.f221137h = i5 + 1;
            int i6 = hVar.f221140k;
            gVar.copyOnWrite();
            C80563h hVar7 = (C80563h) gVar.instance;
            hVar7.f221130a |= 512;
            hVar7.f221140k = i6 + isEmpty;
        }
        return (C80563h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
