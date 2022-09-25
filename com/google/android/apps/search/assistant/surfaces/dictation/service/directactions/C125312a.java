package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.a */
/* compiled from: PG */
public final class C125312a {

    /* renamed from: a */
    private static final C59071e f345684a = C59071e.m91331h();

    /* renamed from: a */
    public static final C52829f m205251a(List list) {
        C69664n.m101061g(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectAction directAction = (DirectAction) it.next();
            if (C69664n.m101066l(directAction.getId(), "app_action")) {
                Bundle extras = directAction.getExtras();
                Bundle bundle = extras != null ? extras.getBundle("metadata") : null;
                if (bundle != null) {
                    MessageLite a = C52801c.m86708a(bundle, "app_action_metadata", C52829f.f138611c);
                    C52829f fVar = (C52829f) a;
                    C69664n.m101060f(a, "bundleToProto(\n         …tionsContext = %s\", it) }");
                    return fVar;
                }
                C59052c cVar = (C59052c) f345684a.mo56226d();
                cVar.mo56379ah(new C59094n(36535));
                cVar.mo56386p("Missing metadata Bundle in the DirectAction extras [SD]");
            }
        }
        C52829f fVar2 = C52829f.f138611c;
        C69664n.m101060f(fVar2, "getDefaultInstance()");
        return fVar2;
    }
}
