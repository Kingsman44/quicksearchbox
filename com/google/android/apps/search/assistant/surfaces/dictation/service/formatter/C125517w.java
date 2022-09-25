package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.r;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.common.base.C58817ah;
import com.google.protos.p4946az.C64354b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.w */
/* compiled from: PG */
public final /* synthetic */ class C125517w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125470af f346107a;

    /* renamed from: b */
    public final /* synthetic */ String f346108b;

    /* renamed from: c */
    public final /* synthetic */ C125513s f346109c;

    /* renamed from: d */
    public final /* synthetic */ C125503i f346110d;

    public /* synthetic */ C125517w(C125470af afVar, String str, C125513s sVar, C125503i iVar) {
        this.f346107a = afVar;
        this.f346108b = str;
        this.f346109c = sVar;
        this.f346110d = iVar;
    }

    public final Object apply(Object obj) {
        C125065at atVar;
        int i;
        int i2;
        int i3;
        C125470af afVar = this.f346107a;
        String str = this.f346108b;
        C125513s sVar = this.f346109c;
        C125503i iVar = this.f346110d;
        ag agVar = (ag) obj;
        String str2 = agVar.a;
        String concat = String.valueOf(str2).concat(String.valueOf(agVar.c));
        if (str2.isEmpty()) {
            atVar = C125065at.f345040b;
        } else {
            C64354b bVar = agVar.b;
            if (bVar == null) {
                bVar = C64354b.f173954b;
            }
            atVar = afVar.mo106979b(bVar, false, iVar.mo106993d(bVar), Optional.empty());
        }
        C125065at c = afVar.mo106980c(agVar, iVar, Optional.empty());
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        asVar.mo106793a(atVar.f345042a);
        asVar.mo106793a(c.f345042a);
        C125065at atVar2 = (C125065at) asVar.build();
        r rVar = agVar.f;
        if (rVar == null) {
            rVar = r.h;
        }
        int i4 = rVar.f;
        r rVar2 = agVar.f;
        if (rVar2 == null) {
            rVar2 = r.h;
        }
        int i5 = rVar2.g;
        if (sVar.mo107019c().isPresent()) {
            int c2 = i4 + ((C125512r) sVar.mo107019c().get()).mo107010c();
            i2 = i5 + ((C125512r) sVar.mo107019c().get()).mo107009b();
            i3 = c2;
            i = ((C125512r) sVar.mo107019c().get()).mo107008a() + 1;
        } else {
            i2 = i5;
            i3 = i4;
            i = 1;
        }
        return new C125505k(str, atVar2, new C125507m(sVar.mo107018b(), sVar.mo107017a(), Optional.m71637of(new C125506l(false, BuildConfig.FLAVOR, concat, i3, i2, i))));
    }
}
