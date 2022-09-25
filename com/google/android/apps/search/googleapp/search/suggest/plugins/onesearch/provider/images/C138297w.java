package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138260k;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138261l;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.w */
/* compiled from: PG */
public final /* synthetic */ class C138297w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376255a;

    /* renamed from: b */
    public final /* synthetic */ C138213bu f376256b;

    public /* synthetic */ C138297w(OneSearchImageProvider oneSearchImageProvider, C138213bu buVar) {
        this.f376255a = oneSearchImageProvider;
        this.f376256b = buVar;
    }

    public final Object apply(Object obj) {
        OneSearchImageProvider oneSearchImageProvider = this.f376255a;
        C138213bu buVar = this.f376256b;
        String str = (String) obj;
        C138260k kVar = (C138260k) C138261l.f376163e.createBuilder();
        kVar.copyOnWrite();
        C138261l lVar = (C138261l) kVar.instance;
        str.getClass();
        lVar.f376165a |= 2;
        lVar.f376167c = str;
        long c = oneSearchImageProvider.f376211e.mo26871c();
        buVar.copyOnWrite();
        C138214bv bvVar = (C138214bv) buVar.instance;
        C138214bv bvVar2 = C138214bv.f376051f;
        bvVar.f376053a |= 8;
        bvVar.f376057e = c;
        C138214bv bvVar3 = (C138214bv) buVar.build();
        kVar.copyOnWrite();
        C138261l lVar2 = (C138261l) kVar.instance;
        bvVar3.getClass();
        lVar2.f376168d = bvVar3;
        lVar2.f376165a |= 4;
        return (C138261l) kVar.build();
    }
}
