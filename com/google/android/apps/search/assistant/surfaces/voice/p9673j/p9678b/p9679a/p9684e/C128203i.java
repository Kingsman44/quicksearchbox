package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128177i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.i */
/* compiled from: PG */
abstract class C128203i {
    /* renamed from: f */
    static C128202h m209289f() {
        C128195a aVar = new C128195a();
        aVar.mo108358c(true);
        return aVar;
    }

    /* renamed from: a */
    public abstract int mo108359a();

    /* renamed from: b */
    public abstract Optional mo108360b();

    /* renamed from: c */
    public abstract String mo108361c();

    /* renamed from: d */
    public abstract boolean mo108362d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C128178j mo108366e(Context context, boolean z) {
        C128177i iVar = (C128177i) C128178j.f352610j.createBuilder();
        String c = mo108361c();
        iVar.copyOnWrite();
        C128178j jVar = (C128178j) iVar.instance;
        c.getClass();
        jVar.f352612a |= 1;
        jVar.f352615d = c;
        String string = context.getString(mo108359a());
        iVar.copyOnWrite();
        C128178j jVar2 = (C128178j) iVar.instance;
        string.getClass();
        jVar2.f352612a |= 2;
        jVar2.f352616e = string;
        iVar.copyOnWrite();
        C128178j jVar3 = (C128178j) iVar.instance;
        jVar3.f352612a |= 32;
        jVar3.f352620i = z;
        return (C128178j) iVar.build();
    }
}
