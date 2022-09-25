package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import java.text.SimpleDateFormat;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.i */
/* compiled from: PG */
public final /* synthetic */ class C77641i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C67464l f213860a;

    public /* synthetic */ C77641i(C67464l lVar) {
        this.f213860a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C67464l lVar = this.f213860a;
        C80563h hVar = (C80563h) obj;
        SimpleDateFormat simpleDateFormat = C77649q.f213868a;
        C80562g gVar = (C80562g) hVar.toBuilder();
        C77556ai aiVar = C77556ai.PARTIAL;
        C67463k kVar = C67463k.START_OF_SPEECH;
        C77889u uVar = C77889u.ASR;
        C67463k a = C67463k.m97475a(lVar.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            int i = hVar.f221141l;
            gVar.copyOnWrite();
            C80563h hVar2 = (C80563h) gVar.instance;
            hVar2.f221130a |= 1024;
            hVar2.f221141l = i + 1;
        } else if (ordinal == 1) {
            int i2 = hVar.f221142m;
            gVar.copyOnWrite();
            C80563h hVar3 = (C80563h) gVar.instance;
            hVar3.f221130a |= 2048;
            hVar3.f221142m = i2 + 1;
        }
        return (C80563h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
