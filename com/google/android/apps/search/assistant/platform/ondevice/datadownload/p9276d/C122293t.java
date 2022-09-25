package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17065j;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17066k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.t */
/* compiled from: PG */
public final /* synthetic */ class C122293t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f339125a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f339126b;

    /* renamed from: c */
    public final /* synthetic */ C17036ac f339127c;

    public /* synthetic */ C122293t(String str, C58833ax axVar, C17036ac acVar) {
        this.f339125a = str;
        this.f339126b = axVar;
        this.f339127c = acVar;
    }

    public final Object apply(Object obj) {
        String str = this.f339125a;
        C58833ax axVar = this.f339126b;
        C17036ac acVar = this.f339127c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            ((C58970a) ((C58970a) C122297x.f339130a.mo56224b()).mo56372aa(34731)).mo56359L("successfully downloaded '%s' group %s in %s", str, C122277d.m201791b(axVar), acVar.f49644c);
        } else {
            ((C58970a) ((C58970a) C122297x.f339130a.mo56224b()).mo56372aa(34730)).mo56359L("fail to download '%s' group %s in %s", str, C122277d.m201791b(axVar), acVar.f49644c);
        }
        C17065j jVar = (C17065j) C17066k.f49681c.createBuilder();
        Objects.requireNonNull(jVar);
        return (C17066k) optional.map(new C122294u(jVar)).map(C122295v.f339129a).orElse(C17066k.f49681c);
    }
}
