package com.google.android.libraries.home.p1958f.p1959a;

import android.os.Bundle;
import com.google.assistant.p3861at.C50181no;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.b */
/* compiled from: PG */
public final class C23787b {
    /* renamed from: a */
    public static final C50181no m44306a(Bundle bundle) {
        C69664n.m101061g(bundle, "<this>");
        MessageLite e = ProtoParsers.m95522e(bundle, "provider", C50181no.f130444i, C62921ba.m95368a());
        C69664n.m101060f(e, "getTrusted(\n    this,\n  …etGeneratedRegistry()\n  )");
        return (C50181no) e;
    }

    /* renamed from: b */
    public static final void m44307b(Bundle bundle, C50181no noVar) {
        C69664n.m101061g(noVar, "provider");
        ProtoParsers.m95532o(bundle, "provider", noVar);
    }
}
