package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p5285d.p5290b.p5291a.p5292a.C68161ax;
import p5285d.p5290b.p5291a.p5292a.C68162ay;

/* renamed from: com.google.android.libraries.ak.c.b.k */
/* compiled from: PG */
public final /* synthetic */ class C147663k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f398518a;

    public /* synthetic */ C147663k(String str) {
        this.f398518a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f398518a;
        C68161ax axVar = (C68161ax) C68162ay.f184449b.createBuilder();
        String language = new Locale(str).getLanguage();
        axVar.copyOnWrite();
        language.getClass();
        ((C68162ay) axVar.instance).f184451a = language;
        return Boolean.valueOf(((C58485gu) obj).contains(axVar.build()));
    }
}
