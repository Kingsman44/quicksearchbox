package com.google.android.libraries.assistant.auto.jumpboost.p702l.p703a.p704a;

import android.app.Activity;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a.C11447a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12981am;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.l.a.a.a */
/* compiled from: PG */
public final class C11831a {

    /* renamed from: a */
    final /* synthetic */ Fragment f38014a;

    /* renamed from: b */
    final /* synthetic */ C21370a f38015b;

    public C11831a(Fragment fragment, C21370a aVar) {
        this.f38014a = fragment;
        this.f38015b = aVar;
    }

    /* renamed from: a */
    public final Intent mo20174a() {
        if (this.f38014a.getHost() instanceof C11447a) {
            Object host = this.f38014a.getHost();
            host.getClass();
            C8971c cVar = ((C11447a) host).f37238e;
            cVar.getClass();
            return ((C143268bb) cVar.f388166f).f388466o;
        } else if (this.f38014a.getHost() instanceof Activity) {
            Object host2 = this.f38014a.getHost();
            host2.getClass();
            return ((Activity) host2).getIntent();
        } else {
            throw new IllegalStateException("Unsupported fragment host for JumpBoost");
        }
    }

    /* renamed from: b */
    public final C12986d mo20175b() {
        C12985c a = C12967c.m29204a(C12989g.UNKNOWN, BuildConfig.FLAVOR, this.f38015b.mo26871c());
        C12981am amVar = C12981am.f40353d;
        a.copyOnWrite();
        C12986d dVar = (C12986d) a.instance;
        C12986d dVar2 = C12986d.f40365e;
        amVar.getClass();
        dVar.f40369c = amVar;
        dVar.f40368b = 1;
        C12991i iVar = ((C12986d) a.instance).f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C12987e eVar = (C12987e) iVar.toBuilder();
        eVar.copyOnWrite();
        C12991i iVar2 = (C12991i) eVar.instance;
        iVar2.f40382a |= 2;
        iVar2.f40384c = true;
        a.copyOnWrite();
        C12986d dVar3 = (C12986d) a.instance;
        C12991i iVar3 = (C12991i) eVar.build();
        iVar3.getClass();
        dVar3.f40370d = iVar3;
        dVar3.f40367a |= 128;
        return (C12986d) a.build();
    }
}
