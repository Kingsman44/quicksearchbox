package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import java.util.Set;
import java.util.regex.Pattern;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.ar */
/* compiled from: PG */
public final /* synthetic */ class C109394ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Set f304680a;

    /* renamed from: b */
    public final /* synthetic */ C53592by f304681b;

    /* renamed from: c */
    public final /* synthetic */ String f304682c;

    /* renamed from: d */
    public final /* synthetic */ String f304683d;

    public /* synthetic */ C109394ar(Set set, C53592by byVar, String str, String str2) {
        this.f304680a = set;
        this.f304681b = byVar;
        this.f304682c = str;
        this.f304683d = str2;
    }

    public final void accept(Object obj) {
        Set set = this.f304680a;
        C53592by byVar = this.f304681b;
        String str = this.f304682c;
        String str2 = this.f304683d;
        C123766cf cfVar = (C123766cf) obj;
        Pattern pattern = C109398av.f304687a;
        set.add(cfVar.f341889d);
        String replace = str.replace(str2, cfVar.f341887b);
        byVar.copyOnWrite();
        C53593bz bzVar = (C53593bz) byVar.instance;
        C53593bz bzVar2 = C53593bz.f140658j;
        replace.getClass();
        bzVar.f140660a |= 1;
        bzVar.f140661b = replace;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
