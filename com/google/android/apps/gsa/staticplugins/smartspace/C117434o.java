package com.google.android.apps.gsa.staticplugins.smartspace;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.o */
/* compiled from: PG */
public final class C117434o implements C92033ac {

    /* renamed from: a */
    public static final C59071e f325956a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.o");

    /* renamed from: b */
    public final Context f325957b;

    /* renamed from: c */
    public final C86127w f325958c;

    /* renamed from: d */
    public final C73912w f325959d;

    /* renamed from: e */
    public final C117382e f325960e;

    /* renamed from: f */
    public final C86124t f325961f;

    /* renamed from: g */
    public final C83794j f325962g;

    /* renamed from: h */
    public final C110402b f325963h;

    public C117434o(Context context, C86127w wVar, C73912w wVar2, C110402b bVar, C86124t tVar, C83794j jVar, C117382e eVar) {
        this.f325957b = context;
        this.f325958c = wVar;
        this.f325959d = wVar2;
        this.f325963h = bVar;
        this.f325961f = tVar;
        this.f325962g = jVar;
        this.f325960e = eVar;
    }

    /* renamed from: c */
    public static Intent m195175c(C92113i iVar, String str) {
        C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
        ciVar.mo53458c(iVar.f256820a);
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.google.android.apps.nexuslauncher.UPDATE_SMARTSPACE");
        intent.putExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CARD", ((C50819dp) ciVar.build()).toByteArray());
        Bitmap bitmap = iVar.f256821b;
        if (bitmap != null) {
            intent.putExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON", bitmap);
        }
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: a */
    public final C60870cx mo86686a(C92113i[] iVarArr, C58833ax axVar) {
        return mo86687b(iVarArr);
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C92113i iVar : iVarArr) {
            if (iVar.f256822c) {
                arrayList.add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Collection.EL.stream(arrayList).forEach(new C117433n(this, arrayList2));
        return C118826c.m197212b(arrayList2);
    }
}
