package com.google.android.libraries.search.assistant.p2585i;

import com.google.protobuf.MessageLite;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.i.e */
/* compiled from: PG */
public final class C33481e {
    /* renamed from: a */
    public static final MessageLite m62058a(List list, C33480d dVar) {
        C69664n.m101061g(list, "<this>");
        C69664n.m101061g(dVar, "key");
        MessageLite c = dVar.mo38882c(list);
        C69664n.m101060f(c, "key.getOrDefault(this)");
        return c;
    }

    /* renamed from: b */
    public static final MessageLite m62059b(List list, C33480d dVar) {
        C69664n.m101061g(list, "<this>");
        C69664n.m101061g(dVar, "key");
        return (MessageLite) dVar.mo38884e(list).orElse(null);
    }
}
