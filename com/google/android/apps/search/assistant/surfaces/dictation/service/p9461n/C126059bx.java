package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bx */
/* compiled from: PG */
public final /* synthetic */ class C126059bx implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347422a;

    /* renamed from: b */
    public final /* synthetic */ C125065at f347423b;

    /* renamed from: c */
    public final /* synthetic */ boolean f347424c;

    public /* synthetic */ C126059bx(C126081cs csVar, C125065at atVar, boolean z) {
        this.f347422a = csVar;
        this.f347423b = atVar;
        this.f347424c = z;
    }

    public final Object apply(Object obj) {
        C126081cs csVar = this.f347422a;
        C125065at atVar = this.f347423b;
        boolean z = this.f347424c;
        Boolean bool = (Boolean) obj;
        if (!C126111dv.m206218e(csVar.f347469g.mo107336a()).equals(C126111dv.m206218e(atVar))) {
            return null;
        }
        csVar.f347469g.mo107340e(new C126097dh(bool.booleanValue()));
        if (!z || csVar.f347469g.mo107337b().f347482c) {
            csVar.f347474l.mo107357a();
            return null;
        }
        csVar.mo107315u();
        return null;
    }
}
