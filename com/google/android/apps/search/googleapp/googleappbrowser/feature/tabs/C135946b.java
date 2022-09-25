package com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs;

import android.graphics.Bitmap;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.C133124i;
import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3343a.p3344a.C43225e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.b */
/* compiled from: PG */
public final class C135946b {

    /* renamed from: a */
    public final C60888db f370270a;

    /* renamed from: b */
    public final C133110a f370271b;

    /* renamed from: c */
    public String f370272c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public final C38553h f370273d;

    /* renamed from: e */
    public final C43225e f370274e;

    /* renamed from: f */
    private final C133103au f370275f;

    /* renamed from: g */
    private final C43269t f370276g;

    public C135946b(C43225e eVar, C60888db dbVar, C133110a aVar, C133103au auVar, C43269t tVar, C38553h hVar) {
        this.f370274e = eVar;
        this.f370270a = dbVar;
        this.f370271b = aVar;
        this.f370275f = auVar;
        this.f370276g = tVar;
        this.f370273d = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo112646a(String str, String str2, Bitmap bitmap) {
        this.f370272c = str2;
        String str3 = this.f370276g.mo46384b().f112969h;
        if (str3 == null) {
            return C60866ct.f164955a;
        }
        C133103au auVar = this.f370275f;
        C133124i iVar = (C133124i) C133125j.f362919l.createBuilder();
        iVar.copyOnWrite();
        C133125j jVar = (C133125j) iVar.instance;
        str.getClass();
        jVar.f362921a |= 1;
        jVar.f362922b = str;
        iVar.copyOnWrite();
        C133125j jVar2 = (C133125j) iVar.instance;
        str2.getClass();
        jVar2.f362921a |= 2;
        jVar2.f362923c = str2;
        iVar.copyOnWrite();
        C133125j jVar3 = (C133125j) iVar.instance;
        jVar3.f362921a |= 8;
        jVar3.f362925e = str3;
        iVar.copyOnWrite();
        C133125j jVar4 = (C133125j) iVar.instance;
        jVar4.f362921a |= 64;
        jVar4.f362928h = true;
        return auVar.mo110976e(iVar, bitmap, true);
    }
}
