package com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14372gu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14380hb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14385hg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.c.a.c */
/* compiled from: PG */
public final class C14733c {
    /* renamed from: a */
    public static C14492lf m31017a(C60214n nVar, Duration duration) {
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14372gu guVar = (C14372gu) C14385hg.f43516f.createBuilder();
        long nanos = duration.toNanos();
        guVar.copyOnWrite();
        C14385hg hgVar = (C14385hg) guVar.instance;
        hgVar.f43518a |= 1;
        hgVar.f43522e = nanos;
        guVar.copyOnWrite();
        nVar.getClass();
        ((C14385hg) guVar.instance).f43521d = nVar;
        C14380hb hbVar = C14380hb.f43509a;
        guVar.copyOnWrite();
        C14385hg hgVar2 = (C14385hg) guVar.instance;
        hbVar.getClass();
        hgVar2.f43520c = hbVar;
        hgVar2.f43519b = 4;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14385hg hgVar3 = (C14385hg) guVar.build();
        hgVar3.getClass();
        lfVar.f43801d = hgVar3;
        lfVar.f43800c = 15;
        return (C14492lf) gtVar.build();
    }
}
