package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139030h;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.t */
/* compiled from: PG */
public final /* synthetic */ class C138988t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ byte[] f377981a;

    /* renamed from: b */
    public final /* synthetic */ String f377982b;

    /* renamed from: c */
    public final /* synthetic */ String f377983c;

    public /* synthetic */ C138988t(byte[] bArr, String str, String str2) {
        this.f377981a = bArr;
        this.f377982b = str;
        this.f377983c = str2;
    }

    public final Object apply(Object obj) {
        byte[] bArr = this.f377981a;
        String str = this.f377982b;
        String str2 = this.f377983c;
        C139030h hVar = (C139030h) ((C139031i) obj).toBuilder();
        C63088z A = C63088z.m96139A(bArr);
        hVar.copyOnWrite();
        C139031i iVar = (C139031i) hVar.instance;
        iVar.f378100a |= 2;
        iVar.f378103d = A;
        hVar.copyOnWrite();
        C139031i iVar2 = (C139031i) hVar.instance;
        iVar2.f378100a |= 1;
        iVar2.f378102c = str;
        hVar.copyOnWrite();
        C139031i iVar3 = (C139031i) hVar.instance;
        str2.getClass();
        iVar3.f378100a |= 4;
        iVar3.f378104e = str2;
        return (C139031i) hVar.build();
    }
}
