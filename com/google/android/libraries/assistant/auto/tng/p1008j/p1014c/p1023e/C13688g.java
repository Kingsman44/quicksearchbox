package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13669b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.e.g */
/* compiled from: PG */
public final class C13688g {

    /* renamed from: a */
    public static final C59071e f41768a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.e.g");

    /* renamed from: b */
    public final Map f41769b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C21370a f41770c;

    /* renamed from: d */
    public final C60888db f41771d;

    /* renamed from: e */
    public C13669b f41772e;

    public C13688g(C21370a aVar, C60888db dbVar) {
        C59104x b = f41768a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAAReqResManager");
        ((C59052c) ((C59052c) b).mo56372aa(44959)).mo56386p("#RequestResponseManager constructor");
        this.f41770c = aVar;
        this.f41771d = dbVar;
    }

    /* renamed from: a */
    public final C13684c mo21221a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f41769b.containsKey(str)) {
            return (C13684c) this.f41769b.get(str);
        }
        C59104x d = f41768a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "UAAReqResManager");
        ((C59052c) ((C59052c) d).mo56372aa(44956)).mo56389s("#fulfill: No pending request exists with this requestId: %s", str);
        return null;
    }
}
