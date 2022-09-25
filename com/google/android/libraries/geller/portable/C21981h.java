package com.google.android.libraries.geller.portable;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.portable.h */
/* compiled from: PG */
public final /* synthetic */ class C21981h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Geller f60627a;

    /* renamed from: b */
    public final /* synthetic */ String f60628b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60629c;

    /* renamed from: d */
    public final /* synthetic */ List f60630d;

    public /* synthetic */ C21981h(Geller geller, String str, C65753ak akVar, List list) {
        this.f60627a = geller;
        this.f60628b = str;
        this.f60629c = akVar;
        this.f60630d = list;
    }

    public final Object apply(Object obj) {
        Geller geller = this.f60627a;
        String str = this.f60628b;
        C65753ak akVar = this.f60629c;
        List list = this.f60630d;
        Long l = (Long) obj;
        if (l.longValue() > 0) {
            try {
                geller.f60384f.onDeletion(str, C21946al.m41085b(akVar, list).toByteArray());
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) Geller.f60378a.mo56225c()).mo56382g(e)).mo56372aa(48035)).mo56386p("Unexpected failure invoking storageOperationsCallback synchronously.");
            }
        }
        return l;
    }
}
