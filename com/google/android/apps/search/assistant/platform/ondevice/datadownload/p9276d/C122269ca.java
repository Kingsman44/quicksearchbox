package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17045al;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.ca */
/* compiled from: PG */
public final /* synthetic */ class C122269ca implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f339043a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f339044b;

    /* renamed from: c */
    public final /* synthetic */ C17036ac f339045c;

    public /* synthetic */ C122269ca(String str, C58833ax axVar, C17036ac acVar) {
        this.f339043a = str;
        this.f339044b = axVar;
        this.f339045c = acVar;
    }

    public final Object apply(Object obj) {
        String str = this.f339043a;
        C58833ax axVar = this.f339044b;
        C17036ac acVar = this.f339045c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) C122272cd.f339049a.mo56224b()).mo56372aa(34743)).mo56359L("group %s not present %s in %s", str, C122277d.m201791b(axVar), acVar.f49644c);
            return C17046am.f49655c;
        }
        ((C58970a) ((C58970a) C122272cd.f339049a.mo56224b()).mo56372aa(34742)).mo56359L("group %s present %s in %s", str, C122277d.m201791b(axVar), acVar.f49644c);
        C17045al alVar = (C17045al) C17046am.f49655c.createBuilder();
        C29690f fVar = (C29690f) optional.get();
        alVar.copyOnWrite();
        C17046am amVar = (C17046am) alVar.instance;
        fVar.getClass();
        amVar.f49658b = fVar;
        amVar.f49657a |= 1;
        return (C17046am) alVar.build();
    }
}
