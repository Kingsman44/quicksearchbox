package com.google.android.apps.gsa.shared.bisto;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124540b;
import com.google.common.p4526f.C59071e;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.shared.bisto.h */
/* compiled from: PG */
public final class C89653h {

    /* renamed from: a */
    public static final C59071e f242760a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.h");

    /* renamed from: b */
    public InputStream f242761b;

    /* renamed from: c */
    public OutputStream f242762c;

    /* renamed from: d */
    public final C124540b f242763d;

    public C89653h(C124539a aVar, UUID uuid) {
        this.f242763d = new C124540b(aVar.f343619a.createRfcommSocketToServiceRecord(uuid));
    }
}
