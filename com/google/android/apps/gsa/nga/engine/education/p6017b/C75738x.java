package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75644ac;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75653d;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75654e;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75675z;
import com.google.assistant.p3781ad.p3789d.p3791b.C48732n;
import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.x */
/* compiled from: PG */
public final /* synthetic */ class C75738x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210210a;

    /* renamed from: b */
    public final /* synthetic */ String f210211b;

    /* renamed from: c */
    public final /* synthetic */ Locale f210212c;

    public /* synthetic */ C75738x(C75706ac acVar, String str, Locale locale) {
        this.f210210a = acVar;
        this.f210211b = str;
        this.f210212c = locale;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C75706ac acVar = this.f210210a;
        String str = this.f210211b;
        Locale locale = this.f210212c;
        Optional optional2 = (Optional) obj;
        if (optional2.isEmpty()) {
            optional = Optional.empty();
        } else {
            C58485gu g = acVar.mo71858g((C48732n) optional2.get(), str, false);
            if (g.isEmpty()) {
                g = acVar.mo71858g((C48732n) optional2.get(), str, true);
            }
            if (g.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of((C48734p) g.get(acVar.f210157h.nextInt(g.size())));
            }
        }
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        String str2 = ((C48734p) optional.get()).f126109c;
        C75644ac l = C75650ai.m121912l();
        ((C75654e) l).f209998d = C75653d.m121929a(str2);
        l.mo71787d(((C48734p) optional.get()).f126108b);
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str2.getClass();
        bbVar.f140596a = 1 | bbVar.f140596a;
        bbVar.f140597b = str2;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 20;
        bbVar2.f140596a |= 4;
        l.mo71790g(Optional.m71637of((C53569bb) baVar.build()));
        l.mo71788e(locale);
        l.mo71786c(C75675z.f210062b);
        return Optional.m71637of(l.mo71784a());
    }
}
