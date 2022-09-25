package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.ae;
import com.google.android.apps.gsa.nga.engine.dictation.af;
import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.y;
import com.google.android.apps.gsa.nga.engine.dictation.z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.be */
/* compiled from: PG */
final class C125496be implements C125472ah {

    /* renamed from: a */
    private static final C59071e f346068a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.be");

    /* renamed from: b */
    private final Locale f346069b;

    public C125496be(Locale locale) {
        this.f346069b = locale;
    }

    /* renamed from: a */
    public final ag mo106978a(ae aeVar, y yVar) {
        C59052c cVar = (C59052c) f346068a.mo56226d();
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36602)).mo56389s("Formatting with empty/uninitialized model for %s. [SD]", this.f346069b);
        af createBuilder = ag.h.createBuilder();
        z zVar = z.c;
        createBuilder.copyOnWrite();
        createBuilder.instance.g = zVar.getNumber();
        return createBuilder.build();
    }
}
